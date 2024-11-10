/*_04forloop-
 * if we know no of iteration in advance then it is recommended 
 * to use for loop
 * 2. for loop having 3 section
 * 1) initialisation  2)conditional  3) increment/decrement
 * 3for loop execute in anticlockwise manner 
 * 4 inside intialization section of for loop we can declare multiple 
 * variables but all the variables should be of same type 
 * 5we can left condition section as empty and in this case 
 * condition will be treated as true and this will become infinite 
 * loop
 * 6 in condition section we only pass boolean otherwise we will
 *  get error  
 7 {} is optional in for loop without {} we can write single 
statement inside fo loop and that statement should not be declarative
 */
class Test{
    public static void main(String[] args) {
        for(int x=10,b=4;x<15;x++) //1 to 4
        {
            System.out.println("neeraj");
            System.out.println(b);
        }
    }
}
class Test1{
    public static void main(String[] args) {
        int x=10;
      //   for(;;x++) //5 valid 
        //for(System.out.println('b');;x++)  // 5
        // for(int b=4;System.out.println(b);b++) //6
         for( int b=4;b<6;System.out.println("bhatt")) // valid  infinite time neeraj bhatt..... if we not ude inside for b++
              System.out.println("neeraj");
    }
}
//unreachability problem 
class Test2
{
    public static void main(String[] args) {
       // for( int b=4;b>6;b--) // valid bcz compiler not check for vriable
         // for(int b=4;;b--)   // unreachable 
          // for(int b=4;true;b--) // unreachable 
         //  for(int b=4;false;b--) // unreachable
        //  for(int b=4;10>20;b--) // unreachable 
              System.out.println("neeraj");
              System.out.println("bhatt");
    }
}