public class StrCount {
    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        else {
            //Recursive Case
            String start =  str.substring(0, sub.length());
            if (start.equals(sub)) {
                return 1 + strCount(str.substring(sub.length()), sub);
            }
            return strCount(str.substring(1), sub);
        }
    }
}
