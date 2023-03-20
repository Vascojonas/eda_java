package listaLigada;

public class Main {

	public static void main(String[] args) {
		
		No<String> no1 = new No<> ("Conteudo no1");
		
		No<String> no2 = new No<> ("Conteudo no2");
		
		No<String> no3 = new No<> ("Conteudo no3");
		
		No<String> no4 = new No<> ("Conteudo no4");
		
		no1.setProximoNo(no2);
		
		no2.setProximoNo(no3);
		
		no4.setProximoNo(no4);
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());

	}

}
