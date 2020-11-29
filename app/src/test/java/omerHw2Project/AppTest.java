/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package omerHw2Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test
   public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(App.search(array, 4));
    }

    @Test
    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(App.search(array, 5));
    }

    @Test
    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(App.search(array, 1));
    }

    @Test
    public void testNull() {
      assertFalse(App.search(null, 1));
    }
 @Test
    public void objectsEqual() {
        ArrayList<Integer> arg = new ArrayList<>();
        arg.add(1);
        arg.add(2);
        arg.add(3);
          assertThrows(
                  RuntimeException.class,
                  () -> { App.swap(arg, 1, 1); });
    }
    @Test
    public void cannotFindX() {  
        ArrayList<Integer> arg = new ArrayList<>();
        arg.add(1);
        arg.add(2);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        assertTrue(expected.equals(App.swap(arg,3,1)));
    }
    @Test
    public void cannotFindY() { 
        ArrayList<Integer> arg = new ArrayList<>();
        arg.add(1);
        arg.add(2);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        assertTrue(expected.equals(App.swap(arg,1,3)));
    }
    @Test
    public void swapWithFirstX() {
        ArrayList<Integer> arg = new ArrayList<>();
        arg.add(1);
        arg.add(2);
        arg.add(3);
        arg.add(2);
        arg.add(4);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(2);
        assertTrue(expected.equals(App.swap(arg,2,4)));
    }
    @Test
    public void swapWithLastY() {
        ArrayList<Integer> arg = new ArrayList<>();
        arg.add(1);
        arg.add(2);
        arg.add(3);
        arg.add(2);
        arg.add(4);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(3);
        expected.add(1);
        expected.add(4);
        assertTrue(expected.equals(App.swap(arg,1,2)));
        
      }
}
