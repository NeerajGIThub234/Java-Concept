 /*_07transfer
 The following statements comes under transfer statement
1. break
2. continue
3. return
4. try-catch-finally
5. assert

1. break
In java we can use break statement at following 3 places
1. inside switch
2. inside loop
3. inside label

2. continue
continue means skip current iteration and continue with the next
 iteration
we can only use continue inside loop */ 

// break inside switch (switch example_)
// break inside loop

import javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler;

class Test{
    public static void main(String[] args) {
        int[] arr={100,200,300,500,400};
        int total=0;
        for(int price:arr)
        {
            if( price>400)
              break;
            total=total+price;
            System.out.println(total);  
        }
        System.out.println(total);
    }
    
}

// break inside label
class Test1{
    public static void main(String[] args) {
        int x=10;
        csd:
        {
            System.out.println("start");
            if(x==10)
              break csd;
            System.out.println("end");  
        }
        System.out.println("end1");
    }
}

//continue 
class Test2{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i%2!=0)
              continue;
            System.out.println(i);  
        }
    }
}

class Test3
{
    public static void main(String[] args) {
        int x=1;
        do {
            System.out.println(x);
            x++;
            if (x++<=5) 
                continue;
            x++;
           System.out.println(x); 
        } while (++x<10);
    }
}

class Student{
    public static void main(String[] args) {
        csd:
           for(int i=0;i<3;i++)
            {
                for(int j=0;j<2;j++)
                {
                    if(j==1)
                      // break;
                     //  break csd;
                     //continue;
                      continue csd;
                     System.out.println(i+" "+j); 
                }
            }
    }
}