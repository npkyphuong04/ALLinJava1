public class Person {
   private String name;
   private float height;
   private int age;
   public Person(String name, float height, int age){
       this.name = name;
       this.height = height;
       this.age = age;
   }
   public void eat(String foodName){
       System.out.println(name + " is eating " + foodName);
   }
   public int getAge(){
       return age;
   }
   public String getName(){
       return name;
   }
}
