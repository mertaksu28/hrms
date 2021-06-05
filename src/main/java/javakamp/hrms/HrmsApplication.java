package javakamp.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsApplication.class, args);
	}

	
}
/*İsterler
 * Mernis Yapılmadı
 * Her kullanıcı için doğrulama yapılmadı
 * 
 * ***job title alanının add ve getall metotları yazılacak
 * ***job title name i pg adminde uniqe olacak
 * ***job advertisements tablosunun entity si yazılacak ve dao, servis, manager ve controller
 *  yazılacak
 * employer id zorunlu olur iş ilanı eklerken**
 * 
 * */
