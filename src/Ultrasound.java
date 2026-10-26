public class Ultrasound extends MedicalService {

    private double additionalFee;

    public Ultrasound(String serviceId, double baseCost,
                      double additionalFee) {
        super(serviceId, "Ultrasound", baseCost);
        this.additionalFee = additionalFee;
    }

    @Override
    public double calculateTotalCost() {
        return baseCost + additionalFee;
    }
}