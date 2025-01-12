import java.util.*;
public class Number{
public static int findNumber(int num){
if(num<1){
return -1;
}
else if(num>1){
return 1;
}
else{
return 0;
}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
findNumber(num);
}
}

