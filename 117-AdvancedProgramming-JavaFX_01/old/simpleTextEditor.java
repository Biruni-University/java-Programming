class TextEditor extends Application {
	final double width = 400;
	final double height = 300;
	
	TextArea text;
	BorderPane root;
	boolean ctrlPressed;
	
	public void start(Stage stage) {
		text = new TextArea();
		root = new BorderPane(text);
		ctrlPressed = false;
		
		text.setOnKeyPressed(e -> {
			if( e.getCode() == KeyCode.CONTROL )
				ctrlPressed = true;
				
			if( ctrlPressed)
				if(e.getCode() == KeyCode.S)
					try {
						save();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				else if(e.getCode() == KeyCode.O)
					try {
						load(stage);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
			
		});
		
		text.setOnKeyReleased(e -> {
			if(e.getCode() == KeyCode.CONTROL)
				ctrlPressed = false;
		});
		
		finalize(stage);	
	}
	
	public void load(Stage stage) throws Exception {
		FileChooser fc = new FileChooser();
		fc.setTitle("Open a file");
		File f = fc.showOpenDialog(stage);
		if(f == null)
			return;
		Scanner sc = new Scanner(f);
		StringBuilder s = new StringBuilder();
		while(sc.hasNextLine())
			s.append(sc.nextLine());
		
		text.setText(s.toString());
	}
	
	public void save() throws IOException {
		FileWriter out = new FileWriter("text.txt");
		out.write(text.getText());
		out.close();
	}
	
	public void finalize(Stage stage) {
		Scene scene = new Scene(root, width, height);
		stage.setScene(scene);
		stage.setTitle("Text Editor");
		stage.show();
	}
}