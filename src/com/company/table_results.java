package com.company;

import javax.swing.table.AbstractTableModel;

public class table_results extends AbstractTableModel {

    private double from, to, step;
    public table_results(double from ,double to, double step){
        this.from = from;
        this.to = to;
        this.step = step;
    }

    public int getColumnCount() {
        return 3;
    }

    public int getRowCount() {
        return (int)((to - from)/step)+1;
    }

    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "Значение Х";
            case 1:
                return "Значение Y";
            case 2:
                return "Значение больше нуля ?";
        }
        return "";
    }

    public Object getValueAt(int row, int col) {
        double x = from + row * step;
        if(col == 0)
            return x;
        double y =  x + x;
        if(col == 1)
            return y;
        else if(col==2)
            return y >= 0.0;
        return null;
    }
    public Class<?> getColumnClass(int col){
        return (col == 2 ? Boolean.class : Double.class);
    }
}