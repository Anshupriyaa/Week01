import java.util.*;

public class MeanHeight {
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    double height[]=new double[11];
    double mean =0.0;
    System.out.print("Enter 11 heights (in cm) :");
    for(int i =0;i<11;i++){
      height[i]=sc.nextDouble();
      mean = mean+height[i];
      }     
    double totalMean=mean/11;
    System.out.println("Mean of heights "+totalMean);

   }
}