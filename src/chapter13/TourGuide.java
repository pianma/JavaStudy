package chapter13;

public class TourGuide {
	//������ ���� ����
	private Providable tour;
	
	public TourGuide(String location) {
		if(location.equals("korean")) {
			tour = new KoreaTour();
		} else if(location.equals("japan")) {
			tour = new JapanTour();
			
		}
	}
	
	public void doLeisureSports() {
		tour.leisureSports();
	}
	
	public void doSightseeing() {
		tour.sightseeing();
	}
	
	public void eatFood() {
		tour.food();
	}
}
