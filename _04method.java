//category1 metod with no argument and no return type
//class student
 //{
   // void marks()
    //{
      //  int sub1=10;
        //int sub2=20;
        //System.out.println(sub1+sub2);
    //}
    //public static void main(String[] args) {
      //  student s=new student();
        //s.marks();
 //   }
//}

//category2 metod with no argument but  have  return type
//class student
 //{
  //  int marks()
  //  {
    //    int sub1=10;
    //    int sub2=20;
    //    return sub1+sub2;
 //   }
   // public static void main(String[] args) {
      // student s=new student();
      //  int result=s.marks();
   // System.out.println(result);
    //System.out.println(result+10);
    //System.out.println(result+20);
   // }
//}

//category3  metod with argument but  have no  return type
//class student
 //{
   // void marks(int sub1, int sub2)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
     //  {
       // System.out.println(sub1+sub2);
     // } 
   // public static void main(String[] args) {
     //  student s=new student();
       // s.marks(20,30);
       // s.marks(200,300);
   // }
//}

//category4  metod with argument and  have   return type
class student
 {
    int marks(int sub1, int sub2)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
       {
        return sub1+sub2;
      } 
    
    public static void main(String[] args) {
       student s=new student();
        int result=s.marks(20,30);
        System.out.println(result);
        int result1=s.marks(200,300);
        System.out.println(result1+200);
    }
}