/*_09assignment=
 * 3 types
 * 1. simple assignment operator=
 * eg.-int x=10;
 * 
 * 2. chained assignment operator=
 * if we want to assign same value to miltiple variables then it 
 * is recommended to use 
  
 3.compound assignment operator
 if we combine assignment operator with any other operator then it
 comes under compound assignment operator
 it perform internally typecasting
 a+=5 => a=(tyope 0f a)(a+5);  */
 class Ass
{
    public static void main(String[] args) {
        int b,c,d;
        int a=b=c=d=25; //2
        System.out.println(a+" "+b+" "+c+" "+d);
        a+=5; // 3
        b-=5; // 3
        c&=5; // 3
        d*=5; //3
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}
