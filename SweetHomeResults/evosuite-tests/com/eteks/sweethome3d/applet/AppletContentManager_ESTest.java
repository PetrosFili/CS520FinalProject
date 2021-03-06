/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 02:43:21 GMT 2022
 */

package com.eteks.sweethome3d.applet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.applet.AppletContentManager;
import com.eteks.sweethome3d.applet.AppletUserPreferences;
import com.eteks.sweethome3d.applet.HomeAppletRecorder;
import com.eteks.sweethome3d.io.ContentRecording;
import com.eteks.sweethome3d.io.DefaultUserPreferences;
import com.eteks.sweethome3d.io.FileUserPreferences;
import com.eteks.sweethome3d.io.HomeFileRecorder;
import com.eteks.sweethome3d.io.HomeXMLExporter;
import com.eteks.sweethome3d.io.HomeXMLHandler;
import com.eteks.sweethome3d.viewcontroller.ContentManager;
import com.eteks.sweethome3d.viewcontroller.View;
import com.eteks.sweethome3d.viewcontroller.ViewFactory;
import com.eteks.sweethome3d.viewcontroller.ViewFactoryAdapter;
import java.awt.HeadlessException;
import java.io.File;
import java.net.URL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AppletContentManager_ESTest extends AppletContentManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ContentManager.ContentType contentManager_ContentType0 = ContentManager.ContentType.SWEET_HOME_3D;
      HomeFileRecorder homeFileRecorder0 = new HomeFileRecorder(2129, true);
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      AppletContentManager appletContentManager0 = new AppletContentManager(homeFileRecorder0, defaultUserPreferences0);
      // Undeclared exception!
      try { 
        appletContentManager0.showOpenDialog((View) null, "com.eteks.sweethome3d.viewcontroller.View$PointerType", contentManager_ContentType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.applet.AppletContentManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HomeAppletRecorder homeAppletRecorder0 = new HomeAppletRecorder("", "s", "Hf8`");
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      AppletContentManager appletContentManager0 = new AppletContentManager(homeAppletRecorder0, defaultUserPreferences0, (ViewFactory) null);
      ContentManager.ContentType contentManager_ContentType0 = ContentManager.ContentType.MODEL;
      // Undeclared exception!
      try { 
        appletContentManager0.showOpenDialog((View) null, "^Zeh", contentManager_ContentType0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HomeAppletRecorder homeAppletRecorder0 = new HomeAppletRecorder("e", "e", "e");
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      AppletContentManager appletContentManager0 = new AppletContentManager(homeAppletRecorder0, defaultUserPreferences0, (ViewFactory) null);
      ContentManager.ContentType contentManager_ContentType0 = ContentManager.ContentType.SWEET_HOME_3D;
      String string0 = appletContentManager0.getPresentationName("Language library", contentManager_ContentType0);
      assertEquals("Language library", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      HomeFileRecorder homeFileRecorder0 = new HomeFileRecorder(2114, false, defaultUserPreferences0, false, false);
      AppletContentManager appletContentManager0 = new AppletContentManager(homeFileRecorder0, defaultUserPreferences0);
      ContentManager.ContentType contentManager_ContentType0 = ContentManager.ContentType.TEXTURES_LIBRARY;
      String string0 = appletContentManager0.getPresentationName("", contentManager_ContentType0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      HomeFileRecorder homeFileRecorder0 = new HomeFileRecorder(2114, false, defaultUserPreferences0, false, false);
      AppletContentManager appletContentManager0 = new AppletContentManager(homeFileRecorder0, defaultUserPreferences0);
      ContentManager.ContentType contentManager_ContentType0 = ContentManager.ContentType.TEXTURES_LIBRARY;
      boolean boolean0 = appletContentManager0.isAcceptable("", contentManager_ContentType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HomeAppletRecorder homeAppletRecorder0 = new HomeAppletRecorder("showOpenDialog.message", "", "", false);
      MockFile mockFile0 = new MockFile("showOpenDialog.message");
      File[] fileArray0 = new File[1];
      FileUserPreferences fileUserPreferences0 = new FileUserPreferences(mockFile0, fileArray0);
      AppletContentManager appletContentManager0 = new AppletContentManager(homeAppletRecorder0, fileUserPreferences0);
      ContentManager.ContentType contentManager_ContentType0 = ContentManager.ContentType.PLUGIN;
      boolean boolean0 = appletContentManager0.isAcceptable("gs*|)n", contentManager_ContentType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HomeFileRecorder homeFileRecorder0 = new HomeFileRecorder((-4047), false);
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      AppletContentManager appletContentManager0 = new AppletContentManager(homeFileRecorder0, defaultUserPreferences0, (ViewFactory) null);
      ContentManager.ContentType contentManager_ContentType0 = ContentManager.ContentType.SWEET_HOME_3D;
      boolean boolean0 = appletContentManager0.isAcceptable("Language library", contentManager_ContentType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContentRecording contentRecording0 = ContentRecording.INCLUDE_NO_CONTENT;
      HomeAppletRecorder homeAppletRecorder0 = new HomeAppletRecorder("C|L9", "", ".KG'", ">-", contentRecording0);
      URL[] uRLArray0 = new URL[0];
      AppletUserPreferences appletUserPreferences0 = new AppletUserPreferences(uRLArray0, uRLArray0);
      AppletContentManager appletContentManager0 = new AppletContentManager(homeAppletRecorder0, appletUserPreferences0);
      ContentManager.ContentType contentManager_ContentType0 = ContentManager.ContentType.JPEG;
      boolean boolean0 = appletContentManager0.isAcceptable(".KG'", contentManager_ContentType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContentRecording contentRecording0 = ContentRecording.INCLUDE_ALL_CONTENT;
      HomeXMLExporter homeXMLExporter0 = new HomeXMLExporter();
      HomeAppletRecorder homeAppletRecorder0 = new HomeAppletRecorder((String) null, "qcI3;EUX,%HB", (String) null, "", contentRecording0, (HomeXMLHandler) null, homeXMLExporter0);
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      ViewFactoryAdapter viewFactoryAdapter0 = new ViewFactoryAdapter();
      AppletContentManager appletContentManager0 = new AppletContentManager(homeAppletRecorder0, defaultUserPreferences0, viewFactoryAdapter0);
      ContentManager.ContentType contentManager_ContentType0 = ContentManager.ContentType.SWEET_HOME_3D;
      // Undeclared exception!
      try { 
        appletContentManager0.showSaveDialog((View) null, "", contentManager_ContentType0, "qcI3;EUX,%HB");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContentRecording contentRecording0 = ContentRecording.INCLUDE_ALL_CONTENT;
      HomeXMLExporter homeXMLExporter0 = new HomeXMLExporter();
      HomeAppletRecorder homeAppletRecorder0 = new HomeAppletRecorder((String) null, "qcI3;EUX,%HB", "\"r", "", contentRecording0, (HomeXMLHandler) null, homeXMLExporter0);
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      ViewFactoryAdapter viewFactoryAdapter0 = new ViewFactoryAdapter();
      AppletContentManager appletContentManager0 = new AppletContentManager(homeAppletRecorder0, defaultUserPreferences0, viewFactoryAdapter0);
      ContentManager.ContentType contentManager_ContentType0 = ContentManager.ContentType.USER_DEFINED;
      // Undeclared exception!
      try { 
        appletContentManager0.showSaveDialog((View) null, "confirmDeleteHome.message", contentManager_ContentType0, "\"r");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown user defined content type
         //
         verifyException("com.eteks.sweethome3d.swing.FileContentManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContentRecording contentRecording0 = ContentRecording.INCLUDE_NO_CONTENT;
      HomeAppletRecorder homeAppletRecorder0 = new HomeAppletRecorder("C|L9", "", ".KG'", ">-", contentRecording0);
      URL[] uRLArray0 = new URL[0];
      AppletUserPreferences appletUserPreferences0 = new AppletUserPreferences(uRLArray0, uRLArray0);
      AppletContentManager appletContentManager0 = new AppletContentManager(homeAppletRecorder0, appletUserPreferences0);
      ContentManager.ContentType contentManager_ContentType0 = ContentManager.ContentType.SWEET_HOME_3D;
      // Undeclared exception!
      try { 
        appletContentManager0.showOpenDialog((View) null, "com.eteks.sweethome3d.viewcontroller.View$PointerType", contentManager_ContentType0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
