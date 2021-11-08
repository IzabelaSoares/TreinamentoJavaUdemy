package entities;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class ProdutoUsado extends Produto {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataFabricacao;

    public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String informarTag() {
        return super.informarTag() + "Data de Fabricação: " + sdf.format(dataFabricacao) + "\n** Usado **";
    }

}
