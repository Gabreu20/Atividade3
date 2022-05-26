/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabriel_lucas.atividade3.classes;

/**
 *
 * @author ice
 */
public class ItemImpressao {
    String arquivo;
    int numCopias;
    
    public ItemImpressao(String arq, int nC){
        arquivo = arq;
        numCopias = nC;
    }
    public String getArquivo(){
        return arquivo;
    }
    public int getCopias(){
        return numCopias;
    }
}
