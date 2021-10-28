package pacote.projeto.escolar;

public class Aluno extends Pessoa {
	private float nota1;
	private float nota2;
	private float media;
	private float exame_final;
	private float media_final;
	private String disciplina;
	
	//Getters e setters
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	public float getMedia() {
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}
	
	public float getMedia_final() {
		return media_final;
	}
	public void setMedia_final(float media_final) {
		this.media_final = media_final;
	}
	
	public float getExame_final() {
		return exame_final;
	}
	public void setExame_final(float exame_final) {
		this.exame_final = exame_final;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
	//Métodos
	public float calcularMedia() {
		this.media = (this.nota1 + this.nota2) / 2;
		if(this.media >= 7 || this.media < 4) {
			this.media_final = this.media;
                        return this.media;
		} else {
                    return this.media;
                }
	}
        
        public float calcularMediaFinal(){
                if(this.media >= 4 && this.media < 7){
                    this.media_final = (this.media + this.exame_final)/2;
                }
                return this.media_final;
        }
	
	public String verificarSituacao() {
		if(this.getMedia() >= 7) {
			return "Aprovado(a)";
		} else if(this.getMedia() >= 4 && this.getMedia() < 7) {
			if(this.getMedia_final() >= 6) {
				return "Aprovado(a) Após Exame Final";
			} else {
				return "Reprovado(a)";
			}
		} else {
			return "Reprovado(a)";
		}
	}
	
	public void exibirHistorico() {
		System.out.println("---DADOS DO(A) ALUNO(A)---");
		System.out.println("Nome: " + this.getNome());
		System.out.println("E-mail: " + this.getEmail());
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Nota 1: " + this.getNota1());
		System.out.println("Nota 2: " + this.getNota2());
		System.out.println("Média: " + calcularMedia());
		if(this.getMedia() >= 4 && this.getMedia() < 7) { 
			System.out.println("Exame final: " + this.getExame_final());
		}
		System.out.println("Média final: " + this.calcularMediaFinal());
		System.out.println("Situação: " + this.verificarSituacao());
	}
	
}
