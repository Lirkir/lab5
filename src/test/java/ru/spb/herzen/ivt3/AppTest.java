package ru.spb.herzen.ivt3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    extends TestCase
{
    App app;

    public void setUp() {
        app = new App();
    }

    public void test_add() {
        assertEquals(app.add(99, 2), 101);
        assertEquals(app.add(-1, 5077), 5076);
    }

    public void test_mult() {
        assertEquals(app.mult(2, 999), 1998);
        assertEquals(app.mult(2, 126), 252);
        assertEquals(app.mult_float(5.4f,  2.1f),  11.34f);
        assertEquals(app.mult_float(3.33f, 2.22f), 7.3926f);
    }

    public void test_expr() {
        assertEquals(1.66666667f, app.expr(-2), 0.000001);
        assertEquals(5.09683996f, app.expr(0.019f), 0.000001);
        assertEquals(-0.79101408f, app.expr(7.321f), 0.000001);
        assertEquals(5, app.expr(0), 0.0001);
        assertEquals(1.66666667f, app.expr(-2), 0.0001);
        assertEquals(Double.POSITIVE_INFINITY, app.expr(1), 0.000001);
    }
}
