import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        loop: while (true) {
            System.out.println("************************************* \n");
            System.out.println("*** Welocme to the Cipher program ***");
            // take an input
            System.out.print("Enter the text to Cipher it : ");
            Scanner text = new Scanner(System.in);
            String planetext = text.next();
            System.out.print("Enter the key : ");
            Scanner keyinput = new Scanner(System.in);
            int key = keyinput.nextInt();
            System.out.println("\n*************************************");

            System.out.println("\n**** Please Choise from options ****");
            System.out.println("1- encrypt ");
            System.out.println("2- decrypt  ");
            System.out.println("3- Exit \n");
            System.out.println("************************************* \n");
            System.out.print("Your Choice : ");
            Scanner data = new Scanner(System.in);
            int Choice = data.nextInt();
            System.out.println("\n*************************************");

            switch (Choice) {
                case 1:
                    encrypt(planetext, key);
                    break;
                case 2:
                    decrypt(planetext, key);
                    break;
                case 3:
                    break loop;

            }
        }

    }

    static void encrypt(String Text, int Key) {
        String Temp = "";
        for (int i = 0; i < Text.length(); i++) {
            int encrypt = ((int) (Text.charAt(i) - 65) + Key) % 26 + 65;
            Temp += (char) encrypt;
        }
        System.out.println("Your encrypt Data is : " + Temp + "\n");
    }

    static void decrypt(String Text, int Key) {
        String Temp = "";
        for (int i = 0; i < Text.length(); i++) {
            int decrypt = ((int) (Text.charAt(i) - 65) - Key) % 26;
            if (decrypt > 0) {
                decrypt += 65 + 26;
                Temp += (char) decrypt;
            } else {
                decrypt += 65;
                Temp += (char) decrypt;
            }

        }
        System.out.println("Your decrypt Data is : " + Temp + "\n");
    }
}
