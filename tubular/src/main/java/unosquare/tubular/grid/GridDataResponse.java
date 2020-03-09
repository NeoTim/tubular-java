package unosquare.tubular.grid;

import java.util.HashMap;
import java.util.List;

public class GridDataResponse {
	
	public int counter;
	public List<List<Object>> payload;
	public int totalRecordCount;
	public int filteredRecordCount;
	public int totalPages;
	public int currentPage;
	public HashMap<String, Object> aggregationPayload;
	
	public int getCounter() {
		return counter;
	}
	
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public List<List<Object>> getPayload() {
		return payload;
	}
	
	public void setPayload(List<List<Object>> payload) {
		this.payload = payload;
	}
	
	public int getTotalRecordCount() {
		return totalRecordCount;
	}
	
	public void setTotalRecordCount(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}
	
	public int getFilteredRecordCount() {
		return filteredRecordCount;
	}
	
	public void setFilteredRecordCount(int filteredRecordCount) {
		this.filteredRecordCount = filteredRecordCount;
	}
	
	public int getTotalPages() {
		return totalPages;
	}
	
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public HashMap<String, Object> getAggregationPayload() {
		return aggregationPayload;
	}
	
	public void setAggregationPayload(HashMap<String, Object> aggregationPayload) {
		this.aggregationPayload = aggregationPayload;
	}
}
