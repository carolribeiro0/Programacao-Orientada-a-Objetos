package Visao;
import Aplicacao.Cachorro;

public class Principal {

	public static void main(String[] args) {
		
	/*a) Instancie o objeto C1 da classe Cachorro inicializando os atributos conforme descrição 
	 * abaixo:
		Nome: cachorro sem nome
		Raça: nehuma raça definida
		Idade: 0*/
		
		Cachorro C1 = new Cachorro ("cachorro sem nome", "nenhuma raça definida",0);
		
		
		/*b) Informe os valores dos atributos após inicializados utilizando os métodos
		acessores;*/
		
		System.out.println("Cachorro 1: "+"\n");
		System.out.println("Nome: "+C1.getNome());
		System.out.println("Raça: "+C1.getRaca());
		System.out.println("Idade: "+C1.getIdade()+"\n");
		
		
		/*c) Utilizando os seus métodos modificadores, altere os valores dos seus atributos;*/
		
		C1.setNome("Bolinha");
		C1.setRaca("Golden");
		C1.setIdade(5);
		
		
		/*d) Informe os valores dos atributos após alteração utilizando o método que retorna
		o estado do objeto;*/
		
		String estado = C1.informarEstado();
		System.out.println("Cachorro 1 modificado: "+"\n");
		System.out.println(estado);
		
		
		//e) Clone o objeto C1 e verifique se os estados dos dois objetos são iguais de fato;
		
		Cachorro C2 = C1.clonarCachorro();
		
		
		//f) Informe o estado do clone. 
		String estado2 = C2.informarEstado();
		System.out.println("Estado clone: "+"\n");
		System.out.println(estado2);
		

	}

}
