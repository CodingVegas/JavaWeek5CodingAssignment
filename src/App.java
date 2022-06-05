
public class App {

  public static void main(String[] args) {
    Logger logger = new SpacedLogger();
 
    logger.log("Please log this.");
    logger.error("Oops, this is an error!");
  }

}
