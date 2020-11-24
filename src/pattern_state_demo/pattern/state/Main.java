package pattern_state_demo.pattern.state;

public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        video.setState(new VideoEnLecture()); 
        video.action();
        video.setState(new VideoEnPause());
        video.action();
     
        
    }
}