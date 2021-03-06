/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:56:50 GMT 2022
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.CollectionListener;
import com.eteks.sweethome3d.model.TexturesCatalog;
import com.eteks.sweethome3d.model.TexturesCategory;
import com.eteks.sweethome3d.tools.SimpleURLContent;
import java.net.URL;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TexturesCatalog_ESTest extends TexturesCatalog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TexturesCatalog texturesCatalog0 = new TexturesCatalog();
      TexturesCategory texturesCategory0 = new TexturesCategory("D*4 pY3Sy7Qg");
      URL uRL0 = MockURL.getHttpExample();
      SimpleURLContent simpleURLContent0 = new SimpleURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("|X9r0cBPMRXC$O)*__P", simpleURLContent0, (-1.0F), (-1.0F), true);
      texturesCatalog0.add(texturesCategory0, catalogTexture0);
      texturesCatalog0.delete(catalogTexture0);
      assertEquals(0, texturesCatalog0.getCategoriesCount());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TexturesCatalog texturesCatalog0 = new TexturesCatalog();
      TexturesCategory texturesCategory0 = new TexturesCategory("D*4 pY3Sy7Qg");
      URL uRL0 = MockURL.getHttpExample();
      SimpleURLContent simpleURLContent0 = new SimpleURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("|X9r0cBPMRXC$O)*__P", simpleURLContent0, (-1.0F), (-1.0F), true);
      catalogTexture0.setCategory(texturesCategory0);
      // Undeclared exception!
      try { 
        texturesCatalog0.delete(catalogTexture0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // catalog doesn't contain texture |X9r0cBPMRXC$O)*__P
         //
         verifyException("com.eteks.sweethome3d.model.TexturesCatalog", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TexturesCatalog texturesCatalog0 = new TexturesCatalog();
      URL uRL0 = MockURL.getFileExample();
      SimpleURLContent simpleURLContent0 = new SimpleURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("OGz-T:y{a+T6\u0000", (String) null, simpleURLContent0, 0.0F, 0.0F, "", false);
      // Undeclared exception!
      try { 
        texturesCatalog0.delete(catalogTexture0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // catalog doesn't contain texture null
         //
         verifyException("com.eteks.sweethome3d.model.TexturesCatalog", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TexturesCatalog texturesCatalog0 = new TexturesCatalog();
      TexturesCategory texturesCategory0 = new TexturesCategory("D*4 pY3Sy7Qg");
      URL uRL0 = MockURL.getHttpExample();
      SimpleURLContent simpleURLContent0 = new SimpleURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("|X9r0cBPMRXC$O)*__P", simpleURLContent0, (-1.0F), (-1.0F), true);
      texturesCatalog0.add(texturesCategory0, catalogTexture0);
      texturesCatalog0.add(texturesCategory0, catalogTexture0);
      texturesCatalog0.delete(catalogTexture0);
      assertEquals(1, texturesCatalog0.getCategoriesCount());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TexturesCatalog texturesCatalog0 = new TexturesCatalog();
      texturesCatalog0.removeTexturesListener((CollectionListener<CatalogTexture>) null);
      assertEquals(0, texturesCatalog0.getCategoriesCount());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TexturesCatalog texturesCatalog0 = new TexturesCatalog();
      List<TexturesCategory> list0 = texturesCatalog0.getCategories();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TexturesCatalog texturesCatalog0 = new TexturesCatalog();
      // Undeclared exception!
      try { 
        texturesCatalog0.getCategory(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TexturesCatalog texturesCatalog0 = new TexturesCatalog();
      CollectionListener<CatalogTexture> collectionListener0 = (CollectionListener<CatalogTexture>) mock(CollectionListener.class, new ViolatedAssumptionAnswer());
      texturesCatalog0.addTexturesListener(collectionListener0);
      assertEquals(0, texturesCatalog0.getCategoriesCount());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TexturesCatalog texturesCatalog0 = new TexturesCatalog();
      int int0 = texturesCatalog0.getCategoriesCount();
      assertEquals(0, int0);
  }
}
