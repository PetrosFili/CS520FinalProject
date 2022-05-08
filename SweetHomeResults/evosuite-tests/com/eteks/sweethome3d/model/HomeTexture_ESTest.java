/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:45:34 GMT 2022
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.HomeTexture;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import com.eteks.sweethome3d.tools.SimpleURLContent;
import com.eteks.sweethome3d.tools.TemporaryURLContent;
import java.net.URL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HomeTexture_ESTest extends HomeTexture_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("@b=1[t<>Tx!?{^", resourceURLContent0, 0.0F, 0.0F, true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, 0.0F, 4085.452F, 427.65F, true);
      HomeTexture homeTexture1 = new HomeTexture(homeTexture0);
      HomeTexture homeTexture2 = new HomeTexture(homeTexture0);
      boolean boolean0 = homeTexture1.equals(homeTexture2);
      assertTrue(homeTexture2.isLeftToRightOriented());
      assertEquals(0.0F, homeTexture2.getAngle(), 0.01F);
      assertEquals(0.0F, homeTexture2.getYOffset(), 0.01F);
      assertEquals(1.0F, homeTexture2.getScale(), 0.01F);
      assertFalse(homeTexture2.equals((Object)homeTexture0));
      assertEquals(0.0F, homeTexture0.getWidth(), 0.01F);
      assertTrue(boolean0);
      assertFalse(homeTexture2.isFittingArea());
      assertEquals(0.0F, homeTexture0.getHeight(), 0.01F);
      assertEquals(0.0F, homeTexture2.getXOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("@b=1[t<>Tx!?{^", resourceURLContent0, 0.0F, 0.0F, true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, 0.0F, 4085.452F, 427.65F, true);
      HomeTexture homeTexture1 = new HomeTexture(homeTexture0);
      HomeTexture homeTexture2 = new HomeTexture(homeTexture1, 0.0F, 0.0F, true);
      boolean boolean0 = homeTexture1.equals(homeTexture2);
      assertFalse(homeTexture2.isFittingArea());
      assertEquals(0.0F, homeTexture2.getYOffset(), 0.01F);
      assertEquals(0.0F, homeTexture2.getXOffset(), 0.01F);
      assertFalse(boolean0);
      assertEquals(0.0F, homeTexture2.getScale(), 0.01F);
      assertEquals(0.0F, homeTexture2.getAngle(), 0.01F);
      assertEquals(0.0F, homeTexture2.getHeight(), 0.01F);
      assertTrue(homeTexture2.isLeftToRightOriented());
      assertEquals(0.0F, homeTexture2.getWidth(), 0.01F);
      assertFalse(homeTexture2.equals((Object)homeTexture1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("@b=1[t<>Tx!?{^", resourceURLContent0, 0.0F, 0.0F, true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, 0.0F, 4085.452F, 427.65F, false);
      HomeTexture homeTexture1 = new HomeTexture(homeTexture0, 0.0F, 0.0F, false);
      homeTexture1.setFittingArea(true);
      boolean boolean0 = homeTexture0.equals(homeTexture1);
      assertFalse(homeTexture0.isFittingArea());
      assertTrue(homeTexture1.isFittingArea());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("@b=1[t<>Tx!?${^", resourceURLContent0, (-910.0231F), (-910.0231F), true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, 0.0F, 4085.452F, 427.65F, false);
      HomeTexture homeTexture1 = new HomeTexture(homeTexture0, 0.0F, 1204.173F, (-1369.9855F), 0.0F, false, true);
      boolean boolean0 = homeTexture0.equals(homeTexture1);
      assertFalse(boolean0);
      assertEquals(0.0F, homeTexture1.getScale(), 0.01F);
      assertTrue(homeTexture1.isLeftToRightOriented());
      assertEquals((-910.0231F), homeTexture0.getWidth(), 0.01F);
      assertEquals(0.0F, homeTexture1.getXOffset(), 0.01F);
      assertEquals((-910.0231F), homeTexture0.getHeight(), 0.01F);
      assertEquals((-1369.9855F), homeTexture1.getAngle(), 0.01F);
      assertFalse(homeTexture1.isFittingArea());
      assertEquals(1204.173F, homeTexture1.getYOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, false);
      CatalogTexture catalogTexture0 = new CatalogTexture("yrn.b9]<;cCp)1", resourceURLContent0, (-910.0231F), (-910.0231F), false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, (-910.0231F), (-910.0231F), (-910.0231F), (-910.0231F), false);
      HomeTexture homeTexture1 = new HomeTexture(homeTexture0, (-910.0231F), (-910.0231F), false);
      boolean boolean0 = homeTexture0.equals(homeTexture1);
      assertEquals((-910.0231F), homeTexture0.getWidth(), 0.01F);
      assertEquals(0.0F, homeTexture1.getYOffset(), 0.01F);
      assertEquals((-910.0231F), homeTexture1.getAngle(), 0.01F);
      assertFalse(homeTexture1.isFittingArea());
      assertEquals((-910.0231F), homeTexture1.getScale(), 0.01F);
      assertEquals(0.0F, homeTexture1.getXOffset(), 0.01F);
      assertFalse(boolean0);
      assertFalse(homeTexture1.isLeftToRightOriented());
      assertEquals((-910.0231F), homeTexture0.getHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("@b=1[t<>Tx!?{^", resourceURLContent0, 0.0F, 0.0F, true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, 0.0F, 4085.452F, 427.65F, false);
      CatalogTexture catalogTexture1 = new CatalogTexture("@b=1[t<>Tx!?{^", resourceURLContent0, 0.0F, 427.65F);
      HomeTexture homeTexture1 = new HomeTexture(catalogTexture1, 1870.8074F);
      boolean boolean0 = homeTexture0.equals(homeTexture1);
      assertFalse(homeTexture1.isFittingArea());
      assertEquals(0.0F, homeTexture1.getXOffset(), 0.01F);
      assertEquals(0.0F, homeTexture1.getYOffset(), 0.01F);
      assertEquals(1870.8074F, homeTexture1.getAngle(), 0.01F);
      assertTrue(homeTexture1.isLeftToRightOriented());
      assertEquals(1.0F, homeTexture1.getScale(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("@b=1[t<>Tx!?{^", resourceURLContent0, 0.0F, 0.0F, true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, 0.0F, 4085.452F, 427.65F, false);
      CatalogTexture catalogTexture1 = new CatalogTexture("@b=1[t<>Tx!?{^", resourceURLContent0, (-2562.79F), 427.65F);
      HomeTexture homeTexture1 = new HomeTexture(catalogTexture1, 1870.8074F);
      boolean boolean0 = homeTexture0.equals(homeTexture1);
      assertFalse(boolean0);
      assertFalse(homeTexture1.isFittingArea());
      assertTrue(homeTexture1.isLeftToRightOriented());
      assertEquals(0.0F, homeTexture1.getYOffset(), 0.01F);
      assertEquals(0.0F, homeTexture1.getXOffset(), 0.01F);
      assertEquals(1.0F, homeTexture1.getScale(), 0.01F);
      assertEquals(1870.8074F, homeTexture1.getAngle(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("yrn.b9U<GbCp)1", resourceURLContent0, (-910.0231F), (-910.0231F));
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, (-910.0231F));
      CatalogTexture catalogTexture1 = new CatalogTexture("yrn.b9]<;cCp)1", "yrn.b9U<GbCp)1", (Content) null, (-910.0231F), (-910.0231F), "Z{", true);
      HomeTexture homeTexture1 = new HomeTexture(catalogTexture1, (-910.0231F), (-910.0231F), true);
      boolean boolean0 = homeTexture1.equals(homeTexture0);
      assertTrue(homeTexture1.isLeftToRightOriented());
      assertFalse(boolean0);
      assertEquals((-910.0231F), homeTexture1.getAngle(), 0.01F);
      assertEquals((-910.0231F), homeTexture1.getScale(), 0.01F);
      assertEquals(0.0F, homeTexture1.getXOffset(), 0.01F);
      assertEquals(0.0F, homeTexture1.getYOffset(), 0.01F);
      assertFalse(homeTexture1.isFittingArea());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("yrn.b9U<GbCp)1", resourceURLContent0, (-910.0231F), (-910.0231F));
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, (-910.0231F));
      CatalogTexture catalogTexture1 = new CatalogTexture("yrn.b9]<;cCp)1", "yrn.b9U<GbCp)1", (Content) null, (-910.0231F), (-910.0231F), "Z{", true);
      HomeTexture homeTexture1 = new HomeTexture(catalogTexture1, (-910.0231F), (-910.0231F), true);
      boolean boolean0 = homeTexture0.equals(homeTexture1);
      assertEquals((-910.0231F), homeTexture1.getScale(), 0.01F);
      assertEquals((-910.0231F), homeTexture1.getAngle(), 0.01F);
      assertFalse(boolean0);
      assertTrue(homeTexture1.isLeftToRightOriented());
      assertEquals(0.0F, homeTexture1.getXOffset(), 0.01F);
      assertFalse(homeTexture1.isFittingArea());
      assertEquals(0.0F, homeTexture1.getYOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("yrn.b9]<;cCp)1", resourceURLContent0, (-910.0231F), (-910.0231F), true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, (-910.0231F), (-910.0231F), (-910.0231F), (-910.0231F), true);
      CatalogTexture catalogTexture1 = new CatalogTexture("yrn.b9U<GbCp)1", resourceURLContent0, (-910.0231F), (-910.0231F));
      HomeTexture homeTexture1 = new HomeTexture(catalogTexture1, (-910.0231F));
      boolean boolean0 = homeTexture0.equals(homeTexture1);
      assertTrue(homeTexture1.isLeftToRightOriented());
      assertEquals(1.0F, homeTexture1.getScale(), 0.01F);
      assertFalse(homeTexture1.isFittingArea());
      assertFalse(boolean0);
      assertEquals(0.0F, homeTexture1.getXOffset(), 0.01F);
      assertEquals((-910.0231F), homeTexture1.getAngle(), 0.01F);
      assertEquals(0.0F, homeTexture1.getYOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("yrn.b9]<;/Cp)1", resourceURLContent0, (-910.0231F), (-910.0231F), true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, 0.0F, 4085.452F, 0.0F, true);
      CatalogTexture catalogTexture1 = new CatalogTexture((String) null, resourceURLContent0, (-2562.79F), 0.0F);
      HomeTexture homeTexture1 = new HomeTexture(catalogTexture1, (-2562.79F));
      boolean boolean0 = homeTexture0.equals(homeTexture1);
      assertTrue(homeTexture1.isLeftToRightOriented());
      assertEquals(1.0F, homeTexture1.getScale(), 0.01F);
      assertFalse(boolean0);
      assertEquals((-2562.79F), homeTexture1.getAngle(), 0.01F);
      assertEquals(0.0F, homeTexture1.getXOffset(), 0.01F);
      assertFalse(homeTexture1.isFittingArea());
      assertEquals(0.0F, homeTexture1.getYOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("!Z2k9E5", (Content) null, 0.0F, 0.0F);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, true);
      boolean boolean0 = homeTexture0.equals(catalogTexture0);
      assertFalse(homeTexture0.isFittingArea());
      assertEquals(0.0F, homeTexture0.getAngle(), 0.01F);
      assertEquals(1.0F, homeTexture0.getScale(), 0.01F);
      assertFalse(boolean0);
      assertTrue(homeTexture0.isLeftToRightOriented());
      assertEquals(0.0F, homeTexture0.getYOffset(), 0.01F);
      assertEquals(0.0F, homeTexture0.getXOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("yrn.b9]<;/Cp)1", resourceURLContent0, (-910.0231F), (-910.0231F), true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, 0.0F, 4085.452F, 0.0F, true);
      HomeTexture homeTexture1 = new HomeTexture(homeTexture0, (-910.0231F), (-910.0231F), true);
      boolean boolean0 = homeTexture0.equals(homeTexture1);
      assertEquals(0.0F, homeTexture1.getXOffset(), 0.01F);
      assertEquals(0.0F, homeTexture1.getYOffset(), 0.01F);
      assertEquals((-910.0231F), homeTexture0.getHeight(), 0.01F);
      assertEquals((-910.0231F), homeTexture0.getWidth(), 0.01F);
      assertEquals((-910.0231F), homeTexture1.getAngle(), 0.01F);
      assertEquals((-910.0231F), homeTexture1.getScale(), 0.01F);
      assertTrue(homeTexture1.isLeftToRightOriented());
      assertFalse(boolean0);
      assertFalse(homeTexture1.isFittingArea());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("!Z2k9E5", (Content) null, 0.0F, 0.0F);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, true);
      homeTexture0.hashCode();
      assertEquals(0.0F, homeTexture0.getXOffset(), 0.01F);
      assertEquals(1.0F, homeTexture0.getScale(), 0.01F);
      assertFalse(homeTexture0.isFittingArea());
      assertEquals(0.0F, homeTexture0.getYOffset(), 0.01F);
      assertEquals(0.0F, homeTexture0.getAngle(), 0.01F);
      assertTrue(homeTexture0.isLeftToRightOriented());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("yrn.b9]<;/Cp)1", resourceURLContent0, (-910.0231F), (-910.0231F), true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, 0.0F, 4085.452F, 0.0F, true);
      homeTexture0.hashCode();
      assertFalse(homeTexture0.isFittingArea());
      assertEquals(0.0F, homeTexture0.getScale(), 0.01F);
      assertEquals(0.0F, homeTexture0.getYOffset(), 0.01F);
      assertEquals(0.0F, homeTexture0.getXOffset(), 0.01F);
      assertEquals(4085.452F, homeTexture0.getAngle(), 0.01F);
      assertTrue(homeTexture0.isLeftToRightOriented());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      TemporaryURLContent temporaryURLContent0 = new TemporaryURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture((String) null, (String) null, temporaryURLContent0, (-1714), (-1714), (String) null, false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, (-1714), (-1714), (-1714), (-1714), false, false);
      homeTexture0.hashCode();
      assertFalse(homeTexture0.isFittingArea());
      assertFalse(homeTexture0.isLeftToRightOriented());
      assertEquals((-1714.0F), homeTexture0.getYOffset(), 0.01F);
      assertEquals((-1714.0F), homeTexture0.getAngle(), 0.01F);
      assertEquals((-1714.0F), homeTexture0.getXOffset(), 0.01F);
      assertEquals((-1714.0F), homeTexture0.getScale(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("-/Ge", "iI'x_FK", (Content) null, 0.0F, 0.0F, ")5nE?tgKPT", true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, 0.0F, 3503.0F, 0.0F, true);
      float float0 = homeTexture0.getYOffset();
      assertFalse(homeTexture0.isFittingArea());
      assertEquals(0.0F, float0, 0.01F);
      assertTrue(homeTexture0.isLeftToRightOriented());
      assertEquals(0.0F, homeTexture0.getXOffset(), 0.01F);
      assertEquals(3503.0F, homeTexture0.getAngle(), 0.01F);
      assertEquals(0.0F, homeTexture0.getScale(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, false);
      CatalogTexture catalogTexture0 = new CatalogTexture("x]hWfGyu:;4vTtY[Ry", "", resourceURLContent0, 0.0F, 0.0F, "");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, (-959.0F), (-959.0F), 0.0F, false, true);
      float float0 = homeTexture0.getScale();
      assertTrue(homeTexture0.isLeftToRightOriented());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, homeTexture0.getXOffset(), 0.01F);
      assertEquals((-959.0F), homeTexture0.getYOffset(), 0.01F);
      assertFalse(homeTexture0.isFittingArea());
      assertEquals((-959.0F), homeTexture0.getAngle(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("@b=1[t<>Tx!?{^", resourceURLContent0, 0.0F, 0.0F, true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, 0.0F, 4085.452F, 427.65F, false);
      HomeTexture homeTexture1 = new HomeTexture(homeTexture0);
      HomeTexture homeTexture2 = new HomeTexture(homeTexture1, 0.0F, 0.0F, false);
      boolean boolean0 = homeTexture1.equals(homeTexture2);
      assertEquals(0.0F, homeTexture2.getXOffset(), 0.01F);
      assertEquals(0.0F, homeTexture2.getYOffset(), 0.01F);
      assertEquals(0.0F, homeTexture2.getWidth(), 0.01F);
      assertEquals(0.0F, homeTexture2.getHeight(), 0.01F);
      assertFalse(homeTexture2.isLeftToRightOriented());
      assertEquals(0.0F, homeTexture2.getAngle(), 0.01F);
      assertEquals(0.0F, homeTexture2.getScale(), 0.01F);
      assertFalse(boolean0);
      assertFalse(homeTexture2.isFittingArea());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      SimpleURLContent simpleURLContent0 = new SimpleURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("", "", simpleURLContent0, 1477.51F, 437.715F, "", false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 437.715F, false);
      float float0 = homeTexture0.getXOffset();
      assertFalse(homeTexture0.isLeftToRightOriented());
      assertFalse(homeTexture0.isFittingArea());
      assertEquals(437.715F, homeTexture0.getAngle(), 0.01F);
      assertEquals(1.0F, homeTexture0.getScale(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, homeTexture0.getYOffset(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      SimpleURLContent simpleURLContent0 = new SimpleURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("", "", simpleURLContent0, 1477.51F, 437.715F, "", false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 437.715F, false);
      float float0 = homeTexture0.getAngle();
      assertFalse(homeTexture0.isFittingArea());
      assertEquals(0.0F, homeTexture0.getYOffset(), 0.01F);
      assertEquals(0.0F, homeTexture0.getXOffset(), 0.01F);
      assertEquals(437.715F, float0, 0.01F);
      assertFalse(homeTexture0.isLeftToRightOriented());
      assertEquals(1.0F, homeTexture0.getScale(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("-/Ge", "iI'x_FK", (Content) null, 0.0F, 0.0F, ")5nE?tgKPT", true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 0.0F, 0.0F, 3503.0F, 0.0F, true);
      boolean boolean0 = homeTexture0.isFittingArea();
      assertEquals(0.0F, homeTexture0.getScale(), 0.01F);
      assertEquals(3503.0F, homeTexture0.getAngle(), 0.01F);
      assertEquals(0.0F, homeTexture0.getXOffset(), 0.01F);
      assertTrue(homeTexture0.isLeftToRightOriented());
      assertEquals(0.0F, homeTexture0.getYOffset(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      SimpleURLContent simpleURLContent0 = new SimpleURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("", "", simpleURLContent0, 1477.51F, 437.715F, "", false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0, 437.715F, false);
      boolean boolean0 = homeTexture0.isLeftToRightOriented();
      assertEquals(0.0F, homeTexture0.getXOffset(), 0.01F);
      assertFalse(boolean0);
      assertEquals(1.0F, homeTexture0.getScale(), 0.01F);
      assertEquals(437.715F, homeTexture0.getAngle(), 0.01F);
      assertFalse(homeTexture0.isFittingArea());
      assertEquals(0.0F, homeTexture0.getYOffset(), 0.01F);
  }
}
