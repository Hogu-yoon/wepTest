package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("LG")
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
@Autowired
	private Speaker speaker;
	
	public LGTV(){
		System.out.println("lgtv 객체 생성");
	}

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
		speaker.volumUp();

	}

	@Override
	public void volumeDown() {
		speaker.volumDown();

	}

}
