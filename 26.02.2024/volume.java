import java.util.*;
public class volume {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s,l,b,h,vc,vcd;
        double r,vs;
        System.out.println("Enter the values of side of a cube");
        s=sc.nextInt();
        vc = s*s*s;
        System.out.println("volume of a cube :"+vc);
        System.out.println("----------------------------");
        System.out.println("Enter the Radius of a sphere");
        r = sc.nextDouble();
        vs = 4.0/3.0*3.14*r*r*r;
        System.out.println("volume of sphere is :"+vs);
        System.out.println("----------------------------");
        System.out.println("Enter the length of the cuboid");
        l=sc.nextInt();
        System.out.println("Enter the breadth of the cuboid");
        b=sc.nextInt();
        System.out.println("Enter the Height of the cuboid");
        h = sc.nextInt();
        vcd = l*b*h;
        System.out.println("volume of the cuboid is :"+vcd);
        System.out.println("----------------------------");
    }
}