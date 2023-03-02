public class testPerson {
    public static void main(String[] args){
        Person p1 = new Person("ky phuong", 1.7f, 19);
        Person p2 = new Person("trinh phuong", 1.65f, 10);

        p1.eat("cake");
        p2.eat("snack");

        int age = p1.getAge();
        String name = p1.getName();
        System.out.println(name + "'s age is: " + age);
        age = p2.getAge();
        name = p2.getName();
        System.out.println(name + "'s age is: " + age);

    }
}
