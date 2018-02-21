import static org.junit.Assert.*;

import org.junit.Test;

public class eliminarepesTest {

	@Test
	public final void test() {
		
		String res = eliminarepes.eliminarepes("aaaaaaaaaaaaaaaaaaa");
		assertEquals("*", res);
		assertEquals("a", eliminarepes.eliminarepes("a"));
		assertEquals("abc", eliminarepes.eliminarepes("abc"));
		assertEquals("p", eliminarepes.eliminarepes("patata"));
		assertEquals("Pinche Fuo", eliminarepes.eliminarepes("Pinches Furros"));
		assertEquals("Herc", eliminarepes.eliminarepes("Hola me llamo Marc"));
		assertEquals("padre", eliminarepes.eliminarepes("padre"));
		assertEquals("*", eliminarepes.eliminarepes(""));
		assertEquals(" ", eliminarepes.eliminarepes(" "));
		assertEquals("*", eliminarepes.eliminarepes("*******"));
		
		
	}

}
