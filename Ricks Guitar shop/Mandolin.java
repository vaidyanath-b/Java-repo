public class Mandolin extends Instrument {

    MandolinSpec spec;

    Mandolin(String serialNumber, double price, MandolinSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public MandolinSpec getSpec() {
        return spec;
    }
}
