public class StrCountDemo {
    public static void main(String[] args) {
        StrCount strCount=new StrCount();
        System.out.println(strCount.strCount("catcowcat", "cat"));
        System.out.println(strCount.strCount("catcowcat", "cow"));
        System.out.println(strCount.strCount("catcowcat", "dog"));

    }

}
