/* difference between static and instance variable
we can access static variable directly from both instance and static area
we can acees instance variable directly from the instance area but we cannot access
instance variable directly from the static area*/ 
 class Test
{
      static int x=10;
      int y=20;
      public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        t1.y=200;
        t1.m1();
        t2.m1();
        System.out.println("end");
      }
      void m1()
      {
        System.out.println(x);
        System.out.println(y);
      }
    
}
