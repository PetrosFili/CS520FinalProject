/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 04:08:54 GMT 2022
 */

package com.eteks.sweethome3d.swing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.swing.AutoCommitSpinner;
import java.text.DateFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JTextArea;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AutoCommitSpinner_ESTest extends AutoCommitSpinner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AutoCommitSpinner.SpinnerModuloNumberModel autoCommitSpinner_SpinnerModuloNumberModel0 = new AutoCommitSpinner.SpinnerModuloNumberModel(0, 0, 7, 0);
      Object object0 = autoCommitSpinner_SpinnerModuloNumberModel0.getNextValue();
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AutoCommitSpinner.SpinnerModuloNumberModel autoCommitSpinner_SpinnerModuloNumberModel0 = new AutoCommitSpinner.SpinnerModuloNumberModel(48, 48, 48, 48);
      Object object0 = autoCommitSpinner_SpinnerModuloNumberModel0.getNextValue();
      assertEquals(96, object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AutoCommitSpinner.SpinnerModuloNumberModel autoCommitSpinner_SpinnerModuloNumberModel0 = new AutoCommitSpinner.SpinnerModuloNumberModel((-1), (-1), (-1), 0);
      Object object0 = autoCommitSpinner_SpinnerModuloNumberModel0.getPreviousValue();
      assertEquals((-1), object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AutoCommitSpinner.SpinnerModuloNumberModel autoCommitSpinner_SpinnerModuloNumberModel0 = new AutoCommitSpinner.SpinnerModuloNumberModel(48, 48, 48, 48);
      Object object0 = autoCommitSpinner_SpinnerModuloNumberModel0.getPreviousValue();
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SpinnerListModel spinnerListModel0 = new SpinnerListModel();
      Locale locale0 = Locale.CANADA;
      DateFormat dateFormat0 = MockDateFormat.getTimeInstance(0, locale0);
      AutoCommitSpinner autoCommitSpinner0 = new AutoCommitSpinner(spinnerListModel0, dateFormat0);
      assertFalse(autoCommitSpinner0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SpinnerNumberModel spinnerNumberModel0 = new SpinnerNumberModel(0.0, 0.0, 0.0, 0.0);
      AutoCommitSpinner autoCommitSpinner0 = new AutoCommitSpinner(spinnerNumberModel0, (Format) null, false);
      JTextArea jTextArea0 = new JTextArea();
      autoCommitSpinner0.setEditor(jTextArea0);
      autoCommitSpinner0.setFormat((Format) null);
      assertFalse(autoCommitSpinner0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SpinnerListModel spinnerListModel0 = new SpinnerListModel();
      AutoCommitSpinner autoCommitSpinner0 = new AutoCommitSpinner(spinnerListModel0);
      assertTrue(autoCommitSpinner0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AutoCommitSpinner.SpinnerModuloNumberModel autoCommitSpinner_SpinnerModuloNumberModel0 = new AutoCommitSpinner.SpinnerModuloNumberModel(48, 48, 48, 48);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      AutoCommitSpinner autoCommitSpinner0 = new AutoCommitSpinner(autoCommitSpinner_SpinnerModuloNumberModel0, mockSimpleDateFormat0);
      assertTrue(autoCommitSpinner0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AutoCommitSpinner.SpinnerModuloNumberModel autoCommitSpinner_SpinnerModuloNumberModel0 = new AutoCommitSpinner.SpinnerModuloNumberModel((-1), (-1), (-1), 617);
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      AutoCommitSpinner autoCommitSpinner0 = new AutoCommitSpinner(autoCommitSpinner_SpinnerModuloNumberModel0, numberFormat0, true);
      autoCommitSpinner0.commitEdit();
      assertFalse(autoCommitSpinner0.getIgnoreRepaint());
  }
}