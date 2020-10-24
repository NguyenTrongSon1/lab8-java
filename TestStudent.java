package lab08;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);

        Student s2 = new Student("Fpt",2,50.5);
        System.out.println(s2);

        s1.setAddress("Dong Hung");
        s1.setProgram("aptech");
        s1.setYear(2020);
        s1.setFee(5.5);
        System.out.println(s1);

    }
}
