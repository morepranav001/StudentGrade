package com.java;
import java.util.Scanner;
public class StudentGrade 
{
public static void main(String[] args) {
int totalSubjects = 5;   
int maxMarksEachSub = 100;  
double[] marks = new double[totalSubjects];
double totalMarks = 0;
double marksInPercentage;
Scanner userInputObj = new Scanner(System.in);
System.out.println("Please enter marks in all subjects.");
for (int i = 0; i < marks.length; i++) {
System.out.print("Subject " + (i + 1) + " : ");
marks[i] = userInputObj.nextInt();
if (marks[i] > maxMarksEachSub || marks[i] < 0) {
System.out.println("Invalid input " + marks[i] + "\nTerminating the program..... ");
return;
}
totalMarks = totalMarks + marks[i];
}
marksInPercentage = (totalMarks / (totalSubjects * maxMarksEachSub)) * 100;
System.out.println("Total marks obtained : " + totalMarks);
System.out.println("Your Grade : " + getGrade(marksInPercentage));
}
private static String getGrade(double marksInPercentage) {
if (marksInPercentage > 80 && marksInPercentage <= 100) {
return "A";
} 
else if (marksInPercentage > 60 && marksInPercentage <= 80) {
return "B";
} 
else if (marksInPercentage > 30 && marksInPercentage <= 60) {
return "C";
} 
else {
return "D";
}
}
}