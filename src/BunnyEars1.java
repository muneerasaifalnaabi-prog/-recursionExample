public class BunnyEars1 {
    public int bunnyEars(int n) {
        //Base Case
        if (n == 0) {
            return 0;
        }
        //Recursive Case
        else {
            if (n == 2) {
                return 2 + bunnyEars(n - 1);
            }

        }
    }
}
