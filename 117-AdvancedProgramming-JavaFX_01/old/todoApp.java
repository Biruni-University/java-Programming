import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch();
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		TodoApp app = new TodoApp();
		app.start(primaryStage);
	}
}
class TodoApp extends Application {
	final double width = 400;
	final double height = 300;
	int numItems = 0;
	BorderPane root;
	VBox content;
	public void start(Stage stage) {
		Button addButton = new Button("Add");
		TextField field = new TextField();
		root = new BorderPane();
		content = new VBox();
		HBox bottom = new HBox(field, addButton);
		bottom.setAlignment(Pos.CENTER);
		root.setBottom(bottom);
		root.setCenter(content);
		addButton.setOnAction(e -> {
			String text = field.getText();
			if(text.length() > 0) {
				addRow(text);
			}
		});
		cosmetics();
		finalize(stage);
	}
	public void addRow(String text) {
		Button delButton = new Button("done");
		Label id = new Label(numItems+1+"");
		Label item = new Label(text);
		HBox row = new HBox(30, id, item, delButton);
		row.setAlignment(Pos.CENTER);
		content.getChildren().add(row);
		delButton.setOnAction(e -> {
			updateNums(row);
			content.getChildren().remove(row);
			numItems--;
		});
		numItems++;
	}
	public void updateNums(Node row) {
		int rowIndex = content.getChildren().indexOf(row);
		for(int i=rowIndex+1; i<content.getChildren().size(); i++) {
			HBox box = (HBox) content.getChildren().get(i);
			Label l = (Label) box.getChildren().get(0);
			l.setText(i+""); // decrement by one
		}
	}
	public void cosmetics() {
		content.setAlignment(Pos.CENTER);
		BorderPane.setAlignment(content, Pos.CENTER);
		BorderPane.setMargin(content, new Insets(20));
	}
	public void finalize(Stage stage) {
		Scene scene = new Scene(root, width, height);
		stage.setScene(scene);
		stage.setTitle("ToDo App");
		stage.show();
	}
}
