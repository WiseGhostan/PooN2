/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catolica.n2;

/**
 *
 * @author joao.pneto
 */
public class ProvaUCB extends ProvaUniversidade {
    
    public ProvaUCB(int notaAV1, int notaAV2) {
        super(notaAV1, notaAV2);
    }
    
    public boolean aprovado(){
        return calcularMedia() >= 7;
    }
}
