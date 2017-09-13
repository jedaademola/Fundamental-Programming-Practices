package com.fpp.lesson5;

public class Computer {

	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;

	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {

		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}

	@Override
	public int hashCode() {

		int seed = 17;
		int result = 31 * seed + manufacturer.hashCode();
		result = 31 * result + processor.hashCode();
		
		result = 31 * result + ramSize;
		result = 31 * result + diskSize;
		
		long temp = Double.doubleToLongBits(processorSpeed);
		
		result = 31 * result + (int) (temp ^ (temp >>> 32));;
		
		return result;
	}

	@Override
	public boolean equals(Object computer) {
		if (computer == null)
			return false;
		if (!(computer instanceof Computer))
			return false;
		Computer c = (Computer) computer;
		boolean isEqual = this.manufacturer.equals(c.manufacturer) && this.processor.equals(c.processor)
				&& this.ramSize == c.ramSize && this.diskSize == c.diskSize && this.processorSpeed == c.processorSpeed;

		return isEqual;
	}

	@Override
	public String toString() {

		String newline = System.getProperty("line.separator");
		String ret = "Manufacturer: " + manufacturer + newline + "Processor: " + processor + newline + "RamSize: "
				+ ramSize + newline + "DiskSize: " + diskSize + newline + "ProcessorSpeed: " + processorSpeed;
		return ret;

	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getProcessor() {
		return processor;
	}

	public int getRamSize() {
		return ramSize;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	double computePower() {
		return ramSize * processorSpeed;
	}

}
