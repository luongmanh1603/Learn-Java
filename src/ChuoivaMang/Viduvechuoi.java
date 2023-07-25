package ChuoivaMang;

import java.util.Scanner;

public class Viduvechuoi {
    public static void main(String[] args) {
        String chuoi;
        char k;
        int dodai;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap chuoi:");
            chuoi = sc.nextLine();
        } while (chuoi.length() > 100);

        System.out.println("Ky tu can dem la");
        k = sc.next().charAt(0);
        for (int i = 0; i < chuoi.length();i++){
            if(k == chuoi.charAt(i)){
                count++;
            }

        }
        System.out.println(count);}
}
