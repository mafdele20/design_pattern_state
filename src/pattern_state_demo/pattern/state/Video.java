package pattern_state_demo.pattern.state;

public class Video {
	private EtatVideo etatVideo;
	
	  public void setState(EtatVideo newEtat) {
	        this.etatVideo = newEtat;
	    }

	    public void action() {
	    	etatVideo.action(this);
	    }
	  

}
