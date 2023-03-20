package listaLigada;

public class Main {

	public static void main(String[] args) {
		
		No no1 = new No ("Conteudo no1");
		
		No no2 = new No ("Conteudo no2");
		
		No no3 = new No ("Conteudo no3");
		
		No no4 = new No ("Conteudo no4");
		
		no1.setProximoNo(no2);
		
		no2.setProximoNo(no3);
		
		no4.setProximoNo(no4);
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());

	}

}
