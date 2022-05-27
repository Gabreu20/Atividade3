/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabriel_lucas.atividade3.classes;

/**
 *
 * @author uplyc
 */
public class Pagamento {
    float valor = 0;
    String formaPgto;
    Boolean pago = false;
    
    public Pagamento(String forma){
        formaPgto = forma;
    }
    public void pagar(){
        pago = true;
    }
    public float getValor(){
        return valor;
    }
    public String getForma(){
        return formaPgto;
    }
    public Boolean getPago(){
        return pago;
    }
    
    public void calculaValor(int nCopias){
        valor = 1.2f * nCopias;
    }
}
