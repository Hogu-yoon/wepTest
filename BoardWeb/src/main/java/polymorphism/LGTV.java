package polymorphism;

public class LGTV implements TV {
	/*
	 * public void turnOn() { }
	 * 
	 * public void turnOff() {
	 * 
	 * }
	 * 
	 * public void soundUP() {
	 * 
	 * }
	 * 
	 * public void soundDOWN() {
	 * 
	 * }
	 */

	@Override
	public void powerOn() {
		System.out.println("lgtv 전원을 켠다");

	}

	@Override
	public void powerOff() {
		System.out.println("lgtv 전원을 끈다");

	}

	@Override
	public void volumeUp() {
		System.out.println("lgtv 볼륨을 올린다");

	}

	@Override
	public void volumeDown() {
		System.out.println("lgtv 볼륨을 내린다");

	}

}
