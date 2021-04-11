package InnerClass.entity;

public class Car {

	private String name;
	private String type;
	public Car(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public class Engine{
		private String engineType;

		public Engine(String engineType) {
			super();
			this.engineType = engineType;
		}

		public String getEngineType() {
			return engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}
		
	}
	

}
