class Bike{

    //paremeterized Constructor
    Bike(int cost) {
        System.out.println("Cost :"+cost);
    }
    public static void main(String[] args) {
        System.out.println("Start the program");
        Bike b = new Bike(10000);
        System.out.println("Ending the program");
    }    
}