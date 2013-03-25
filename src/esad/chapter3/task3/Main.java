package esad.chapter3.task3;

/**
 * @author: grisha_angelov
 */
public class Main {
    public static String replaceSymbolsInIdNumber(String id) {
        return id.replace('-', ' ').replace('(', ' ').replace(')', ' ').replace('/', ' ');
    }

    public static String replaceInId(String id) {
        String symbols = "-()/";
        for (int i = 0; i < symbols.length(); i++) {
            id = id.replace(symbols.charAt(i), ' ');
        }
        return id;
    }

    public static void main(String[] args) {
        String str = "a-b(c)d/e";
        System.out.println(replaceSymbolsInIdNumber(str));
        System.out.println(replaceInId(str));
    }
}
