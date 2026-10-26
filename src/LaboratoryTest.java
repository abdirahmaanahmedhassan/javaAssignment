public class LaboratoryTest extends MedicalService {

    private double testCharge;

    public LaboratoryTest(String serviceId, double baseCost,
                          double testCharge) {
        super(serviceId, "Laboratory Test", baseCost);
        this.testCharge = testCharge;
    }

    @Override
    public double calculateTotalCost() {
        return baseCost + testCharge;
    }
}