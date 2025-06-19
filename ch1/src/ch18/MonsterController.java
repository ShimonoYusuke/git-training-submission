package ch18;

//SpringBootによるWebAPIのサンプル
import org.springframework.web.bind.annotation.*;

import ch12.Monster;

@RestController

public class MonsterController {
	@GetMapping("/monster")
	public Monster monster(@RequestParam(value = "id") String id) {
		return new Monster(id);
	}

}
