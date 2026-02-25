//Create a class student with data name, roll no and 3 marks. Calculate total and average and display the result.

import java.util.Scanner;
class Student
{
String name;
int rollno;
int mark1,mark2,mark3;
int total;
double average;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Name: ");
name=sc.nextLine();

System.out.print("Enter the Roll Number: ");
rollno=sc.nextInt();

System.out.print("Enter Mark 1: ");
mark1=sc.nextInt();

System.out.print("Enter Mark 2: ");
mark2=sc.nextInt();

System.out.print("Enter Mark 3: ");
mark3=sc.nextInt();
}

void calculate()
{
total=mark1+mark2+mark3;
average=total/3.0;
}

void display()
{
System.out.println("\n--- Student Details ---");
System.out.println("Name: " + name);
System.out.println("Roll No: " +rollno);
System.out.println("Total Marks: " +total);System.out.println("Average Marks: " +average);
}

public static void main(String[] args)
{
Student s=new Student();
s.getData();
s.calculate();
s.display();
}}
