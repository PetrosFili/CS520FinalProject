/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 04:17:22 GMT 2022
 */

package com.eteks.sweethome3d.swing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.io.DefaultUserPreferences;
import com.eteks.sweethome3d.io.FileUserPreferences;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.swing.CompassPanel;
import com.eteks.sweethome3d.viewcontroller.CompassController;
import com.eteks.sweethome3d.viewcontroller.ViewFactoryAdapter;
import javax.swing.undo.UndoableEditSupport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CompassPanel_ESTest extends CompassPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      Home home0 = new Home();
      ViewFactoryAdapter viewFactoryAdapter0 = new ViewFactoryAdapter();
      UndoableEditSupport undoableEditSupport0 = new UndoableEditSupport(viewFactoryAdapter0);
      CompassController compassController0 = new CompassController(home0, defaultUserPreferences0, viewFactoryAdapter0, undoableEditSupport0);
      CompassPanel compassPanel0 = new CompassPanel(defaultUserPreferences0, compassController0);
      compassController0.setLatitudeInDegrees((-2475.7693F));
      assertEquals(100.0F, compassController0.getDiameter(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileUserPreferences fileUserPreferences0 = new FileUserPreferences();
      Home home0 = new Home(48.80472F);
      ViewFactoryAdapter viewFactoryAdapter0 = new ViewFactoryAdapter();
      UndoableEditSupport undoableEditSupport0 = new UndoableEditSupport(home0);
      CompassController compassController0 = new CompassController(home0, fileUserPreferences0, viewFactoryAdapter0, undoableEditSupport0);
      CompassPanel compassPanel0 = new CompassPanel(fileUserPreferences0, compassController0);
      compassController0.setNorthDirectionInDegrees(48.80472F);
      assertEquals(51.466667F, compassController0.getLatitudeInDegrees(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      Home home0 = new Home();
      ViewFactoryAdapter viewFactoryAdapter0 = new ViewFactoryAdapter();
      UndoableEditSupport undoableEditSupport0 = new UndoableEditSupport();
      CompassController compassController0 = new CompassController(home0, defaultUserPreferences0, viewFactoryAdapter0, undoableEditSupport0);
      CompassPanel compassPanel0 = new CompassPanel(defaultUserPreferences0, compassController0);
      compassPanel0.doLayout();
      assertFalse(compassPanel0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileUserPreferences fileUserPreferences0 = new FileUserPreferences();
      Home home0 = new Home(48.80472F);
      ViewFactoryAdapter viewFactoryAdapter0 = new ViewFactoryAdapter();
      UndoableEditSupport undoableEditSupport0 = new UndoableEditSupport(home0);
      CompassController compassController0 = new CompassController(home0, fileUserPreferences0, viewFactoryAdapter0, undoableEditSupport0);
      CompassPanel compassPanel0 = new CompassPanel(fileUserPreferences0, compassController0);
      compassController0.setTimeZone("Language library");
      assertEquals(0.0F, compassController0.getLongitudeInDegrees(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      Home home0 = new Home();
      ViewFactoryAdapter viewFactoryAdapter0 = new ViewFactoryAdapter();
      UndoableEditSupport undoableEditSupport0 = new UndoableEditSupport(viewFactoryAdapter0);
      CompassController compassController0 = new CompassController(home0, defaultUserPreferences0, viewFactoryAdapter0, undoableEditSupport0);
      CompassPanel compassPanel0 = new CompassPanel(defaultUserPreferences0, compassController0);
      compassController0.setX(7000L);
      assertEquals(100.0F, compassController0.getDiameter(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      Home home0 = new Home();
      ViewFactoryAdapter viewFactoryAdapter0 = new ViewFactoryAdapter();
      UndoableEditSupport undoableEditSupport0 = new UndoableEditSupport((Object) null);
      CompassController compassController0 = new CompassController(home0, defaultUserPreferences0, viewFactoryAdapter0, undoableEditSupport0);
      CompassPanel compassPanel0 = new CompassPanel(defaultUserPreferences0, compassController0);
      compassController0.setDiameter(640.6F);
      assertEquals(0.0F, compassController0.getLongitudeInDegrees(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      Home home0 = new Home();
      ViewFactoryAdapter viewFactoryAdapter0 = new ViewFactoryAdapter();
      UndoableEditSupport undoableEditSupport0 = new UndoableEditSupport(viewFactoryAdapter0);
      CompassController compassController0 = new CompassController(home0, defaultUserPreferences0, viewFactoryAdapter0, undoableEditSupport0);
      CompassPanel compassPanel0 = new CompassPanel(defaultUserPreferences0, compassController0);
      compassController0.setY(7000L);
      assertEquals(51.466667F, compassController0.getLatitudeInDegrees(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      Home home0 = new Home();
      ViewFactoryAdapter viewFactoryAdapter0 = new ViewFactoryAdapter();
      UndoableEditSupport undoableEditSupport0 = new UndoableEditSupport();
      CompassController compassController0 = new CompassController(home0, defaultUserPreferences0, viewFactoryAdapter0, undoableEditSupport0);
      CompassPanel compassPanel0 = new CompassPanel(defaultUserPreferences0, compassController0);
      compassController0.setLongitudeInDegrees(1465.0553F);
      assertEquals(1465.0553F, compassController0.getLongitudeInDegrees(), 0.01F);
  }
}
