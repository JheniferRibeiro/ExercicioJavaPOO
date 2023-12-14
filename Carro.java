package ExPOO;

import java.time.LocalDate;

public class Carro {

    private String modelo;
    private String ano;
    private String cor;
    private boolean ligado;

    public Carro(String modelo, String ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.ligado = false;
    }

    public void ligarCarro() {
        if (!ligado) {
            ligado = true;
            System.out.println("O Carro foi ligado.");
        } else {
            System.out.println("O Carro já está ligado");
        }
    }

    public void desligarCarro() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }
}