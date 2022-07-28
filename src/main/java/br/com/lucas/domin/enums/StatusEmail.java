package br.com.lucas.domin.enums;

public enum StatusEmail {
    
 

	ENVIADO(1, "enviado"),

	PENDENTE(2, "pendente");
   
     
    private int codigo;
	private String descricao;

	private StatusEmail(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static StatusEmail toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		for (StatusEmail o : StatusEmail.values()) {
			if (codigo.equals(o.getCodigo())) {
				return o;
			}
		}

		throw new IllegalArgumentException("Tipo inválido: " + codigo);
	}

}
