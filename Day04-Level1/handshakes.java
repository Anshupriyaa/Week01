import java.util.*;
public class handshakes{
// Created method for calculating Maximum Handshake
public static int maxHandshake(int numOfStudent){
// Calculated possible handshakes with the help of formula
int possibleHandshakes=(numOfStudent*(numOfStudent-1))/2;
return possibleHandshakes; 
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of students");
int numOfStudent=sc.nextInt();
//calling method maxHandshake
System.out.println(maxHandshake(numOfStudent));
}
}
