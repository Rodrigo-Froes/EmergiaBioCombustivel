package com.mycompany.emergia;

public class CalculoEmergiaBiodisel {

    final private int trasformidadeBiodiselBabacu = 36593;
    final private int trasformidadeBiodiselMacauba = 52964;
    final private float vlEnergeticoBiodisel = (float) ((float) 3.7 * (Math.pow(10, 10)));
    final private float vlEmergiaLitroBiodiselB = (float) trasformidadeBiodiselBabacu * vlEnergeticoBiodisel / 1000;
    final private float vlEmergiaLitroBiodiselM = (float) trasformidadeBiodiselMacauba * vlEnergeticoBiodisel / 1000;
    private float litros;
    private float resultEmergiaBiodisel;
    private String tipo;

    public void CalculoEmergiaBiodisel(String tipo, float litros) {
        switch (tipo) {
            case "Babaçu" -> {
                this.tipo = tipo;
                this.litros = litros;
                resultEmergiaBiodisel = this.litros * vlEmergiaLitroBiodiselB;
            }
            case "Macauba" -> {
                this.tipo = tipo;
                this.litros = litros;
                resultEmergiaBiodisel = this.litros * vlEmergiaLitroBiodiselM;
            }
            default -> System.out.println("Opção inválida!");
        }
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public float getResultEmergiaBiodisel() {
        return resultEmergiaBiodisel;
    }

    public void setResultEmergiaBiodisel(float resultEmergiaBiodisel) {
        this.resultEmergiaBiodisel = resultEmergiaBiodisel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
