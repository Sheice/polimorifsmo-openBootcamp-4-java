public class Main {
    public static void main(String[] args) {

        SmartDevice smartPhone = new SmartPhone(123, "app sotre", "Samsung", 23, 3);
        SmartDevice smartWatch = new SmartWatch(1, "zeterium", "apple", true, 10);

        System.out.println("smarthPhone: " + smartPhone.getMark() + " " + smartPhone.getSizeScreen() + " "
        + smartPhone.getSoftware() + " " + ((SmartPhone) smartPhone).getButtons() + " " + ((SmartPhone) smartPhone).getCantCams() );

        System.out.println("smarthWatch: " + smartWatch.getMark() + " " + smartWatch.getSizeScreen() + " "
        + smartWatch.getSoftware() + " " + ((SmartWatch) smartWatch).isItIsHand() + " " + ((SmartWatch) smartWatch).getHoles() );

    }
}