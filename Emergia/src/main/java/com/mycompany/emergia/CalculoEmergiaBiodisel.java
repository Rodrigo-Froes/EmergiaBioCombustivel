package com.mycompany.emergia;

public class CalculoEmergiaBiodisel {

    final private int trasformidadeBiodiselBabacu = 36593;
    final private int trasformidadeBiodiselMacauba = 52964;
    final private float vlEnergeticoBiodisel = (float) ((float) 3.7 * (Math.pow(10, 10)));
    final private float vlEmergiaLitroBiodiselB = (float) trasformidadeBiodiselBabacu * vlEnergeticoBiodisel / 1000;
    final private float vlEmergiaLitroBiodiselM = (float) trasformidadeBiodiselMacauba * vlEnergeticoBiodisel / 1000;
    private float litros;
    private float resultEmergiaBiodisel;

    public void CalculoEmergiaBiodisel(String tipo, float litros) {
        if (tipo == "Babaçu") {
            this.litros = litros;
            resultEmergiaBiodisel = this.litros * vlEmergiaLitroBiodiselB;
        }
        if (tipo == "Macauba") {
            this.litros = litros;
            resultEmergiaBiodisel = this.litros * vlEmergiaLitroBiodiselM;
        }
    }

    public void calcEmergiaBiodiselBabacu(float litros) {
        this.litros = litros;
        resultEmergiaBiodisel = this.litros * vlEmergiaLitroBiodiselB;
    }

    public void calcEmergiaBiodiselMacauba(float litros) {
        this.litros = litros;
        resultEmergiaBiodisel = this.litros * vlEmergiaLitroBiodiselM;
    }
}
