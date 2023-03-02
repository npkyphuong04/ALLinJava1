public class Son extends Father{
    public String uni;
    public Son(String name, float height, int age, String uni){
        super(name, height, age);
        this.uni = uni;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("I am a student of " + uni);
    }
}
