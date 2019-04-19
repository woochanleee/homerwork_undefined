public class Person_2 extends Friends {


    public static void main(String[] args) {
        Person_2 person_2 = new Person_2();
        person_2.getName("윤석준");
        person_2.getAge(17);
        person_2.getHeight(190);

        System.out.println(person_2.name);
        System.out.println(person_2.age+"살");
        System.out.println(person_2.height+"cm");
    }
}