

import org.junit.Test;
import org.junit.Assert;

public class URLDecompTest {

  @Test(expected = RuntimeException.class)
  public final void whenInputIsNotStringThenExceptionIsThrownProtocol(){
    Problem1.getProtocol(2);
  }
  @Test(expected = RuntimeException.class)
  public final void whenInputIsNotStringThenExceptionIsThrownDomain(){
    Problem1.getDomain(false);
  }
  @Test(expected = RuntimeException.class)
  public final void whenInputIsNotStringThenExceptionIsThrownPath(){
    Problem1.getPath(1);
  }

  @Test(expected = RuntimeException.class)
  public final void whenInputIsMoreThanOneStringThenExceptionIsThrownProtocol(){
    Problem1.getProtocol("StringOne", "StringTwo");
  }
  @Test(expected = RuntimeException.class)
  public final void whenInputIsMoreThanOneStringThenExceptionIsThrownDomain(){
    Problem1.getDomain("StringOne", "StringTwo");
  }
  @Test(expected = RuntimeException.class)
  public final void whenInputIsMoreThanOneStringThenExceptionIsThrownPath(){
    Problem1.getPath("StringOne", "StringTwo");
  }
  @Test
  public final void whenInputIsOneStringNoExceptionIsThrownProtocol(){
    Assert.assertEquals("", Problem1.getProtocol("String"));
  }
  @Test
  public final void whenInputIsOneStringNoExceptionIsThrownDomain(){
    Assert.assertEquals("", Problem1.getDomain("String"));
  }
  @Test
  public final void whenInputIsOneStringNoExceptionIsThrownPath(){
    Assert.assertEquals("", Problem1.getPath("String"));
  }
  @Test
  public final void whenEmptyStringIsUsedThenReturnValueEmptyStringPath() {
    Assert.assertEquals("", Problem1.getPath(""));
  }
  @Test
  public final void whenEmptyStringIsUsedThenReturnValueEmptyStringProtocol() {
    Assert.assertEquals("", Problem1.getProtocol(""));
  }
  @Test
  public final void whenEmptyStringIsUsedThenReturnValueEmptyStringDomain() {
    Assert.assertEquals("", Problem1.getDomain(""));
  }
  @Test
  public final void whenValidStringIsUsedThenReturnValueIsDomain() {
    Assert.assertEquals("www.google.com", Problem1.getDomain("https://www.google.com/some-path"));
  }
  @Test
  public final void whenValidStringIsUsedThenReturnValueIsProtocol() {
    Assert.assertEquals("ftp", Problem1.getProtocol("ftp://bu.edu/"));
  }
  @Test
  public final void whenValidStringIsUsedThenReturnValueIsPath() {
    Assert.assertEquals("some-news-story", Problem1.getPath("https://www.cnn.com/some-news-story"));
  }
  @Test
  public final void whenURLHasNoPathShouldReturnEmptyString() {
    Assert.assertEquals("", Problem1.getPath("ftp://bu.edu/"));
  }
  @Test
  public final void whenURLHasMultipleBackslahesShouldStillReturnCorrectly() {
    Assert.assertEquals("thispath/thatpath/allthepaths", Problem1.getPath("https://domain.com/thispath/thatpath/allthepaths"));
  }

}