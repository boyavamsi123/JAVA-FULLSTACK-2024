public class circumference {
    public static void main(String[] args){
        float radius, area, circumference;
        radius = 5.6f;
        area = (float)(22/7.0*radius*radius);
        circumference = (float)(2*22/7.0*radius);
        System.out.println("The Area of a circle is :"+area);  //98.56
        System.out.println("The Circumference of a circle is :"+circumference);  //35.2
        // area of a circle is : pi*(r*r)
        // circumference of a circle is : 2*pi*r
    }