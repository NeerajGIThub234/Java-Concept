/*  _05for_each.java
 * It is introduced in 1.5 version
2. If we want to apply loop over array or collection then for-each
 loop is recommended to use while if we want general purpose loop
  then for loop is recommended to use
3. In the case of array and collection for loop is index based 
loop while for-each loop is value based loop.
4. By using for loop we can traverse elements of array and collection in both forward and backward direction while by using for-each loop we can only traverse in forward direction
 */
class Test
{
  public static void main(String[] args) {
    int[] arr={10,20,30,40,50};
    for(int i=1;i<=arr.length;i++)
        System.out.println(arr[i-1]);
    for (int ele : arr) 
        System.out.println(ele);
    for(int i=4;i>=0;i--) 
        System.out.println(arr[i]);   
  }    
}
