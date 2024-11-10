class student{

    int roll_no = 1;
    int age = 20;

    public static void main(String[] args) {
        student s1= new student();
        student s2= new student();
        s1.roll_no = 100;
        s2.age = 28;
        System.out.println(s1.roll_no);
        System.out.println(s2.roll_no);
        System.out.println(s1.age);
        System.out.println(s2.age);
        
    }
}