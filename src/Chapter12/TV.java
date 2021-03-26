package Chapter12;

public class TV {
	private boolean power;
	private int channel;
	
	public void power() {
		power = !power;
	}
	
	public void channelupo() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}
