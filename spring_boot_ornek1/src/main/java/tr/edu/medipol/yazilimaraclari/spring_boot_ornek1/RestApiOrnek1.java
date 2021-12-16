package tr.edu.medipol.yazilimaraclari.spring_boot_ornek1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ornek")
public class RestApiOrnek1 {

	@GetMapping("/merhaba")
	public @ResponseBody Mesaj merhaba() {
		Mesaj merhabaMesaji = new Mesaj();
		merhabaMesaji.bilgi = "Medipolden merhabalar!";
		return merhabaMesaji;
	}

	@GetMapping("/hayirli_cumalar")
	public Mesaj hayirliCumalar() {
		Mesaj cumaMesaji = new Mesaj();
		cumaMesaji.bilgi = "Medipolden hayirli cumalar!";
		return cumaMesaji;
	}

	public static class Mesaj {
		private String bilgi;

		public String getBilgi() {
			return bilgi;
		}

		public void setBilgi(String bilgi) {
			this.bilgi = bilgi;
		}
	}

}