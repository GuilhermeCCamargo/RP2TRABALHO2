/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unipampa.lista.classe;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author yuryalencar
 */
public class RPListTest {
    
    public RPListTest() {
    }

    /**
     * Test of isEmpty method, of class RPList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        RPList<String> instance = new RPList();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    
        instance.add("Teste");
        expResult = false;
        result = instance.isEmpty();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of removeLast method, of class RPList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        RPList<String> instance = new RPList();
        instance.add("Teste");
        String expResult = "Teste";
        String result = instance.removeLast();
        assertEquals(expResult, result);

        instance.add("Teste");
        instance.add("Teste1");
        expResult = "Teste1";
        result = instance.removeLast();
        assertEquals(expResult, result);

        expResult = "Teste";
        result = instance.removeLast();
        assertEquals(expResult, result);
    }

    /**
     * Test of indexOf method, of class RPList.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        RPList<String> instance = new RPList();
        instance.add("Teste");
        instance.add("Teste1");
        instance.add("Teste2");
        instance.add("Teste3");
        
        int expResult = 0;
        int result = instance.indexOf("Teste");
        assertEquals(expResult, result);        
    
        expResult = 1;
        result = instance.indexOf("Teste1");
        assertEquals(expResult, result);        
    
        expResult = 2;
        result = instance.indexOf("Teste2");
        assertEquals(expResult, result);        
    
        expResult = 3;
        result = instance.indexOf("Teste3");
        assertEquals(expResult, result);        
    }

    /**
     * Test of size method, of class RPList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        RPList<String> instance = new RPList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
        instance.add("Teste");
        expResult = 1;
        result = instance.size();
        assertEquals(expResult, result);
        
        instance.add("Teste1");
        expResult = 2;
        result = instance.size();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of contains method, of class RPList.
     */
    @Test
    @Ignore
    public void testContains() {
        System.out.println("contains");
        Object o = null;
        RPList instance = new RPList();
        boolean expResult = false;
        boolean result = instance.contains(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class RPList.
     */
    @Test
    @Ignore
    public void testIterator() {
        System.out.println("iterator");
        RPList instance = new RPList();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class RPList.
     */
    @Test
    @Ignore
    public void testToArray_0args() {
        System.out.println("toArray");
        RPList instance = new RPList();
        Object[] expResult = null;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class RPList.
     */
    @Test
    @Ignore
    public void testToArray_ObjectArr() {
        System.out.println("toArray");
        Object[] a = null;
        RPList instance = new RPList();
        Object[] expResult = null;
        Object[] result = instance.toArray(a);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class RPList.
     */
    @Test
    @Ignore
    public void testAdd_Object() {
        System.out.println("add");
        Object e = null;
        RPList instance = new RPList();
        boolean expResult = false;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class RPList.
     */
    @Test
    public void testRemove_Object() {
        System.out.println("remove");
        RPList<String> instance = new RPList();
        instance.add("Teste");
        instance.add("Teste1");
        instance.add("Teste2");
        instance.add("Teste3");
        boolean expResult = true;
        boolean result = instance.remove("Teste");
        assertEquals(expResult, result);
        
        expResult = true;
        result = instance.remove("Teste1");
        assertEquals(expResult, result);
        
        expResult = false;
        result = instance.remove("Teste5");
        assertEquals(expResult, result);
        
        expResult = true;
        result = instance.remove("Teste3");
        assertEquals(expResult, result);
    }

    /**
     * Test of getLast method, of class RPList.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        RPList<String> instance = new RPList();
        
        instance.add("Teste");
        String expResult = "Teste";
        String result = instance.getLast();
        assertEquals(expResult, result);
        
        instance.add("Teste1");
        expResult = "Teste1";
        result = instance.getLast();
        assertEquals(expResult, result);
        
        instance.add("Teste2");
        expResult = "Teste2";
        result = instance.getLast();
        assertEquals(expResult, result);
    
        instance.add("Teste3");
        expResult = "Teste3";
        result = instance.getLast();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of containsAll method, of class RPList.
     */
    @Test
    @Ignore
    public void testContainsAll() {
        System.out.println("containsAll");
        Collection c = null;
        RPList instance = new RPList();
        boolean expResult = false;
        boolean result = instance.containsAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class RPList.
     */
    @Test
    @Ignore
    public void testAddAll_Collection() {
        System.out.println("addAll");
        Collection c = null;
        RPList instance = new RPList();
        boolean expResult = false;
        boolean result = instance.addAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class RPList.
     */
    @Test
    @Ignore
    public void testAddAll_int_Collection() {
        System.out.println("addAll");
        int index = 0;
        Collection c = null;
        RPList instance = new RPList();
        boolean expResult = false;
        boolean result = instance.addAll(index, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAll method, of class RPList.
     */
    @Test
    @Ignore
    public void testRemoveAll() {
        System.out.println("removeAll");
        Collection c = null;
        RPList instance = new RPList();
        boolean expResult = false;
        boolean result = instance.removeAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retainAll method, of class RPList.
     */
    @Test
    @Ignore
    public void testRetainAll() {
        System.out.println("retainAll");
        Collection c = null;
        RPList instance = new RPList();
        boolean expResult = false;
        boolean result = instance.retainAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class RPList.
     */
    @Test
    @Ignore
    public void testClear() {
        System.out.println("clear");
        RPList instance = new RPList();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class RPList.
     */
    @Test
    @Ignore
    public void testGet() {
        System.out.println("get");
        int index = 0;
        RPList instance = new RPList();
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class RPList.
     */
    @Test
    @Ignore
    public void testSet() {
        System.out.println("set");
        int index = 0;
        Object element = null;
        RPList instance = new RPList();
        Object expResult = null;
        Object result = instance.set(index, element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class RPList.
     */
    @Test
    @Ignore
    public void testAdd_int_Object() {
        System.out.println("add");
        int index = 0;
        Object element = null;
        RPList instance = new RPList();
        instance.add(index, element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class RPList.
     */
    @Test
    @Ignore
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        RPList instance = new RPList();
        Object expResult = null;
        Object result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastIndexOf method, of class RPList.
     */
    @Test
    @Ignore
    public void testLastIndexOf() {
        System.out.println("lastIndexOf");
        Object o = null;
        RPList instance = new RPList();
        int expResult = 0;
        int result = instance.lastIndexOf(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listIterator method, of class RPList.
     */
    @Test
    @Ignore
    public void testListIterator_0args() {
        System.out.println("listIterator");
        RPList instance = new RPList();
        ListIterator expResult = null;
        ListIterator result = instance.listIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listIterator method, of class RPList.
     */
    @Test
    @Ignore
    public void testListIterator_int() {
        System.out.println("listIterator");
        int index = 0;
        RPList instance = new RPList();
        ListIterator expResult = null;
        ListIterator result = instance.listIterator(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subList method, of class RPList.
     */
    @Test
    @Ignore
    public void testSubList() {
        System.out.println("subList");
        int fromIndex = 0;
        int toIndex = 0;
        RPList instance = new RPList();
        List expResult = null;
        List result = instance.subList(fromIndex, toIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
