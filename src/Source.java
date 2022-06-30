public class Source {
    public static void main(String[] args) {
        String string = "1F-RUDYARD K1PL1NG";
        System.out.println(correct(string).equals("IF-RUDYARD KIPLING"));
    }
    public static String correct(String string) {
        return string.replace("5", "S").replace("0","O").replace("1","I");
    }
}
