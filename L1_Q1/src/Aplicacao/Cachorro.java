/* 1. Implementar a classe Cachorro, em Java, de
acordo com o modelo abaixo retirado de
um Diagrama de Classes.
a) Implemente todos os métodos assessores
e modificadores necessários.
b) Implemente ainda um construtor que
receba os valores dos atributos como
parâmetros e os inicialize.
Declarar uma classe Principal que:
a) Instancie o objeto C1 da classe Cachorro
inicializando os atributos conforme
descrição abaixo:
Nome: cachorro sem nome
Raça: nehuma raça definida
Idade: 0
b) Informe os valores dos atributos após
inicializados utilizando os métodos
acessores;
c) Utilizando os seus métodos
modificadores, altere os valores dos seus
atributos;
d) Informe os valores dos atributos após
alteração utilizando o método que retorna
o estado do objeto;
e) Clone o objeto C1 e verifique se os estados
dos dois objetos são iguais de fato;
f) Informe o estado do clone. */

package Aplicacao;

public class Cachorro {
	private String Nome;
	private String Raca;
	private int Idade;
	
	public Cachorro(String Nome, String Raca, int Idade) {
		this.Nome= Nome;
		this.Raca= Raca;
		this.Idade= Idade;
	}
	
	public String informarEstado() {
		return  "Nome: "+Nome+"\n" +
	            "Raça: "+Raca+"\n"+
				"Idade: "+Idade+"\n";
	}
	
	public Cachorro clonarCachorro() {
		Cachorro C2 = new Cachorro (this.Nome, this.Raca, this.Idade);
		return C2 ;
	}
	
	public String getNome() {
		return Nome;
	}

	public String getRaca() {
		return Raca;
	}
	
	public int getIdade() {
		return Idade;
	}
	
	public void setNome(String Nome) {
		this.Nome= Nome;
	}
	
	public void setRaca(String Raca) {
		this.Raca= Raca;
	}
	
	public void setIdade(int Idade) {
		this.Idade= Idade;
	}
	
}










