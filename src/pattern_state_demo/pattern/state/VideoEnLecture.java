package pattern_state_demo.pattern.state;

class VideoEnLecture implements EtatVideo {

	@Override
	public void action(Video context) {
		
		System.out.println("La vid�o est en lecture");
		
	}

}
