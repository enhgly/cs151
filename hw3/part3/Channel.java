enum Channel {
    MTV(36), DISNEY(48), PBS(5), ESPN(24), FOX(52);
    final int channelNumber;

    private Channel(int channelNumber) {
        this.channelNumber = channelNumber;
    }
}
