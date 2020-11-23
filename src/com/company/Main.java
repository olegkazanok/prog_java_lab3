package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Таблица");
        frame.setSize(700, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menu = new JMenuBar();
        JMenu reference = new JMenu("справка");
        menu.add(reference);
        JMenuItem info = new JMenuItem("о программе");
        reference.add(info);
        frame.getContentPane().add(BorderLayout.NORTH, menu);
        frame.setVisible(true);
        info.addActionListener(e -> JOptionPane.showMessageDialog
                (null, "Выполнил Казанок Олег. Студент 9 группы"));

        double from = -2.0, to = 1.0, step = 0.1;
        JTable tabl = new JTable(new table_results(from,to,step));
        JScrollPane scrollPane = new JScrollPane(tabl);
        frame.add(scrollPane);
    }
}
