public class Efetivo extends Funcionario{
    private double salarioBase;
    private double descontos;
    private double beneficios;

    public Efetivo(String nome, String sobrenome, String numeroConta, double salarioBase, double descontos, double beneficios) {
        super(nome, sobrenome, numeroConta);
        this.salarioBase = salarioBase;
        this.descontos = descontos;
        this.beneficios = beneficios;
    }

    @Override
    public double calculaSaldo() {
        return salarioBase + beneficios - descontos;
    }

    @Override
    public void imprimeSaldo(double valor){
        System.out.println("Gerado recibo - Funcionário EFETIVO: ");
    }

    @Override
    public void depositar(double valor){
        System.out.println("Depositado o valor: " + valor);
    }
}
