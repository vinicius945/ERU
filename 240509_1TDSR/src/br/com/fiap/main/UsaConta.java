package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.fiap.com.bean.ContaPouoanca;

public class UsaConta {

	public static void main(String[] args) {
		String aux, escolha = "sim";
		int numConta, opcao;
		float saldo, valor;
		while (escolha.equalsIgnoreCase("Sim")){
			try {
				aux = JOptionPane.showInputDialog("Digite número da conta");
				numConta = Integer.parseInt(aux);
				aux = JOptionPane.showInputDialog("Digite o saldo da conta");
				saldo = Float.parseFloat(aux);
				ContaPouoanca cp = new ContaPouoanca();
				cp.setNumConta(numConta);
				cp.setSaldo(saldo);
				aux = JOptionPane.showInputDialog("Escolha a operação: "
						+ "\n(1) Saque \n(2) Depósito");
				opcao = Integer.parseInt(aux);
				switch (opcao) {
				case 1:
					aux = JOptionPane.showInputDialog("Digite o valor para sacar: ");
					valor = Float.parseFloat(aux);
					JOptionPane.showMessageDialog(null, "Dados da conta:"
							+ "\n N da conta: " + cp.getNumConta()
							+ "\nSaldo Atual: " + cp.sacar(valor));
					break;
				case 2:
					aux = JOptionPane.showInputDialog("Digite o valor para despositar");
					valor = Float.parseFloat(aux);
					JOptionPane.showMessageDialog(null, "Dados da conta:"
							+ "\n N da conta: " + cp.getNumConta()
							+ "\nSaldo Atual: " + cp.depositar(valor));
					break;	
				default:
					throw new Exception("Escolha incorreta");
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			escolha = JOptionPane.showInputDialog("Deseja continuar?");
			
		}
		JOptionPane.showMessageDialog(null, "Fim de programa");
	}

}
