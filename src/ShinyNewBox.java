
enum Cable {
    TYPE_C
}

enum Device {
    SUMSONG_S21, IPHONE_10
}
public class ShinyNewBox {
    private Cable cable = Cable.TYPE_C;
    private Device device = Device.SUMSONG_S21;
    private Charger charger = new AUCharger();

    public Cable getCable() {
        return cable;
    }

    public void setCable(Cable cable) {
        this.cable = cable;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }

    @Override
    public String toString() {
        return "ShinyNewBox{" +
                "cable=" + cable +
                ", device=" + device +
                ", charger=" + charger +
                '}';
    }
}
