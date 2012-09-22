import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

	@Test
	public void testUser() {
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

	@Test
	public void testTwitterAccount() {
    Fixtures.deleteAll();
    Fixtures.loadModels("data.yml");
	
		User shishidohinata = User.get("shishidohinata");
		TwitterAccount account = new TwitterAccount(shishidohinata);
		assertEquals(account.user, shishidohinata);
	}

}
