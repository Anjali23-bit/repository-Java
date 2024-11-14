public class Main {
  static int sum(int x,int y)
  {
    return x+y;
  }
  static int sum(int x,int y,int z)
  {
    return x+y+z;
  }
    public static void main(String[] args) {
      
      System.out.println(sum(2,3));
      System.out.println(sum(2,3,4));
  }
}