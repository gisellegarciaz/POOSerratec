package main;

import classes.ClasseCidade;
import classes.ClasseEndereco;
import classes.ClasseEstado;
import classes.ClassePessoa;
import classes.ClasseTelefone;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {			
		
	}
	
	public static int menu() {
		Scanner input = new Scanner(System.in);
		
		String menu = """
					-----------------------
					   Sistema Serratec
					-----------------------
					  1- Cadastrar Estado
					  2- Cadastrar Cidade
					  3- Cadastrar Endereço
					  4- Cadastrar Pessoa
					  5- Imprimir um
					  6- Imprimir todos
					  7- Sair
					-----------------------					  
				""";
		System.out.println(menu);
		System.out.print("Selecione uma opção: ");
		int opcao = input.nextInt(); 

		return opcao;
	}
	
	public static void selecionarMenu(int opcao, ArrayList<ClassePessoa> p) {
		switch (opcao) {
		case 1: 
		case 2: 
		case 3: 
		case 4: cadastrarPessoa(p); break;
		case 5: imprimirUm(p); break;
		case 6: imprimirTodos(p); break;
		case 7:	System.out.println("\nObrigado por usar o sistema."); break;
		default: System.out.println("Opção inválida.");
		}
	}
	
	private static void imprimirTodos(ArrayList<ClassePessoa> p) {
		// TODO Auto-generated method stub
		
	}

	private static void imprimirUm(ArrayList<ClassePessoa> p) {
		// TODO Auto-generated method stub
		
	}

	public static void cadastrarPessoa(ArrayList<ClassePessoa> p) {
		Scanner input = new Scanner(System.in);
		boolean continuar = true;
		
		System.out.println("\nCADASTRO");
		System.out.println("-------------------------");
		
		while (continuar) {		
			adicionarPessoa(p);
			System.out.println("-------------------------\n");
			System.out.println("Deseja cadastrar mais uma pessoa? (S/N)");
			char resposta = input.next().charAt(0);
			
			continuar = resposta == 'S' || resposta == 's';
			System.out.println("-------------------------\n");
		}
	}
	
	public static void adicionarPessoa(ArrayList<ClassePessoa> p) {			
		p.add(cadastrar());
	}
	
	public static ClassePessoa cadastrar() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = input.nextLine();
		
		System.out.print("Informe o cpf: ");
		String cpf = input.nextLine();
		
		ClasseEndereco endereco = cadastrarEndereco();
		
		System.out.print("Informe o telefone: ");
		List<ClasseTelefone> telefones = cadastrarTelefones();

	
		ClassePessoa p = new ClassePessoa(nome, cpf, endereco, telefones);
		
		return p;
	}
	
	public static ClasseEndereco cadastrarEndereco() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o endereço (rua - número): ");
		String rua = input.nextLine();
		
		System.out.print("Informe o bairro: ");
		String bairro = input.nextLine();
		
		System.out.print("Informe o cep: ");
		String cep = input.nextLine();
		
		ClasseCidade cidade = cadastrarCidade();
		
		ClasseEndereco e = new ClasseEndereco(rua, bairro, cep, cidade);
		return e;
	}
	
	public static ClasseCidade cadastrarCidade() {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Informe a cidade: ");
		String cidade = input.nextLine();
		
		ClasseEstado estado = cadastrarEstado();
		
		ClasseCidade c = new ClasseCidade(cidade, estado);
		return c;
	}
	
	public static ClasseEstado cadastrarEstado() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o nome do Estado: ");
		String nome = input.nextLine();
		
		System.out.print("Informe a sigla: ");
		String sigla = input.next();
		
		ClasseEstado e = new ClasseEstado(nome, sigla);
		return e;
	}
	
	public static List<ClasseTelefone> cadastrarTelefones() {
		Scanner input = new Scanner(System.in);
		List<ClasseTelefone> lista = new ArrayList<ClasseTelefone>();
		
		boolean continuar = false;
		char resposta;
		
		do {
			System.out.print("Informe o nome o telefone: ");
			String tel = input.nextLine();
			
			ClasseTelefone telefone = new ClasseTelefone(tel);	
			
			lista.add(telefone);
			
			System.out.println("Deseja cadastrar mais um telefone? (S/N");
			resposta = input.next().charAt(0);
			
			continuar = resposta == 'S' || resposta == 's';
			
		} while (continuar);
		
		
		return lista; 
	}
	
	public static void procedural () {
		Estado estado = new Estado("Rio de Janeiro", "RJ");
		Cidade cidade = new Cidade("Teresópolis", estado);
		
		Estado estado2 = new Estado("Paraná", "PR");
		Cidade cidade2 = new Cidade("Guarapuava", estado2);
		
		Endereco e1 = new Endereco("Rua Delfim Moreira, 123", "Centro", "25953-000", cidade);
		Endereco e2 = new Endereco("Rua Saldanha Marinho, 999", "Centro", "55555-55", cidade2);
		
		Telefone t1 = new Telefone("(21) 98752-6654");
		Telefone t2 = new Telefone("(21) 98754-8752");
		
		List<Telefone> listaTel =  new ArrayList<>();
		
		listaTel.add(t1);
		listaTel.add(t2);
		
		Telefone t3 = new Telefone("(21) 99999-6654");
		Telefone t4 = new Telefone("(21) 98888-8752");
		
		List<Telefone> listaTel2 =  new ArrayList<>();
		
		listaTel2.add(t3);
		listaTel2.add(t4);
		
		Pessoa p1 = new Pessoa("Ricardo Oliveira", "123.456.789-99", e1, listaTel);
		Pessoa p2 = new Pessoa("Renato Oliveira", "999.999.999-99", e2, listaTel2);
		
		System.out.println("Nome: " + p1.getNome() + " - " + p1.getCpf());
		System.out.println("Endereço: " + p1.getEndereco().getRua() + " - " +
										  p1.getEndereco().getBairro() + " - " +
										  p1.getEndereco().getCep() + " - " + 
										  p1.getEndereco().getCidade().getNomeCidade() + " - " + 
										  p1.getEndereco().getCidade().getEstado().getSigla());
		System.out.print("Telefones: ");
		
		for (Telefone tel : p1.getTelefones()) {
			System.out.print(tel.getTelefone() + " / ");
		}
		System.out.println("");
	}
}
