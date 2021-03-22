package mathutils;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MathUtilsTest {

    @Test
    void testAdd(){
        MathUtils mathUtils=new MathUtils();
        int expected=2;
        int actual=mathUtils.add(1,1);
        assertEquals(expected,actual,"The add method shoudl add two numbers");
    }


    @Test
    void testComputeCircleRadius(){
        MathUtils mathUtils=new MathUtils();
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),"Should return right circle area");
        assertEquals(62.83185307179586,mathUtils.computeCirclePerimetre(10), "should return right circle perimetre");
    }





}
