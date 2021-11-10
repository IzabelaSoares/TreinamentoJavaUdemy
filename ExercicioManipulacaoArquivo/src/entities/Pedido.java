package entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Item> items;

    public void adicionarItensAoCarrinho(Item item){
        items.add(item);
    }

}
