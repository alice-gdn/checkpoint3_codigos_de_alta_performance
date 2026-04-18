package Entities;

public class Cliente {
    private String nome;
    private String CPF;
    private String whatsapp;
    private double valorTotalDaUltimaFatura;
    private boolean aptoParaOferta;

    public Cliente(String nome, String CPF, String whatsapp, double valorTotalDaUltimaFatura) {
        this.nome = nome;
        this.CPF = CPF;
        this.whatsapp = whatsapp;
        this.valorTotalDaUltimaFatura = valorTotalDaUltimaFatura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public double getValorTotalDaUltimaFatura() {
        return valorTotalDaUltimaFatura;
    }

    public void setValorTotalDaUltimaFatura(double valorTotalDaUltimaFatura) {
        this.valorTotalDaUltimaFatura = valorTotalDaUltimaFatura;
    }

    public boolean isAptoParaOferta() {
        return aptoParaOferta;
    }

}
