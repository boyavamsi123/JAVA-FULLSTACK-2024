class University{
 String UniversityName = "JNTU";
 void conductExams(){
 System.out.println("JNTU is Conducting Exams");
 }
 }
class College extends University{
 String collegeName = "Aspiron Khuze Technology";
 void providePlacements(){
 System.out.println("Aspiron Khuze Technology provides placement also");
 }
}
class Department extends College{
 String departementName = "Computer Science";
 void fest(){
 System.out.println("Cs Departement has a fest called as Equinox");
 }
}
class MultiLevel{
 public static void main(String args[]){
 Department d = new Department();
 System.out.println("University Name :"+d.UniversityName);
 System.out.println("College Name :"+d.collegeName);
 System.out.println("Departement Name :"+d.departementName);
 System.out.println("___________________");
 d.conductExams();
 d.fest();
 d.providePlacements();
 }
}