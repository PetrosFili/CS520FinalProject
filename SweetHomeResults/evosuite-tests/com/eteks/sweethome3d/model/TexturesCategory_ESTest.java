/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:57:04 GMT 2022
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.TexturesCategory;
import com.eteks.sweethome3d.tools.URLContent;
import java.net.URL;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TexturesCategory_ESTest extends TexturesCategory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TexturesCategory texturesCategory0 = new TexturesCategory(":=1oyFn^_u:8s1y|a");
      CatalogTexture catalogTexture0 = new CatalogTexture("v8T@&0", "ik[*", (Content) null, (-1721.0F), 0.0F, ":=1oyFn^_u:8s1y|a", false);
      // Undeclared exception!
      try { 
        texturesCategory0.delete(catalogTexture0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // :=1oyFn^_u:8s1y|a doesn't contain texture ik[*
         //
         verifyException("com.eteks.sweethome3d.model.TexturesCategory", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TexturesCategory texturesCategory0 = new TexturesCategory(":=1oyFn^_u:8s1y|a");
      CatalogTexture catalogTexture0 = new CatalogTexture("v8T@&0", "ik[*", (Content) null, (-1721.0F), 0.0F, ":=1oyFn^_u:8s1y|a", false);
      texturesCategory0.add(catalogTexture0);
      texturesCategory0.delete(catalogTexture0);
      assertEquals((-1721.0F), catalogTexture0.getWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URLContent uRLContent0 = new URLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("!;NP2tu)", "D6H&0]cK8Cu@Ns/R.P", uRLContent0, (-1284.2F), 0.0F, "!;NP2tu)");
      TexturesCategory texturesCategory0 = new TexturesCategory("");
      texturesCategory0.add(catalogTexture0);
      texturesCategory0.add(catalogTexture0);
      assertEquals((-1284.2F), catalogTexture0.getWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TexturesCategory texturesCategory0 = new TexturesCategory("");
      TexturesCategory texturesCategory1 = new TexturesCategory("D6H&0]cK8Cu@Ns/R.P");
      boolean boolean0 = texturesCategory0.equals(texturesCategory1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TexturesCategory texturesCategory0 = new TexturesCategory("");
      boolean boolean0 = texturesCategory0.equals(texturesCategory0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TexturesCategory texturesCategory0 = new TexturesCategory("");
      boolean boolean0 = texturesCategory0.equals("D6H&0]cK8Cu@Ns/R.P");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TexturesCategory texturesCategory0 = new TexturesCategory("");
      String string0 = texturesCategory0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TexturesCategory texturesCategory0 = new TexturesCategory("lJ=v6U.h8x`(Tl5h9A");
      texturesCategory0.hashCode();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TexturesCategory texturesCategory0 = new TexturesCategory("");
      int int0 = texturesCategory0.getTexturesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TexturesCategory texturesCategory0 = new TexturesCategory("lJ=v6U.h8x`(Tl5h9A");
      // Undeclared exception!
      try { 
        texturesCategory0.getTexture(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TexturesCategory texturesCategory0 = new TexturesCategory("");
      int int0 = texturesCategory0.compareTo(texturesCategory0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TexturesCategory texturesCategory0 = new TexturesCategory((String) null);
      List<CatalogTexture> list0 = texturesCategory0.getTextures();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TexturesCategory texturesCategory0 = new TexturesCategory(" Z&5F`D6JKigch(8Oc");
      int int0 = texturesCategory0.getIndexOfTexture((CatalogTexture) null);
      assertEquals((-1), int0);
  }
}
