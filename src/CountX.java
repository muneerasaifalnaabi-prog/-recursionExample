public class CountX {
    public int countX(String str) {
        //Base case
        if (str.length() == 0){
            return 0;
        }
        //Recursive Case
        else{
            char firstChar =str.charAt(0);
            if (firstChar=='x'){
                return 1 + countX(str.substring(1));
            }
            else
                return countX(str.substring(1));


        }

    }
}
