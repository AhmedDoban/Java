import java.util.Scanner;
public class Cipher {
    public static void main(String[] args) {
        // initialization
        String planetext ="";
        String cipherText="";
        int key ;
        // take an input
        System.out.print("Enter the text to Cipher it : ");
        Scanner text = new Scanner(System.in);
        planetext = text.next();
        System.out.print("Enter the key : ");
        Scanner keyinput = new Scanner(System.in);
        key = keyinput.nextInt();
        // encrypt the text by implementation

        for (int i = 0 ; i < planetext.length() ; i++){
            int encrypt = ((int) ( planetext.charAt(i) - 65 ) + key ) % 26 + 65 ;
            cipherText += (char) encrypt;
        }
            System.out.println(cipherText);
        // decrypt the text by implementation
        for (int i = 0 ; i < (cipherText.length()/2-2) ; i++){

            int decrypt = ((int) ( cipherText.charAt(i) - 65 ) - key ) % 26  ;
            if(decrypt > 0){
                decrypt += 26 + 65 ;
            }
            else {
                decrypt += 65;
            }
            planetext += (char) decrypt;
        }
        System.out.println(planetext);
        encrypt(planetext,key);
        decrypt("MTYQP", 6);
    }
    static void encrypt(String Text, int Key) {
        String Temp = "";
        for ( int i = 0; i < Text.length() ; i++){
            int encrypt = ((int)(Text.charAt(i) - 65 )+ Key) % 26 + 65;
            Temp += (char)encrypt;
        }
        System.out.println(Temp);
    }
    static void decrypt(String Text, int Key) {
        String Temp = "";
        for ( int i = 0; i < Text.length() ; i++){
            int decrypt = ((int)(Text.charAt(i) - 65 ) - Key) % 26 ;
            if(decrypt > 0){
                decrypt += 65 + 26;
                Temp += (char)decrypt;
            }
            else {
                decrypt += 65 ;
                Temp += (char)decrypt;
            }

        }
        System.out.println(Temp);
    }
}
