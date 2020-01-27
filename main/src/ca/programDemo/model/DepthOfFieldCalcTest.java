package ca.programDemo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepthOfFieldCalcTest {

    //public static final double COC = 0.029;

    @Test
    void getHyperFocalDistInMM() {
        Lens lens= new Lens("Canon", 1.8, 50);

        //Case 1:
        double distOfObj = 1100, fVal = 1.8;
        DepthOfFieldCalc dof1 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        double expected = 47890.0/1000;
        assertEquals(expected, dof1.getHyperFocalDistInMM()/1000, 0.005);

        //Case 2:
        distOfObj = 1000;
        fVal = 8;
        DepthOfFieldCalc dof2 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        expected = 10780.0/1000;
        assertEquals(expected, dof2.getHyperFocalDistInMM()/1000, 0.005);

        //Case 3:
        distOfObj = 15000;
        fVal = 11;
        DepthOfFieldCalc dof3 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        expected = 7840.0/1000;
        assertEquals(expected, dof3.getHyperFocalDistInMM()/1000, 0.005);
    }

    @Test
    void getNearFocalPoint() {
        Lens lens= new Lens("Canon", 1.8, 50);

        //Case 1:
        double distOfObj = 1100, fVal = 1.8;
        DepthOfFieldCalc dof1 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        double expected = 1.08;
        assertEquals(expected, dof1.getNearFocalPoint()/1000, 0.005);

        //Case 2:
        distOfObj = 1000;
        fVal = 8;
        DepthOfFieldCalc dof2 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        expected = 0.92;
        assertEquals(expected, dof2.getNearFocalPoint()/1000, 0.005);

        //Case 3:
        distOfObj = 15000;
        fVal = 11;
        DepthOfFieldCalc dof3 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        expected = 5.16;
        assertEquals(expected, dof3.getNearFocalPoint()/1000, 0.005);
    }

    @Test
    void getFarFocalPoint() {
        Lens lens= new Lens("Canon", 1.8, 50);

        //Case 1:
        double distOfObj = 1100, fVal = 1.8;
        DepthOfFieldCalc dof1 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        double expected = 1.12;
        assertEquals(expected, dof1.getFarFocalPoint()/1000, 0.005);

        //Case 2:
        distOfObj = 1000;
        fVal = 8;
        DepthOfFieldCalc dof2 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        expected = 1.10;
        assertEquals(expected, dof2.getFarFocalPoint()/1000, 0.005);

        //Case 3:
        distOfObj = 15000;
        fVal = 11;
        DepthOfFieldCalc dof3 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        expected = Double.POSITIVE_INFINITY;
        assertEquals(expected, dof3.getFarFocalPoint()/1000, 0.005);
    }

    @Test
    void getDepthOfFieldInMM() {
        Lens lens= new Lens("Canon", 1.8, 50);

        //Case 1:
        double distOfObj = 1100, fVal = 1.8;
        DepthOfFieldCalc dof1 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        double expected = 0.05;
        assertEquals(expected, dof1.getDepthOfFieldInMM()/1000, 0.005);

        //Case 2:
        distOfObj = 1000;
        fVal = 8;
        DepthOfFieldCalc dof2 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        expected = 0.18;
        assertEquals(expected, dof2.getDepthOfFieldInMM()/1000, 0.005);

        //Case 3:
        distOfObj = 15000;
        fVal = 11;
        DepthOfFieldCalc dof3 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        expected = Double.POSITIVE_INFINITY;
        assertEquals(expected, dof3.getDepthOfFieldInMM()/1000, 0.005);
    }

    @Test
    void getLens() {
        Lens lens1= new Lens("Canon", 1.8, 50);
        Lens lens2 = new Lens("Tamron", 2.8, 90);
        Lens lens3 = new Lens("Sigma", 2.8, 200);

        //Case 1:
        double distOfObj = 1100, fVal = 1.8;
        DepthOfFieldCalc dof1 = new DepthOfFieldCalc(lens1, distOfObj, fVal);
        assertEquals(lens1, dof1.getLens());

        //Case 2:
        distOfObj = 2000;
        fVal = 2.8;
        DepthOfFieldCalc dof2 = new DepthOfFieldCalc(lens2, distOfObj, fVal);
        assertEquals(lens2, dof2.getLens());

        //Case 3:
        distOfObj = 1500;
        fVal = 5;
        DepthOfFieldCalc dof3 = new DepthOfFieldCalc(lens3, distOfObj, fVal);
        assertEquals(lens3, dof3.getLens());
    }

    @Test
    void getDistanceOfObjInMM() {
        Lens lens= new Lens("Canon", 1.8, 50);

        //Case 1:
        double distOfObj = 1100, fVal = 1.8;
        DepthOfFieldCalc dof1 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        assertEquals(distOfObj, dof1.getDistanceOfObjInMM());

        //Case 2:
        distOfObj = 1000;
        fVal = 8;
        DepthOfFieldCalc dof2 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        assertEquals(distOfObj, dof2.getDistanceOfObjInMM());

        //Case 3:
        distOfObj = 15000;
        fVal = 11;
        DepthOfFieldCalc dof3 = new DepthOfFieldCalc(lens, distOfObj, fVal);
        assertEquals(distOfObj, dof3.getDistanceOfObjInMM());
    }
}