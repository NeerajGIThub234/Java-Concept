// // 1 HASH MAP
// import java.util.Collection;
// import java.util.HashMap;
// import java.util.Set;
// import java.util.Iterator;
// import java.util.Map;
// class Test{
//     public static void main(String[] args) {
//         HashMap m=new HashMap();
//         System.out.println(m.put(100, "neeraj"));
//         m.put(212, 'a');
//         m.put("madman", "madman");
//         m.put(300, true);
//         System.out.println(m.put(212, "nikita"));
//         System.out.println(m.get(100));
//         System.out.println(m);
//         System.out.println(m.remove(300));
//         System.out.println(m);
//         System.out.println(m.keySet());
//         System.out.println(m.values());
//         Collection c=m.values();
//         System.out.println(c);
//         Set s1=m.entrySet();
//         System.out.println(s1);
//         Iterator i=s1.iterator();
//         while (i.hasNext()) {
//             Object o=i.next();
//             Map.Entry e=(Map.Entry)o;
//             System.out.println(e.getKey());
//             System.out.println(e.getValue());
//         }
//     }
// }

// 2 IDENTITY HASH MAP
// import java.util.HashMap;
// import java.util.IdentityHashMap;
// class Test{
//     public static void main(String[] args) {
//         HashMap m=new HashMap();
//         Integer i1=new Integer(100);
//         Integer i2=new Integer(100);
//         m.put(i1, "neeraj");
//         m.put(i2, "bhatt");
//         IdentityHashMap m1=new IdentityHashMap();
//         m1.put(i1, "neeraj");
//         m1.put(i2, "bhatt");
//         System.out.println(m);
//         System.out.println(m1);
//     }
// }

// 3 WEEK HASHMAP
// import java.util.HashMap;
// import java.util.WeakHashMap;
// class Test 
// {
//     public static void main(String[] args)  throws InterruptedException{
//         //HashMap m=new HashMap();
//         // WeakHashMap m=new WeakHashMap();
//         Test t=new Test();
//         m.put(t,"csd");
//         System.out.println(m);
//         t=null;
//         System.gc();
//         Thread.sleep(1000);
//         System.out.println(m);

//     }
//     public String toString(){
//         return "Test";
//     }
//     public void finalize(){
//         System.out.println("finialize method");
//     }
// }

//4 SORTED MAP
// 4.1 TREE MAP
// import java.util.TreeMap;
// class Test{
// public static void main(String[] args) {
//     TreeMap m=new TreeMap();
//     m.put(100,"csd");
//     m.put(200,'n');
//     m.put(300,true);
//     System.out.println(m);
//     // m.put("nik", 10);
//     m.put(null, 90);
// }
// }