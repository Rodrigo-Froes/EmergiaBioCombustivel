package com.mycompany.emergia;

public class CalculoEmergia {
    final private float emergia = 25;
    private float[] resultado;
    static int indice = 0;
    
    public float calcular(float num){
        for(indice = 0;indice < 1000000000; indice ++){
            if(resultado[indice]==0){
                resultado[indice] = emergia * num;
                break;
            }
        }
        return resultado[indice];
    }
    
    public void mostrarResultado(){
        for(indice = 0; indice < resultado.length; indice ++){
            System.out.println(indice+"º resultado: "+resultado[indice]);
        }
    }
}