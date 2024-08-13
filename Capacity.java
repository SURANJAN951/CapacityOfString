public class Capacity {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity());
        str.append("abcdefghijklmnop");
        System.out.println(str.capacity());
         str.append("q");
        System.out.println(str.capacity());
    }
}
