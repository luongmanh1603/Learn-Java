package ChuoivaMang;

import java.util.Scanner;

public class Chuoitrongjava {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = new String("manh");
        System.out.println(s1);


        String nameP = "quan";
        System.out.println(nameP);
        //do dai chuoi
        String address;
        int dodai;
        System.out.println("Dia chi: ");
        address = sc.nextLine();

        dodai = address.length();
        System.out.println(dodai);

        //noi 2 chuoi ki tu
        String s3;
        String s4;

        System.out.println("String3:");
        s3 = sc.nextLine();
        System.out.println("String4:");
        s4 = sc.nextLine();
        String s5 = s3.concat(s4);
        System.out.println("Thanh chuoi:"+ s5);


    }
}
