public class P9_to_P26 {
	public static void main(String[] args) {
		System.out.println("P9");
		RacingCar rccar1 = new RacingCar();
		rccar1.newShow();
		System.out.println("\nP11");
		RacingCar rccar2 = new RacingCar();
		rccar2.setCar(1234, 20.5);
		rccar2.setCourse(5);
		rccar2.show();
		System.out.println("\nP14");
		Car car1 = new RacingCar();
		car1.setCar(1234, 20.5);
		car1.show();
		System.out.println("\nP17");
		Car cars[] = new Car[2];
		cars[0] = new Car();
		cars[0].setCar(1234, 20.5);
		cars[1] = new RacingCar();
		cars[1]. setCar(4567, 30.5);
		for (int i = 0; i < cars.length; i++) {
			cars[i].show();
		}
		System.out.println("\nP24");
		Car car2 = new Car();
		car2.setCar(1234, 20.5);
		System.out.println(car2);
		System.out.println("\nP25");
		Car car3 = new Car();
		Car car4 = new Car();
		Car car5 = car3;
		System.out.println("car3與 car4相同" + car3.equals(car4));
		System.out.println("car3與 car5相同" + car3.equals(car5));
		System.out.println("\nP26");
		Car[] cars1 = new Car[2];
		cars1[0] = new Car();
		cars1[1] = new RacingCar();
		for (int i = 0; i < cars1.length; i++) {
			Class cl = cars1[i].getClass();
			System.out.println("第" + (i + 1) + "個物件的類別是" + cl);
		}
	}
}

class Car {
	protected int num;
	protected double gas;

	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}

	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}

	public void show() {
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}

	public String toString() {
		String str = "車號: " + num + "汽油量: " + gas;
		return str;
	}
}

class RacingCar extends Car {
	private int course;

	public RacingCar() {
		System.out.println("生產了賽車");
		course = 0;
	}

	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車編號設為" + course);
	}

	public void newShow() {
		System.out.println("賽車的車號是" + num);
		System.out.println("汽油量是" + gas);
		System.out.println("賽車編號是" + course);
	}

	public void show() {
		System.out.println("賽車的車號是" + num);
		System.out.println("汽油量是" + gas);
		System.out.println("賽車編號是" + course);
	}
}