package com.mycompany.emergia;

public class User {
    private int codigo;
    private String nome;
    private CalculoEmergiaEtanol[] calcEtanol;
    private CalculoEmergiaBiodisel[] calcBiodisel;
    static int i;
    
    public User(int codigo, String nome){
        this.nome = nome;
        this.codigo = codigo;
    }
    
    public void calculoEtanol(float litros){
        for(i = 0; i <= calcEtanol.length; i++){
            if(calcEtanol[i]==null){
                calcEtanol[i].CalculoEmergiaEtanol(litros);
                break;
            }
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
}
