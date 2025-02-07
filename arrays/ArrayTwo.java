class demo{
    public static void main(String[] args){
        //array initilization & declaration the values
        int[] a = {10,20,30,40,50,60,70,80};
        //printing the array values
        // these are the individual printing
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[5]);
        System.out.println(a[6]);
        System.out.println(a[7]);
        System.out.println("==================");
        
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println("==================");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
        System.out.println("==================");
        int[] data={10,20,30,40,50};
        int sum = 0;
        for(int i=0;i<data.length;i++){
            sum = sum + data[1];
        }
        System.out.println("Sum :"+sum); //100
        System.out.println("Average :"+sum/data.length); //20
    }
}