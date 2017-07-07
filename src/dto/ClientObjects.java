package dto;



public class ClientObjects {
	
	public Integer getNum_control() {
		return num_control;
	}
	public void setNum_control(Integer num_control) {
		this.num_control = num_control;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Integer getQuant() {
		return quant;
	}
	public void setQuant(Integer quant) {
		this.quant = quant;
	}
	public Integer getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(String string, Integer cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	private Integer num_control;
	private String data;
	private String Nome;
	private Float valor;
	private Integer quant;
	private Integer cod_cliente;
}
