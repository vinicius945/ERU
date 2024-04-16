package FIAP;

import javax.swing.JOptionPane;

public class USARADIO {

	public static void main(String[] args) {
		RADIO radio1;
		String aux;
		float estacao;
		int volume, escolha;
		try {
			aux = JOptionPane.showInputDialog("Escolha o volume");
			volume = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Escolha a estação");
			estacao = Float.parseFloat(aux);
			
			radio1 = new RADIO(volume, estacao);
			
			JOptionPane.showMessageDialog(null, "Estação: " + radio1.getEstacao()
					+"\nVolume: " + radio1.getVolume());
			
			aux = JOptionPane.showInputDialog("Escolha uma opção: "
					+"\n(1) Aumentar volume"
					+"zn(2) Diminuir volume"
					+ "\n(3) Trocar de estação)");
			escolha = Integer.parseInt(aux);
			
			switch (escolha) {
			case 1:
				radio1.aumentarVolume();
				break;
			case 2:
				radio1.diminuirVolume();
				break;
			case 3:
				aux = JOptionPane.showInputDialog("Escolha nova estação");
				estacao = Float.parseFloat(aux);
				radio1.setEstacao(estacao);
				break;
			default:
				throw new Exception("Opção invádia(1-3");
			}
			
			JOptionPane.showMessageDialog(null, "Estação: " + radio1.getEstacao()
			+"\nVolume: " + radio1.getVolume());
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
