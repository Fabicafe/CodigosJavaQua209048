package entities;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numeroConta, int agencia, double saldo, Cliente titular) {
		super(numeroConta, agencia, saldo, titular);
	}	
		public ContaCorrente() {
	}
	
		@Override
		public boolean Sacar(double valor) {
			if(valor <= this.saldo) {
				this.saldo -= valor;
				return true;
			}
			else {
				return false;	
		
}
		}
		}