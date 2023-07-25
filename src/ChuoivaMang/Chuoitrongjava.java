package ChuoivaMang;

import java.util.Scanner;

public class Chuoitrongjava {


    public static void main(String[] args) {
        String s1 = new String("manh");
        System.out.println(s1);


        String nameP = "quan";
        System.out.println(nameP);
        //do dai chuoi
        String address;
        int dodai;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dia chi: ");
        address = sc.nextLine();

        dodai = address.length();
        System.out.println(dodai);


    }
}
