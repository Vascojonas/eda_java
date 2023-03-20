package pilha;

import listaLigada.No;
public class Pilha {
	
	private No<Integer> refNoEntradadaPilha;

	public Pilha() {
		this.refNoEntradadaPilha = null;
	}
	
	
	public void push(No<Integer> novoNo) {
		No<Integer> auxiliar = this.refNoEntradadaPilha;
		
		this.refNoEntradadaPilha = novoNo;
		this.refNoEntradadaPilha.setProximoNo(auxiliar); 
	}
	
	
	public No<Integer> pop() {
		
		if(!this.isEmpty()) {
			No<Integer> noPoped = this.refNoEntradadaPilha;
			
			this.refNoEntradadaPilha = this.refNoEntradadaPilha.getProximoNo();
			
			return noPoped;
		}
		
		return null;
	}
	
	
	
	public No<Integer> top(){
		return refNoEntradadaPilha;
	}
	
	
	public boolean isEmpty() {
		return refNoEntradadaPilha == null ? true : false;
	}


	@Override
	public String toString() {
		
		String stringRetorno = "________________________\n";
				stringRetorno += "  Pilha\n";
	           stringRetorno += "________________________\n";
		
	      No<Integer> noAuxiliar = this.refNoEntradadaPilha;
	      
	      while(true) {
	    	  
	    	  if(noAuxiliar != null) {
	    		  stringRetorno += "[No { Dado = "+ noAuxiliar.getConteudo() + "}]\n";
	    		  noAuxiliar = noAuxiliar.getProximoNo();
	    		 
	    	  }else {
	    		 
	    		  return stringRetorno;
	    	  }
	      }
	           
	         
	}
	 
	
}
