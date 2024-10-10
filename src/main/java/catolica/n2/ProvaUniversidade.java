/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catolica.n2;

/**
 *
 * @author joao.pneto
 */
public class ProvaUniversidade {
    float notaAV1;
    float notaAV2;
    
    public ProvaUniversidade(float notaAV1, float notaAV2){
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
    }

    public float getNotaAV1() {
        return notaAV1;
    }

    public float getNotaAV2() {
        return notaAV2;
    }
    
    public float calcularMedia(){
        return (notaAV1+notaAV2)/2;
    }
}
