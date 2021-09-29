package polymorphism;

import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("삼성tv 객체 생성");
	}

//	public SamsungTV(Speaker speaker) {
//		super();
//		System.out.println("===>SamsungTV(2) 객체 생성");
//		this.speaker = speaker;
//	}
//		
//
//	public SamsungTV(Speaker speaker, int price) {
//		super();
//		System.out.println("===>SamsungTV(3) 객체 생성");
//		this.speaker = speaker;
//		this.price = price;
//	}
	

	public void initMethod() {
		System.out.println("객체 켜면 생성자다음에 초기화하기 위해 부르는 함수 initMethod");
	}

	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

	public void destroyMethod() {
		System.out.println("객체를 닫기전에 부르는 destroyMethod함수");
	}

	public void powerOn() {
		// 전원을 킨다
		System.out.println("samsungTv 전원을 켭니다.(가격 : "+price+")");
	}

	public void powerOff() {
		// 전원을 끈다
		System.out.println("samsungTv 전원을 끕니다.");
	}

	public void volumeUp() {
		// 볼륨업
//		speaker = new SonySpeaker();
		speaker.volumUp();
//		System.out.println("samsungTv 볼륨을 올립니다.");
	}

	public void volumeDown() {
		// 볼륨 다운
//		speaker = new SonySpeaker();
		speaker.volumDown();
//		System.out.println("samsungTv 볼륨을 내립니다..");
	}

}
