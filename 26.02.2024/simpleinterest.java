class simpleinterest{
    public static void main(String args[]){
        double p,t,r,si=0.0;
        p = Double.valueOf(args[0]);
        t = Double.valueOf(args[1]);
        r = Double.valueOf(args[2]);
        si = (p*t*r)/100;
        System.out.println("Simple Interest is :"+si);
    }
}