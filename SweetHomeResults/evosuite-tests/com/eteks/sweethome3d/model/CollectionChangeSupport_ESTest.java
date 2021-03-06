/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 03:28:04 GMT 2022
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.eteks.sweethome3d.model.CollectionChangeSupport;
import com.eteks.sweethome3d.model.CollectionEvent;
import com.eteks.sweethome3d.model.CollectionListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CollectionChangeSupport_ESTest extends CollectionChangeSupport_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      CollectionChangeSupport<String> collectionChangeSupport0 = new CollectionChangeSupport<String>(object0);
      CollectionEvent.Type collectionEvent_Type0 = CollectionEvent.Type.ADD;
      CollectionListener<String> collectionListener0 = (CollectionListener<String>) mock(CollectionListener.class, new ViolatedAssumptionAnswer());
      collectionChangeSupport0.addCollectionListener(collectionListener0);
      collectionChangeSupport0.fireCollectionChanged("", (-164), (CollectionEvent.Type) collectionEvent_Type0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CollectionChangeSupport<Object> collectionChangeSupport0 = new CollectionChangeSupport<Object>((Object) null);
      CollectionListener<Object> collectionListener0 = (CollectionListener<Object>) mock(CollectionListener.class, new ViolatedAssumptionAnswer());
      collectionChangeSupport0.removeCollectionListener(collectionListener0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CollectionChangeSupport<Integer> collectionChangeSupport0 = new CollectionChangeSupport<Integer>((Object) null);
      Integer integer0 = new Integer(608);
      CollectionEvent.Type collectionEvent_Type0 = CollectionEvent.Type.ADD;
      collectionChangeSupport0.fireCollectionChanged(integer0, (CollectionEvent.Type) collectionEvent_Type0);
  }
}
