/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.view.tablemodel;

import br.edu.ifpr.model.Person;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import org.w3c.dom.views.AbstractView;

/**
 *
 * @author rafae
 */
public class PersonTableModel extends AbstractTableModel {

    private List<Person> data = new LinkedList<>();

    private String[] columns = {"Nome", "CPF"};

    public PersonTableModel() {

    }

    public Person get(int row) {
        return data.get(row);
    }

    public void add(Person p) {
        this.data.add(p);
        this.fireTableDataChanged();
    }

    public void remove(int row) {
        this.data.remove(row);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int row, int column) {
        Person person = data.get(row);

        switch (column) {
            case 0:
                return person.getName();
            case 1:
                return person.getCpf();
            default:
                return null;
        }
    }

}
