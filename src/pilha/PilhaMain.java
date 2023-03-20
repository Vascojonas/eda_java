package pilha;

import listaLigada.No;

public class PilhaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pilha p = new Pilha();
		
		No<Integer> a = new No<>(87);
		No<Integer> b = new No<>(100);
		
		p.push(a);
		p.push(b);
		
		System.out.println(p);
		
		p.pop();
		
		System.out.println(p);
	}

}
