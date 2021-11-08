package entities;

import Enumerations.EProcessamentoPedido;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private EProcessamentoPedido processamentoPedido;
    private Date momento;
    private List<ItemPedido> itens = new ArrayList<>();

    private static final SimpleDateFormat conversorData = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    public Pedido(Cliente cliente, EProcessamentoPedido processamentoPedido) {
        this.cliente = cliente;
        this.processamentoPedido = processamentoPedido;
        this.momento = Date.valueOf(LocalDateTime.now().toLocalDate());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Registro de Compra\n");
        sb.append("Data e Hora de Compra: " + conversorData.format(momento) + "\n");
        sb.append("Status da Compra: " + processamentoPedido);
        sb.append("Cliente: " + cliente);
        sb.append("Itens Comprados\n");
        sb.append(listarItens());
        sb.append("Total: " + String.format("%.2f", calcularTotal()));
        return sb.toString();
    }

    public String listarItens(){
        String teste = "";
        for(var i: itens){
            teste += i.toString() + "\n";
        }
        return teste;
    }

    public Double calcularTotal(){
        Double total = 0.0;
        for(var i : itens){
            total += i.subTotal();
        }
        return total;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItem(ItemPedido itemPedido){
        itens.add(itemPedido);
    }

    public  void RemoverItem(ItemPedido itemPedido){
        itens.remove(itemPedido);
    }

    public EProcessamentoPedido getProcessamentoPedido() {
        return processamentoPedido;
    }

    public void setProcessamentoPedido(EProcessamentoPedido processamentoPedido) {
        this.processamentoPedido = processamentoPedido;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }
}
