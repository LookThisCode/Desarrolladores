package testingAndroid;

// Import the uiautomator libraries
import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class DemoInicio extends UiAutomatorTestCase {   

   public void testDemo() throws UiObjectNotFoundException {   
      
      //Buscando un objeto con el texto 'Play Store'
      UiObject allAppsButton = new UiObject(new UiSelector().text("Play Store"));
      allAppsButton.clickAndWaitForNewWindow();

      
      
      
      
      /*
       * Pruebas sobre los linears layout
      UiObject btn = new UiObject(new UiSelector().className("android.widget.LinearLayout").instance(1).childSelector(new UiSelector()));

      if(btn.exists() && btn.isEnabled() && btn.isFocused()) 
      {
    	  	btn.clickAndWaitForNewWindow();
      }
      */
      
      /*
       * Contando la cantidad de Linears
      UiCollection contando = new UiCollection(new UiSelector()
      .className("android.widget.FrameLayout"));
      
      int count = contando.getChildCount(new UiSelector()
      .className("android.widget.LinearLayout"));
      
      if (count > 2)
      {
    	   assertTrue("Muchas repeticiones",false);
      }
      else
      {
    	   assertTrue("Correcto", true);
      }
      */
         
  }   
}
