package ant;

/**
 * @author georgi.hristov@clouway.com
 */
public class MyMainClass {
  public static void main(String[] args) {
    Messages messages = new Messages();
    MyStatusLogger logger = new MyStatusLogger();
    MyLoggerClass loggerClass = new MyLoggerClass(logger,messages);
    loggerClass.onBuildSucces();
  }
}
