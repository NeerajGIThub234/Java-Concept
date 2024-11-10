/* _10conditional(?:)=
this is ternary category operator that means this is take 
3 operands 
condition ? a:b
if condition is true then it will return a otherwise b
2. nesting is posible
3. line of code reduce and readability will be increased*/
class Cond
{
public static void main(String[] args) {
    int n1=Integer.parseInt(args[0]);
    int n2=Integer.parseInt(args[1]);
    int n3=Integer.parseInt(args[2]);
    int n4=Integer.parseInt(args[3]);
    int max=(n1>n2&&n1>n3&&n1>n4)?n1:(n2>n3&&n2>n4?n2:(n3>n4?n3:n4));
    System.out.println(max);
}    
}
// we can also use if else instead of conditional statement but in else will increase line of code 