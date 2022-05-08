/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:16:58 GMT 2022
 */

package com.eteks.sweethome3d.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.io.DefaultUserPreferences;
import com.eteks.sweethome3d.io.FileUserPreferences;
import com.eteks.sweethome3d.io.HomeContentContext;
import com.eteks.sweethome3d.io.HomeXMLHandler;
import com.eteks.sweethome3d.model.Camera;
import com.eteks.sweethome3d.model.CatalogDoorOrWindow;
import com.eteks.sweethome3d.model.CatalogLight;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.DimensionLine;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.HomeDoorOrWindow;
import com.eteks.sweethome3d.model.HomeLight;
import com.eteks.sweethome3d.model.Label;
import com.eteks.sweethome3d.model.Level;
import com.eteks.sweethome3d.model.LightSource;
import com.eteks.sweethome3d.model.ObserverCamera;
import com.eteks.sweethome3d.model.Room;
import com.eteks.sweethome3d.model.Sash;
import com.eteks.sweethome3d.model.Wall;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import java.math.BigDecimal;
import java.net.URL;
import java.util.EmptyStackException;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.AttributesImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HomeXMLHandler_ESTest extends HomeXMLHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      homeXMLHandler0.startElement("", "", (String) null, attributesImpl0);
      Label label0 = new Label("", 25.417F, (-16));
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      homeXMLHandler0.setLabelAttributes(label0, "", hashMap0);
      assertEquals(0.0F, label0.getElevation(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      homeXMLHandler0.startElement((String) null, "/n/n,X9?E", "/n/n,X9?E", attributes2Impl0);
      Home home0 = new Home();
      homeXMLHandler0.setHome(home0);
      homeXMLHandler0.endElement("/n/n,X9?E", "/n/n,X9?E", "property");
      homeXMLHandler0.startElement("property", "property", "property", attributes2Impl0);
      homeXMLHandler0.endElement("X2Iq:!/-Y(", (String) null, "/n/n,X9?E");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      homeXMLHandler0.startElement((String) null, "/n/n,X9?E", "/n/n,X9?E", attributes2Impl0);
      homeXMLHandler0.endElement("/n/n,X9?E", "/n/n,X9?E", "property");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      homeXMLHandler0.startElement((String) null, "/n/n,X9?E", "/n/n,X9?E", attributes2Impl0);
      homeXMLHandler0.endElement("X2Iq:!/-Y(", (String) null, "/n/n,X9?E");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      homeXMLHandler0.startElement("", "", "lightSource", attributes2Impl0);
      try { 
        homeXMLHandler0.endElement((String) null, (String) null, "lightSource");
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Missing float attribute x
         //
         verifyException("com.eteks.sweethome3d.io.HomeXMLHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      homeXMLHandler0.startElement("", "", "sash", attributes2Impl0);
      try { 
        homeXMLHandler0.endElement("sash", "sash", "sash");
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Missing float attribute xAxis
         //
         verifyException("com.eteks.sweethome3d.io.HomeXMLHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      homeXMLHandler0.startElement((String) null, "?~BAW]K,..-JP)1I\"X,", "?~BAW]K,..-JP)1I\"X,", attributes2Impl0);
      try { 
        homeXMLHandler0.endElement("?~BAW]K,..-JP)1I\"X,", "?~BAW]K,..-JP)1I\"X,", "point");
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Missing float attribute x
         //
         verifyException("com.eteks.sweethome3d.io.HomeXMLHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      homeXMLHandler0.startElement((String) null, "home", "home", attributes2Impl0);
      try { 
        homeXMLHandler0.endElement("iqBbLo[F1Me5t)Xel", (String) null, "dimensionLine");
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Missing float attribute xStart
         //
         verifyException("com.eteks.sweethome3d.io.HomeXMLHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      homeXMLHandler0.startElement("", "", "print", attributes2Impl0);
      try { 
        homeXMLHandler0.endElement("print", "print", "print");
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Missing paperOrientation attribute
         //
         verifyException("com.eteks.sweethome3d.io.HomeXMLHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      homeXMLHandler0.startElement("", "", "compass", attributes2Impl0);
      // Undeclared exception!
      try { 
        homeXMLHandler0.endElement("compass", "compass", "compass");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.io.HomeXMLHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      homeXMLHandler0.startElement("*5UY,j<@ecl", "*5UY,j<@ecl", "texture", attributes2Impl0);
      homeXMLHandler0.startElement("texture", "print", "compass", attributes2Impl0);
      try { 
        homeXMLHandler0.endElement("texture", "texture", "texture");
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Missing float attribute width
         //
         verifyException("com.eteks.sweethome3d.io.HomeXMLHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      homeXMLHandler0.startElement("", "", "NONE", attributes2Impl0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Wall wall0 = new Wall("NONE", (-2446.1875F), (-2446.1875F), (-139.41667F), (-2446.1875F), (-139.41667F), 91.63333F);
      homeXMLHandler0.setWallAttributes(wall0, "", hashMap0);
      assertEquals((-2446.1875F), wall0.getYStart(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      homeXMLHandler0.startElement("7g/`2.];beDvp_", "", "xu", attributes2Impl0);
      ObserverCamera observerCamera0 = new ObserverCamera("QL6>2rA%Js[rG7", (-2075.54F), 0.0F, 0.0F, 0.0F, (-2075.54F), 1520.78F);
      homeXMLHandler0.setCameraAttributes(observerCamera0, "7EY\":''2p:$Jxe1^M4}", hashMap0);
      assertEquals((-2075.54F), observerCamera0.getPitch(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      homeXMLHandler0.startElement("lengthStyle", "PNT", "lengthStyle", attributes2Impl0);
      LightSource[] lightSourceArray0 = new LightSource[3];
      float[][] floatArray0 = new float[9][7];
      BigDecimal bigDecimal0 = new BigDecimal((-1615507653));
      CatalogLight catalogLight0 = new CatalogLight("lengthStyle", "lengthStyle", "d2mLIu7#3X%Ze&DV2", (Content) null, (Content) null, (Content) null, 0.0F, 43.240276F, (-2056.0F), 24.640833F, false, lightSourceArray0, floatArray0, ";'+4./$:o/3(M*D}", false, bigDecimal0, bigDecimal0);
      HomeLight homeLight0 = new HomeLight(";'+4./$:o/3(M*D}", catalogLight0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        homeXMLHandler0.setPieceOfFurnitureAttributes(homeLight0, "d2mLIu7#3X%Ze&DV2", hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.io.HomeXMLHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      homeXMLHandler0.startElement("", "", (String) null, attributesImpl0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      float[][] floatArray0 = new float[9][3];
      URL uRL0 = MockURL.getFileExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, false);
      Sash[] sashArray0 = new Sash[9];
      CatalogDoorOrWindow catalogDoorOrWindow0 = new CatalogDoorOrWindow("", "", "Q_I`O?IlIf4", resourceURLContent0, resourceURLContent0, resourceURLContent0, 0.0F, (-16.0F), (-23.533333F), (-1880919869), true, 25.417F, 0.0F, sashArray0, floatArray0, "Missing values for attribute matrix", false, (BigDecimal) null, (BigDecimal) null);
      HomeDoorOrWindow homeDoorOrWindow0 = new HomeDoorOrWindow(catalogDoorOrWindow0);
      // Undeclared exception!
      try { 
        homeXMLHandler0.setPieceOfFurnitureAttributes(homeDoorOrWindow0, "^:k{", hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.io.HomeXMLHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      homeXMLHandler0.startElement("baseboard", "&!WC%{Yo/|p27c", "baseboard", attributes2Impl0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      homeXMLHandler0.startElement("5or", "5or", "label", attributesImpl0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      homeXMLHandler0.startElement("NAME_VISIBLE", "", "furnitureGroup", attributes2Impl0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      homeXMLHandler0.startElement("subpartSizeUnderLight", "pieceOfFurniture", "pieceOfFurniture", attributes2Impl0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      homeXMLHandler0.startElement("level", ":e*rMJW", "level", attributesImpl0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      homeXMLHandler0.startElement((String) null, "environment", "environment", attributes2Impl0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      homeXMLHandler0.startElement("z6^[7j,7d 82(*", "z6^[7j,7d 82(*", "textStyle", attributes2Impl0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      homeXMLHandler0.startElement("furnitureVisibleProperty", "furnitureVisibleProperty", "furnitureVisibleProperty", attributes2Impl0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      attributes2Impl0.addAttribute("America/Costa_Rica", "E/]'XE+ (o^XmiIK?w", "furnitureGroup", "point", "Crd%");
      homeXMLHandler0.startElement("", "", "J8+5P_p.x]e", attributes2Impl0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      homeXMLHandler0.startElement((String) null, "home", "home", attributes2Impl0);
      homeXMLHandler0.endElement("point", "material", "polyline");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      homeXMLHandler0.startElement("", "", "", attributes2Impl0);
      float[][] floatArray0 = new float[7][5];
      Room room0 = new Room("", floatArray0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      homeXMLHandler0.setRoomAttributes(room0, "", hashMap0);
      assertTrue(room0.isFloorVisible());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      homeXMLHandler0.endDocument();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      homeXMLHandler0.startElement((String) null, "home", "home", attributes2Impl0);
      homeXMLHandler0.endElement("home", "home", "property");
      homeXMLHandler0.startElement("wallWidth", "wallWidth", "wallWidth", attributes2Impl0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      homeXMLHandler0.endElement("X2Iq:!/-Y(", (String) null, "home");
      Camera.Lens camera_Lens0 = Camera.Lens.FISHEYE;
      Camera camera0 = new Camera("property", 592.7F, 592.7F, 2408.1F, 592.7F, 592.7F, 2408.1F, 8542, camera_Lens0);
      homeXMLHandler0.setCameraAttributes(camera0, "X2Iq:!/-Y(", hashMap0);
      assertNull(camera0.getName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
      homeXMLHandler0.startElement((String) null, "home", "home", attributes2Impl0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Level level0 = new Level((String) null, 8542, 592.7F, 0.5F);
      homeXMLHandler0.setLevelAttributes(level0, "1S6ObX#Ot\"(", hashMap0);
      assertTrue(level0.isViewableAndVisible());
      assertTrue(level0.isViewable());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      DimensionLine dimensionLine0 = new DimensionLine(1131.62F, 1131.62F, 1131.62F, 1131.62F, 1131.62F);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        homeXMLHandler0.setDimensionLineAttributes(dimensionLine0, "com.eteks.sweethome3d.swing.PhotoPanel.PhotoDialogY", hashMap0);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      homeXMLHandler0.setContentContext((HomeContentContext) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Home home0 = homeXMLHandler0.getHome();
      assertNull(home0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultUserPreferences defaultUserPreferences0 = new DefaultUserPreferences();
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler(defaultUserPreferences0);
      homeXMLHandler0.startDocument();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      homeXMLHandler0.startElement("", "", "material", attributes2Impl0);
      homeXMLHandler0.endElement((String) null, (String) null, "material");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUserPreferences fileUserPreferences0 = new FileUserPreferences();
      HomeXMLHandler homeXMLHandler0 = new HomeXMLHandler(fileUserPreferences0);
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        homeXMLHandler0.characters(charArray0, 1486, 1486);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }
}