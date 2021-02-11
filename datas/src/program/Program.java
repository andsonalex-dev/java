package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Date x1 = new Date();
		
		Date y1 = sdf1.parse("10/02/2021");
		Date y2 = sdf2.parse("10/02/2021 14:03:44");
		
		System.out.println(sdf2.format(x1));
		
		//Usando calendar
		
		System.out.println("Usando o Calendar -==============================");
		
		Calendar cal = Calendar.getInstance();
		System.out.println("Data atual: " + x1);		
		cal.setTime(x1); // pegando a data atual			
		cal.add(Calendar.HOUR_OF_DAY, 4);  //adicionando 4 horas		
		x1 = cal.getTime();	
		System.out.println("Hora acresentada: " + x1);	
		
	}

}
