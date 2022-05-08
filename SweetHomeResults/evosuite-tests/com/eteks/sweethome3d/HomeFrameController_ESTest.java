/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 02:55:36 GMT 2022
 */

package com.eteks.sweethome3d;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.HomeFrameController;
import com.eteks.sweethome3d.io.FileUserPreferences;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.HomeApplication;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.plugin.PluginManager;
import com.eteks.sweethome3d.swing.FileContentManager;
import com.eteks.sweethome3d.viewcontroller.ViewFactory;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HomeFrameController_ESTest extends HomeFrameController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Home home0 = new Home(1367.5754F);
      HomeApplication homeApplication0 = mock(HomeApplication.class, new ViolatedAssumptionAnswer());
      doReturn((UserPreferences) null).when(homeApplication0).getUserPreferences();
      FileUserPreferences fileUserPreferences0 = new FileUserPreferences();
      FileContentManager fileContentManager0 = new FileContentManager(fileUserPreferences0);
      File file0 = MockFile.createTempFile("Furniture library", "PluginLanguageLibrary");
      PluginManager pluginManager0 = new PluginManager(file0);
      HomeFrameController homeFrameController0 = new HomeFrameController(home0, homeApplication0, (ViewFactory) null, fileContentManager0, pluginManager0);
      homeFrameController0.getHomeController();
      // Undeclared exception!
      try { 
        homeFrameController0.displayView();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.viewcontroller.HomeController", e);
      }
  }
}
