/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:00:52 GMT 2022
 */

package com.eteks.sweethome3d.io;

import org.junit.Test;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.io.DamagedHomeIOException;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.Selectable;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DamagedHomeIOException_ESTest extends DamagedHomeIOException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Home home0 = new Home(485.2236F);
      List<Selectable> list0 = home0.getSelectedItems();
      Class<Content> class0 = Content.class;
      List<Content> list1 = Home.getSubList((List<? extends Selectable>) list0, class0);
      DamagedHomeIOException damagedHomeIOException0 = new DamagedHomeIOException(home0, list1);
      List<Content> list2 = damagedHomeIOException0.getInvalidContent();
      assertTrue(list2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Home home0 = new Home(485.2236F);
      List<Selectable> list0 = home0.getSelectedItems();
      Class<Content> class0 = Content.class;
      List<Content> list1 = Home.getSubList((List<? extends Selectable>) list0, class0);
      DamagedHomeIOException damagedHomeIOException0 = new DamagedHomeIOException(home0, list1);
      Home home1 = damagedHomeIOException0.getDamagedHome();
      assertEquals(7000L, home1.getVersion());
  }
}
