package br.fiap.com.bean;
/**
 * Classe para objetos do tipo ContaPoupanca
 * @author Fulano da Silva
 * @version 1.0
 */
public class ContaPouoanca implements ContaBancaria {
	//atributos
	private int numConta;
	private float saldo;
	// construtor
	public ContaPouoanca() {}
	//getter e stters
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	//métodos da classe
	/**
	 *  Método sacar que permite sacar o valor informado.
	 *  Valor a ser sacado não pode ser superior ao valor do saldo.
	 *  @author Fulano da Silva
	 *  @param float valor - valor indicado a ser sacado.
	 *  @return float - valor do saldo (atualizado)
	 */
	public float sacar(float valor) {
		try {
			if (valor <= saldo) {
				saldo -= valor;
			}
			else {
				throw new Exception("Saldo Insuficiente");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return saldo;
	}
	/**
	 * Método depositar que permite depositar o valor informado.
	 * @author Fulano da Silva
	 * @param float valor - valor indicado para ser depositado.
	 * @return float - valor do saldo (atualizado)
	 */
	public float depositar (float valor) {
		saldo += valor;
		return saldo;	
	}
}
