/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabriel_lucas.atividade3.classes;
import java.util.Random;
/**
 *
 * @author ice
 */
public class PedidoImpressao {
    int numeroPedido;
    String dataPedido;
    String corImpressao;
    String impressora;
    String dataEntrega;
    String status = "nao efetuado";
    ItemImpressao item;
    
    public void EmitirPedido(String Arq, int copias, String dataP, String cor, String impress){
        Random rand = new Random();
        numeroPedido = rand.nextInt(999);
        dataPedido = dataP;
        corImpressao = cor;
        impressora = impress;  
        
        AdicionaItem(Arq, copias);
    }
    public void AdicionaItem(String Arq, int copias){
        ItemImpressao i = new ItemImpressao(Arq, copias);
        item = i;
    }
    
    public int getNumPedido(){
        return numeroPedido;
    }
    public String getDataPedido(){
        return dataPedido;
    }
    public String getColorido(){
        return corImpressao;
    }
    public String getStatus(){
        return status;
    }
}
