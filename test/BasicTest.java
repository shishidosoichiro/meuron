import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

	@Test
	public void userTest() {
    Fixtures.deleteAll();
    Fixtures.loadModels("data.yml");
	
		User shishido = new User("shishido");
		assertEquals(shishido.username, "shishido");
		shishido.save();
		assertEquals(shishido, shishido);
		
		User shishidohinata = User.get("shishidohinata");
		assertNotNull(shishidohinata);
		assertFalse(shishidohinata.equals(shishido));
		
	}

}
