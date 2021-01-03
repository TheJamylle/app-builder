

import com.jamylle.app_builder.Produto;
import com.jamylle.app_builder.ProdutoBuilder;
import com.jamylle.app_builder.Vendedor;
import java.time.LocalDate;

/**
 *
 * @author Jamylle
 */
public class Principal {
    
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setId(0);
        v.setNome("Maria dos Santos");
        
        Produto produto = new ProdutoBuilder()
                .id(0)
                .titulo("Notebook DELL")
                .descricao("Processador i5-8265U, 8GB RAM, 512GB SSD")
                .marca("DELL")
                .preco(3500.00)
                .dataCadastro(LocalDate.of(2021, 2, 2))
                .dataUltimaAtualizacao(LocalDate.of(2021, 2, 2))
                .vendedor(v)
                .categoria("Eletônicos")
                .urlFoto("")
                .modelo("")
                .peso(1.5)
                .altura(0)
                .largura(0)
                .profundidade(0)
                .estoque(1)
                .build();
        
        System.out.println(produto.toString());
    }
}
