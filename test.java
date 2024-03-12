import java.util.Scanner;

/**
 * test
 */
public class test {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Hãy nhập khóa");
                String secretKey = sc.nextLine();
                System.out.println("Hãy nhập chuỗi");
                String originalString = sc.nextLine();
                TestAES testAES = new TestAES();
                String encryptedString = testAES.encrypt(originalString, secretKey);
                System.out.println("Mã hóa: " + encryptedString);
                String decryptedString = testAES.decrypt(encryptedString, secretKey);
                System.out.println("Giải mã: " + decryptedString);
                sc.close();
        }
}