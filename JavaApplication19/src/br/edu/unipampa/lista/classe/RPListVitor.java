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

/**
 *
 * @author vitor
 */
public class RPListVitor<G extends Object> implements List {

    /**
     * Falta adicionar para ver se a lista está vazia
     */
    private No<G> inicio;
    private int size;

    public RPListVitor() {
        inicio = new No(null, null, null);
        size = 0;
    }

    @Override
    public G remove(int index) {
        No aux = this.inicio;
        int cont = 0;
        if (size == 0) {
            throw new UnsupportedOperationException("Lista vazia");
        } else if (size == 1) {
            inicio = null;
            size--;
            return (G) aux.getInfo();
        } else if (index < size && index >= 0) {
            int y = 0;
            for (int x = 0; x < index; x++) {
                aux = aux.getProx();
            }
            No ant = aux.getAnt();
            No prox = aux.getProx();
            ant.setProx(prox);
            prox.setAnt(ant);
            size--;
            return (G) aux.getInfo();

        } else {
            throw new IndexOutOfBoundsException("Indice inválido!");
        }

    }

    @Override
    public void add(int index, Object element) {

        No aux = this.inicio;
        int cont = 0;
        try {
            G info = (G) aux.getInfo();
        } catch (Exception e) {
            throw new ClassCastException("Dado inválido!");
        }
        G elemento = (G) element;
        if (element == null) {
            throw new NullPointerException("Elemento Nulo!");
        } else if (index == 0 && inicio.getInfo() == null) {

            inicio.setInfo(elemento);
            inicio.setAnt(inicio);
            inicio.setProx(inicio);
            size++;
        } else if (index == size) {
            for (int i = 0; i < index; i++) {
                aux = aux.getProx();
            }
            No add = new No(elemento, inicio, aux);
            aux.setProx(add);
            inicio.setAnt(add);
            size++;
        } else if (index < size || index >= 0) {
            for (int i = 0; i < index; i++) {
                aux = aux.getProx();
            }

            No ant = null;
            ant = aux.getAnt();
            No add = new No(elemento, aux, ant);
            ant.setProx(add);
            aux.setAnt(add);
            size++;

        } else {
            throw new IndexOutOfBoundsException("Indice inválido!");
        }

    }

    @Override
    public G get(int index) {
        No aux = this.inicio;
        int cont = 0;
        if (index <= size || index >= 0) {
            for (int i = 0; i < index; i++) {
                aux = aux.getProx();
            }
            return (G) aux.getInfo();
        } else {
            throw new IndexOutOfBoundsException("Indice inválido!");
        }

    }

    //<editor-fold defaultstate="collapsed" desc="Não Implementados">
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray(Object[] arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="get e set">
    /**
     * @return the inicio
     */
    public No getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

//</editor-fold>
}
