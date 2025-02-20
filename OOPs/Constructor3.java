class Student{
   int age;
 Student(int a){
 age = a;
 }
 public static void main(String args[]){
 Student s1 = new Student(25);
 Student s2 = new Student(45);
 System.out.println("Age :"+s1.age);
 System.out.println("Age :"+s2.age);
 } 
}