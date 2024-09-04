package exerciciospoo;

public class Carro2 {

	public static void main(String[] args) {
		
		Carro carro1 =  new Carro();
		Carro carro2 = new Carro();
		
		
		//carro 1
		carro1.setName("Modelo: Ferrari");
		carro1.setCor("Cor: Vermelho");
		carro1.setAndar("Andando: Não");
		carro1.setVireDireita("Virar a Direita: Sim");
		carro1.setVireEsquerda("Virar a esquerda: Sim");
		carro1.setDarSeta("Dar seta");
		
		//Carro 2
		carro2.setName("Modelo: BMW");
		carro2.setCor("Cor: Prata e azul escuro");
		carro2.setAndar("Andando: Não");
		carro2.setVireDireita("Virar a direita: Sim");
		carro2.setVireEsquerda("Virar a esquerda: Não");
		carro2.setDarSeta("Dar seta");
		
		
		//Exibição do Carro 1
		System.out.println("----- Carro 1 -----");
		System.out.println(carro1.getName());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getAndar());
		System.out.println(carro1.getVireDireita());
		System.out.println(carro1.getVireEsquerda());
		System.out.println(carro1.getDarSeta());
		
		
		//Exibição do Carro 2
		System.out.println("----- Carro 2 -----");
		System.out.println(carro2.getName());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getAndar());
		System.out.println(carro2.getVireDireita());
		System.out.println(carro2.getVireEsquerda());
		System.out.println(carro2.getDarSeta());
		
		
		
		

	}

}
