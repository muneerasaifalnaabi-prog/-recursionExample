public class PairStar {
 public String  pairStar(String str){
     //Base Case
     if (str.length() <=1){
       return str;
     }
     //Recursive Case
     else {
         String first = String.valueOf(str.charAt(0));
         String next = String.valueOf(str.charAt(1));
         if (first==next){
             return  first + "*" + pairStar(next);
         }
         else
            return first + pairStar(next);
     }
 }
}
