package com.riccardosennati.es1;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		
		Info i = new Info();
		i.setNome("Riccardo");
		i.setCognome("Sennati");
		i.DataDiNascita(LocalDate.of(1997, 12, 8));
		DataSource data = new Adapter(i);
		UserData u = new UserData();
		
		u.getData(data);
	}
	
	

}
