package ca.programDemo.model;

public class DepthOfFieldCalc {
    private Lens lens;
    private double distanceOfObjInMM;
    private double aperture;
    private static final double CIRCLE_OF_CONFUSION_IN_MM = 0.029;
    private double hyperFocalDistInMM;

    public DepthOfFieldCalc(Lens lens, double distanceOfObjInMM, double aperture) {
        this.lens = lens;
        this.distanceOfObjInMM = distanceOfObjInMM;
        this.aperture = aperture;
        this.hyperFocalDistInMM = Math.pow(this.lens.getFocalLengthInMM(), 2) /
                (this.aperture*this.CIRCLE_OF_CONFUSION_IN_MM);
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
        this.hyperFocalDistInMM = Math.pow(this.lens.getFocalLengthInMM(), 2) /
                (this.aperture*this.CIRCLE_OF_CONFUSION_IN_MM);
    }

    public double getDistanceOfObjInMM() {
        return distanceOfObjInMM;
    }

    public void setDistanceOfObjInMM(double distanceOfObjInMM) {
        this.distanceOfObjInMM = distanceOfObjInMM;
        this.hyperFocalDistInMM = Math.pow(this.lens.getFocalLengthInMM(), 2) /
                (this.aperture*this.CIRCLE_OF_CONFUSION_IN_MM);
    }

    public double getAperture() {
        return aperture;
    }

    public void setAperture(double aperture) {
        this.aperture = aperture;
        this.hyperFocalDistInMM = Math.pow(this.lens.getFocalLengthInMM(), 2) /
                (this.aperture*this.CIRCLE_OF_CONFUSION_IN_MM);
    }

    public static double getCircleOfConfusionInMM() {
        return CIRCLE_OF_CONFUSION_IN_MM;
    }

    public double getHyperFocalDistInMM(){
        return hyperFocalDistInMM;
    }

    public double getNearFocalPoint() {
        double nearFP = (hyperFocalDistInMM * distanceOfObjInMM) /
                (hyperFocalDistInMM + (distanceOfObjInMM - lens.getFocalLengthInMM()));
        return nearFP;
    }

    public double getFarFocalPoint() {
        double farFP = (hyperFocalDistInMM * distanceOfObjInMM) /
                (hyperFocalDistInMM - (distanceOfObjInMM - lens.getFocalLengthInMM()));
        if(distanceOfObjInMM > hyperFocalDistInMM)
            farFP = Double.POSITIVE_INFINITY;
        return farFP;
    }

    public double getDepthOfFieldInMM() {
        return getFarFocalPoint() - getNearFocalPoint();
    }


}
