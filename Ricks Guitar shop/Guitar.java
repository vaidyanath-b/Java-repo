public class Guitar extends Instrument {

    GuitarSpec spec;

    Guitar(String serialNumber, double price, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }
    
    public GuitarSpec getSpec() {
        return spec;
    }

}
