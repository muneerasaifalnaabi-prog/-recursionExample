public class CountAbc {

    public int countAbc(String str) {

        if (str.length() < 3) {
            return 0;
        }

        String first3 = str.substring(0, 3);

        if (first3.equals("abc") || first3.equals("aba")) {
            return 1 + countAbc(str.substring(1));
        }

        return countAbc(str.substring(1));
    }
}