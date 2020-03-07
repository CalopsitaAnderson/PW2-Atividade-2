import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Cliente obj = new Cliente();
		obj.nome = "anderson";
		obj.eMail = "am33zhick@gmail.com";
		obj.telefone = "11993501000";
		obj.dtnasc = new Date();
		obj.idade = new Date();
		obj.cpf = "35875986816";
		
		LocalDate date = LocalDate.of(1995, 11, 25);
		obj.dtnasc = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		LocalDate date1 = LocalDate.of(1985, 11, 25);
		obj.idade = Date.from(date1.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		System.out.println("nome :"+ obj.nome);
		System.out.println("email :"+ obj.eMail );
		System.out.println("telefone :"+ obj.telefone);
		System.out.println("data de nascimento :"+ obj.dtnasc );
		System.out.println("maioridade:" + obj.idade);
		System.out.println("SUCESSO " + (obj.ehCPFValido() && obj.ehMaiorIdade()));
		
	}
}
	
