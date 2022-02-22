public abstract class Funcionario {
    private String nome, sobrenome, numeroConta;

    public Funcionario(String nome, String sobrenome, String numeroConta){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConta = numeroConta;
    }

    public void pagamentoSalario(){
        double valor;
        valor = calculaSaldo();
        imprimeSaldo(valor);
        depositar(valor);
    }

    public abstract double calculaSaldo();

    public abstract void imprimeSaldo(double quantia);

    public abstract void depositar(double quantia);
}
