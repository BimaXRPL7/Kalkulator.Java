import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double AngkaPertama = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double AngkaKedua = scanner.nextInt();
        
        System.out.println("Select the operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (x)");
        System.out.println("4. Division (:)");
        int choice = scanner.nextInt();

        double hasil;
        switch (choice) {
            case 1:
                hasil= AngkaPertama + AngkaKedua;
                break;
            case 2:
                hasil= AngkaPertama - AngkaKedua;
                break;
            case 3:
                hasil= AngkaPertama * AngkaKedua;
                break;
            case 4:
            if (AngkaKedua != 0) {
                hasil = AngkaPertama / AngkaKedua;
            } else {
                System.out.println("Error: Cannot divide by zero.");
                return;
            }
            break;
        default:
            System.out.println("Invalid Choice.");
            return;
                
        }
        System.out.println("Result: "+hasil);
        scanner.close();
        System.out.println("Made By Bimantara and ChatGPT");
        
        
    }
}	