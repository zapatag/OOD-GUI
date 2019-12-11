package javaapplication1.RMS;

import javaapplication1.wPkg.SelectStuffFrame;

public class Table {
        
	private int tableNum;
	private String tableStatus;

	public Table(int tableNum){
		this.tableNum = tableNum;
		this.tableStatus = "Occupied";
	}

	public int getTableNum() {
		return tableNum;
	}

	public String getTableStatus() {
		return tableStatus;
	}

	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}

	public void setTableStatus(String tableStatus) {
		this.tableStatus = tableStatus;
	}

	public void addTable(Order order){
		order.setTable(this.tableNum);
	}


}
