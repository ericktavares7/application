package exerciciosPoli;

public class ProdutoImportado extends Produto {
  private int tipo;
public ProdutoImportado(String nome, double preco, int tipo) {
		super(nome, preco);
		this.tipo = tipo;
	}
	//metodos get e set
  public int getTipo() {
	  return tipo;
  }
  public void setTipo(int tipo) {
	  this.tipo = tipo;  
   }
  @Override
  public double calcularImposto() {
	  double imposto = 0;
	  switch (tipo) {
	  case 1:
		  imposto = getPreco() * 0.35;
		  break;
	  case 2:
		  imposto = getPreco() * 0.15;
		  break;
	  case 3:
		  imposto = getPreco() * 0.20;
		  break;
	  }
      return imposto;
		 }
  @Override 
  public void exibirRelatorio() {
	  super.exibirRelatorio();
	  System.out.println("Tipo:" + tipo);
  }
  
  }
