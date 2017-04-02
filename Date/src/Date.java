
public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day,int month,int year) throws DateException{
		this.year=year;
		if(month < 1 || month > 12){
			throw new DateException("Mes"+ month+"no valido");
		}else{
			this.month = month;
		}
		this.day = day;
	}
	
	public String toString(){
		return this.day+"/"+this.month +"/"+ this.year;
	}
	
	public boolean isSameDay(Date nuevo, Date today){
		String todayStr = today.toString();
		String nuevoStr = nuevo.toString();
		String todayDay = todayStr.substring(0,2);
		String nuevoDay = nuevoStr.substring(0,2);
		
		if(todayDay.equals(nuevoDay)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isSameDayIf(Date nuevo, Date today){
		String todayStr = today.toString();
		String nuevoStr = nuevo.toString();
		String todayDay = todayStr.substring(0,2);
		String nuevoDay = nuevoStr.substring(0,2);
		
		return todayDay.equals(nuevoDay);
		
	}
	
	public boolean isSameMonth(Date nuevo, Date today){
		String todayStr = today.toString();
		String nuevoStr = nuevo.toString();
		String todayMnt = todayStr.substring(3,4);
		String nuevoMnt = nuevoStr.substring(3,4);
		
		if(todayMnt.equals(nuevoMnt)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isSameMonthIf(Date nuevo, Date today){
		String todayStr = today.toString();
		String nuevoStr = nuevo.toString();
		String todayMnt = todayStr.substring(3,5);
		String nuevoMnt = nuevoStr.substring(3,5);
		
		return todayMnt.equals(nuevoMnt);
			
	}
	
	public boolean isSameYear(Date nuevo, Date today){
		String todayStr = today.toString();
		String nuevoStr = nuevo.toString();
		String todayYear = todayStr.substring(6,todayStr.length());
		String nuevoYear = nuevoStr.substring(6,nuevoStr.length());
		
		if(todayYear.equals(nuevoYear)){
			return true;
		}else{
			return false;
		}
	}
		
	public boolean isSameYearIf(Date nuevo, Date today){
		String todayStr = today.toString();
		String nuevoStr = nuevo.toString();
		String todayYear = todayStr.substring(6,todayStr.length());
		String nuevoYear = nuevoStr.substring(6,nuevoStr.length());
		
		return todayYear.equals(nuevoYear);
	}
	
	public boolean isSame(Date nuevo, Date today){
		String todayStr = today.toString();
		String nuevoStr = nuevo.toString();
		if(todayStr.equals(nuevoStr)){
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean isSameIf(Date nuevo, Date today){
		String todayStr = today.toString();
		String nuevoStr = nuevo.toString();
		
		return todayStr.equals(nuevoStr);
	}
	
	public String mesLetra(Date fecha){
		String result = "";
		String fechaStr = fecha.toString();
		String fechaMnt = fechaStr.substring(3,5);
		
		switch(fechaMnt){
		case "1/":
		{
			result = "Enero";
			break;
		}
		case "2/":
		{
			result = "Febrero";
			break;
		}
		case "3/":
		{
			result = "Marzo";
			break;
		}
		case "4/":
		{
			result = "Abril";
			break;
		}
		case "5/":
		{
			result = "Mayo";
			break;
		}
		case "6/": 
		{
			result = "Junio";
			break;
		}
		case "7/":
		{
			result = "Julio";
			break;
		}
		case "8/":
		{
			result = "Agosto";
			break;
		}
		case "9/":
		{
			result = "Septiembre";
			break;
		}
		case "10":
		{
			result = "Octubre";
			break;
		}
		case "11":
		{
			result = "Noviembre";
			break;
		}
		case "12":
		{
			result = "Diciembre";
			break;
		}
		}//Fin switch
		
		return result;
	}
	public boolean NumCorrecto(Date fecha){
		String fechaStr = fecha.toString();
		String fechaDay = fechaStr.substring(0,2);
		String fechaMnt = fechaStr.substring(3,5);
		int dias = Integer.parseInt(fechaDay);
		
		if((fechaMnt.equals("1/") || fechaMnt.equals("3/") || fechaMnt.equals("5/") || fechaMnt.equals("7/") || fechaMnt.equals("8/") || fechaMnt.equals("10") || fechaMnt.equals("12")) && (dias > 0 && dias <=31)){
			return true;
		}else if(fechaMnt.equals("1/") && (dias==28) || (dias==29)){
			return true;
		}else if((fechaMnt.equals("4/") || fechaMnt.equals("6/") || fechaMnt.equals("9/")  || fechaMnt.equals("11")) && (dias > 0 && dias <=30)){
			return true;
		}
		return false;
	}
	
	public String estacion(Date fecha){
		String fechaStr = fecha.toString();
		String fechaDay = fechaStr.substring(0,2);
		String fechaMnt = fechaStr.substring(3,5);
		int dias = Integer.parseInt(fechaDay);
		
		if((fechaMnt.equals("3/") && dias>= 20) || (fechaMnt.equals("4/") || (fechaMnt.equals("5/") ||((fechaMnt.equals("6/") && dias< 21))))){
			return "Primavera";
		}else if((fechaMnt.equals("6/") && dias>= 21) || (fechaMnt.equals("7/") || (fecha.equals("8/") || (fechaMnt.equals("9/") && dias<22) ))){
			return "Verano";
		}else if((fechaMnt.equals("9/") && dias>= 22) || (fechaMnt.equals("10") || (fechaMnt.equals("11") || (fechaMnt.equals("12") && dias<21)))){
			return "Otoño";
		}else{
			return "Invierno";
		}
	}
	public int mesesRestantes(Date fecha){
			int result = 0;
			String fechaStr = fecha.toString();
			String fechaMnt = fechaStr.substring(3,5);
			
			switch(fechaMnt){
			case "1/":
			{
				result = 11;
				break;
			}
			case "2/":
			{
				result = 10;
				break;
			}
			case "3/":
			{
				result = 9;
				break;
			}
			case "4/":
			{
				result = 8;
				break;
			}
			case "5/":
			{
				result = 7;
				break;
			}
			case "6/": 
			{
				result = 6;
				break;
			}
			case "7/":
			{
				result = 5;
				break;
			}
			case "8/":
			{
				result = 4;
				break;
			}
			case "9/":
			{
				result = 3;
				break;
			}
			case "10":
			{
				result = 2;
				break;
			}
			case "11":
			{
				result = 1;
				break;
			}
			case "12":
			{
				result = 0;
				break;
			}
			}//Fin switch
			
			return result;
		}
	
	public String imprimir(Date fecha){
		String fechaStr = fecha.toString();
		return fechaStr;
	}
	
	public int diasRestantes(Date fecha){
		String fechaStr = fecha.toString();
		String fechaDay = fechaStr.substring(0,2);
		String fechaMnt = fechaStr.substring(3,5);
		int dias = Integer.parseInt(fechaDay);
		if((fechaMnt.equals("1/") || fechaMnt.equals("3/") || fechaMnt.equals("5/") || fechaMnt.equals("7/") || fechaMnt.equals("8/") || fechaMnt.equals("10") || fechaMnt.equals("12")) && (dias > 0 && dias <=31)){
			return 31-dias;
		}else if(fechaMnt.equals("1/") && (dias==28) || (dias==29)){
			return 28-dias;
		}else if((fechaMnt.equals("4/") || fechaMnt.equals("6/") || fechaMnt.equals("9/")  || fechaMnt.equals("11")) && (dias > 0 && dias <=30)){
			return 30-dias;
		}
		return 0;
	}
	
	public int mesesIguales(Date fecha){
		String fechaStr = fecha.toString();
		String fechaDay = fechaStr.substring(0,2);
		String fechaMnt = fechaStr.substring(3,5);
		int dias = Integer.parseInt(fechaDay);
		if((fechaMnt.equals("1/") || fechaMnt.equals("3/") || fechaMnt.equals("5/") || fechaMnt.equals("7/") || fechaMnt.equals("8/") || fechaMnt.equals("10") || fechaMnt.equals("12")) && (dias > 0 && dias <=31)){
			return 7;
		}else if(fechaMnt.equals("1/") && (dias==28) || (dias==29)){
			return 1;
		}else if((fechaMnt.equals("4/") || fechaMnt.equals("6/") || fechaMnt.equals("9/")  || fechaMnt.equals("11")) && (dias > 0 && dias <=30)){
			return 4;
		}
		return 0;
	}
	
	public int cuentaDias(Date fecha){
		int result = 0;
		String fechaStr = fecha.toString();
		String fechaMnt = fechaStr.substring(3,5);
		String fechaDay = fechaStr.substring(0,2);
		int dias = Integer.parseInt(fechaDay);
		
		switch(fechaMnt){
		case "1/":
		{
			result = dias;
			break;
		}
		case "2/":
		{
			result = 31+dias;
			break;
		}
		case "3/":
		{
			result = 31+28+dias;
			break;
		}
		case "4/":
		{
			result =  31+28+31+dias;
			break;
		}
		case "5/":
		{
			result = 31+28+31+30+dias;
			break;
		}
		case "6/": 
		{
			result = 31+28+31+30+31+dias;
			break;
		}
		case "7/":
		{
			result = 31+28+31+30+31+30+dias;
			break;
		}
		case "8/":
		{
			result = 31+28+31+30+31+30+31+dias;
			break;
		}
		case "9/":
		{
			result = 31+28+31+30+31+30+31+31+dias;
			break;
		}
		case "10":
		{
			result = 31+28+31+30+31+30+31+31+30+dias;
			break;
		}
		case "11":
		{
			result = 31+28+31+30+31+30+31+31+30+31+dias;
			break;
		}
		case "12":
		{
			result = 31+28+31+30+31+30+31+31+30+31+30+dias;
			break;
		}
		}//Fin switch
		
		return result;
	}
	
	
}
