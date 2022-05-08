/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:34:15 GMT 2022
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.HomeDescriptor;
import com.eteks.sweethome3d.tools.URLContent;
import java.net.URL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HomeDescriptor_ESTest extends HomeDescriptor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URLContent uRLContent0 = new URLContent(uRL0);
      HomeDescriptor homeDescriptor0 = new HomeDescriptor("", uRLContent0, uRLContent0);
      Content content0 = homeDescriptor0.getIcon();
      assertSame(content0, uRLContent0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URLContent uRLContent0 = new URLContent(uRL0);
      HomeDescriptor homeDescriptor0 = new HomeDescriptor("", uRLContent0, uRLContent0);
      Content content0 = homeDescriptor0.getContent();
      assertSame(content0, uRLContent0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URLContent uRLContent0 = new URLContent(uRL0);
      HomeDescriptor homeDescriptor0 = new HomeDescriptor("", uRLContent0, uRLContent0);
      String string0 = homeDescriptor0.getName();
      assertEquals("", string0);
  }
}
