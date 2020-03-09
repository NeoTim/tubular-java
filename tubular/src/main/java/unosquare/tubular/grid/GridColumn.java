package unosquare.tubular.grid;

import unosquare.tubular.common.*;

public class GridColumn {
	
	public String name;
	public String label;
	public boolean sortable;
	public int sortOrder;
	public SortDirection sortDirection;
	public Filter filter;
	public boolean Searchable;
	public DataType dataType;
	public AggregationFunction aggregate;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public boolean isSortable() {
		return sortable;
	}
	
	public void setSortable(boolean sortable) {
		this.sortable = sortable;
	}
	
	public int getSortOrder() {
		return sortOrder;
	}
	
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	
	public SortDirection getSortDirection() {
		return sortDirection;
	}
	
	public void setSortDirection(SortDirection sortDirection) {
		this.sortDirection = sortDirection;
	}
	
	public Filter getFilter() {
		return filter;
	}
	
	public void setFilter(Filter filter) {
		this.filter = filter;
	}
	
	public boolean isSearchable() {
		return Searchable;
	}
	
	public void setSearchable(boolean searchable) {
		Searchable = searchable;
	}
	
	public DataType getDataType() {
		return dataType;
	}
	
	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}
	
	public AggregationFunction getAggregate() {
		return aggregate;
	}
	
	public void setAggregate(AggregationFunction aggregate) {
		this.aggregate = aggregate;
	}
}
