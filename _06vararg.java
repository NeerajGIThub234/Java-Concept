class test
 {
    static void add(int a)
    {
        System.out.println("normal");
    }
    static void add(int... a)
    {
        System.out.println("vararg");
    }
    public static void main(String[] args) {
        add(10,20,30);
        add(20,50);
        add(10);
    }
}
