public class TestTelevision {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.changeChannel(Channel.MTV);
        tv.changeChannel(Channel.DISNEY);
        tv.changeChannel(Channel.PBS);
        tv.changeChannel(Channel.ESPN);
        tv.changeChannel(Channel.FOX);
    }
}
