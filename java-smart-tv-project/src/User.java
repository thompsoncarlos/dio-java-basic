public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.increaseVolume();
        
        System.out.println("Current Channel: " + smartTv.channel);
        smartTv.changeChannel(13);
        System.out.println("Current Volume: " + smartTv.volume);

        System.out.println();
        System.out.println("TV is On? " + smartTv.turnOn);
        System.out.println("Current Channel: " + smartTv.channel);
        System.out.println("Current Volume: " + smartTv.volume);
        
        smartTv.turnOn();
        System.out.println("New status: TV is On? " + smartTv.turnOn);

    }
}
