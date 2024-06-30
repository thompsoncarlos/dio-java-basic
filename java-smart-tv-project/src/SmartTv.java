public class SmartTv {
  boolean turnOn = false;
  int channel = 1;
  int volume = 25;

  public void changeChannel(int newChannel){
    channel = newChannel;
  }

  public void increaseChannel() {
    channel++;
  }

  public void decreaseChannel() {
    channel--;
  }

  public void increaseVolume() {
    volume++;
  }

  public void decreaseVolume(){
    volume--;
  }

  public void turnOn() {
    turnOn = true;
  }

  public void turnOff() {
    turnOn = false;
  }
}
