class University{
    String UniversityName = "JNTU";
    void conductExams(){
        System.out.println("JNTU is conducting Exams");
    }
}
class College extends University{
    String collegeName = "Aspiron Khuze Technology";
    void providePlacements(){
        System.out.println("Aspiron Khuze Technology Provodes placements also");
    }
}
class Department extends College{
    String departmentName = "Computer Science";
    void fest(){
        System.out.println("CS Department has a fest called as Equinox");
    }
}
class MultiLevel{
    public static void main(String[] args) {
        Department d = new Department();
        System.out.println("University Name :"+d.UniversityName);
        System.out.println("College Name :"+d.collegeName);
        System.out.println("Department Name :"+d.departmentName);
        System.out.println("------------------------------------");
        d.conductExams();
        d.fest();
        d.providePlacements();  
    }
}