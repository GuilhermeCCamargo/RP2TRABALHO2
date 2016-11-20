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
import java.util.NoSuchElementException;

/**
 *
 * @author vitor
 * @param <E> variavel generica
 */
public class RPListVitor<E> implements List {

    /**
     * Falta adicionar para ver se a lista está vazia
     */
    private No<E> inicio;
    private int tamanho;

    public RPListVitor() {
        inicio = null;
        tamanho = 0;
    }

    @Override
    public E remove(int index) {
        No aux = this.inicio;
        if (tamanho == 0) {
            throw new UnsupportedOperationException("Lista vazia");
        } else if (tamanho == 1) {
            inicio = null;
            tamanho--;
            return (E) aux.getInfo();
        } else if (index < tamanho && index >= 0) {
            int y = 0;
            for (int x = 0; x < index; x++) {
                aux = aux.getProx();
            }
            No ant = aux.getAnt();
            No prox = aux.getProx();
            ant.setProx(prox);
            prox.setAnt(ant);
            tamanho--;
            return (E) aux.getInfo();

        } else {
            throw new IndexOutOfBoundsException("Indice inválido!");
        }

    }

    @Override
    public void add(int index, Object element) {

        No aux = this.inicio;
        E elemento = (E) element;//Cast 
        if (element == null) {

            throw new NullPointerException("Elemento Nulo!");

        } else if (index == 0 && inicio == null) {

            No first = new No(element);
            inicio = first;
            inicio.setProx(inicio);
            inicio.setAnt(inicio);
            tamanho++;
        } else if (index == tamanho) {
            for (int i = 0; i < index; i++) {
                aux = aux.getProx();
            }
            No add = new No(elemento, inicio, aux);
            aux.setProx(add);
            inicio.setAnt(add);
            tamanho++;
        } else if (index < tamanho || index >= 0) {
            for (int i = 0; i < index; i++) {
                aux = aux.getProx();
            }

            No ant = null;
            ant = aux.getAnt();
            No add = new No(elemento, aux, ant);
            ant.setProx(add);
            aux.setAnt(add);
            tamanho++;

        } else {
            throw new IndexOutOfBoundsException("Indice inválido!");
        }

    }

    @Override
    public E get(int index) {
        No aux = this.inicio;
        if (index <= tamanho || index >= 0) {
            for (int i = 0; i < index; i++) {
                aux = aux.getProx();
            }
            return (E) aux.getInfo();
        } else {
            throw new IndexOutOfBoundsException("Indice inválido!");
        }

    }

    @Override
    public boolean contains(Object o) {
        if (inicio == null || o == null) {
            throw new NullPointerException("Lista ou objeto nulo!");
        }
        No aux = inicio;
        while (aux != inicio) {
            if (aux.getInfo().equals(o)) {
                return true;
            }
            aux = aux.getProx();
        }
        return false;

    }

    public E getFirst() {
        if (inicio == null) {
            throw new NoSuchElementException("Lista vazia");
        }
        return (E) inicio.getInfo();
    }

    public void addFirst(Object o) {
        if (inicio == null) {
            inicio = new No((E) o);
            inicio.setProx(inicio);
            inicio.setAnt(inicio);
        }
        No add = new No(o, inicio, inicio.getAnt());
        inicio.getAnt().setProx(add);
        inicio.setAnt(add);
        inicio = add;
    }

    public E removeFirst() {
        if (inicio == null) {
            throw new NoSuchElementException("Lista vazia!");
        }
        No aux = inicio;
        inicio = inicio.getProx();
        inicio.setAnt(aux.getAnt());
        return (E) aux.getInfo();
    }

    //<editor-fold defaultstate="collapsed" desc="remover Seu">
    @Override
    public boolean remove(Object o) {
        No<E> aux;

        if (o == null) {
            throw new NullPointerException("Objeto nulo");
        }

        if (!isEmpty()) {
            if (this.inicio.getInfo().equals((E) o)) {
                if (!this.inicio.getProx().equals(this.inicio)) {
                    this.inicio.getAnt().setProx(this.inicio.getProx());
                    this.inicio.getProx().setAnt(this.inicio.getAnt());
                    this.inicio = this.inicio.getProx();
                    this.tamanho--;
                    return true;
                } else {
                    this.inicio = null;
                    this.tamanho--;
                    return true;
                }
            }

            aux = this.inicio.getProx();
            while (aux != this.inicio) {
                if (aux.getInfo().equals((E) o)) {
                    aux.getAnt().setProx(aux.getProx());
                    aux.getProx().setAnt(aux.getAnt());
                    this.tamanho--;
                    return true;
                }
                aux = aux.getProx();
            }
        }
        return false;
    }
//</editor-fold>

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
