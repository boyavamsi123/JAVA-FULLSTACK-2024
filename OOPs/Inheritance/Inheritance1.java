class Father{
    int age = 40;
}
class Son extends Father{
    String name = "Tom";
}
class Test{
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.age);
        System.out.println(s.name);
    }
}