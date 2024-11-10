 class _08commandlinearg {
    public static void main(String[] args) {
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[0]+args[1]);
        System.err.println(num1+num2);
    }
}
