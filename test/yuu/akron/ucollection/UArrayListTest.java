/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yuu.akron.ucollection;

import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author yuuakron
 */
public class UArrayListTest {
    
    private final ArrayListWithUtility<String> list = new ArrayListWithUtility<String>("x", "m", "j", "a", "abc", "#");
    
    public UArrayListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testImplementsInterface() {
        System.out.println("interface check");
        
        assertEquals(true, TestUtility.isUArrayList(list));
    }

    /**
     * Test of newList method, of class UArrayList.
     */
    @Test
    public void testNewList_0args() {
        System.out.println("newList");
        ArrayListWithUtility expResult = new ArrayListWithUtility();
        ArrayListWithUtility result = ArrayListWithUtility.newList();
        assertEquals(expResult, result);
    }

    /**
     * Test of newList method, of class UArrayList.
     */
    @Test
    public void testNewList_Collection() {
        System.out.println("newList");
        ArrayListWithUtility expResult = new ArrayListWithUtility(list);
        ArrayListWithUtility result = ArrayListWithUtility.newList(list);
        assertEquals(expResult, result);
    }

    /**
     * Test of newList method, of class UArrayList.
     */
    @Test
    public void testNewList_int() {
        System.out.println("newList");
        int initialCapacity = 100;
        ArrayListWithUtility expResult = new ArrayListWithUtility(initialCapacity);
        ArrayListWithUtility result = ArrayListWithUtility.newList(initialCapacity);
        assertEquals(expResult, result);
    }

    /**
     * Test of newList method, of class UArrayList.
     */
    @Test
    public void testNewList_GenericType() {
        System.out.println("newList");
        ArrayListWithUtility expResult = new ArrayListWithUtility("a", "b", ",");
        ArrayListWithUtility result = ArrayListWithUtility.newList("a", "b", ",");
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class UArrayList.
     */
    @Test
    public void testAdd_GenericType() {
        System.out.println("add");
        Object e = "a";
        ArrayListWithUtility instance = new ArrayListWithUtility();
        boolean expResult = true;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
        ArrayListWithUtility instance2 = new ArrayListWithUtility(e);
        assertEquals(instance, instance2);
    }
}
