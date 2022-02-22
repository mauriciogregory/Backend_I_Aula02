public class Contratado extends Funcionario {
    private double valorHora;
    private int horas;

    public Contratado(String nome, String sobrenome, String numeroConta, double valorHora, int horas) {
        super(nome, sobrenome, numeroConta);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    @Override
    public double calculaSaldo(){
        return valorHora * horas;
    }

    @Override
    public void imprimeSaldo(double valor){
        System.out.println("Gerando recibo do FUNCIONÁRIO CONTRATADO");
    }

    @Override
    public void depositar(double valor){
        System.out.println("Depositado valor de: " + valor);
    }
}
