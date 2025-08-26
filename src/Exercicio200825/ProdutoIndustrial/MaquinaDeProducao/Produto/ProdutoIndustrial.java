package Exercicio200825.ProdutoIndustrial.MaquinaDeProducao.Produto;
/*Desenvolva uma classe Produto que represente um item fabricado. Deve conter
atributos para código, nome, peso e preço de custo. Crie métodos para calcular o preço
de venda (acréscimo de 30% sobre o custo) e exibir as especificações do produto.*/
public class ProdutoIndustrial {
    private String codigo;
    private String nome;
    private double precoDeCusto;
    private double precoDeVenda;

    public void calcularPrecoDeVenda(){
        precoDeVenda = precoDeCusto * 1.3;
    }

    @Override
    public String toString() {
        return "ProdutoIndustrial{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", precoDeCusto=" + precoDeCusto +
                ", precoDeVenda=" + precoDeVenda +
                '}';
    }
}
