
public class SpacedLogger implements Logger {

  public void log(String log) {
    char[] logArray = log.toCharArray();
    String output = "";
    for(int a=0;a<logArray.length;a++) {
      output+=logArray[a];
      if(a<(logArray.length-1)) {
        output+=" ";
      }
    }
    
    System.out.println(output);
  }
  
  public void error(String error) {
    char[] logArray = error.toCharArray();
    String output = "";
    for(int a=0;a<logArray.length;a++) {
      output+=logArray[a];
      if(a<(logArray.length-1)) {
        output+=" ";
      }
    }
    System.out.println("ERROR: "+output);  
  }
  
  public void close() {
    
  }

}
