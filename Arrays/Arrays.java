public class Arrays{
  
    public static void main(String[] args) {
        int[] a= new int[4];
        a[0]=1;
        a[1]=3;
        a[2]=6;
        a[3]=7;
      for (int i=0;i<a.length;i++){
        System.out.println(a[i]);
      } 
      // one dimentional array
      System.out.println("// another array");
      int b[]= {4,5,6,7,5};  
     for (int i : b) {
        System.out.println(i);
     }
     //two dimentional array   
      System.out.println("// another array");
      int c[][]={
          {2,3,6},{5,7,8},{9,5,9}
      };
    for(int i=0;i<c.length;i++){
        for(int j=0;j<c.length;j++){
            System.out.print(c[i][j]+" ");
        }
        System.out.println(" ");
    }
    //passing array to a method
    System.out.println("// another array");
      int d[]={2,4,5};
      A.min(d);
      //copying an array
      System.out.println("// another array");
      int e[]=new int[3];
      System.arraycopy(a,1 ,e ,0 ,3 );
      for(int i=0;i<e.length;i++)
      System.out.println(e[i]);
    }
   
  
    }
