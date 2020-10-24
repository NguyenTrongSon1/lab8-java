package lab08;

public class Person {
    private String name;
    private String address;

    public Person(){
        this.name = "Son";
        this.address = "phu luong";
    }
    public Person(String name){
        this.name=name;
        this.address ="";
    }
    public Person(String name,String address){
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);

        p1.setAddress("dong hung");
        System.out.println(p1);
    }
}
