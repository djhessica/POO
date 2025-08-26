package Exercicio200825.ProdutoIndustrial.MaquinaDeProducao.EstoqueDeMateriaPrima;
/*Desenvolva uma classe MateriaPrima com atributos para nome, quantidade em
estoque e fornecedor. Crie métodos para adicionar ao estoque, retirar do estoque e
verificar se precisa repor (quantidade abaixo de 100 unidades). */
public class EstoqueDeMateria_prima {
    private String nome;
    private int quantidadeEmEstoque;
    private  String fornecedor;

    public void adicionarEstoque (int quantidade){
        quantidadeEmEstoque += quantidade;
    }
    public void retirarEstoque(int quantidade){
        quantidadeEmEstoque -= quantidade;
    }
    public void verificarReposicaoEstoque(){
        if (quantidadeEmEstoque < 100){
            System.out.println("materia com estoque baixo.");
        }
    }
}

