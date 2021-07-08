package br.com.generation.aula06.lista;
public class TestaTodos {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica preguica = new Preguica();
		
		dog.setNome("Pitty");
		dog.setIdade(12);
		dog.setCor("Branca");
		dog.setSom("Latido");
		dog.setCorrer("Sim");
		
		horse.setNome("Zapzap");
		horse.setIdade(4);
		horse.setCor("Preto");
		horse.setSom("Relincha");
		horse.setCorrer("Sim");
		
		preguica.setNome("SeiLaNomeprapreguiça");
		preguica.setIdade(20);
		preguica.setCor("Marrom");
		preguica.setSom("Sons Nasal");
		preguica.setDorme("Muito");
		preguica.setSubirArvore("Sim");
		
		
		System.out.println("DOGUINHO");
		System.out.println("\nNome: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade() + " Anos");
		System.out.println("Cor: " + dog.getCor());
		System.out.println("Som: " + dog.getSom());
		System.out.println("Corre: " + dog.getCorrer());
		
		System.out.println("CAVALO");
		System.out.println("\nNome: " + horse.getNome());
		System.out.println("Idade: " + horse.getIdade() + " Anos");
		System.out.println("Cor: " + horse.getCor());
		System.out.println("Som: " + horse.getSom());
		System.out.println("Corre: " + horse.getCorrer());
		
		System.out.println("Preguica");
		System.out.println("\nNome: " + preguica.getNome());
		System.out.println("Idade: " + preguica.getIdade() + " Anos");
		System.out.println("Cor: " + preguica.getCor());
		System.out.println("Som: " + preguica.getSom());
		System.out.println("Dorme? " + preguica.getDorme());
		System.out.println("Escala Árvores: " + preguica.getSubirArvore());


	}

}
