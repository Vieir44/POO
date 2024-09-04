package exerciciospoo;

public class Pc2 {

	public static void main(String[] args) {

		Pc pc1 = new Pc();

		pc1.setModelo("Modelo: Asus nuc  ");
		pc1.setTipo("Tipo: PC Gamer");
		pc1.setEmpresa("Empresa: Asus");
		pc1.setCor("Cor: Preta");
		pc1.setLiga("Liga: Sim");
		pc1.setDesliga("Desliga: Sim");
		pc1.setLed("Tem led: Sim");
		pc1.setAplicativos("Possui App's: Sim");


		System.out.println(pc1.getModelo());
		System.out.println(pc1.getTipo());
		System.out.println(pc1.getEmpresa());
		System.out.println(pc1.getCor());
		System.out.println(pc1.getLiga());
		System.out.println(pc1.getDesliga());
		System.out.println(pc1.getLed());
		System.out.println(pc1.getAplicativos());

	}

}
