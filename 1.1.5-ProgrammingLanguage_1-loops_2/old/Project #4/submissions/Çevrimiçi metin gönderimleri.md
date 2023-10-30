import java.util.Scanner;

  

class Punchcard {

public static void main(String[] args) {

  

Scanner scanner = new Scanner(System.in);

System.out.print("enter the your desired text: ");

String inString = scanner.nextLine();

  

System.out.print("enter the letter you want to count: ");

char wantedChar = scanner.next().charAt(0);

  

int totalChar = 0, i = 0;

char temp;

  

while ( i < inString.length()) {

  

temp = inString.charAt(i);

if (temp == wantedChar)

totalChar++;

i++;

}

System.out.println(wantedChar + " appears " + totalChar + " times in your
text");

scanner.close();

}

}

//suren