package Practice;
import java.util.StringTokenizer;
public class FileHandlingAndTokeniztion {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer ("I love reading books, especially non-fiction", ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
