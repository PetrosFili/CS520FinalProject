/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 04:09:49 GMT 2022
 */

package com.eteks.sweethome3d.swing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.swing.AutoCompleteDocument;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AutoCompleteDocument_ESTest extends AutoCompleteDocument_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField("j\"o8pj<NZznF-(N1");
      Stack<String> stack0 = new Stack<String>();
      AutoCompleteDocument autoCompleteDocument0 = new AutoCompleteDocument(jPasswordField0, stack0);
      StyleContext styleContext0 = new StyleContext();
      StyleContext.NamedStyle styleContext_NamedStyle0 = styleContext0.new NamedStyle();
      autoCompleteDocument0.insertString(0, "j\"o8pj<NZznF-(N1", styleContext_NamedStyle0);
      assertTrue(autoCompleteDocument0.isAutoCompletionEnabled());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea();
      AutoCompleteDocument autoCompleteDocument0 = new AutoCompleteDocument(jTextArea0, (List<String>) null);
      autoCompleteDocument0.insertString(1, "ralLabel.mnemonic", (AttributeSet) null);
      autoCompleteDocument0.insertString(0, "ralLabel.mnemonic", (AttributeSet) null);
      assertTrue(autoCompleteDocument0.isAutoCompletionEnabled());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField("j\"o8pj<NZznF-(N1");
      Stack<String> stack0 = new Stack<String>();
      AutoCompleteDocument autoCompleteDocument0 = new AutoCompleteDocument(jPasswordField0, stack0);
      StyleContext styleContext0 = new StyleContext();
      StyleContext.NamedStyle styleContext_NamedStyle0 = styleContext0.new NamedStyle();
      autoCompleteDocument0.insertString(0, "{name=j\"o8pj<NZznF-(N1,resolver=AttributeSet,}\n{name=j\"o8pj<NZznF-(N1,}\n{default=AttributeSet,}\n{name=default,}\n", styleContext_NamedStyle0);
      assertTrue(autoCompleteDocument0.isAutoCompletionEnabled());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField("j\"o8pj<NZznF-(N1");
      Stack<String> stack0 = new Stack<String>();
      AutoCompleteDocument autoCompleteDocument0 = new AutoCompleteDocument(jPasswordField0, stack0);
      StyleContext styleContext0 = new StyleContext();
      StyleContext.NamedStyle styleContext_NamedStyle0 = styleContext0.new NamedStyle();
      autoCompleteDocument0.insertString(502, "", styleContext_NamedStyle0);
      assertTrue(autoCompleteDocument0.isAutoCompletionEnabled());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      AutoCompleteDocument autoCompleteDocument0 = new AutoCompleteDocument(jTextPane0, arrayList0);
      MutableAttributeSet mutableAttributeSet0 = jTextPane0.getInputAttributes();
      autoCompleteDocument0.insertString((-2167), (String) null, mutableAttributeSet0);
      assertTrue(autoCompleteDocument0.isAutoCompletionEnabled());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      AutoCompleteDocument autoCompleteDocument0 = new AutoCompleteDocument(jPasswordField0, linkedList0);
      autoCompleteDocument0.setAutoCompletionEnabled(false);
      StyleContext styleContext0 = new StyleContext();
      StyleContext.NamedStyle styleContext_NamedStyle0 = styleContext0.new NamedStyle();
      try { 
        autoCompleteDocument0.insertString(1850, "ukCD7Js+p+r", styleContext_NamedStyle0);
        fail("Expecting exception: BadLocationException");
      
      } catch(BadLocationException e) {
         //
         // Invalid insert
         //
         verifyException("javax.swing.text.GapContent", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JTextArea jTextArea0 = new JTextArea("679V);1)m#FXv9'");
      jTextArea0.replaceSelection("679V);1)m#FXv9'");
      Stack<String> stack0 = new Stack<String>();
      stack0.add("679V);1)m#FXv9'");
      AutoCompleteDocument autoCompleteDocument0 = new AutoCompleteDocument(jTextArea0, stack0);
      assertTrue(autoCompleteDocument0.isAutoCompletionEnabled());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField("j\"o8pj<NZznF-(N1");
      Stack<String> stack0 = new Stack<String>();
      AutoCompleteDocument autoCompleteDocument0 = new AutoCompleteDocument(jPasswordField0, stack0);
      boolean boolean0 = autoCompleteDocument0.isAutoCompletionEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField("Ggmn*CU9,2");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("Ggmn*CU9,2");
      AutoCompleteDocument autoCompleteDocument0 = new AutoCompleteDocument(jPasswordField0, linkedList0);
      assertTrue(autoCompleteDocument0.isAutoCompletionEnabled());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField("D");
      Stack<String> stack0 = new Stack<String>();
      AutoCompleteDocument autoCompleteDocument0 = new AutoCompleteDocument(jPasswordField0, stack0);
      StyleContext styleContext0 = StyleContext.getDefaultStyleContext();
      StyleContext.NamedStyle styleContext_NamedStyle0 = styleContext0.new NamedStyle();
      autoCompleteDocument0.insertString(0, "D", styleContext_NamedStyle0);
      assertTrue(autoCompleteDocument0.isAutoCompletionEnabled());
  }
}
