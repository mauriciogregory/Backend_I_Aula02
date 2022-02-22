import static org.junit.jupiter.api.Assertions.*;

class Test {

    @org.junit.jupiter.api.Test
    public void Calculos() {
        Funcionario func = new Efetivo("Odair", "Olavo", "5555", 2000.0, 100.0, 300.00);
        func.pagamentoSalario();
    }
}
