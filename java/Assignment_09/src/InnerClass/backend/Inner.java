package InnerClass.backend;

import InnerClass.entity.CPU;
import InnerClass.entity.CPU.Processor;
import InnerClass.entity.CPU.Ram;
import InnerClass.entity.Car;
import InnerClass.entity.Car.Engine;

public class Inner {
	
	public void QuestionCPU() {
		CPU cpu=new CPU(10);
		Processor processor=cpu.new Processor(1, 2);
		Ram ram=cpu.new Ram(3, 4);
		System.out.println(processor.getCache());
		System.out.println(ram.getClockSpeed());
	}
	
	public void QuestionCar() {
		Car car = new Car("Mazda", "8WD");
		Engine engine=car.new Engine("Crysler");
		System.out.println(car.getName());
		System.out.println(car.getType());
		System.out.println(engine.getEngineType());
	}
}
