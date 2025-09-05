/*
2) Crie uma classe com o nome CalculoInss
defina uma variável com o nome salário, inicialize a
variável com algum valor e exiba no console o valor 
do salário com desconto do INSS.

	Tabela INSS 
 até 1.518,00 descontará 0% 
 entre 1.518,01 até 2.793,88 descontará 9% 
 entre 2.793,89 até 4.190,83 descontará 12% 
 Acima 4.190,84 até 8.157,41 descontará 14%
*/

public class CalculoINSS {

	public static void main(String[] args) {
		
		//variaveis
        double salario = 5000.00;
        double desconto = 0.0;
        double salarioComDesconto = 0.0;
       
		
        //calculo
        if (salario <= 1518.00) {
            desconto = salario * 0; // 0% de desconto
        } else if (salario <= 2793.88) {
            desconto = salario * 0.09; // 9% de desconto
        } else if (salario <= 4190.83) {
            desconto = salario * 0.12; // 12% de desconto
        } else if (salario <= 8157.41) {
            desconto = salario * 0.14; // 14% de desconto
        }
        
        //calculo 2
        salarioComDesconto = (salario - desconto);
	
        /* Exibindo o resultado usando println
        System.out.println("O valor do salário sem desconto é: R$" + salario);
        System.out.println("O valor do desconto do INSS é: R$" + desconto);
        System.out.println("O salário com desconto do INSS é: R$" + salarioComDesconto); */
    
        //Como a saída ficou com uma casa decimal ao final do valor (ex. salario 5000.0),
        //pesquisei e testei a saida com printf, pra dar 2 casas decimais:
        
        System.out.printf("O valor do salário sem desconto é: R$%.2f%n", salario);
        System.out.printf("O valor do desconto do INSS é: R$%.2f%n", desconto);
        System.out.printf("O salário com desconto do INSS é: R$%.2f%n", salarioComDesconto);
        
	}	
}
