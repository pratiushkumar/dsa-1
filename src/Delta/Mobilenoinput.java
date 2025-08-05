package Delta;

import java.util.Scanner;

public class Mobilenoinput {
    public static boolean islegal(String mobile)  {
        //check if all digits in string are numbers
        for(int i =0; i <mobile.length(); i ++) {
            if (!Character.isDigit(mobile.charAt(i))) {
                return false;
            }
            int length =  mobile.length();
            if(length == 10 ) {
                return mobile.charAt(0) >= '6' && mobile.charAt(1) <= 9 ;
            }
            else if(length == 11 ) {
                return mobile.charAt(0) =='0' && mobile.charAt(1) >= '6' && mobile.charAt(1) <= '9';
            }
            else if(length == 12)  {
                return mobile.startsWith("91") && mobile.charAt(2) >= '6' && mobile.charAt(2) <='9';
            }
        }

        int length =  mobile.length();

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String mobileNumber = sc.nextLine();
        if (islegal(mobileNumber)) {
            System.out.println("Valid mobile number");
        } else {
            System.out.println("Invalid mobile number");
        }
    }

}

