package innerclass;

public class MemberCLass {

    public class InnerMenberClas {
        private int id;

        public void In() {
            System.out.println("Hello");
        }
    }
    // chỉ có thể thừa kế ngay trong lớp chua nó

    public class InnerMemberClass2 extends InnerMenberClas {

    }

    public static void main(String[] args) {
        MemberCLass m = new MemberCLass();
        MemberCLass.InnerMenberClas in = m.new InnerMenberClas();

        in.In();
    }
}
