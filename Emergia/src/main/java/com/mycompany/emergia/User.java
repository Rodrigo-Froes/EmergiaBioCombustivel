/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emergia;

/**
 *
 * @author Tema_
 */
public class User {
    static private int userId;
    private String nome;
    private String senha;
    
    public User(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getSenha(){
        return this.senha;
    }
}
