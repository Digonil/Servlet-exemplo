package br.com.fiapon.model;

public class ClienteModel {

	private Integer idCliente;
	private String nomeCliente;
	private String emailCliente;

	public ClienteModel() {

	}

	public ClienteModel(Integer idCliente, String nomeCliente, String emailCliente) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	@Override
	public String toString() {
		return "ClienteModel [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", emailCliente="
				+ emailCliente + "]";
	}

}
