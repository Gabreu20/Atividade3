/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabriel_lucas.atividade3.classes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
abstract class Usuario {
    public String nome;
    public int idade;
    public String sexo;
    public String dataNascimento;
    public List<PedidoImpressao> pedidos = new ArrayList();
}
