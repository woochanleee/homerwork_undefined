import sun.dc.pr.PRError;

public class Person_1 extends Friends {


    public static void main(String[] args) {
        Person_1 person_1 = new Person_1();
        person_1.getName("이우찬");
        person_1.getAge(17);
        person_1.getHeight(170);

        System.out.println(person_1.name);
        System.out.println(person_1.age+"살");
        System.out.println(person_1.height+"cm");
    }
}