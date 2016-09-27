package br.com.qualityfactory.el.elmd.model;

/**
 * Representa a entidade no banco de dados com os métodos genéricos para persistência 
 * @author Eduardo
 *
 */
abstract class ModelDefault implements Model {
	
	private Short id;
	private String code;

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
