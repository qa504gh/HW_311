package core;
import static org.junit.Assert.*;
import org.junit.*;
public class CalcTest {

static double divide(double a, double b)                       {return a / b;}
static double divide(double a, double b, double c)             {return a / b / c;}
static double divide(double a, double b, double c, double d)   {return a / b / c / d;}
static double divide(double a, double b, double c, double d, double e)   {return a/b/c/d/e;}

static double add(double a, double b)                          {return a + b;}
static double add(double a, double b, double c)                {return a + b + c;}
static double add(double a, double b, double c, double d)      {return a + b + c + d;}

static double subtract(double a, double b)                     {return a - b;}
static double subtract(double a, double b, double c)           {return a - b - c;}
static double subtract(double a, double b, double c, double d) {return a - b - c - d;}

static double multiply(double a, double b)                     {return a * b;}
static double multiply(double a, double b, double c)           {return a * b * c;}
static double multiply(double a, double b, double c, double d) {return a * b * c * d;}

@Test // @Ignore
public void test_01_1() {assertEquals("Not correct", divide(90.0, 7.0), 12.9, 0.09);
System.out.println("---------------- START of JUnit Test: CalcTest ------------------------");
System.out.println("Test 1-1 divide 2 values: 90.0 /7.0 = 12.9 > Test: PASS");
}
@Test // @Ignore
public void test_01_2() {assertEquals("Not correct", divide(90.0, 3.0, 2.0), 15.0, 0.09);
System.out.println("Test 1-2 divide 3 values: 90.0/3.0/2.0 = 15.0 > Test: PASS");
}
@Test // @Ignore
public void test_01_3() {assertEquals("Not correct", divide(90.0, 3.0, 2.0, 10.0), 1.5, 0.09);
System.out.println("Test 1-3 divide 4 values: 90.0/3.0/2.0/10 = 1.5 > Test: PASS");
}
@Test // @Ignore
public void test_01_4() {assertEquals("Not correct", divide(1000.0, 10.0, 2.0, 5.0), 10.0, 0.09);
System.out.println("Test 1-4 divide 5 values: 1000.0/10.0/2.0/10 = 1.5 > Test: PASS\n");
}
//----------------------------------------------------------
@Test // @Ignore
public void test_02_1() {assertEquals("Not correct", add(60.0, 5.0), 65.0, 0.09);
System.out.println("Test 2-1 add 2 values: 60.0 + 5.0 = 65.0 > Test: PASS");
}
@Test // @Ignore
public void test_02_2() {assertEquals("Not correct", add(60.0, 5.0, 100.0), 165.0, 0.09);
System.out.println("Test 2-2 add 3 values: 60.0+5.0+100.0 = 165.0 > Test: PASS");
}
@Test // @Ignore
public void test_02_3() {assertEquals("Not correct", add(60.0, 10.0, 20.0, 15.5 ), 105.5, 0.09);
System.out.println("Test 2-3 add 4 values: 60.0+10.0+20.0+15.5 = 105.5 > Test: PASS\n");
}
//-------------------------------------------------------------------
@Test // @Ignore
public void test_03_1() {assertEquals("Not correct", subtract(100.0, 22.0), 78.0, 0.09);
System.out.println("Test 3-1 substr 2 values: 100.0 - 22.0 = 78.0 > Test: PASS");
}
@Test // @Ignore
public void test_03_2() {assertEquals("Not correct", subtract(100.0, 20.0, 10.5), 69.5, 0.09);
System.out.println("Test 3-2 substr 3 values: 100.0 - 20.0 - 10.5 = 69.5 >Test: PASS");
}
@Test // @Ignore
public void test_03_3() {assertEquals("Not correct", subtract(100.0, 20.0, 10.5, 0.5), 69.0, 0.09);
System.out.println("Test 3-3 substr 4 values: 100.0 - 20.0 - 10.5 - 0.5 = 69.0 > Test: PASS\n");
}
// ----------------------------------------------------------------------
@Test // @Ignore
public void test_04_1() {assertEquals("Not correct", multiply(9.0, 5.0), 45.0, 0.09);
System.out.println("Test 4-1 mult 2 values: 9.0 * 5.0 = 45.0 > Test: PASS");
}
@Test // @Ignore
public void test_04_2() {assertEquals("Not correct", multiply(9.0, 5.0, 10.0), 450.0, 0.09);
System.out.println("Test 4-2 mult 3 values: 9.0 * 5.0 * 10.0 = 450.0 > Test: PASS");
}
@Test // @Ignore
public void test_04_3() {assertEquals("Not correct", multiply(2.0, 5.0, 10.0, 10.0), 1000.0, 0.09);
System.out.println("Test 4-3 mult 4 values: 10.0 * 2.0 * 10.0 * 10.0 = 1000.0 > Test: PASS");
System.out.println("---------------- End of JUnit Test: CalcTest --------------------------");
}
//////

}// end-of-test