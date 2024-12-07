import java.util.Scanner;
public class currencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO CURRENCY CONVERTER..");
        System.out.println("1. USD TO RUPEE..");
        System.out.println("2. RUPEE TO USD");
        System.out.println("3. EURO TO RUPEE..");
        System.out.println("4. RUPEE TO EURO..");
        System.out.println("Enter Your Choice(1 or 2 or 3 or 4)");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Enter your amount in USD");
            double USD = sc.nextDouble();
            double Rupee = usdToRupee(USD);
            System.out.println("Converted amount in rupees: " +Rupee);
        }
        else if(choice == 2){
            System.out.println("ENTER THE AMOUNT IN RUPEE: ");
            double Rupee = sc.nextDouble();
            double USD = RupeeToUsd(Rupee);
            System.out.println("Converted amount in Usd: " +USD);
        }
        else if(choice == 3){
            System.out.println("ENTER THE AMOUNT IN EURO: ");
            double EURO = sc.nextDouble();
            double Rupee = euroToRupee(EURO);
            System.out.println("Converted amount in USD " +Rupee);
        }
        else if(choice == 4){
            System.out.println("ENTER THE AMOUNT IN RUPEE: ");
            double Rupee = sc.nextDouble();
            double Euro = RupeeToEuro(Rupee);
            System.out.println("converted amount in usd: " +Euro);
        }
        else{
            System.out.println("INVALID CHOICE.PLEASE SELECT 1 OR 2 OR 3 OR 4");
        }
        sc.close();
    }
    public static double usdToRupee(double USD){
        return USD * 83.47; 
    }
    public static double RupeeToUsd(double Rupee){
        return Rupee * 0.0119804;
    }
    public static double euroToRupee(double EURO){
        return EURO * 89.10;
    }
    public static double RupeeToEuro(double Rupee){
        return Rupee * 0.0113;
    }
}
