package unosquare.tubular;

import unosquare.tubular.common.*;

public class Filter {
	
	public String name;
	public String text;
	public CompareOperators operator;
	public String[] argument;
	public boolean HasFilter;

	public Filter() {
		operator = CompareOperators.NONE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public CompareOperators getOperator() {
		return operator;
	}

	public void setOperator(CompareOperators operator) {
		this.operator = operator;
	}

	public String[] getArgument() {
		return argument;
	}

	public void setArgument(String[] argument) {
		this.argument = argument;
	}

	public boolean isHasFilter() {
		return HasFilter;
	}

	public void setHasFilter(boolean hasFilter) {
		HasFilter = hasFilter;
	}
}
