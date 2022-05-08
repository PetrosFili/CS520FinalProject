/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:55:05 GMT 2022
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.model.Sash;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sash_ESTest extends Sash_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Sash sash0 = new Sash(0.0F, 0.0F, 0.0F, 2362.0F, 0.0F);
      float float0 = sash0.getStartAngle();
      assertEquals(0.0F, sash0.getEndAngle(), 0.01F);
      assertEquals(2362.0F, float0, 0.01F);
      assertEquals(0.0F, sash0.getYAxis(), 0.01F);
      assertEquals(0.0F, sash0.getWidth(), 0.01F);
      assertEquals(0.0F, sash0.getXAxis(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Sash sash0 = new Sash(0.0F, 0.0F, 0.0F, 2362.0F, 0.0F);
      float float0 = sash0.getWidth();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, sash0.getYAxis(), 0.01F);
      assertEquals(2362.0F, sash0.getStartAngle(), 0.01F);
      assertEquals(0.0F, sash0.getXAxis(), 0.01F);
      assertEquals(0.0F, sash0.getEndAngle(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Sash sash0 = new Sash(0.0F, 0.0F, 0.0F, 2362.0F, 0.0F);
      float float0 = sash0.getXAxis();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, sash0.getWidth(), 0.01F);
      assertEquals(2362.0F, sash0.getStartAngle(), 0.01F);
      assertEquals(0.0F, sash0.getEndAngle(), 0.01F);
      assertEquals(0.0F, sash0.getYAxis(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Sash sash0 = new Sash(0.0F, 0.0F, 0.0F, 2362.0F, 0.0F);
      float float0 = sash0.getYAxis();
      assertEquals(0.0F, sash0.getWidth(), 0.01F);
      assertEquals(0.0F, sash0.getXAxis(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, sash0.getEndAngle(), 0.01F);
      assertEquals(2362.0F, sash0.getStartAngle(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Sash sash0 = new Sash(0.0F, 0.0F, 0.0F, 2362.0F, 0.0F);
      float float0 = sash0.getEndAngle();
      assertEquals(0.0F, sash0.getYAxis(), 0.01F);
      assertEquals(2362.0F, sash0.getStartAngle(), 0.01F);
      assertEquals(0.0F, sash0.getWidth(), 0.01F);
      assertEquals(0.0F, sash0.getXAxis(), 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }
}