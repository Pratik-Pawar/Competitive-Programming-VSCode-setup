
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.*;

public class Templete {

    Object solve() {

        return null;
    }

    public static void main(String[] args) {
        if(args.length==1&&args[0].equals("#Local")){
        try {
            String cwd=System.getProperty("user.dir");
            System.setIn(new FileInputStream(cwd+"\\input.txt"));
            System.setOut(new PrintStream(cwd+"\\output.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }}
        ip=new Scanner(System.in);
        Templete s = new Templete();
        T = 1;
        T = ip.nextInt();
        for (t = 1; t <= T; t++) {
//            System.out.println("Case #" + t + ": " + s.solve());
            System.out.println(s.solve());
        }
    }
    static int t, T;
    static Scanner ip;
}