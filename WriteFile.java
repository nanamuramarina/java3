import java io.*;

public class WriteFile {
  public static void main (String[] args) {
    try {
      BufferedReader r = new BufferedReader (
        new InputStreamReader (System. in));
      PrintWriter w = new PrintWriter (
        new BufferedReader (new FileWriter("output.txt")));
        
        String str;
        while((str = r.readLine()) != nell) {
          w.println(str);
        }
        r.close();
        w.close();Logger.warn(param);
    } catch (I OException e) {
      System.out.println(e);
    }
  }
}