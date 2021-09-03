import java.util.Scanner;
public class Test{
 public static void main(String[]args){
 Student st1 = new Student();
 st1.getDetails();
 st1.displayDetails();
 Student st2 = new Student();
 st2.getDetails();
 st2.displayDetails();
}

}

public class Student{
 int roll ;
 String name ;
 float marks;
Scanner sc = new Scanner(System.in);
public void getDetails(){
System.out.print("enter the roll number:");
  roll=sc.nextInt();
  sc.nextLine();
System.out.print("enter the student name:");
  name=sc.nextLine();
System.out.print("enter the student marks:");
  marks=sc.nextInt();

}
public void displayDetails(){
System.out.println("name :"+ name + "\nroll no :"+ roll +"\nmarks :"+marks );
}
} 