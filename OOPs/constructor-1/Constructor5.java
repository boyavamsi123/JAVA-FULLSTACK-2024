class Person{
 int age;
 String name;
 Person(int age, String name){
 this.age = age;
 this.name = name;
 }
 public static void main(String args[]){
 Person p1 = new Person(20,"Tom");
 Person p2 = new Person(40,"Jerry");
 System.out.println("Name : "+ p1.name + " Age :"+p1.age);
 System.out.println("Name :"+p2.name + " Age :"+p2.age);
 }
}