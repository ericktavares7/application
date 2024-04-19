package exerciciosPoli;

class ListaProdutos{
private Produto[] produtos;
private int tamanhoAtual;

public ListaProdutos() {
	produtos = new Produto[10];
	tamanhoAtual = 0;
	
}
public void insereProduto(Produto p) {
	if (tamanhoAtual < 10) {
		produtos[tamanhoAtual] = p;
		tamanhoAtual++;
	}
	else {
		System.out.println("Lista cheia, não é possivel adicionar mais produtos.");
		
	}
}
public void imprimirProdutos() {
	System.out.println("Produtos Nacionais: ");
	for (Produto p: produtos) {
		if (p instanceof Produto && !(p instanceof ProdutoImportado)) {
			p.exibirRelatorio();
		}
	}
	System.out.println("Produtos Importados: ");
	for (Produto p : produtos) {
		if (p instanceof ProdutoImportado) {
			p.exibirRelatorio();
			
      }
	 }
   }
  }

