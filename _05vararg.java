class test  {
    void sum(int... a)
    {
        int total=0;
        for(int ele:a)
        {
            total=total+ele;
            System.out.println(total);
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        test t=new test();
        t.sum(30,40,50,60);
    }
}
