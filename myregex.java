import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class myregex {

    public static void main(String arg[]) {
        Pattern p = Pattern.compile(".*s*");
        Matcher m = p.matcher("mysq");
        boolean b = m.matches();
        System.out.println(b);
    }
}
