package pl.edu.wszib.springwithtests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import pl.edu.wszib.springwithtests.service.ShoppingBasketService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SpringWithTestsApplicationTests {

	@Autowired
	ShoppingBasketService service;

//	@Autowired
//	private MockMvc mockMvc;

	@Test
	public void contextLoads() {
	}

}
