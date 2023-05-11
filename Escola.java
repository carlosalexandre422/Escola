class SerHumano {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniv(){
        this.setIdade(this.getIdade()+1);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "SerHumano{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
class SerAluno extends SerHumano{
    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatr(){
        System.out.println("Matricula cancelada!");
    }
}

class Professor extends SerHumano{

    private String especialidade;
    private Double salario;

    public void receberAum(Double aum){
        this.setSalario(this.getSalario()+aum);
    }
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}

class Funcionario extends SerHumano{
    private String setor;
    private boolean trabalando;


    public void mudarTrabalho(){
        this.setTrabalando(!this.isTrabalando());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalando() {
        return trabalando;
    }

    public void setTrabalando(boolean trabalando) {
        this.trabalando = trabalando;
    }
}
public class Escola {
    public static void main(String[] args) {
        SerHumano h1 = new SerHumano();
        SerAluno a1 = new SerAluno();
        Professor p1 = new Professor();
        Funcionario f1 = new Funcionario();

        h1.setNome("Zé");
        a1.setNome("jão");
        p1.setNome("Toin");
        f1.setNome("Deca");

        h1.setSexo("masculino");
        System.out.println(h1.toString());
    }
}
