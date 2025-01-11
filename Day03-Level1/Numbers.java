import java.util.*;
public class Numbers{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number[]=new int[5];
for(int i=0;i<number.length;i++){
number[i]=sc.nextInt();
}
for(int i=0;i<number.length;i++){
if(number[i]>0){
if(number[i]%2==0){
System.out.println("Number "+number[i]+" is a positive and an even number.");
}else{
System.out.println("Number "+number[i]+" is a positive and an odd number.");
}
}
else if(number[i]<0){
System.out.println("Number "+number[i]+" is a negative number.");
}
else{
System.out.println("Number is zero.");
}
}
}
}
