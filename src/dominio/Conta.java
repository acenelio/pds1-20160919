package dominio;

import java.math.BigDecimal;

import aplicacao.ServicoException;

public class Conta {

	private BigDecimal saldo;

	public Conta(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public void debitar(BigDecimal valor) throws ServicoException {
		if (valor.doubleValue() > saldo.doubleValue()) {
			throw new ServicoException("Saldo insuficiente para débito. Operação cancelada");
		}
		saldo = saldo.subtract(valor);
	}
}
