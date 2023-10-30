import java.util.Scanner;  
  
class QuickStart {  
public static void main(String[] args) {  
  
Scanner input= new Scanner(System.in);  
  
System.out.print("enter your five digit number: ");  
int userrequest=input.nextInt();  
  
System.out.print("digits are: ");  
  
int temp = 10000;  
while (temp > 0) {  
  
int results = userrequest / temp;  
System.out.print(results);  
userrequest = userrequest % temp;  
temp = temp / 10;  
  
if (temp > 0) {  
  
System.out.print("-");  
}  
}  
}  
}  
//Suren