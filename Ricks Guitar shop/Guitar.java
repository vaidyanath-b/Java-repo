public class Guitar {
    
    String serialNumber;
    double price;
    GuitarSpec spec;

    Guitar(String serialNumber, double price , GuitarSpec spec)
    {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public double getPrice() {
        return price;
    }
    public GuitarSpec getSpec() {
        return spec;
    }

}
