package exerciciosPoli;

public class  Application {

	public static void main(String[] args) {
		ListaProdutos lista = new ListaProdutos();
		
 Produto p1 = new Produto("Camiseta", 50.0);
 Produto p2 = new Produto("Celular",5000.0);
 lista.insereProduto(p1);
 lista.insereProduto(p2);
 
 ProdutoImportado p3 = new ProdutoImportado("Arroz",30.0,2);
 ProdutoImportado p4 = new ProdutoImportado ("Computador", 1200.0, 1);
 lista.insereProduto(p3);
 lista.insereProduto(p4);
 
 lista.imprimirProdutos();
		

	}

}
