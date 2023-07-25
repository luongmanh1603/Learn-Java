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
        System.out.println(count);
        // kiem tra so ky tu in hoa, in thuong, so
        String chuoi1;
        int hoa = 0, thuong = 0, so = 0;
        do {
            System.out.println("Nhap chuoi can kiem tra:");
            chuoi1 = sc.nextLine();
        } while (chuoi1.length() > 100);
        for (int j = 0; j < chuoi1.length();j++){
            if (Character.isUpperCase(chuoi1.charAt(j))){
                hoa++;

            } else if (Character.isLowerCase(chuoi1.charAt(j))) {
                thuong++;
            } else if (Character.isDigit(chuoi1.charAt(j))){
                so++;
            }
        }

        System.out.println("Thuong:"+thuong + ",Hoa" + hoa + ",So"+so);

        }

}
