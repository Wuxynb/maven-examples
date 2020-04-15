package webadv.s17201321.lab1;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;
public class App {
    private static String username = "wuxinyue";
    private static String password = "17201321";
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Please input username and password!");
            System.exit(0);
        }
        System.out.println("username in file is:" + username + "\nyour input is:" + args[0]);
        System.out.println("password in file is:" + sha256hex(password) + "\nyour input is:" + sha256hex(args[1]));
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
