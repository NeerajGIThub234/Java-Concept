/*length vs length():-
 * if we want to know total no of elements present in the array 
 * then we need to use length variable
 * if we want to total no of characters present in the string then
 * we need to use length() 
 */
class Test
{
    public static void main(String[] args) {
        String[] arr={"neeraj","shubham","ankit"};
        System.out.println(arr.length);
        System.out.println(arr[0].length());
        System.out.println(arr[1].length());
        System.out.println(arr[2].length());
      //  System.out.println(arr.length());
    //  System.out.println(arr[0].length);
    }
}

/*annoymous array:-
 * Anonymous array.
1.array without name is known as annoymous array
2. If have one time requirement with array then it is recommended
 to use Anonymous array.
3. If we have multiple time requirement of same array then it is
 recommended to use normal array.
 */
class Test1{
    static void sum(int[] arr1){
        int sum=0;
        for (int i : arr1) 
            sum=sum+i;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Test1.sum(new int[] {10,20,30,40,50});
        Test1.sum(new int[] {10,30,40,50});
    }
}
 /*. arrat element assignment 
 1. In the case of primitive type array as a part of array 
 elements either we can provide same primitive type value or any
type value that can be automatically promoted to that primitive
type.
Ex. In the case of int array we can pass byte, short, char, int 
as array elements
2. in the class type array as a part of array element either we can
provide same class object or it"s child class object 
*/
class Test2{
    int x;
    Test2(int x){
        this.x=x;
    }
    public static void main(String[] args) {
        Test2 [] arr=new Test2[30];
        arr[0]=new Test2(20);
        arr[1]=new Test2(30);
        System.out.println(arr[0].x);
        System.out.println(arr[1].x);
      //  System.out.println(arr[2].x); // null pointer exveption

        Object[] arr1=new Object[2];
        arr1[0]=new Object();
        arr1[1]=new String("neeraj");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

    }
}
/* array variable assignment
 * Element level promotions are not applicable to array.
Char->int valid 
char[]->int[] not valid
 */
class Test3
{
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int []arr1={50,80};
        arr=arr1;
        int sum=0;
        for (int i : arr) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
// class Test4
// {
//     public static void main(String[] args) {
//         int[] arr={10,20,30,40};
//         char []arr1={'a','b'}; // error
//         arr=arr1;
//         int sum=0;
//         for (int i : arr) {
//             sum=sum+i;
//         }
//         System.out.println(sum);
//     }
// }