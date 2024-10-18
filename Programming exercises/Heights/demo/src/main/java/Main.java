import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be written? ");
        int n = sc.nextInt();
        System.out.println();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        //for to pass the datas.
        for(int i=0; i<n; i++){
            System.out.println("Person "+(i+1)+" data:");

            System.out.print("Name: ");
            sc.nextLine();
            name[i] = sc.nextLine();

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            System.out.print("Height: ");
            height[i] = sc.nextDouble();
            System.out.println();
        }

        //for to calculate the sum.
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += height[i];
        }

        //for to calculate the average.
        double averageHeight = 0;
        for(int i=0; i<n; i++){
           averageHeight = sum/n;
        }

        //for to check people under 18 years old.
        double percent=0;
        int cont = 0;
        for(int i=0; i<n; i++){
            if(age[i] < 16){
               cont++; 
            }

            percent = (cont * 100)/n;
        }
        System.out.print("Average height: "+averageHeight);
        System.out.println();
        System.out.println("People under 18 years old: "+percent+"%");

        sc.close();

    }
}