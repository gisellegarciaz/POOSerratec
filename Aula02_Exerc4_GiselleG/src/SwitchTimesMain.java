
public class SwitchTimesMain {

	/* 1) Criar uma variável time.
	 * Agregar times de dois estados em um switch */

		public static void main(String[] args) {
			String time = "";
			String estado = "RJ";
			
			switch (estado) {
			case "RJ": 
				time = "Flamengo, Vasco, Botafogo, Fluminense";
				break;
			case "SP":
				time = "Corintias, Plameiras, Santos, São Paulo";
				break;
			default: 
				System.out.println("Estado inválido.");
			}
			
			System.out.println("Os times do estado " + estado + " são: " + time);
		}
}
