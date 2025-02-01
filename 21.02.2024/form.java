public class form{
    public static void main(String[] args){
        int a=5,b=6, sum, diff, result;
        //Unary Operators
        System.out.println("Unary operator: "+(a++));    //5
        System.out.println("Unary operators 2: "+(--b)); //5
        //Binary Operators
        sum = a+b;
        diff = a-b;
        System.out.println("Binary operators: "+sum);  //11
        System.out.println("Binary operators: "+diff); //1
        //Ternar Operators
        result = (a>b) ? a:b;
        System.out.println("Ternary operator: "+result); //6
    }
}