public class SmartWatch extends SmartDevice {
    private boolean itIsHand;
    private int holes;

    public SmartWatch(){

    }

    public SmartWatch(double sizeScreen, String software, String mark, boolean itIsHand, int holes){
        super(sizeScreen, software, mark);
        this.itIsHand = itIsHand;
        this.holes = holes;
    }

    public boolean isItIsHand() {
        return itIsHand;
    }

    public void setItIsHand(boolean itIsHand) {
        this.itIsHand = itIsHand;
    }

    public int getHoles() {
        return holes;
    }

    public void setHoles(int holes) {
        this.holes = holes;
    }
}
