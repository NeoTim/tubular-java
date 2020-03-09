package unosquare.tubular.grid;

import unosquare.tubular.common.*;

public class GridDataRequest {
	
	public int counter;
	public Filter search;
	public int skip;
	public int take;
	public GridColumn[] columns;
	public int timezoneOffset;
	
	public int getCounter() {
		return counter;
	}
	
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public Filter getSearch() {
		return search;
	}
	
	public void setSearch(Filter search) {
		this.search = search;
	}
	
	public int getSkip() {
		return skip;
	}
	
	public void setSkip(int skip) {
		this.skip = skip;
	}
	
	public int getTake() {
		return take;
	}
	
	public void setTake(int take) {
		this.take = take;
	}
	
	public GridColumn[] getColumns() {
		return columns;
	}
	
	public void setColumns(GridColumn[] columns) {
		this.columns = columns;
	}
	
	public int getTimezoneOffset() {
		return timezoneOffset;
	}
	
	public void setTimezoneOffset(int timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}
}
