/* _07shortcircuit(&&,||)
 * &&(short circuit and)= if first condition is false then it not evaluated second 
 * condition and it will directly give result as false 
 * ||(short circuit or)= if first condition is true then it not evaluated second 
 * condition and it will directly give result as true 
 */
 class Test 
{
   public static void main(String[] args) {
    int x=10,y=15;
    if(++x<10 && ++y>15)
    {
        x++;
    }
    else{
        y++;
    }
    System.out.println(x);
    System.out.println(y);
   }    
}
class Test1
{
   public static void main(String[] args) {
    int x=10,y=15;
    if(++x<10 & ++y>15)
    {
        x++;
    }
    else{
        y++;
    }
    System.out.println(x);
    System.out.println(y);
   }    
}
 class Test2
 {
   
    public static void main(String[] args) {
        int x=10,y=15;
        System.out.println(++x>10 && ++y<15);
        System.out.println(++x>10 & ++y<15);
        System.out.println(++x>10 || ++y<15);
        System.out.println(++x>10 | ++y<15);
        System.out.println(++x>10 ^ ++y<15);
    }
 }