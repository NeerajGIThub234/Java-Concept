/* _06bitwise(&,|,^)=
we can apply bitwise operator on boolean type-
1. &(and)= both the operands are true then it will return true otherwise false
2. |(or)= both the operands are false then it will return false otherwise true
3. ^(ex-or) = both the operands are different then it will return true otherwise false
4. we can also aplly this 3 on integral type(byte,short,int,long)
5. we can't apply this  3 on floating type(float,double)

bitwise compliment operator(~)=
6. apply only integral type not on boolean type
7. -ve no store in the 2's compliment from in the memory 
2's compliment = 1's compliment+1

8. bitwise compliment operator(!)
this will only applicable for boolean change true to false and fasle to true*/ 
class Test
 {
    public static void main(String[] args) {
        System.out.println(true&false); 
        System.out.println(false|true);
        System.out.println(true^false);
        System.out.println(58&72); //4
        System.out.println(58|72); //4
        System.out.println(58^72); //4
       // System.out.println(58.4&78); //5
        System.out.println(~45); //6
        System.out.println(!false); //8
    }
}
