package model;

public class CartaoCredito {

    private Integer numero;
    private Double saldo = 0.0;
    private Double limite;
    private Double bonus = 0.0;
    private String bandeira;

    public CartaoCredito(Integer numero, Double limite, String bandeira) {
        this.numero = numero;
        this.limite = limite;
        this.bandeira = bandeira;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public Double getBonus() {
        return bonus;
    }

    public String getBandeira() {
        return bandeira;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setBandeira(String bandeira) {
        if (bandeira != null && !bandeira.isEmpty())
            this.bandeira = bandeira.trim();
    }

    public void setLimite(Double limite) {
        if (limite > 0.0)
            this.limite = limite;
    }

    public void addComprar(Double valorCompra) {
        if (valorCompra <= saldo) {
            saldo += valorCompra;
            creditarBonus( (float) (valorCompra * 0.03));
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void addPagar(Double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            creditarBonus( (float) (valor * 0.02));
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    private void creditarBonus(Float valor) {
        bonus += valor;
    }

}
