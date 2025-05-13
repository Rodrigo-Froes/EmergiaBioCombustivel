package com.mycompany.emergia;

import java.util.Scanner;

public class CalculoEmergiaEtanol {
    final private int trasformidadeEtanol = 86200;
    final private float tepMetroCubicoEtanol = (float) 0.509573898;
    final private float tepToJaule = (float) ((float)41.87 * (Math.pow(10, 9)));
    final private float vlEnergeticoEtanol = (float) tepMetroCubicoEtanol * tepToJaule;
    final private float vlEmergiaLitroEtanol = (float) trasformidadeEtanol * vlEnergeticoEtanol / 1000;
    private float litros;
    private float resultEmergiaEtanol;
    
    public void CalculoEmergiaEtanol(float litros){
        this.litros = litros;
        resultEmergiaEtanol = this.litros * vlEmergiaLitroEtanol;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public float getResultEmergiaEtanol() {
        return resultEmergiaEtanol;
    }

    public void setResultEmergiaEtanol(float resultEmergiaEtanol) {
        this.resultEmergiaEtanol = resultEmergiaEtanol;
    }    
}