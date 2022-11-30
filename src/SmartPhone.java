public class SmartPhone extends  SmartDevice {
    private int buttons;
    private int cantCams;

    public SmartPhone(){

    }

    public SmartPhone(double sizeScreen, String software, String mark, int buttons, int cantCams){
        super(sizeScreen, software, mark);
        this.buttons = buttons;
        this.cantCams = cantCams;
    }

    public int getButtons() {
        return buttons;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }

    public int getCantCams() {
        return cantCams;
    }

    public void setCantCams(int cantCams) {
        this.cantCams = cantCams;
    }
}
