public class demo{
    public static void main(String args[]){
        int myNum=5;
        float myFloat= 5.4f;
        char myLetter= 'M';
        boolean myBool= true;
        String myText= "hello";
        System.out.println(myNum);
        System.out.println(myFloat);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
    // typecasting
     double d=35;
        int i= (int)d;
        float f=i;
        char ch='b';
        String s=String.valueOf(ch);
         System.out.println(d);
         System.out.println(i);
          System.out.println(f);
           System.out.println(ch);
           System.out.println(s);
            System.out.println(s instanceof String);
        System.out.println(s.getClass().getName());
        //Operators
        int x=43;
        int y=35;
        int z=Math.max(x,y);
        int a=Math.min(x,y);
    	  System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(y%x);
        System.out.println(x+=x);
        System.out.println(x-=20);
        System.out.println(x*=3);
        System.out.println(--y);
        System.out.println(x&=y);
        System.out.println(x|=y);
        System.out.println(y^x);
        System.out.println(x++);
        System.out.println(z);
        System.out.println(a);
           
           
    }
}
