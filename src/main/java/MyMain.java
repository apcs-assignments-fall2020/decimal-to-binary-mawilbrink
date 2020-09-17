import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        
        int intBinary = Integer.parseInt(binary);
        int decimal = 0;
        int n = 0;
    
        while (intBinary != 0){
            decimal += (intBinary%10)*(Math.pow(2,n));
            intBinary /= 10;
            n += 1;

        }
        
        return decimal;
        
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format:");

        String input = scan.nextLine();
        System.out.println("The decimal form of "+input+" is "+binaryToDecimal(input));
    }
}
