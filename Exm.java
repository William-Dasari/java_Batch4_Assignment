import java.util.Scanner;
public class Exm{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter values for addition : ");
        System.out.print("first value : ");
        int firstvalue=scanner.nextInt();
        System.out.print("second value :");
        int secondvalue=scanner.nextInt();
        int sum=firstvalue+secondvalue;
        System.out.println("Addition of "+firstvalue+" and "+secondvalue+" is "+sum);
    }
}