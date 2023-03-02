public class Father {
    private String name;
    private float height;
    private int age;
    public Father(String name, float height, int age){
        this.name = name;
        this.height = height;
        this.age = age;
    }
    public void getInfo(){
        System.out.println("My name is: " + name);
        System.out.println("My height is: " + height);
        System.out.println("I am " + age + " years old");
    }
}
