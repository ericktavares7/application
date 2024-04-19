package exerciciosPoli;

public class Produto {
	
private String nome;
private double preco;
  
    public Produto(String nome, double preco) {
    	this.nome = nome;
    	this.preco = preco;
    	
    }
    public String getNome() {
	return nome;
}
   public void setNome(String nome) {
	   this.nome = nome;
	   
   }
   public double getPreco() {
	   return preco;
	   
   }
   public void setPreco(double preco) {
	   this.preco = preco;
	   
   }
   //calculo dos impostos
   
   public double calcularImposto() {
	   if (preco < 100.0) {
		   return preco * 0.05;
	   }
	   else {
		   return preco * 0.10;
	   }
   }
	   // exibir o relatorio
	   public void exibirRelatorio() {
		   System.out.println("Nome do produto: " + nome);
		   System.out.println("Preço: R$" + calcularImposto());
	   }
   }

