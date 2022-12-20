package com.makingdevs.cartservice

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles(profiles = ["default"])
class CartServiceApplicationTests {

	@Test
	fun contextLoads() {
	}

}
