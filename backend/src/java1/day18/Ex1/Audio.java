package java1.day18.Ex1;

public class Audio implements RemoteControl{
	
	// 필드
	private int volume; // 인스턴스 필드
	
	@Override
	public void turnOn() {System.out.println("TV를 켭니다.");}	
	@Override
	public void turnOff() {System.out.println("TV를 끕니다.");}
	
	@Override
	public void setVolume(int volume) {
		if(volume> RemoteControl.MAX_VOLUME) {
			// 만약에 볼륨이 최대볼륨보다 크면
			this.volume = RemoteControl.MAX_VOLUME;
			// 해당 댇체는 최대볼륨으로 대입
		}else if(volume<RemoteControl.MIN_VOLUME) {
			// 만약에 볼륨이 최소볼륨보다 작으면 해당 객체의 소음을 최소볼륨으로 대입/설정
			this.volume = RemoteControl.MIN_VOLUME;
		}else {this.volume = volume;}
		System.out.println("현재 텔레비전 소음 : "+this.volume);
	}
}

