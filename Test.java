 import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Sinir Sayisini giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 2 ){
            System.out.println(i);
        }



    }
}