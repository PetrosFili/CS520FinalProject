/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:25:48 GMT 2022
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.model.CatalogDoorOrWindow;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.Sash;
import com.eteks.sweethome3d.tools.SimpleURLContent;
import com.eteks.sweethome3d.tools.URLContent;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CatalogDoorOrWindow_ESTest extends CatalogDoorOrWindow_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      SimpleURLContent simpleURLContent0 = new SimpleURLContent(uRL0);
      Sash[] sashArray0 = new Sash[0];
      Integer integer0 = new Integer(1162);
      float[][] floatArray0 = new float[8][5];
      Long long0 = new Long(1753L);
      CatalogDoorOrWindow catalogDoorOrWindow0 = new CatalogDoorOrWindow("sDZ`", simpleURLContent0, simpleURLContent0, 1L, (-1190.91F), 0.0F, (-1190.91F), false, 342.274F, 1L, sashArray0, integer0, floatArray0, false, long0, "TDF4O0ZY;A", 1.0F, true);
      Sash[] sashArray1 = catalogDoorOrWindow0.getSashes();
      assertTrue(catalogDoorOrWindow0.isWidthDepthDeformable());
      assertEquals(342.274F, catalogDoorOrWindow0.getWallThickness(), 0.01F);
      assertSame(sashArray1, sashArray0);
      assertTrue(catalogDoorOrWindow0.isWallCutOutOnBothSides());
      assertEquals(1.0F, catalogDoorOrWindow0.getWallDistance(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Sash[] sashArray0 = new Sash[1];
      float[][] floatArray0 = new float[18][9];
      BigDecimal bigDecimal0 = new BigDecimal((-632));
      CatalogDoorOrWindow catalogDoorOrWindow0 = new CatalogDoorOrWindow("^VRYI", "", "^VRYI", (Content) null, (Content) null, (Content) null, 0.0F, 2154.98F, 2154.98F, 2154.98F, false, 2154.98F, 2154.98F, sashArray0, floatArray0, "com.eteks.sweethome3d.model.CatalogDoorOrWindow", false, bigDecimal0, bigDecimal0);
      Sash[] sashArray1 = catalogDoorOrWindow0.getSashes();
      assertEquals(2154.98F, catalogDoorOrWindow0.getWallThickness(), 0.01F);
      assertNotSame(sashArray1, sashArray0);
      assertTrue(catalogDoorOrWindow0.isWallCutOutOnBothSides());
      assertTrue(catalogDoorOrWindow0.isWidthDepthDeformable());
      assertEquals(2154.98F, catalogDoorOrWindow0.getWallDistance(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Sash[] sashArray0 = new Sash[5];
      Integer integer0 = new Integer(392);
      Long long0 = Long.getLong("AMB@y7+vmBKFu/(", (-2083L));
      CatalogDoorOrWindow catalogDoorOrWindow0 = new CatalogDoorOrWindow("j~Wf#++YLQ)>s_6= `", (Content) null, (Content) null, 0.0F, 0.0F, 0.0F, 0.0F, true, 0.0F, 0.0F, sashArray0, integer0, (float[][]) null, true, long0, "AMB@y7+vmBKFu/(", (-1272.6155F), true);
      boolean boolean0 = catalogDoorOrWindow0.isHorizontallyRotatable();
      assertEquals(0.0F, catalogDoorOrWindow0.getWallThickness(), 0.01F);
      assertEquals(0.0F, catalogDoorOrWindow0.getWallDistance(), 0.01F);
      assertFalse(boolean0);
      assertTrue(catalogDoorOrWindow0.isWallCutOutOnBothSides());
      assertTrue(catalogDoorOrWindow0.isWidthDepthDeformable());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      URLContent uRLContent0 = new URLContent((URL) null);
      Sash[] sashArray0 = new Sash[1];
      float[][] floatArray0 = new float[5][7];
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      CatalogDoorOrWindow catalogDoorOrWindow0 = new CatalogDoorOrWindow("L~3M3(|.nOX>g:", "!/Hg", "L~3M3(|.nOX>g:", uRLContent0, uRLContent0, uRLContent0, (-344.094F), 1212.035F, 0.0F, 0.0F, true, (-409.7394F), 0.0F, sashArray0, floatArray0, "G", false, false, true, bigDecimal0, bigDecimal0);
      float float0 = catalogDoorOrWindow0.getWallDistance();
      assertTrue(catalogDoorOrWindow0.isWallCutOutOnBothSides());
      assertEquals((-409.7394F), catalogDoorOrWindow0.getWallThickness(), 0.01F);
      assertTrue(catalogDoorOrWindow0.isWidthDepthDeformable());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      SimpleURLContent simpleURLContent0 = new SimpleURLContent(uRL0);
      Sash[] sashArray0 = new Sash[9];
      float[][] floatArray0 = new float[6][4];
      BigInteger bigInteger0 = BigInteger.ONE;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      CatalogDoorOrWindow catalogDoorOrWindow0 = new CatalogDoorOrWindow("", "", "h", simpleURLContent0, simpleURLContent0, 0.0F, 0.0F, 0.0F, 0.0F, false, 0.0F, 0.0F, sashArray0, floatArray0, "h", false, bigDecimal0, bigDecimal0);
      catalogDoorOrWindow0.getCutOutShape();
      assertEquals(0.0F, catalogDoorOrWindow0.getWallDistance(), 0.01F);
      assertTrue(catalogDoorOrWindow0.isWidthDepthDeformable());
      assertTrue(catalogDoorOrWindow0.isWallCutOutOnBothSides());
      assertEquals(0.0F, catalogDoorOrWindow0.getWallThickness(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[8];
      Long long0 = new Long((-1L));
      Float float0 = new Float(65.96F);
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      CatalogDoorOrWindow catalogDoorOrWindow0 = new CatalogDoorOrWindow("com.eteks.sweethome3d.model.CatalogDoorOrWindow", "com.eteks.sweethome3d.model.CatalogDoorOrWindow", "com.eteks.sweethome3d.model.CatalogDoorOrWindow", (String) null, stringArray0, long0, float0, (Content) null, (Content) null, (Content) null, 65.96F, 65.96F, 65.96F, 65.96F, 1.0F, false, "", (-1L), 794.7528F, (Sash[]) null, (float[][]) null, stringArray0[3], false, true, true, bigDecimal0, bigDecimal0, stringArray0[3]);
      boolean boolean0 = catalogDoorOrWindow0.isWallCutOutOnBothSides();
      assertTrue(catalogDoorOrWindow0.isWidthDepthDeformable());
      assertTrue(boolean0);
      assertEquals(794.7528F, catalogDoorOrWindow0.getWallDistance(), 0.01F);
      assertEquals((-1.0F), catalogDoorOrWindow0.getWallThickness(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Sash[] sashArray0 = new Sash[5];
      Integer integer0 = new Integer(392);
      Long long0 = Long.getLong("AMB@y7+vmBKFu/(", (-2083L));
      CatalogDoorOrWindow catalogDoorOrWindow0 = new CatalogDoorOrWindow("j~Wf#++YLQ)>s_6= `", (Content) null, (Content) null, 0.0F, 0.0F, 0.0F, 0.0F, true, 0.0F, 0.0F, sashArray0, integer0, (float[][]) null, true, long0, "AMB@y7+vmBKFu/(", (-1272.6155F), true);
      boolean boolean0 = catalogDoorOrWindow0.isWidthDepthDeformable();
      assertEquals(0.0F, catalogDoorOrWindow0.getWallDistance(), 0.01F);
      assertEquals(0.0F, catalogDoorOrWindow0.getWallThickness(), 0.01F);
      assertTrue(boolean0);
      assertTrue(catalogDoorOrWindow0.isWallCutOutOnBothSides());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Sash[] sashArray0 = new Sash[5];
      float[][] floatArray0 = new float[3][7];
      BigDecimal bigDecimal0 = new BigDecimal((-103L));
      CatalogDoorOrWindow catalogDoorOrWindow0 = new CatalogDoorOrWindow("com.eteks.sweethome3d.model.CatalogDoorOrWindow", "SJkZ", "", (Content) null, (Content) null, (-103L), (-1688.54F), (-71.42F), 3041.7068F, true, 0.0F, 668.1F, sashArray0, floatArray0, "", true, bigDecimal0, bigDecimal0);
      boolean boolean0 = catalogDoorOrWindow0.isDoorOrWindow();
      assertTrue(catalogDoorOrWindow0.isWidthDepthDeformable());
      assertTrue(boolean0);
      assertEquals(0.0F, catalogDoorOrWindow0.getWallThickness(), 0.01F);
      assertTrue(catalogDoorOrWindow0.isWallCutOutOnBothSides());
      assertEquals(668.1F, catalogDoorOrWindow0.getWallDistance(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Sash[] sashArray0 = new Sash[1];
      float[][] floatArray0 = new float[8][2];
      float[] floatArray1 = new float[9];
      floatArray0[0] = floatArray1;
      floatArray0[1] = floatArray0[0];
      floatArray0[2] = floatArray0[0];
      BigDecimal bigDecimal0 = new BigDecimal(1507);
      CatalogDoorOrWindow catalogDoorOrWindow0 = new CatalogDoorOrWindow("%=`]miMdy%'", "%=`]miMdy%'", "%=`]miMdy%'", (Content) null, (Content) null, (Content) null, 2012.412F, 2012.412F, 2012.412F, 0.3926991F, false, (-1013.0F), 0.3926991F, sashArray0, floatArray0, "", true, bigDecimal0, bigDecimal0);
      float float0 = catalogDoorOrWindow0.getWallThickness();
      assertTrue(catalogDoorOrWindow0.isWallCutOutOnBothSides());
      assertEquals(0.3926991F, catalogDoorOrWindow0.getWallDistance(), 0.01F);
      assertEquals((-1013.0F), float0, 0.01F);
      assertTrue(catalogDoorOrWindow0.isWidthDepthDeformable());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      float[][] floatArray0 = new float[5][8];
      CatalogDoorOrWindow catalogDoorOrWindow0 = null;
      try {
        catalogDoorOrWindow0 = new CatalogDoorOrWindow("com.eteks.sweethome3d.model.CatalogDoorOrWindow", (Content) null, (Content) null, 0.0F, 0.0F, (-2857.8F), 1.0F, false, 0.0F, 1.0F, (Sash[]) null, (Integer) null, floatArray0, true, 0.0F, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.CatalogDoorOrWindow", e);
      }
  }
}