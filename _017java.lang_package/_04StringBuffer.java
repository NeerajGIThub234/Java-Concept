// CONSTRUCTORS OF STRINGBUFFER
// 1 StringBuffer sb= new StringBuffer();
// class Test
// {
//  public static void main(String[] args) {
//     StringBuffer sb= new StringBuffer();
//     System.out.println(sb.length());
//     System.out.println(sb.capacity());
//     sb.append("abcdefghijklmnop");
//     System.out.println(sb.length());
//     System.out.println(sb.capacity());
//     sb.append("q");
//     System.out.println(sb.length());
//     System.out.println(sb.capacity());
//  }    
// }

// 2 StringBuffer sb= new StringBuffer(int capacity);
// class Test
// {
//  public static void main(String[] args) {
//     StringBuffer sb= new StringBuffer(100);
//     System.out.println(sb.length());
//     System.out.println(sb.capacity());
//     for(int i=1;i<=100;i++){
//         sb.append("i");
//     }
//     System.out.println(sb.length());
//     System.out.println(sb.capacity());
//     sb.append("q");
//     System.out.println(sb.length());
//     System.out.println(sb.capacity());
//  }    
// }

// 3 StringBuffer sb= new StringBuffer(String content);
// class Test{
//     public static void main(String[] args) {
//         StringBuffer sb= new StringBuffer("neeraj");
//         System.out.println(sb.length());
//          System.out.println(sb.capacity());
//     }
// }

// METHODS OF STRINGBUFFER CLASS
// 1 public int length()
// 2 public int capacity()
// class Test{
//     public static void main(String[] args) {
//         StringBuffer sb= new StringBuffer("neeraj");
//         System.out.println(sb.length());
//          System.out.println(sb.capacity());
//     }
// }

// 3 public char charAt(int index)
// class Test{
//    public static void main(String[] args) {
//     StringBuffer sb=new StringBuffer("neeraj");
//     System.out.println(sb.charAt(4));
//     char ch=s.charAt(6);
//     System.out.println(ch);
//    } 
// }

// 4 public char setCharAt(int index,char ch);
// class Test{
//    public static void main(String[] args) {
//     StringBuffer sb=new StringBuffer("neeraj");
//     System.out.println(sb);
//     sb.setCharAt(4,'b');
//     System.out.println(sb);
//    } 
// }

/* 5 public StringBuffer append(String s);
                         append(int i);
                         append(byte b);
                         ........
it is applicable for all premitive data type */
// class Test{
//    public static void main(String[] args) {
//     StringBuffer sb=new StringBuffer("neeraj");
//     System.out.println(sb);
//     sb.append("bhatt");
//     System.out.println(sb);
//     sb.append(10);
//     System.out.println(sb);
//     sb.append(true);
//     System.out.println(sb);
//     sb.append('k');
//     System.out.println(sb);
//    } 
// }

/*/* 6 public StringBuffer insert(int index,String s);
                           insert(int index,int i);
                         ........
it is applicable for all premitive data type */
// class Test{
//    public static void main(String[] args) {
//     StringBuffer sb=new StringBuffer("neeraj");
//     System.out.println(sb);
//     sb.insert(6,"bhatt");
//     System.out.println(sb);
//     sb.insert(6,true);
//     System.out.println(sb);
//     sb.insert(4,10.5);
//     System.out.println(sb);
//    } 
// } 

// 7 public StringBuffer delete(int begin,int end);
// class Test{
//    public static void main(String[] args) {
//     StringBuffer sb=new StringBuffer("neerajbhatt");
//     System.out.println(sb);
//     sb.delete(6,11);
//     System.out.println(sb);
//    } 
// }

// 7 public StringBuffer deleteCharAt(int begin);
// class Test{
//    public static void main(String[] args) {
//     StringBuffer sb=new StringBuffer("neerajbhatt");
//     System.out.println(sb);
//     sb.deleteCharAt(6);
//     System.out.println(sb);
//    } 
// }

// 9 public StringBuffer reverse();
// class Test{
//     public static void main(String[] args) {
//         StringBuffer sb=new StringBuffer("neeraj");
//         System.out.println(sb);
//         sb.reverse();
//         System.out.println(sb);
//     }
// }

// 10 public void setLength(int length)
// class Test{
//     public static void main(String[] args) {
//         StringBuffer sb=new StringBuffer("neerajbhatt");
//         System.out.println(sb);
//         sb.setLength(6);
//         System.out.println(sb);
//     }
// }

// 11 public void ensureCapacity(int capacity);
// class Test{
//     public static void main(String[] args) {
//         StringBuffer sb=new StringBuffer("neeraj");
//         System.out.println(sb.capacity());
//         sb.ensureCapacity(200);
//         System.out.println(sb.capacity());
//     }
// }

// 12 public void trimToSize()
// class Test{
//     public static void main(String[] args) {
//         StringBuffer sb=new StringBuffer("neeraj");
//         System.out.println(sb.capacity());
//         sb.trimToSize();
//         System.out.println(sb.capacity());
//     }
// }