/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package com.mycompany.sistemahibernate;

import java.beans.*;
import java.io.Serializable;
import java.time.*;

/**
 *
 * @author Filipe
 */
public class Aluno implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    private int matrícula;
    private int idade;
    private int telefone;
    private String nome;
    private String sobrenome;
    private String CPF;
    private LocalDate dataNascimento;

    
    public Aluno() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
    public void setMat(int valor) {
    	this.matrícula = valor;
    }
    public void setIdade(int valor) {
    	this.idade = valor;
    }
    public void setTele(int valor) {
        this.telefone = valor;
    }
    public void setNome(String valor) {
    	this.nome = valor;
    }
    public void setSobreNome(String valor) {
    	this.sobrenome = valor;
    }
    public void setCpf(String valor) {
        this.CPF = valor;
    }
    public void setNasc(LocalDate valor) {
    	this.dataNascimento = valor;
    }
    
    public int getMat() {
    	return this.matrícula;
    }

    public int getIdade() {
    	return this.idade;
    }

    public int getTelefone() {
    	return this.telefone;
    }

    public String getNome() {
    	return this.nome;
    }
    
    public String getSobrenome() {
    	return this.sobrenome;
    }

    public String getCPF() {
    	return this.CPF;
    }

    public LocalDate getDataNascimento() {
    	return this.dataNascimento;
    }

}
