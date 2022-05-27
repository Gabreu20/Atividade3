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
    String nome;
    int numeroPedido;
    String dataPedido;
    String corImpressao;
    String impressora;
    String dataEntrega;
    String status = "Pendente";
    ItemImpressao item;
    Boolean gratis = false;
    Pagamento pg;
    
    public void EmitirPedido(String n ,String Arq, int copias, String dataP, String cor, String impress, String formaPgmto, Boolean g){
        nome = n;
        Random rand = new Random();
        numeroPedido = rand.nextInt(9999);
        dataPedido = dataP;
        corImpressao = cor;
        impressora = impress;  
       
        gratis = g;
        
        AdicionaItem(Arq, copias);
        Pagamento p = new Pagamento(formaPgmto);
        pg = p; 
        if(!gratis){
            p.calculaValor(copias);  
        }
    }
    public void AdicionaItem(String Arq, int copias){
        ItemImpressao i = new ItemImpressao(Arq, copias);
        item = i;
    }
    public void imprimePedido(){
        status = "Efetuado";
    }
    
    public void pagar(){
        pg.pagar();
        status = "pago";
    }
    
    public String getNome(){
        return nome;
    }
    public Pagamento getPg(){
        return pg;
    }
    public ItemImpressao getItem(){
        return item;
    }
    public String getArq(){
        return item.getArquivo();
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
