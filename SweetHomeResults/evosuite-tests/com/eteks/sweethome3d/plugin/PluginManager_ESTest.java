/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 04:06:23 GMT 2022
 */

package com.eteks.sweethome3d.plugin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.io.DefaultUserPreferences;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.HomeApplication;
import com.eteks.sweethome3d.model.HomePieceOfFurniture;
import com.eteks.sweethome3d.model.Library;
import com.eteks.sweethome3d.plugin.Plugin;
import com.eteks.sweethome3d.plugin.PluginManager;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import javax.swing.undo.UndoableEditSupport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PluginManager_ESTest extends PluginManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL[] uRLArray0 = new URL[1];
      URL uRL0 = MockURL.getHttpExample();
      uRLArray0[0] = uRL0;
      PluginManager pluginManager0 = new PluginManager(uRLArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      URL[] uRLArray0 = new URL[3];
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "mCP ");
      URL uRL0 = MockURL.getHttpExample();
      uRLArray0[0] = uRL0;
      PluginManager pluginManager0 = null;
      try {
        pluginManager0 = new PluginManager(uRLArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File[] fileArray0 = new File[0];
      PluginManager pluginManager0 = new PluginManager(fileArray0);
      try { 
        pluginManager0.pluginExists("fM-s(4~A=_xB");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Can't access to plugins folder
         //
         verifyException("com.eteks.sweethome3d.plugin.PluginManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      URL[] uRLArray0 = new URL[0];
      PluginManager pluginManager0 = new PluginManager(uRLArray0);
      try { 
        pluginManager0.pluginExists("EFJ");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Can't access to plugins folder
         //
         verifyException("com.eteks.sweethome3d.plugin.PluginManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File[] fileArray0 = new File[2];
      MockFile mockFile0 = new MockFile("jar:");
      fileArray0[0] = (File) mockFile0;
      MockFile.createTempFile("jar:", "", (File) mockFile0);
      PluginManager pluginManager0 = null;
      try {
        pluginManager0 = new PluginManager(fileArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PluginManager pluginManager0 = new PluginManager((File[]) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      File[] fileArray0 = new File[1];
      MockFile mockFile0 = new MockFile("", "");
      fileArray0[0] = (File) mockFile0;
      PluginManager pluginManager0 = new PluginManager(fileArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Furniture library");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Plugin");
      try { 
        pluginManager0.addPlugin("Furniture library");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Can't write Furniture library in plugins folder
         //
         verifyException("com.eteks.sweethome3d.plugin.PluginManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      File[] fileArray0 = new File[1];
      MockFile mockFile0 = new MockFile("}", "}");
      fileArray0[0] = (File) mockFile0;
      PluginManager pluginManager0 = new PluginManager(fileArray0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Furniture library");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "RT\"i=g");
      pluginManager0.addPlugin("Furniture library");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      File[] fileArray0 = new File[1];
      MockFile mockFile0 = new MockFile("", "");
      fileArray0[0] = (File) mockFile0;
      PluginManager pluginManager0 = new PluginManager(fileArray0);
      try { 
        pluginManager0.addPlugin("Furniture library");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Can't write Furniture library in plugins folder
         //
         verifyException("com.eteks.sweethome3d.plugin.PluginManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      URL[] uRLArray0 = new URL[0];
      PluginManager pluginManager0 = new PluginManager(uRLArray0);
      try { 
        pluginManager0.addPlugin("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Can't access to plugins folder
         //
         verifyException("com.eteks.sweethome3d.plugin.PluginManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      File[] fileArray0 = new File[1];
      MockFile mockFile0 = new MockFile("", "");
      fileArray0[0] = (File) mockFile0;
      PluginManager pluginManager0 = new PluginManager(fileArray0);
      ArrayList<Home> arrayList0 = new ArrayList<Home>();
      HomeApplication homeApplication0 = mock(HomeApplication.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(homeApplication0).getHomes();
      LinkedList<HomePieceOfFurniture> linkedList0 = new LinkedList<HomePieceOfFurniture>();
      Home home0 = new Home(linkedList0);
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      arrayList0.add(home0);
      UndoableEditSupport undoableEditSupport0 = new UndoableEditSupport(fileArray0[0]);
      List<Plugin> list0 = pluginManager0.getPlugins(homeApplication0, home0, defaultUserPreferences0, undoableEditSupport0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URL[] uRLArray0 = new URL[0];
      PluginManager pluginManager0 = new PluginManager(uRLArray0);
      Stack<Library> stack0 = new Stack<Library>();
      Library library0 = mock(Library.class, new ViolatedAssumptionAnswer());
      stack0.add(library0);
      pluginManager0.deletePlugins(stack0);
      assertTrue(stack0.contains(library0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("com.eteks.sweethome3d.model.CollectionEvent");
      PluginManager pluginManager0 = new PluginManager(mockFile0);
      Stack<Library> stack0 = new Stack<Library>();
      pluginManager0.deletePlugins(stack0);
      assertTrue(stack0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Oq]YZ3[ly\"0xK^&", "");
      PluginManager pluginManager0 = new PluginManager(mockFile0);
      boolean boolean0 = pluginManager0.pluginExists("");
      assertFalse(boolean0);
  }
}
