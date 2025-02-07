class  demo{
    public static void main(String[] args) {
        //First method 
        /*int[] j=new  int[5];
        j[0]=50;
        j[2]=100;
        j[4]=120;
        System.out.println(j[0]); //50
        System.out.println(j[1]); //0
        System.out.println(j[2]); //100
        System.out.println(j[3]); //0
        System.out.println(j[4]); //120
        j[2]=200;
        System.out.println(j[2]);
        j[4]=400;
        System.out.println(j[4]);
        for(int i=0;i<j.length;i++){
            System.out.println(j[i]);
        }
        int i=0;
        while(i<j.length){
            System.out.println(j[i]);
            i++;
        }*/
       //Second method
       /*int[] j= {50,500,250,450,800};
       int i=0;
       while(i<j.length){
        System.out.println(j[i]);
        i++;
       }*/
      //Third method
      int[] j;
      j=new int[]{45,125,350,36,97,100};
      System.out.println("Size is"+j.length);
      for(int i=0;i<j.length;i++){
        System.out.println(j[i]);
      }

      int[] k=new int[]{45,125,350,36,97,100};
      System.out.println("Size is"+k.length);
      for(int i=0;i<k.length;i++){
        System.out.println(k[i]);
      }
    }
}