/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unipampa.lista.classe;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 *
 * @author yuryalencar
 */
public class RPList<E> implements List<E>, Serializable, Iterator{
    
    private No<E> inicio;
    private int tamanho = 0;
    private int indic=0;
    
    @Override
    public boolean isEmpty(){
        return tamanho == 0;
    }
    
    /**
     * Método para remover o ultimo elemento da lista.
     * @return - Retorna o ultimo elemento desta lista.
     */
    public E removeLast() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException("Lista vazia");
        }
        
        No end = inicio.getAnt();
        if(inicio.getAnt().equals(inicio)){
            inicio = null;
            tamanho --;
        } else {
            inicio.setAnt(end.getAnt());
            end.getAnt().setProx(inicio);
            tamanho --;
        }
        
        return (E) end.getInfo();
    }

    @Override
    public int indexOf(Object o) {
        
        if(o == null){
            throw new NullPointerException("Objeto informado é nulo");
        } else if(isEmpty()) {
            throw new NullPointerException("Lista vazia");
        } else {
            int cont = 0;

            if(inicio.getInfo().equals(o)){
                return cont;
            }

            if(!(inicio.getAnt().getInfo().equals(inicio))){
                No aux = inicio.getProx();
                cont++;
                while(!aux.equals(inicio)){
                    if(aux.getInfo().equals(o)){
                        return cont;
                    }
                    aux = aux.getProx();
                    cont++;
                }
            }
        }
        
        return -1;
    }

    @Override
    public int size() {
        return this.tamanho;
    }

    @Override
    public boolean add(Object e) {
        No<E> no;
        if(e == null){
            throw new NullPointerException("Objeto nulo");
        }
        
        if(this.tamanho == 0){
            this.inicio = new No(e);
            inicio.setProx(inicio);
            inicio.setAnt(inicio);
            tamanho ++;
            return true;
        }
        
        no = new No(e);
        this.inicio.getAnt().setProx(no);
        no.setAnt(this.inicio.getAnt());
        no.setProx(this.inicio);
        this.inicio.setAnt(no);
        tamanho ++;
        
        return true;
    }

    @Override
    public boolean remove(Object o) {
        No<E> aux;
        
        if(o == null){
            throw new NullPointerException("Objeto nulo");
        }
        
        if(!isEmpty()){
            if(this.inicio.getInfo().equals((E) o)){
                if(!this.inicio.getProx().equals(this.inicio)){
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
            while(!aux.equals(this.inicio)){
                if(aux.getInfo().equals((E) o)){
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

    public E getLast(){
        if(isEmpty()){
            throw new NoSuchElementException("Lista vazia");
        } else {
            return (E) this.inicio.getAnt().getInfo();
        }
    }
    
    @Override
    public E get(int index) {
        No aux = this.inicio;
        if (index < tamanho && index > -1 && tamanho != 0) {
            for (int i = 0; i < index; i++) {
                aux = aux.getProx();
            }
            return (E) aux.getInfo();
        } else {
            throw new IndexOutOfBoundsException("Indice inválido!");
        }

    }

    @Override
    public Object set(int index, Object element) {
        if(index < 0 || index > size() || tamanho == 0){
            throw new IndexOutOfBoundsException("Index inválido");
        }
        
        if(element == null){
            throw new NullPointerException("Elemento nulo");
        }
        
        E previous;
        No aux = this.inicio;
        
        for (int i = 0; i < index; i++) {
            aux = aux.getProx();
        }
        
        previous = (E) aux.getInfo();
        aux.setInfo((E) element);
        
        return previous;
    }

    @Override
    public E remove(int index) {
        No aux = this.inicio;
        if (tamanho == 0) {
            throw new UnsupportedOperationException("Lista vazia");
        } else if (tamanho == 1 && index == 0) {
            inicio = null;
            tamanho--;
            return (E) aux.getInfo();
        } else if (index < tamanho && index > -1) {
            for (int i = 0; i < index; i++) {
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
    public boolean contains(Object o) {
        if(inicio == null || o == null){
            throw new NullPointerException("Lista ou objeto nulo!");
        }
        
        if(inicio.getInfo().equals((E)o)){
            return true;
        }
        
        No aux = inicio.getProx();
        
        while(!aux.equals(inicio)){
            if(aux.getInfo().equals((E)o)){
                return true;
            }
            
            aux = aux.getProx();
        }
        
        return false;
    }
    
    public E getFirst(){
        if(inicio==null){
            throw new NoSuchElementException("Lista vazia");
        }
        return (E) inicio.getInfo();
    }
    
    public void addFirst(Object o){
        if(inicio==null){
            inicio = new No((E)o);
            inicio.setProx(inicio);
            inicio.setAnt(inicio);
        }
        No add = new No((E)o, inicio, inicio.getAnt());
        inicio.getAnt().setProx(add);
        inicio.setAnt(add);
        inicio = add;
    }
    
    public E removeFirst(){
        if(inicio==null){
            throw new NoSuchElementException("Lista vazia!");
        }
        No aux = inicio;
        inicio = inicio.getProx();
        inicio.setAnt(aux.getAnt());
        return (E)aux.getInfo();
    }
    
    @Override
    public void add(int index, Object element) {

        No aux = this.inicio;
        E elemento = (E) element; 
        if (element == null) {
            
            throw new NullPointerException("Elemento Nulo!");
            
        } else if (index == 0 && tamanho == 0) {

            No first = new No(element);
            inicio=first;
            inicio.setProx(inicio);
            inicio.setAnt(inicio);
            tamanho++;
        } else if (index == tamanho) {
            No add = new No(elemento, inicio, inicio.getAnt());
            inicio.getAnt().setProx(add);
            inicio.setAnt(add);
            tamanho++;
        } else if (index < tamanho || index > -1) {
            for (int i = 0; i < index; i++) {
                aux = aux.getProx();
            }

            No add = new No(elemento, aux, aux.getAnt());
            aux.getAnt().setProx(add);
            aux.setAnt(add);
            tamanho++;
        } else {
            throw new IndexOutOfBoundsException("Indice inválido!");
        }

    }
    
    @Override
    public String toString(){
        return "size: "+this.tamanho;
    }
    
    @Override
    public Iterator iterator() {
        indic = 0;
        return this;
    }

    @Override
    public boolean hasNext() {
        return indic < tamanho;
    }

    @Override
    public E next() {
        E a = get(indic);
        indic++;
        return a;
    }

    //<editor-fold defaultstate="collapsed" desc="Unsupported">
    
    

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray(Object[] a) {
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
    
}
