 /* _02switch = 
  * if there are ultiple condition then it is not recommened to use
  if-else if-else bcz dur to thid readability will be down and in this case 
  it is recomended to use switch statement
  */
class Test
{
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        switch (num) {
            case 10: System.out.println("ten");
                break;
            case 20:System.out.println("twenty"); 
                break;       
            default:System.out.println("invalid-choice");
                break;
        }
    }
}

/* 2 in switch statement we can pass following arguments
 * 1.4v        1.5v(refer class)     1.7v
 * byte           BYTE
 * short          SHORT              String
 * int            INTEGER 
 * char           CHARACTER
                    enum 
3 every cases should be in the range of provided input 
type otherwise we will get error
4 default is not mandatory
5 we can write default at any position but as a good 
programming practice it is recommended to keep default at the last 
position
6 FALL THROUGH PROPERTY OF SWITCH 
if any case match in switch then all the cases from that case
onwards will be executed untill any break or end
-->if we want to perfrom some common action for multiple 
cases then fall through property is very advantage property*/ 

class Test1
{
    public static void main(String[] args) {
        byte b=30;
        switch (b) {
            case 25:System.out.println(25);
            case 30:System.out.println(30); 
            case 40:System.out.println(40);
            // case 1000:System.out.println(1000); // byte range(-127 to 128) out of range
            // case b:System.out.println(40); //vaiable not allowed in switch case
            final byte x=30;
            switch (x) {
                default:System.out.println(50); // 5
                case x:System.out.println(40); // it is constant bcz of final value fixed
                     break;
                // case 10+20:System.out.println(40); 
                //case 10+20=case30 = case b so duplicate case value inside switch
                case 10+30:System.out.println(40);
                    break;
            }
        }
    }
}