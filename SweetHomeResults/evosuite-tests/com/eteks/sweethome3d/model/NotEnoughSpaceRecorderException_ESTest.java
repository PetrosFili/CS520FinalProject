/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:50:08 GMT 2022
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.model.NotEnoughSpaceRecorderException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NotEnoughSpaceRecorderException_ESTest extends NotEnoughSpaceRecorderException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NotEnoughSpaceRecorderException notEnoughSpaceRecorderException0 = new NotEnoughSpaceRecorderException("E|~(Iq@&8=JZ#", 0L);
      long long0 = notEnoughSpaceRecorderException0.getMissingSpace();
      assertEquals(0L, long0);
  }
}
