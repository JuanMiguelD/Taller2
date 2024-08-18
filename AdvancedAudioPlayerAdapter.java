public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    private AdvancedAudioPlayer advancedAudioPlayer;
 
    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer var1) {
       this.advancedAudioPlayer = var1;
    }
 
    public void play(String var1, String var2) {
       switch (var1) {
          case "mp4":
             this.advancedAudioPlayer.playMp4(var2);
             break;
          case "vlc":
             this.advancedAudioPlayer.playVlc(var2);
       }
 
    }
 
    public void stop() {
       this.advancedAudioPlayer.stop();
    }
 }
