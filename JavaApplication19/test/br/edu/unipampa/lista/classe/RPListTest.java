/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unipampa.lista.classe;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yuryalencar
 */
public class RPListTest {
    
    public RPListTest() {
    }


    /**
     * Test of remove method, of class RPList.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove int");
        
        RPList instance = new RPList();
        instance.add("Teste");
        instance.add("Teste1");
        instance.add("Teste2");
        instance.add("Teste3");
        
        Object expResult = "Teste2";
        Object result = instance.remove(2);
        assertEquals(expResult, result);
    
        expResult = 3;
        result = instance.size();
        assertEquals(expResult, result);
        
        expResult = "Teste3";
        result = instance.remove(2);
        assertEquals(expResult, result);
    
        expResult = 2;
        result = instance.size();
        assertEquals(expResult, result);
        
        expResult = "Teste1";
        result = instance.remove(1);
        assertEquals(expResult, result);
    
        expResult = 1;
        result = instance.size();
        assertEquals(expResult, result);
        
        expResult = "Teste";
        result = instance.remove(0);
        assertEquals(expResult, result);
    
        expResult = 0;
        result = instance.size();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of set method, of class RPList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        RPList instance = new RPList();
        instance.add("Teste");
        instance.add("Teste1");
        instance.add("Teste2");
        instance.add("Teste3");
        
        Object expResult = "Teste2";
        Object result = instance.set(2, "Yury");
        assertEquals(expResult, result);
        
        expResult = "Teste";
        result = instance.set(0, "Yury2");
        assertEquals(expResult, result);
        
        expResult = "Teste3";
        result = instance.set(3, "Yury5");
        assertEquals(expResult, result);
        
        expResult = "Teste1";
        result = instance.set(1, "Yury25");
        assertEquals(expResult, result);
        
        expResult = "Yury";
        result = instance.get(2);
        assertEquals(expResult, result);
        
        expResult = "Yury2";
        result = instance.get(0);
        assertEquals(expResult, result);
        
        expResult = "Yury5";
        result = instance.get(3);
        assertEquals(expResult, result);
        
        expResult = "Yury25";
        result = instance.get(1);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of get method, of class RPList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        RPList<String> instance = new RPList();
        instance.add("Teste");
        instance.add("Teste1");
        instance.add("Teste2");
        instance.add("Teste3");
        String expResult = "Teste";
        String result = instance.get(0);
        assertEquals(expResult, result);

        expResult = "Teste1";
        result = instance.get(1);
        assertEquals(expResult, result);

        expResult = "Teste3";
        result = instance.get(3);
        assertEquals(expResult, result);

        expResult = "Teste2";
        result = instance.get(2);
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class RPList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        RPList<String> instance = new RPList();
        instance.add("Teste");
        instance.add("Teste1");
        instance.add("Teste2");
        instance.add("Teste3");
        
        String expResult = "Teste";
        String result = instance.getFirst();
        assertEquals(expResult, result);

        instance.remove("Teste");
        
        expResult = "Teste1";
        result = instance.getFirst();
        assertEquals(expResult, result);
        
        instance.remove("Teste1");
        
        expResult = "Teste2";
        result = instance.getFirst();
        assertEquals(expResult, result);
        
        instance.remove("Teste2");
        
        expResult = "Teste3";
        result = instance.getFirst();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class RPList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        RPList<String> instance = new RPList();
        instance.add("Teste");
        instance.add("Teste1");
        instance.add("Teste2");
        instance.add("Teste3");
        
        String expResult = "Teste";
        String result = instance.removeFirst();
        assertEquals(expResult, result);

        expResult = "Teste1";
        result = instance.removeFirst();
        assertEquals(expResult, result);
        
        expResult = "Teste2";
        result = instance.removeFirst();
        assertEquals(expResult, result);
        
        expResult = "Teste3";
        result = instance.removeFirst();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class RPList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        RPList<String> instance = new RPList();
        instance.addFirst("Teste");
        
        String expResult = "Teste";
        String result = instance.removeFirst();
        assertEquals(expResult, result);

        instance.addFirst("Teste1");
        instance.addFirst("Teste2");
        
        expResult = "Teste2";
        result = instance.removeFirst();
        assertEquals(expResult, result);
        
        instance.addFirst("Teste3");
        
        expResult = "Teste3";
        result = instance.removeFirst();
        assertEquals(expResult, result);
        
        expResult = "Teste1";
        result = instance.removeFirst();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class RPList.
     */
    @Test
    public void testAddInt() {
        System.out.println("add_int");
        RPList<String> instance = new RPList();
        instance.add(0, "Teste"); 
        instance.add(1,"Teste1");
        instance.add(1,"Teste2");
        instance.add(2,"Teste3");
        
        String expResult = "Teste";
        String result = instance.get(0);
        assertEquals(expResult, result);
    
        expResult = "Teste2";
        result = instance.get(1);
        assertEquals(expResult, result);
        
        expResult = "Teste3";
        result = instance.get(2);
        assertEquals(expResult, result);
        
        expResult = "Teste1";
        result = instance.get(3);
        assertEquals(expResult, result);
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
    public void testContains() {
        System.out.println("contains");
        RPList instance = new RPList();
        instance.add("Teste");
        instance.add("Teste1");
        instance.add("Teste2");
        instance.add("Teste3");
    
        boolean expResult = false;
        boolean result = instance.contains("Yury");
        assertEquals(expResult, result);
        
        expResult = true;
        result = instance.contains("Teste");
        assertEquals(expResult, result);
    
        expResult = true;
        result = instance.contains("Teste1");
        assertEquals(expResult, result);
        
        expResult = true;
        result = instance.contains("Teste2");
        assertEquals(expResult, result);
       
        expResult = true;
        result = instance.contains("Teste3");
        assertEquals(expResult, result);
    
        expResult = false;
        result = instance.contains("Teste4");
        assertEquals(expResult, result);
    
        expResult = false;
        result = instance.contains("Inexistente");
        assertEquals(expResult, result);
    }
}
