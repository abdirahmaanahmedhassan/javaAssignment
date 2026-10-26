public class Consultation extends MedicalService {

    private double doctorFee;

    public Consultation(String serviceId, double baseCost,
                        double doctorFee) {
        super(serviceId, "Consultation", baseCost);
        this.doctorFee = doctorFee;
    }

    @Override
    public double calculateTotalCost() {
        return baseCost + doctorFee;
    }
}
