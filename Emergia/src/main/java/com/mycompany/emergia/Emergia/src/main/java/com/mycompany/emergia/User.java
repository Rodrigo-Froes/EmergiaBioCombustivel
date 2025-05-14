package com.mycompany.emergia;

public class User {

    private int codigo;
    private String nome;
    private String senha;
    private CalculoEmergiaEtanol[] calcEtanol;
    private CalculoEmergiaBiodisel[] calcBiodisel;
    static int i;

    public User(int codigo, String nome, String senha) {
        this.nome = nome;
        this.codigo = codigo;
        this.senha = senha;
    }

    public void calculoEtanol(float litros) {
        for (i = 0; i <= calcEtanol.length; i++) {
            if (calcEtanol[i] == null) {
                calcEtanol[i].CalculoEmergiaEtanol(litros);
                break;
            }
        }
    }

    public void calculoBiodisel(String tipo, float litros) {
        for (i = 0; i <= calcBiodisel.length; i++) {
            if (calcBiodisel[i] == null) {
                calcBiodisel[i].CalculoEmergiaBiodisel(tipo, litros);
                break;
            }
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public CalculoEmergiaEtanol[] getCalcEtanol() {
        return calcEtanol;
    }

    public CalculoEmergiaBiodisel[] getCalcBiodisel() {
        return calcBiodisel;
    }
}
