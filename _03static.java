class student3 {
    int roll_no=10;
    static String cname="rtu";
     public static void main(String[] args) {
        student3 s1 =new student3();
        student3 s2 =new student3();
        System.out.println(s1.roll_no);
        System.out.println(s1.cname);
        System.out.println(s2.roll_no);
        System.out.println(s2.cname);
        s1.roll_no=200;
        s1.cname="neeraj";
        System.out.println(s1.roll_no);
        System.out.println(s1.cname);
        System.out.println(s2.roll_no);
        System.out.println(s2.cname);


    } 
        
    }

    

