
// Aluna: Giselle P A Garcia

package classes;

public class Calculadora {
	
    public double calcular(double valor1, double valor2, int operacao) {
        switch (operacao) {
            case 1: // Soma
                return valor1 + valor2;
            case 2: // Subtração
                return valor1 - valor2;
            case 3: // Multiplicação
                return valor1 * valor2;
            case 4: // Divisão
                if (valor2 != 0) {
                    return valor1 / valor2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return Double.NaN; 
                }
            default:
                System.out.println("Operação inválida.");
                return Double.NaN;
        }
    }
}

