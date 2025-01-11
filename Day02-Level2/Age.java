import java.util.*;
public class Age{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int studentsAge[]=new int[10];
System.out.print("Enter number");
int studentsAge[]=sc.nextInt();
for(int i=0;i<=studentsAge.length;i++){
int age=studentsAge[i];
}
if(age<0){
System.out.print("Invalid number");
}
else if(age>=18){
System.out.print("The student with the age "+age+" can vote. ");
}
else{
System.out.print("The student with the age "+age+" cannot vote.");
}
}
}