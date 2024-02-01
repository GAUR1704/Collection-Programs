package com.prowings.enums;

public enum Size {
	
	SMALL(38),MEDIUM(40), LARGE(42), EXTRALARGE(44);
	
	int size;
	
	Size(int size)
	{
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public double calculatePrize()
	{
		return this.getSize() * 20;
	}

}
