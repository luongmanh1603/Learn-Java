package OOP;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void  main(String[] args) {
        donggoi s = new donggoi();
        s.setName("Manh");
        System.out.println(s.getName());
        Student s1 = new Student("1","manh","manh@", 19);
        Student s2 = new Student("1","manh","manh@", 19);
        Student s3 = new Student("2","manh","manh@", 19);
        System.out.println("s1 == s2:"+ (s1 == s2));
        System.out.println("s1 equals s2:" + (s1.equals(s2)));
        System.out.println("s1 equals s3: "+ (s1.equals(s3)));
        List<Student> liststudent = new ArrayList<>();
        liststudent.add(s1);
        liststudent.add(s2);
        liststudent.add(s3);
        Student st1 = new Student("4");
        Student st2 = new Student("3");
        System.out.println("search id=1: " + liststudent.contains(st1));
        System.out.println("search id=3 :"+ liststudent.contains(st2));


    }
}
