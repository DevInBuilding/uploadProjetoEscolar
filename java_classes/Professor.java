package pacote.projeto.escolar;

public class Professor extends Pessoa {
	private String area_atuacao;
	private float valor_hora_trabalhada;
	private int qtde_horas_disciplina;
	private int mes_atual;
	private int mes_nascimento;
	
	//Getters e setters
	public String getArea_atuacao() {
		return area_atuacao;
	}
	public void setArea_atuacao(String area_atuacao) {
		this.area_atuacao = area_atuacao;
	}
        
	public float getValor_hora_trabalhada() {
		return valor_hora_trabalhada;
	}
	public void setValor_hora_trabalhada(float valor_hora_trabalhada) {
		this.valor_hora_trabalhada = valor_hora_trabalhada;
	}
	
        public int getQtde_horas_disciplina() {
		return qtde_horas_disciplina;
	}
	public void setQtde_horas_disciplina(int qtde_horas_disciplina) {
		this.qtde_horas_disciplina = qtde_horas_disciplina;
	}
	
        public int getMes_atual() {
		return mes_atual;
	}
	public void setMes_atual(int mes_atual) {
		this.mes_atual = mes_atual;
	}
	
        public int getMes_nascimento() {
		return mes_nascimento;
	}
	public void setMes_nascimento(int mes_nascimento) {
		this.mes_nascimento = mes_nascimento;
	}
	
	
	//Métodos
	public float calcularSalario() {
		return (this.valor_hora_trabalhada * this.qtde_horas_disciplina);
	}
	
	public float calcularBonus() {
		if(this.mes_atual == this.mes_nascimento) {
			return ((this.valor_hora_trabalhada * this.qtde_horas_disciplina) * 1.25f); //Acréscimo de 25% no salário do professor
		} else {
                        return this.calcularSalario();
		}
	}
	
	public void exibirDadosProfessor() {
		System.out.println("---DADOS DO(A) PROFESSOR(A)---");
		System.out.println("Nome: " + this.getNome());
		System.out.println("E-mail: " + this.getEmail());
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Área de atuação: " + this.getArea_atuacao());
		System.out.println("Valor da hora trabalhada: $ " + this.getValor_hora_trabalhada());
		System.out.println("Quantidade de horas trabalhada: " + this.getQtde_horas_disciplina());
		System.out.println("Salário: $ " + this.calcularSalario());
		System.out.println("Salário com bonificação: $ " + this.calcularBonus());
	}
	
}
