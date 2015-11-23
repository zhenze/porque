import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
System.out.println("verificar Prima");
Empleato emp = new Empleato();
Empleato emp2 = new Empleato();
Empleato emp3 = new Empleato();
Empleato emp4 = new Empleato();
Prima p = new Prima();
emp.inicialitza("Aurora", "002W56", 5, "S");
emp2.inicialitza("Aurora", "002W56", 13, "S");
emp3.inicialitza("Aurora", "002W56", 13, "N");
emp4.inicialitza("Aurora", "002W56", 5, "N");
assertTrue(Prima.calculalaPrima(emp) == 400);
assertTrue(Prima.calculalaPrima(emp2) == 600);
assertTrue(Prima.calculalaPrima(emp3) == 150);
assertTrue(Prima.calculalaPrima(emp4) == 100);
assertFalse(Prima.calculalaPrima(emp3) == 100);
assertTrue(Prima.calculalaPrima(emp4) == 1234923);
	}

}
