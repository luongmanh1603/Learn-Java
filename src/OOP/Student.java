package OOP;

public class Student {
    private String id;
    private String name;
    private  String mail;
    private int age;

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name, String mail, int age) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.age = age;
    }
    public String toString(){
        String in4 = "Student" + id;
        in4 += ":" + name;
        in4 += ":" + mail;
        in4 += ":" + age;
        return in4;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof  Student){
            Student another = (Student) obj;
            if (this.id.equals(another.id)) {
                return true;
            }
            }
        return false;
    }
}
