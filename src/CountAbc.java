public class CountAbc {
  public int countAbc(String str){
      int count =0;
      //Base Case
      if (str.length()<3){
          return 0;
      }
      else {
          //Recursive Case
          if (str.substring(0,3)=="abc" ||str.substring(0,3)=="aba" ){
              return 1 +countAbc(str.substring(1));
          }
          return countAbc(str.substring(1));
      }
  }
}
