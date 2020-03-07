import java.util.Date;

public class TesteIdade {
	
public static void main(String[] args) {
		
		Cliente obj = new Cliente();
		
		Date dtget = DateTimeUtils.aniver(19, 11, 2002);
		obj.dtnasc = dtget;
	
		System.out.println(obj.dtnasc);
		System.out.println(obj.toString());
		
				
	}

}
