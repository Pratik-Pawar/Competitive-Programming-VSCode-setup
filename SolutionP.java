
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.math.*;

public class Solution {

    Object solve() {
        String input1 = ip.nextLine();
        String input2 = ip.nextLine();
        
    }

    public static void main(String[] args) {
        if (args.length == 1 && args[0].contains("#Local")) {
            try {
                String cwd = System.getProperty("user.dir");
                System.setIn(new FileInputStream(cwd + "/input.txt"));
                System.setOut(new PrintStream(cwd + "/output.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
        ip = new Scanner(System.in);
        Solution s = new Solution();
        T = 1;
        T = ip.nextInt();
        ip.nextLine();

        for (t = 1; t <= T; t++) {
            // System.out.println("Case #" + t + ": " + s.solve());
            System.out.println(s.solve());
        }
    }

    static int t, T;
    static Scanner ip;
}