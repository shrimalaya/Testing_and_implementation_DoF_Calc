package ca.programDemo.model;

public class Lens {
    private String make; //Make of camera. eg: Canon, Nikon, etc
    private double maxAperture; //F-number for lens
    private double focalLengthInMM;

    public Lens(String make, double maxAperture, double focalLengthInMM) {
        this.make = make;
        this.maxAperture = maxAperture;
        this.focalLengthInMM = focalLengthInMM;
    }

    public String getMake() {
        return make;
    }

    public double getMaxAperture() {
        return maxAperture;
    }

    public double getFocalLengthInMM() {
        return focalLengthInMM;
    }

    @Override
    public String toString() {
        return make + "  " + focalLengthInMM +
                "mm  F" + maxAperture ;
    }
}
