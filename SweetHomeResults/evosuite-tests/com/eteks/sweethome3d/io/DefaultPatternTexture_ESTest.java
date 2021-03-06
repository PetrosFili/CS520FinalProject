/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:06:03 GMT 2022
 */

package com.eteks.sweethome3d.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.io.DefaultPatternTexture;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultPatternTexture_ESTest extends DefaultPatternTexture_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultPatternTexture defaultPatternTexture0 = null;
      try {
        defaultPatternTexture0 = new DefaultPatternTexture("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown resource resources/patterns/.png
         //
         verifyException("com.eteks.sweethome3d.tools.ResourceURLContent", e);
      }
  }
}
