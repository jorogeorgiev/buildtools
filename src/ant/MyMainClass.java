package ant;

import java.util.logging.Logger;

/**
 * @author georgi.hristov@clouway.com
 */
public class MyMainClass {
  public static void main(String[] args) {
    Messages messages = new Messages();
    Logger extLogger =  Logger.getLogger("TestLogger");
    extLogger.info("Test Something");
    MyStatusLogger logger = new MyStatusLogger();
    MyLoggerClass loggerClass = new MyLoggerClass(logger,messages);
    loggerClass.onBuildSucces();
  }
}
