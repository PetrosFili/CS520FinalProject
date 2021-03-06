/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:42:06 GMT 2022
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.model.AspectRatio;
import com.eteks.sweethome3d.model.Camera;
import com.eteks.sweethome3d.model.CatalogPieceOfFurniture;
import com.eteks.sweethome3d.model.Compass;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.HomeEnvironment;
import com.eteks.sweethome3d.model.HomeFurnitureGroup;
import com.eteks.sweethome3d.model.HomeObject;
import com.eteks.sweethome3d.model.HomePieceOfFurniture;
import com.eteks.sweethome3d.model.Label;
import com.eteks.sweethome3d.model.Level;
import com.eteks.sweethome3d.model.ObserverCamera;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeListenerProxy;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HomeObject_ESTest extends HomeObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compass compass0 = new Compass(3050.107F, 3050.107F, 3050.107F);
      compass0.setProperty("jG,d#3>0!$z.^", "wS");
      compass0.getProperty("0");
      assertEquals("compass-00000000-0100-4000-8200-000003000000", compass0.getId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Camera.Lens camera_Lens0 = Camera.Lens.NORMAL;
      Camera camera0 = new Camera(0.0F, 796.078F, 0.0F, 0.0F, 0.0F, 0.0F, (-1791L), camera_Lens0);
      camera0.getProperty("+ ds'?*goU\"&]C[jV<");
      assertEquals("camera-00000000-0100-4000-8200-000003000000", camera0.getId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compass compass0 = new Compass(3050.107F, 3050.107F, 3050.107F);
      compass0.setProperty("Atlantic/Canary", "Atlantic/Canary");
      compass0.setProperty("Atlantic/Canary", "eV|\"BLbzlUuR<r");
      assertEquals("compass-00000000-0100-4000-8200-000003000000", compass0.getId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compass compass0 = new Compass(3050.107F, 3050.107F, 3050.107F);
      compass0.setProperty("Atlantic/Canary", "Atlantic/Canary");
      compass0.setProperty("", "BW\"o(ny0rUAJ9s?[@0g");
      compass0.setProperty("U5psN|_tB7*c", "U5psN|_tB7*c");
      assertEquals("compass-00000000-0100-4000-8200-000003000000", compass0.getId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compass compass0 = new Compass(3050.107F, 3050.107F, 3050.107F);
      compass0.setProperty("jG,d#3>0!$z.^", "LgZsm>'X+S^gdM+FeJ");
      compass0.setProperty("jG,d#3>0!$z.^", (String) null);
      assertEquals("compass-00000000-0100-4000-8200-000003000000", compass0.getId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compass compass0 = new Compass(3050.107F, 3050.107F, 3050.107F);
      compass0.setProperty("jG,d#3>0!$z.^", "LgZsm>'X+S^gdM+FeJ");
      compass0.setProperty("U5psN|_tB7*c", (String) null);
      assertEquals("compass-00000000-0100-4000-8200-000003000000", compass0.getId());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compass compass0 = new Compass(3050.107F, 3050.107F, 3050.107F);
      compass0.setProperty("U5psN|_tB7*c", (String) null);
      assertEquals("compass-00000000-0100-4000-8200-000003000000", compass0.getId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compass compass0 = new Compass(3050.107F, 3050.107F, 3050.107F);
      compass0.setProperty("rz]aF<W", "rz]aF<W");
      compass0.setProperty("jG,d#3>0!$z.^", "jG,d#3>0!$z.^");
      HomeObject homeObject0 = compass0.duplicate();
      assertEquals("compass-04000000-0500-4000-8600-000007000000", homeObject0.getId());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compass compass0 = new Compass(3050.107F, 3050.107F, 3050.107F);
      compass0.setProperty("Atlantic/Canary", "Atlantic/Canary");
      HomeObject homeObject0 = compass0.duplicate();
      assertEquals("compass-04000000-0500-4000-8600-000007000000", homeObject0.getId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compass compass0 = new Compass(0.0F, 25.417F, 0.0F);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("jRnI'x1)AA?{", propertyChangeListener0);
      compass0.addPropertyChangeListener("xE?j:3", (PropertyChangeListener) propertyChangeListenerProxy0);
      compass0.addPropertyChangeListener("jRnI'x1)AA?{", (PropertyChangeListener) propertyChangeListenerProxy0);
      assertEquals("compass-00000000-0100-4000-8200-000003000000", compass0.getId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Camera.Lens camera_Lens0 = Camera.Lens.NORMAL;
      Camera camera0 = new Camera(0.0F, 796.078F, 0.0F, 0.0F, 0.0F, 0.0F, (-1791L), camera_Lens0);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("+ ds'?*goU\"&]C[jV<", propertyChangeListener0);
      camera0.addPropertyChangeListener("", (PropertyChangeListener) propertyChangeListenerProxy0);
      camera0.removePropertyChangeListener("+ ds'?*goU\"&]C[jV<", (PropertyChangeListener) propertyChangeListenerProxy0);
      assertEquals("camera-00000000-0100-4000-8200-000003000000", camera0.getId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      HomeEnvironment homeEnvironment0 = new HomeEnvironment("feukgr{l[]*Gv");
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.GROUND_TEXTURE;
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListener0);
      assertEquals(AspectRatio.VIEW_3D_RATIO, homeEnvironment0.getPhotoAspectRatio());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Level level0 = null;
      try {
        level0 = new Level((String) null, (String) null, (-1381.76F), (-1381.76F), (-1381.76F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ID must exist
         //
         verifyException("com.eteks.sweethome3d.model.HomeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Label label0 = new Label("@u", "@u", (-209.40514F), (-209.40514F));
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("", propertyChangeListener0);
      label0.addPropertyChangeListener("com.eteks.sweethome3d.model.Polyline", (PropertyChangeListener) propertyChangeListenerProxy0);
      label0.addPropertyChangeListener((PropertyChangeListener) propertyChangeListenerProxy0);
      assertEquals(0.0F, label0.getAngle(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment("feukgr{l[]*Gv");
      HomeObject homeObject0 = homeEnvironment0.duplicate();
      assertEquals("feukgr-00000000-0100-4000-8200-000003000000", homeObject0.getId());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObserverCamera observerCamera0 = new ObserverCamera("", (-7L), (-7L), (-430.352F), (-7L), (-430.352F), (-7L));
      HomeObject homeObject0 = observerCamera0.duplicate();
      assertEquals("-00000000-0100-4000-8200-000003000000", homeObject0.getId());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compass compass0 = new Compass(0.0F, 0.0F, 0.0F);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("#N\"nKtEGPp2]OzwSB", propertyChangeListener0);
      compass0.addPropertyChangeListener("ID must exist", (PropertyChangeListener) propertyChangeListenerProxy0);
      compass0.setLatitude(0.0F);
      assertEquals("compass-00000000-0100-4000-8200-000003000000", compass0.getId());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compass compass0 = new Compass(0.0F, (-1.0F), 15.284722F);
      compass0.setProperty("S{*!lx*Ei}D8j", "S{*!lx*Ei}D8j");
      Collection<String> collection0 = compass0.getPropertyNames();
      assertEquals("compass-00000000-0100-4000-8200-000003000000", compass0.getId());
      assertTrue(collection0.contains("S{*!lx*Ei}D8j"));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Camera camera0 = new Camera("", 0.0F, 0.0F, (-3281.904F), 0.0F, (-1820.3951F), (-3281.904F));
      Collection<String> collection0 = camera0.getPropertyNames();
      assertFalse(collection0.contains(""));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<HomePieceOfFurniture> linkedList0 = new LinkedList<HomePieceOfFurniture>();
      CatalogPieceOfFurniture catalogPieceOfFurniture0 = new CatalogPieceOfFurniture("com.eteks.sweethome3d.mode.HomePieceOfFuriture$5", (Content) null, (Content) null, 3989.971F, 3989.971F, 3989.971F, true, true);
      HomePieceOfFurniture homePieceOfFurniture0 = new HomePieceOfFurniture(catalogPieceOfFurniture0);
      linkedList0.offer(homePieceOfFurniture0);
      HomeFurnitureGroup homeFurnitureGroup0 = new HomeFurnitureGroup(linkedList0, "com.eteks.sweethome3d.mode.HomePieceOfFuriture$5");
      homeFurnitureGroup0.setX(3989.971F);
      assertEquals("furnitureGroup-04000000-0500-4000-8600-000007000000", homeFurnitureGroup0.getId());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("Room points must containt at least two points", propertyChangeListener0);
      Camera camera0 = new Camera("com.eteks.sweethome3d.model.HomeObject", (-113.5F), (-1962.1315F), 0.0F, 0.0F, (-1962.1315F), (-113.5F));
      camera0.addPropertyChangeListener("Atlantic/Stanley", (PropertyChangeListener) propertyChangeListenerProxy0);
      camera0.removePropertyChangeListener((PropertyChangeListener) propertyChangeListenerProxy0);
      assertEquals("Room points must containt at least two points", propertyChangeListenerProxy0.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compass compass0 = new Compass(3050.107F, 3050.107F, 3050.107F);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("Europe/Andorra", propertyChangeListener0);
      compass0.removePropertyChangeListener((PropertyChangeListener) propertyChangeListenerProxy0);
      assertEquals("compass-00000000-0100-4000-8200-000003000000", compass0.getId());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compass compass0 = new Compass(3050.107F, 3050.107F, 3050.107F);
      String string0 = compass0.getId();
      assertEquals("compass-00000000-0100-4000-8200-000003000000", string0);
  }
}
