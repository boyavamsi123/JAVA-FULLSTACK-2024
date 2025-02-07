class demo{
    public static void main(String[] args){
        //array declaration
        int[] a;
        //array creation
        a = new int[3];
        //printing array elements
        //array can start form 0 index
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println("=================");
        a[0]=10;
        a[1]=20;
        a[2]=30;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println("=================");
        //array declaration and creation
        double[] x = new double[4];
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println("=================");
        x[0] = 25;
        x[1] = 45;
        x[2] = 95;
        x[3] = 125;
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println("=================");
        //i want to find the length of the array.
        System.out.println("length of x :"+x.length);
        System.out.println("length of a :"+a.length);
    }
}