package ant;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author georgi.hristov@clouway.com
 */
public class MyLoggerClassTest {


  @Test
  public void testSomeFuncOfMyLoggerClass(){

    StatusLogger logger = mock(StatusLogger.class);
    Messages messages = new Messages();
    MyLoggerClass loggerClass = new MyLoggerClass(logger,messages);
    loggerClass.onBuildSucces();
    verify(logger).log(messages.onSuccess());

  }
}
