import java.util.*;
public class Chocolate{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int numberOfchocolates=sc.nextInt();
int numberOfchildren=sc.nextInt();
int result = numberOfchocolates/numberOfchildren;
int remainingChocolate=numberOfchocolates%numberOfchildren;
System.out.println(" The number of chocolate each child gets is "+ result + " and the number of remaining chocolates are " + remainingChocolate);
}
}