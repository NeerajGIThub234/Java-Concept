class test
 {
  public static void main(int args) {
    System.out.println("int-main");
  }  
  public static void main(String... neeraj) {
    System.out.println("string... neeraj");
    main(10);
  }
}
