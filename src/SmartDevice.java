public class SmartDevice {
    private double sizeScreen;
    private String software;
    private String mark;

    public SmartDevice(){

    }

    public  SmartDevice(double sizeScreen, String software, String mark){
        this.mark = mark;
        this.sizeScreen = sizeScreen;
        this.software = software;
    }


    public double getSizeScreen() {
        return sizeScreen;
    }

    public void setSizeScreen(double sizeScreen) {
        this.sizeScreen = sizeScreen;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
