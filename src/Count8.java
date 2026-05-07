public class Count8 {
    public int count8(int n){
        //Base Case
        if (n==0){
            return 0;
        }
        //Recursive Case
        else{
            int lastDigit = n%10;
            int sconedLastDigit =  (n / 10) % 10;
            int removelastDigit = n/10;
            int count =0 ;
            if (lastDigit == 8 && sconedLastDigit == 8) {
                count = 2;
            } else if (lastDigit==8) {
                count=1;
            }
            else {
                count =0;
        }
            return
        }

    }
}
