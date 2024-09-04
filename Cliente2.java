package exerciciospoo;

public class Cliente2 {

	public static void main(String[] args) {
      
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setNome("Nome: Rogério da Silva");
		cliente1.setTelefone("Telefone: 55 15 99739-1652");
		cliente1.setCpf("CPF: 37847385783");
		cliente1.setRg("RG: 39749375973");
		cliente1.setComprar("Compra: Sim");
		cliente1.setReclama("Reclama: Sim");
		cliente1.setAndar("Anda: Sim");
		cliente1.setNegocia("Negocia: Sim\n");
		
		cliente2.setNome("Nome: Roberto Maldade");
		cliente2.setTelefone("Telefone: 55 15 99719-1282");
		cliente2.setCpf("CPF: 28493567934");
		cliente2.setRg("RG: 28749274992");
		cliente2.setComprar("Compra: Sim");
		cliente2.setReclama("Reclama: Sim");
		cliente2.setAndar("Anda: Sim");
		cliente2.setNegocia("Negocia: Sim\n");
		
		System.out.println("----- Cliente 1 -----\n");
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		System.out.println(cliente1.getComprar());
		System.out.println(cliente1.getReclama());
		System.out.println(cliente1.getAndar());
		System.out.println(cliente1.getNegocia());
		
		System.out.println("----- Cliente 2 -----\n");
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		System.out.println(cliente1.getComprar());
		System.out.println(cliente1.getReclama());
		System.out.println(cliente1.getAndar());
		System.out.println(cliente1.getNegocia());
		
		
		
		

	}

}
