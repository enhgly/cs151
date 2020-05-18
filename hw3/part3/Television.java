public class Television {
    public void changeChannel(Channel channel) {
        switch (channel) {
        case MTV:
            System.out.println(channel.channelNumber + ": MTV");
            break;
        case DISNEY:
            System.out.println(channel.channelNumber + ": Disney");
            break;
        case PBS:
            System.out.println(channel.channelNumber + ": PBS");
            break;
        case ESPN:
            System.out.println(channel.channelNumber + ": ESPN");
            break;
        case FOX:
            System.out.println(channel.channelNumber + ": FOX");
            break;
        }
    }
}
