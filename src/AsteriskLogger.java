import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class AsteriskLogger implements Logger {
  
  private BufferedWriter writer;
  
  public static void boxString(String contents) {
    Date date = new Date();
    String stars = "";
    for (int a=1;a<=contents.length()+6;a++) {
      stars+="*";
    }
    System.out.println(date.toString());
    System.out.println(stars);
    System.out.println("***"+contents+"***");
    System.out.println(stars);
  }
  
  public void log(String log) {
    Date date = new Date();
    System.out.println(date.toString());
    System.out.println("***"+log+"***");
  }

@Override
public void error(String error) {
  boxString(error);
}

@Override
public void close() {
  try {
    writer.close();
  } catch (IOException e) {
    e.printStackTrace();
  }
}
}