import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hãy nhập nội dung cần mã hóa:");
        String originalString = sc.nextLine();

        System.out.println("Hãy nhập khóa:");
        String secretKey = sc.nextLine();

        TestAES testAES = new TestAES();

        // Mã hóa chuỗi
        String encryptedString = testAES.encrypt(originalString, secretKey);
        System.out.println("Chuỗi đã được mã hóa: " + encryptedString);

        // Giải mã chuỗi
        System.out.println("Hãy nhập chuỗi cần giải mã:");
        String encryptedInput = sc.nextLine().trim(); // Loại bỏ khoảng trắng ở đầu và cuối chuỗi

        System.out.println("Hãy nhập khóa:");
        secretKey = sc.nextLine();

        String decryptedString = testAES.decrypt(encryptedInput, secretKey);
        System.out.println("Chuỗi đã được giải mã: " + decryptedString);

        sc.close();
    }
}
