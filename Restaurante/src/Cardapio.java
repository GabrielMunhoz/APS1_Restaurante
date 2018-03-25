import java.util.Scanner;

public class Cardapio {
	private static Pratos prato [] = new Pratos[10];
	static int idP;
	public static void main(String[] args) {
		while(true) {
		inicia();
		}
	}
	private static void inicia() {
		String menu=""
				+ "============"
				+ "\n1-Para adicionar prato: "
				+ "\n2-para listar cardapio: "
				+ "\n3-Para alterar valor do prato: "
				+ "\n4-para alterar descri��o: "
				+ "\n============";
		switch(digiInt(menu)) {
		case 1 : addPrato();break;
		case 2 : listaCardapio();break;
		case 3 : alteraValor();break;
		case 4 : alterarDescricao();break;
		}
		
	}
	private static void listaCardapio() {
		if(prato[0]==null) {
			System.out.println("Voce deve Adicionar um prato!");addPrato();
		}
		int  id=0;
		while(prato[id]!=null) {
			System.out.println("============"
					+ "\nPosi��o["+id+"]"+prato[id].toString()+
					"\n============");
			id++;
		}
		
	}
	private static void alterarDescricao() {
		if(prato[0]==null) {
			System.out.println("Voce deve Adicionar um prato!");addPrato();
		}
		int  id=0;
		while(prato[id]!=null) {
			System.out.println("============"
					+ "\nPosi��o["+id+"]"+prato[id].toString()+
					"\n============");
			id++;
		}
		int esc=digiInt("Digite a posi��o do prato que deseje alterar"
				+ "a descri��o:");
		prato[esc].setDescricao(digString("Digite nova Descri��o:"));
		
	}
	private static void alteraValor() {
		if(prato[0]==null) {
			System.out.println("Voce deve Adicionar um prato!");addPrato();
		}
		int  id=0;
		while(prato[id]!=null) {
			System.out.println("============"
					+ "\nPosi��o["+id+"]"+prato[id].toString()+
					"\n============");
			id++;
		}
		int esc=digiInt("Digite a posi��o do prato que deseje alterar");
		prato[esc].setPreco(digDouble("Digite um novo valor: "));
		
	}
	private static void addPrato() {
		String nome=digString("Digite o nome do Prato: "),
				descricao=digString("Digite a descri��o do prato: ");
		double preco = digDouble("Digite o valor do prato: ");
		prato[idP] = new Pratos(nome,preco);
		prato[idP].setDescricao(descricao);
		idP++;
	}
	private static double digDouble(String string) {
		System.out.println(string);
		return new Scanner(System.in).nextDouble();
	}
	private static String digString(String string) {
		System.out.println(string);
		return new Scanner(System.in).nextLine();
	}
	private static int digiInt(String menu) {
		System.out.println(menu);
		return new Scanner (System.in).nextInt();
	}

}
