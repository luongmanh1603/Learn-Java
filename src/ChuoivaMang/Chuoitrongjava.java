package ChuoivaMang;

import java.util.Scanner;

public class Chuoitrongjava {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = new String("manh");
        System.out.println(s1);


        String nameP = "quan";
        System.out.println(nameP);
//        //do dai chuoi
//        String address;
//        int dodai;
//        System.out.println("Dia chi: ");
//        address = sc.nextLine();
//
//        dodai = address.length();
//        System.out.println(dodai);

        //noi 2 chuoi ki tu
        String s3;
        String s4;

        System.out.println("String3:");
        s3 = sc.nextLine();
        System.out.println("String4:");
        s4 = sc.nextLine();
        String s5 = s3.concat(s4);
        System.out.println("Thanh chuoi:"+ s5);
        //tra ve ky tu trong chuoi
        char c = s5.charAt(2);
        System.out.println(c);
        // so sanh 2 chuoi
        int sosanh = s3.compareTo(s4);
        if (sosanh == 0){
            System.out.println("2 so bang nhau");

        } else {
            System.out.println("2 so khac nhau");

        }
        //ham tra ve vi tri xuat hien
        int re = s5.indexOf(s4);
        int re1 = s5.indexOf(s3);
        System.out.println(re);
        System.out.println(re1);
        System.out.println(s5.replace(s4,s3));

        String s6 = s5.substring(5);
        System.out.println(s6);

    }
}
