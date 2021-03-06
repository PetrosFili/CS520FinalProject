/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 02:58:05 GMT 2022
 */

package com.eteks.sweethome3d.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.io.AutoRecoveryManager;
import com.eteks.sweethome3d.io.FileUserPreferences;
import com.eteks.sweethome3d.model.HomeApplication;
import com.eteks.sweethome3d.model.UserPreferences;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AutoRecoveryManager_ESTest extends AutoRecoveryManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UserPreferences userPreferences0 = mock(UserPreferences.class, new ViolatedAssumptionAnswer());
      HomeApplication homeApplication0 = mock(HomeApplication.class, new ViolatedAssumptionAnswer());
      doReturn(userPreferences0, (UserPreferences) null).when(homeApplication0).getUserPreferences();
      AutoRecoveryManager autoRecoveryManager0 = null;
      try {
        autoRecoveryManager0 = new AutoRecoveryManager(homeApplication0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.io.AutoRecoveryManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileUserPreferences fileUserPreferences0 = new FileUserPreferences();
      HomeApplication homeApplication0 = mock(HomeApplication.class, new ViolatedAssumptionAnswer());
      doReturn(fileUserPreferences0, fileUserPreferences0, fileUserPreferences0).when(homeApplication0).getUserPreferences();
      AutoRecoveryManager autoRecoveryManager0 = new AutoRecoveryManager(homeApplication0);
      autoRecoveryManager0.openRecoveredHomes();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileUserPreferences fileUserPreferences0 = new FileUserPreferences();
      HomeApplication homeApplication0 = mock(HomeApplication.class, new ViolatedAssumptionAnswer());
      doReturn(fileUserPreferences0, fileUserPreferences0, fileUserPreferences0, (UserPreferences) null).when(homeApplication0).getUserPreferences();
      AutoRecoveryManager autoRecoveryManager0 = new AutoRecoveryManager(homeApplication0);
      // Undeclared exception!
      try { 
        fileUserPreferences0.setAutoSaveDelayForRecovery((-891));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.io.AutoRecoveryManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("C:\\Users\\Petros\\eTeks\\Sweet Home 3D\\recovery");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUserPreferences fileUserPreferences0 = new FileUserPreferences();
      HomeApplication homeApplication0 = mock(HomeApplication.class, new ViolatedAssumptionAnswer());
      doReturn(fileUserPreferences0, fileUserPreferences0, fileUserPreferences0).when(homeApplication0).getUserPreferences();
      AutoRecoveryManager autoRecoveryManager0 = new AutoRecoveryManager(homeApplication0);
  }
}
