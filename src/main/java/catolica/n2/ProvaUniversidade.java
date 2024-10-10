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
    int notaAV1;
    int notaAV2;
    
    public ProvaUniversidade(int notaAV1, int notaAV2){
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
    }

    public int getNotaAV1() {
        return notaAV1;
    }

    public int getNotaAV2() {
        return notaAV2;
    }
    
    public int calcularMedia(){
        return (this.notaAV1+this.notaAV2)/2;
    }
}
