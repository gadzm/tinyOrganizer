package com.gadzm.TinyOrganizer.calendar;

import javax.swing.table.AbstractTableModel;

class CalendarTableModel extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
    String[] days = {"Pn", "Wt", "Śr", "Czw", "Pt", "So", "Nd"};
    private final MonthToDisplay month;

    public CalendarTableModel(MonthToDisplay month) {
        this.month = month;
    }

    public int getColumnCount() {
        return 7;
    }

    public int getRowCount() {
        return 6;
    }

    public Object getValueAt(int row, int column) {
        return month.getDay(row, column);
    }

    @Override
    public String getColumnName(int column) {
        return days[column];
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public Class getColumnClass(int column) {
        return getValueAt(1, column).getClass();
    }
}
