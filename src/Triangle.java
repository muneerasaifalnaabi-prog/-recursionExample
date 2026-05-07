public class Triangle {
  public  int  triangle(int n) {
      //Base Case
      if (n==0) {
          return 0;
      }
      //Recursive Case
      return  n + triangle(n - 1);
  }
}
