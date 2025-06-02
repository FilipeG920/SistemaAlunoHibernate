/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemahibernate;


import  javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Filipe
 */
public class AlunoTableModel extends AbstractTableModel {
    private List<Aluno> alunos;
    private String[] colunas;
    
    public AlunoTableModel(List<Aluno> alunos) {
        this.alunos = (alunos != null) ? alunos : new ArrayList<>();
        this.colunas = new String[]{"Matrícula", "Nome", "Idade", 
            "Data de Nascimento", "Telefone", "CPF"};
    }

    @Override
    public int getRowCount() {
        return alunos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;        
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Aluno aluno = alunos.get(rowIndex);
        
        return switch (columnIndex) {
            case 0 -> aluno.getMat();
            case 1 -> aluno.getNome();
            case 2 -> aluno.getIdade();
            case 3 -> aluno.getDataNascimento();
            case 4 -> aluno.getTelefone();
            case 5 -> aluno.getCPF();
            default -> null;
        };   
    }
    
    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
        // Notifica a JTable que uma nova linha foi inserida na última posição
        fireTableRowsInserted(this.alunos.size() - 1, this.alunos.size() - 1);
    }
    
    public void removeAluno(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < this.alunos.size()) {
            this.alunos.remove(rowIndex);
            // Notifica a JTable que uma linha foi removida
            fireTableRowsDeleted(rowIndex, rowIndex);
        }
    }
    
    public Aluno getAlunoAt(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < this.alunos.size()) {
            return this.alunos.get(rowIndex);
        }
        return null;
    }
}
