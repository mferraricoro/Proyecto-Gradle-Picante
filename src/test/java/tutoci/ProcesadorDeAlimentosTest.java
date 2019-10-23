package tutoci;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProcesadorDeAlimentosTest {

	List<Alimento> alimentos;
	ProcesadorDeAlimentos procesadorDeAlimentos;
	
	@Before
	public void iniciar() {
		
		alimentos = new ArrayList<>();
		procesadorDeAlimentos = new ProcesadorDeAlimentos(alimentos);
		alimentos.add(new Alimento("Arroz Los Sembradores", 3320, "arroz", "SEMARR01", 1000));
		alimentos.add(new Alimento("Fideos de arroz con espinaca", 1012, "arroz, agua, almidón de maíz, espinaca, aceite de girasol", "SOYARR02", 300));
		alimentos.add(new Alimento("Fideos de Trigo", 800, "trigo, agua, almidón de maíz", "MATTRI01", 250));
		alimentos.add(new Alimento("Lentejas", 1140, "lentejas", "LENT01", 400));
		alimentos.add(new Alimento("Arbejas", 264, "arbejas, agua, sal", "ARB01", 300));
	}
	
	@Test
	public void debePoderHacerBusquedasDeAlimentos() {
		Assert.assertEquals(2, procesadorDeAlimentos.filterEj1(1100).size());
	}

	@Test
	public void debePoderHacerBusquedasDeAlimentos2() {
		Assert.assertEquals("SEMARR01", procesadorDeAlimentos.filterEj2("SEMARR01").get(0).getCodigo());
	}

	@Test
	public void debePoderHacerBusquedasDeAlimentos3() {
		Assert.assertEquals(new Integer(6536),procesadorDeAlimentos.filterEj3());
	}

	@Test
	public void debePoderHacerBusquedasDeAlimentos4() {
		Assert.assertEquals(new Integer(4332),procesadorDeAlimentos.filterEj4("arroz"));
	}
}
