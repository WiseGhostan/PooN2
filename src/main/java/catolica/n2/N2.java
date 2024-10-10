/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package catolica.n2;

/**
 *
 * @author joao.pneto
 */
public class N2 {

    public static void main(String[] args) {
        ProvaUCB UCB1 =  new ProvaUCB(7, 7);
        ProvaFafifo Fafifo1 = new ProvaFafifo(5, 6);
        
        System.out.println("Aprovado Fafifo? " + (Fafifo1.aprovado()?"Aprovado":"Reprovado"));
        System.err.println("Aprovado UCB? " + (UCB1.aprovado()?"Aprovado":"Reprovado"));
    }
}
