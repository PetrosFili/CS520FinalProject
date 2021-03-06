/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:49:51 GMT 2022
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.model.BackgroundImage;
import com.eteks.sweethome3d.model.Level;
import com.eteks.sweethome3d.tools.URLContent;
import java.net.URL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Level_ESTest extends Level_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Level level0 = new Level("com.eteks.sweethome3d.model.Level$Property", 0.0F, 2465.3948F, 0.0F);
      assertTrue(level0.isVisible());
      
      level0.setVisible(false);
      boolean boolean0 = level0.isViewableAndVisible();
      assertFalse(level0.isVisible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Level level0 = new Level("<3Anl4", (String) null, 0.0F, 0.0F, 2002.37F);
      boolean boolean0 = level0.isViewableAndVisible();
      assertEquals(0.0F, level0.getElevation(), 0.01F);
      assertEquals((-1), level0.getElevationIndex());
      assertTrue(boolean0);
      assertEquals(2002.37F, level0.getHeight(), 0.01F);
      assertEquals(0.0F, level0.getFloorThickness(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Level level0 = new Level("com.eteks.sweethome3d.model.Level$Property", 0.0F, 2465.3948F, 0.0F);
      level0.setFloorThickness(0.0F);
      assertEquals(0.0F, level0.getFloorThickness(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Level level0 = new Level("ELEVATION", "ELEVATION", 0.0F, 0.0F, 0.0F);
      level0.setFloorThickness(0.0F);
      assertEquals(0.0F, level0.getFloorThickness(), 0.01F);
      assertEquals(0.0F, level0.getElevation(), 0.01F);
      assertTrue(level0.isViewableAndVisible());
      assertEquals(0.0F, level0.getHeight(), 0.01F);
      assertEquals((-1), level0.getElevationIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Level level0 = new Level("com.eteks.sweethome3d.model.Level$Property", 0.0F, 2465.3948F, 0.0F);
      level0.setElevationIndex(97);
      level0.setElevationIndex(97);
      assertEquals(97, level0.getElevationIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Level level0 = new Level("ELEVATION_INDEX", "", 3009.2175F, 0.0F, (-1600.2421F));
      URL uRL0 = MockURL.getHttpExample();
      URLContent uRLContent0 = new URLContent(uRL0);
      BackgroundImage backgroundImage0 = new BackgroundImage(uRLContent0, 0.0F, 0.0F, 623.2F, 1.0F, (-1600.2421F), 0.0F, (-1600.2421F));
      level0.setBackgroundImage(backgroundImage0);
      assertEquals((-1), level0.getElevationIndex());
      assertEquals(0.0F, level0.getFloorThickness(), 0.01F);
      assertTrue(level0.isViewableAndVisible());
      assertEquals((-1600.2421F), level0.getHeight(), 0.01F);
      assertEquals(3009.2175F, level0.getElevation(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Level level0 = new Level("com.eteks.sweethome3d.model.Level$Property", 0.0F, (-1871.1704F), 0.0F);
      level0.setBackgroundImage((BackgroundImage) null);
      assertEquals((-1871.1704F), level0.getFloorThickness(), 0.01F);
      assertEquals(0.0F, level0.getHeight(), 0.01F);
      assertEquals((-1), level0.getElevationIndex());
      assertEquals(0.0F, level0.getElevation(), 0.01F);
      assertTrue(level0.isViewableAndVisible());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Level level0 = new Level("", "", (-1.0F), (-1.0F), 928.1F);
      level0.setName((String) null);
      assertEquals(928.1F, level0.getHeight(), 0.01F);
      assertEquals((-1.0F), level0.getFloorThickness(), 0.01F);
      assertTrue(level0.isViewableAndVisible());
      assertEquals((-1), level0.getElevationIndex());
      assertEquals((-1.0F), level0.getElevation(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Level level0 = new Level("com.eteks.sweethome3d.model.Level$Property", 0.0F, (-1871.1704F), 0.0F);
      level0.setName("FLOOR_THICKNESS");
      assertEquals("FLOOR_THICKNESS", level0.getName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Level level0 = new Level("ELEVATION", "ELEVATION", 0.0F, 0.0F, 0.0F);
      level0.setName("ELEVATION");
      assertEquals((-1), level0.getElevationIndex());
      assertEquals(0.0F, level0.getElevation(), 0.01F);
      assertTrue(level0.isViewableAndVisible());
      assertEquals(0.0F, level0.getFloorThickness(), 0.01F);
      assertEquals(0.0F, level0.getHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Level level0 = new Level("!z>T,R7/=6UdAi+!%O+", "com.eteks.sweethome3d.model.HomeObject", (-4133.189F), (-4133.189F), (-4133.189F));
      level0.setElevation(0.0F);
      assertEquals(0.0F, level0.getElevation(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Level level0 = new Level("ELEVATION", "ELEVATION", 0.0F, 0.0F, 0.0F);
      level0.setElevation(0.0F);
      assertEquals(0.0F, level0.getElevation(), 0.01F);
      assertTrue(level0.isViewableAndVisible());
      assertEquals(0.0F, level0.getFloorThickness(), 0.01F);
      assertEquals((-1), level0.getElevationIndex());
      assertEquals(0.0F, level0.getHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Level level0 = new Level("<3Anl4", (String) null, 0.0F, 0.0F, 2002.37F);
      level0.setViewable(false);
      assertFalse(level0.isViewable());
      
      level0.setViewable(true);
      assertEquals(2002.37F, level0.getHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Level level0 = new Level("com.eteks.sweethome3d.model.Level$Property", 0.0F, (-1871.1704F), 0.0F);
      assertTrue(level0.isViewable());
      
      level0.setViewable(false);
      boolean boolean0 = level0.isViewableAndVisible();
      assertFalse(level0.isViewable());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Level level0 = new Level("ELEVATION", "ELEVATION", 0.0F, 0.0F, 0.0F);
      level0.setViewable(true);
      assertEquals((-1), level0.getElevationIndex());
      assertEquals(0.0F, level0.getHeight(), 0.01F);
      assertEquals(0.0F, level0.getElevation(), 0.01F);
      assertTrue(level0.isViewableAndVisible());
      assertEquals(0.0F, level0.getFloorThickness(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Level level0 = new Level("", (-1433.7775F), (-1433.7775F), (-2260.0F));
      level0.setHeight((-2371.974F));
      assertEquals((-2371.974F), level0.getHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Level level0 = new Level("M\"TtBV4&N", 5327.9F, 5327.9F, (-896.498F));
      assertEquals((-896.498F), level0.getHeight(), 0.01F);
      
      level0.setHeight((-896.498F));
      assertEquals(5327.9F, level0.getFloorThickness(), 0.01F);
      assertEquals((-1), level0.getElevationIndex());
      assertEquals(5327.9F, level0.getElevation(), 0.01F);
      assertTrue(level0.isViewableAndVisible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Level level0 = new Level("", (-1433.7775F), (-1433.7775F), (-2260.0F));
      level0.setVisible(false);
      assertFalse(level0.isVisible());
      
      level0.setVisible(true);
      assertTrue(level0.isViewableAndVisible());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Level level0 = new Level("com.eteks.sweethome3d.model.Level$Property", 0.0F, (-1871.1704F), 0.0F);
      assertTrue(level0.isVisible());
      
      level0.setVisible(false);
      level0.setVisible(false);
      assertFalse(level0.isVisible());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Level level0 = new Level("com.eteks.sweethome3d.model.Level$Property", 0.0F, (-1871.1704F), 0.0F);
      level0.getBackgroundImage();
      assertEquals(0.0F, level0.getHeight(), 0.01F);
      assertEquals((-1871.1704F), level0.getFloorThickness(), 0.01F);
      assertTrue(level0.isViewableAndVisible());
      assertEquals(0.0F, level0.getElevation(), 0.01F);
      assertEquals((-1), level0.getElevationIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Level level0 = new Level("com.eteks.sweethome3d.model.Level$Property", 0.0F, (-1871.1704F), 0.0F);
      boolean boolean0 = level0.isVisible();
      assertTrue(level0.isViewableAndVisible());
      assertEquals(0.0F, level0.getElevation(), 0.01F);
      assertEquals((-1), level0.getElevationIndex());
      assertEquals((-1871.1704F), level0.getFloorThickness(), 0.01F);
      assertEquals(0.0F, level0.getHeight(), 0.01F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Level level0 = new Level("", "", (-2063.0913F), (-2063.0913F), (-2063.0913F));
      Level level1 = level0.clone();
      assertEquals((-1), level1.getElevationIndex());
      assertEquals((-2063.0913F), level1.getHeight(), 0.01F);
      assertTrue(level1.isViewableAndVisible());
      assertEquals((-2063.0913F), level1.getElevation(), 0.01F);
      assertEquals((-2063.0913F), level1.getFloorThickness(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Level level0 = new Level("8*QnH3JjOC<'qsmu", 610.83F, 610.83F, 189.12596F);
      float float0 = level0.getHeight();
      assertEquals(610.83F, level0.getFloorThickness(), 0.01F);
      assertEquals(610.83F, level0.getElevation(), 0.01F);
      assertEquals((-1), level0.getElevationIndex());
      assertTrue(level0.isViewableAndVisible());
      assertEquals(189.12596F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Level level0 = new Level("", "", (-1.0F), (-1.0F), 928.1F);
      boolean boolean0 = level0.isViewable();
      assertTrue(level0.isViewableAndVisible());
      assertEquals((-1.0F), level0.getFloorThickness(), 0.01F);
      assertEquals(928.1F, level0.getHeight(), 0.01F);
      assertEquals((-1.0F), level0.getElevation(), 0.01F);
      assertEquals((-1), level0.getElevationIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Level level0 = new Level("G<RjLfwj4Y8!K", (-18.48F), (-18.48F), (-1436.989F));
      float float0 = level0.getFloorThickness();
      assertEquals((-18.48F), float0, 0.01F);
      assertEquals((-18.48F), level0.getElevation(), 0.01F);
      assertTrue(level0.isViewableAndVisible());
      assertEquals((-1436.989F), level0.getHeight(), 0.01F);
      assertEquals((-1), level0.getElevationIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Level level0 = new Level("M\"TtBV4&N", 5327.9F, 5327.9F, (-896.498F));
      int int0 = level0.getElevationIndex();
      assertEquals((-1), int0);
      assertTrue(level0.isViewableAndVisible());
      assertEquals(5327.9F, level0.getFloorThickness(), 0.01F);
      assertEquals(5327.9F, level0.getElevation(), 0.01F);
      assertEquals((-896.498F), level0.getHeight(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Level level0 = new Level("", "Unknown resource ", (-449.89664F), (-449.89664F), (-449.89664F));
      float float0 = level0.getElevation();
      assertEquals((-449.89664F), level0.getHeight(), 0.01F);
      assertEquals((-449.89664F), level0.getFloorThickness(), 0.01F);
      assertEquals((-449.89664F), float0, 0.01F);
      assertEquals((-1), level0.getElevationIndex());
      assertTrue(level0.isViewableAndVisible());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Level level0 = new Level("", "", 1214.5F, (-2820.0F), 2584.0F);
      level0.getName();
      assertEquals((-2820.0F), level0.getFloorThickness(), 0.01F);
      assertEquals(1214.5F, level0.getElevation(), 0.01F);
      assertEquals(2584.0F, level0.getHeight(), 0.01F);
      assertTrue(level0.isViewableAndVisible());
      assertEquals((-1), level0.getElevationIndex());
  }
}
