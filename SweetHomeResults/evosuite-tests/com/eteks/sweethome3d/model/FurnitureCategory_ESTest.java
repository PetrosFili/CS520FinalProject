/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:30:51 GMT 2022
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.model.CatalogPieceOfFurniture;
import com.eteks.sweethome3d.model.FurnitureCategory;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import com.eteks.sweethome3d.tools.TemporaryURLContent;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FurnitureCategory_ESTest extends FurnitureCategory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FurnitureCategory furnitureCategory0 = new FurnitureCategory("");
      String[] stringArray0 = new String[7];
      Long long0 = new Long(0);
      Float float0 = new Float(280.2444F);
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("com.eteks.sweethome3d.model.CatalogPieceOfFurniture", "~:iS7b<FS 9DpkGQ[I", 0, "com.eteks.sweethome3d.tools.ResourceURLContent", uRLStreamHandler0);
      TemporaryURLContent temporaryURLContent0 = new TemporaryURLContent(uRL0);
      BigDecimal bigDecimal0 = new BigDecimal((-1L));
      CatalogPieceOfFurniture catalogPieceOfFurniture0 = new CatalogPieceOfFurniture("com.eteks.sweethome3d.tools.ResourceURLContent", "com.eteks.sweethome3d.tools.ResourceURLContent", "[u+:]xst&uRYV #m*", "com.eteks.sweethome3d.tools.ResourceURLContent", stringArray0, long0, float0, temporaryURLContent0, temporaryURLContent0, temporaryURLContent0, 280.2444F, 2014.3466F, 280.2444F, 1945.9653F, (-1931.06F), true, "com.eteks.sweethome3d.tools.ResourceURLContent", (float[][]) null, true, "com.eteks.sweethome3d.tools.ResourceURLContent", false, false, true, bigDecimal0, bigDecimal0, "~:iS7b<FS 9DpkGQ[I");
      furnitureCategory0.add(catalogPieceOfFurniture0);
      furnitureCategory0.add(catalogPieceOfFurniture0);
      assertEquals(2014.3466F, catalogPieceOfFurniture0.getDepth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FurnitureCategory furnitureCategory0 = new FurnitureCategory("#");
      FurnitureCategory furnitureCategory1 = new FurnitureCategory("aU``To");
      boolean boolean0 = furnitureCategory1.equals(furnitureCategory0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FurnitureCategory furnitureCategory0 = new FurnitureCategory("#");
      boolean boolean0 = furnitureCategory0.equals(furnitureCategory0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FurnitureCategory furnitureCategory0 = new FurnitureCategory("%/>'1L.");
      boolean boolean0 = furnitureCategory0.equals("%/>'1L.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FurnitureCategory furnitureCategory0 = new FurnitureCategory("%/>'1L.");
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(classLoader0, "");
      CatalogPieceOfFurniture catalogPieceOfFurniture0 = new CatalogPieceOfFurniture("%/>'1L.", resourceURLContent0, resourceURLContent0, 0.0F, 0.0F, 804.11285F, false, true);
      // Undeclared exception!
      try { 
        furnitureCategory0.delete(catalogPieceOfFurniture0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // %/>'1L. doesn't contain piece %/>'1L.
         //
         verifyException("com.eteks.sweethome3d.model.FurnitureCategory", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FurnitureCategory furnitureCategory0 = new FurnitureCategory("%/>'1L.");
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(classLoader0, "");
      CatalogPieceOfFurniture catalogPieceOfFurniture0 = new CatalogPieceOfFurniture("%/>'1L.", resourceURLContent0, resourceURLContent0, 0.0F, 0.0F, 804.11285F, true, true);
      furnitureCategory0.add(catalogPieceOfFurniture0);
      furnitureCategory0.delete(catalogPieceOfFurniture0);
      assertEquals(0, furnitureCategory0.getFurnitureCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FurnitureCategory furnitureCategory0 = new FurnitureCategory("");
      // Undeclared exception!
      try { 
        furnitureCategory0.getPieceOfFurniture(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FurnitureCategory furnitureCategory0 = new FurnitureCategory("_}v}X#(hH7VK9]3EI\"");
      int int0 = furnitureCategory0.getFurnitureCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FurnitureCategory furnitureCategory0 = new FurnitureCategory("_}v}X#(hH7VK9]3EI\"");
      List<CatalogPieceOfFurniture> list0 = furnitureCategory0.getFurniture();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FurnitureCategory furnitureCategory0 = new FurnitureCategory("");
      String[] stringArray0 = new String[7];
      Long long0 = new Long(0);
      Float float0 = new Float(280.2444F);
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("com.eteks.sweethome3d.model.CatalogPieceOfFurniture", "~:iS7b<FS 9DpkGQ[I", 0, "com.eteks.sweethome3d.tools.ResourceURLContent", uRLStreamHandler0);
      TemporaryURLContent temporaryURLContent0 = new TemporaryURLContent(uRL0);
      BigDecimal bigDecimal0 = new BigDecimal((-1L));
      CatalogPieceOfFurniture catalogPieceOfFurniture0 = new CatalogPieceOfFurniture("com.eteks.sweethome3d.tools.ResourceURLContent", "com.eteks.sweethome3d.tools.ResourceURLContent", "[u+:]xst&uRYV #m*", "com.eteks.sweethome3d.tools.ResourceURLContent", stringArray0, long0, float0, temporaryURLContent0, temporaryURLContent0, temporaryURLContent0, 280.2444F, 2014.3466F, 280.2444F, 1945.9653F, (-1931.06F), true, "com.eteks.sweethome3d.tools.ResourceURLContent", (float[][]) null, true, "com.eteks.sweethome3d.tools.ResourceURLContent", false, false, true, bigDecimal0, bigDecimal0, "~:iS7b<FS 9DpkGQ[I");
      furnitureCategory0.add(catalogPieceOfFurniture0);
      String[] stringArray1 = catalogPieceOfFurniture0.getFilterCriteria();
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FurnitureCategory furnitureCategory0 = new FurnitureCategory("com.eteks.sweethome3d.tools.TemporaryURLContent");
      int int0 = furnitureCategory0.compareTo(furnitureCategory0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FurnitureCategory furnitureCategory0 = new FurnitureCategory("");
      furnitureCategory0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FurnitureCategory furnitureCategory0 = new FurnitureCategory("");
      String[] stringArray0 = new String[7];
      Long long0 = new Long(0);
      Float float0 = new Float(280.2444F);
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("com.eteks.sweethome3d.model.CatalogPieceOfFurniture", "~:iS7b<FS 9DpkGQ[I", 0, "com.eteks.sweethome3d.tools.ResourceURLContent", uRLStreamHandler0);
      TemporaryURLContent temporaryURLContent0 = new TemporaryURLContent(uRL0);
      BigDecimal bigDecimal0 = new BigDecimal((-1L));
      CatalogPieceOfFurniture catalogPieceOfFurniture0 = new CatalogPieceOfFurniture("com.eteks.sweethome3d.tools.ResourceURLContent", "com.eteks.sweethome3d.tools.ResourceURLContent", "[u+:]xst&uRYV #m*", "com.eteks.sweethome3d.tools.ResourceURLContent", stringArray0, long0, float0, temporaryURLContent0, temporaryURLContent0, temporaryURLContent0, 280.2444F, 2014.3466F, 280.2444F, 1945.9653F, (-1931.06F), true, "com.eteks.sweethome3d.tools.ResourceURLContent", (float[][]) null, true, "com.eteks.sweethome3d.tools.ResourceURLContent", false, false, true, bigDecimal0, bigDecimal0, "~:iS7b<FS 9DpkGQ[I");
      int int0 = furnitureCategory0.getIndexOfPieceOfFurniture(catalogPieceOfFurniture0);
      assertEquals((-1), int0);
  }
}
