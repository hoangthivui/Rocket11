package InnerClass.entity;

public class CPU {

	private int price;

	public CPU(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	public class Processor{
		private int coreAmount;
		private int menufacturer;
		
		public Processor(int coreAmount, int menufacturer) {
			super();
			this.coreAmount = coreAmount;
			this.menufacturer = menufacturer;
		}
		public float getCache() {
			return (float) 4.3;
		}
		public int getCoreAmount() {
			return coreAmount;
		}
		public int getMenufacturer() {
			return menufacturer;
		}
	}
	public class Ram{
		private int memory;
		private int menufacturer;
		
		public Ram(int memory, int menufacturer) {
			super();
			this.memory = memory;
			this.menufacturer = menufacturer;
		}
		public int getMemory() {
			return memory;
		}
		public int getMenufacturer() {
			return menufacturer;
		}
		public float getClockSpeed() {
			return (float) 5.5;
		}
		
		
		
	}

}
