
public class MainDate {

		public static void main(String[]args){
			
			Date today = null;
			Date fecha = null;
			
			try{
				today = new Date(30,12,2017);
				System.out.println(today);
			}catch(DateException e){
				System.out.println(e.getMessage());
			}
			
			try{
				fecha = new Date(31,03,2017);
				System.out.println(fecha);
			}catch(DateException e){
				System.out.println(e.getMessage());
			}
		
			
			today.isSameDay(today,fecha);
			today.isSameMonth(today,fecha);
			today.isSameYear(today, fecha);
			today.isSameYearIf(today, fecha);
			today.isSame(today, fecha);
			today.mesLetra(today);
			today.NumCorrecto(today);
			today.estacion(today);
			today.mesesRestantes(today);
			today.imprimir(today);
			today.diasRestantes(today);
			today.mesesIguales(today);
			today.cuentaDias(today);
		}
		
		
		
		
		
		
		
	
}
