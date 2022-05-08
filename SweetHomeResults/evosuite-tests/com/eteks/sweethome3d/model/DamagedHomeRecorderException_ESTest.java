/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:29:57 GMT 2022
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.DamagedHomeRecorderException;
import com.eteks.sweethome3d.model.Home;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DamagedHomeRecorderException_ESTest extends DamagedHomeRecorderException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Content> linkedList0 = new LinkedList<Content>();
      DamagedHomeRecorderException damagedHomeRecorderException0 = new DamagedHomeRecorderException((Home) null, linkedList0, "sp3Lb");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Content> linkedList0 = new LinkedList<Content>();
      DamagedHomeRecorderException damagedHomeRecorderException0 = new DamagedHomeRecorderException((Home) null, linkedList0);
      Home home0 = damagedHomeRecorderException0.getDamagedHome();
      assertNull(home0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Content> linkedList0 = new LinkedList<Content>();
      DamagedHomeRecorderException damagedHomeRecorderException0 = new DamagedHomeRecorderException((Home) null, linkedList0);
      List<Content> list0 = damagedHomeRecorderException0.getInvalidContent();
      assertEquals(0, list0.size());
  }
}