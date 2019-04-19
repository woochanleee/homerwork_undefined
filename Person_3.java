public class Person_3 extends Friends {


    public static void main(String[] args) {
        Person_3 person_3 = new Person_3();
        person_3.getName("이진혁");
        person_3.getAge(17);
        person_3.getHeight(180);

        System.out.println(person_3.name);
        System.out.println(person_3.age+"살");
        System.out.println(person_3.height+"cm");
    }
}