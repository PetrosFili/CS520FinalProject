/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 04:18:33 GMT 2022
 */

package com.eteks.sweethome3d.swing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.io.FileUserPreferences;
import com.eteks.sweethome3d.swing.ControllerAction;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ControllerAction_ESTest extends ControllerAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("hashCode");
      File[] fileArray0 = new File[3];
      fileArray0[0] = (File) mockFile0;
      fileArray0[1] = (File) mockFile0;
      fileArray0[2] = (File) mockFile0;
      FileUserPreferences fileUserPreferences0 = new FileUserPreferences(mockFile0, fileArray0);
      Class<Object> class0 = Object.class;
      ControllerAction controllerAction0 = null;
      try {
        controllerAction0 = new ControllerAction(fileUserPreferences0, class0, "Language library", "Language library", "hashCode", fileArray0);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(Throwable e) {
      }
  }
}
