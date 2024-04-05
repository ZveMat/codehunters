package hu.codehunters;

import org.junit.Assert;
import org.junit.Test;

public class TestCustomString {

    @Test
    public void testReplace() {
        char[] testCharArray = "Tomi".toCharArray();
        CustomString testCustomString = new CustomString(testCharArray);
        CustomString actualResult = testCustomString.replace('T', 'R');
        CustomString expectedResult = new CustomString("Romi".toCharArray());
        Assert.assertArrayEquals(actualResult.getSzoveg(), expectedResult.getSzoveg());
    }

    @Test
    public void testConcat() {
        char[] testCharArray1 = "alma".toCharArray();
        char[] testCharArray2 = "körte".toCharArray();
        CustomString testCustomString1 = new CustomString(testCharArray1);
        CustomString testCustomString2 = new CustomString(testCharArray2);
        CustomString actualResult = testCustomString1.concat(testCustomString2);
        CustomString expectedResult = new CustomString("almakörte".toCharArray());
        Assert.assertArrayEquals(actualResult.getSzoveg(), expectedResult.getSzoveg());
    }

    @Test
    public void testToUppercase() {
        char[] testCharArray1 = "alma".toCharArray();
        CustomString testCustomString1 = new CustomString(testCharArray1);
        CustomString actualResult = testCustomString1.toUppercase();
        CustomString expectedResult = new CustomString("ALMA".toCharArray());
        Assert.assertArrayEquals(actualResult.getSzoveg(), expectedResult.getSzoveg());
    }
}
