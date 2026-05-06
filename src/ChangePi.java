public class ChangePi {
    public  String  changePi(String str){
        //Base Case
        if  (str.length() == 0){
            return "";
        }
        //Recursive Case
        else {
            if (str.startsWith("pi")){
                return "3.14" + changePi(str.substring(2));
            }
            else {
                char first = str.charAt(0);
                return first +changePi(str.substring(1));
            }
        }
    }
}
