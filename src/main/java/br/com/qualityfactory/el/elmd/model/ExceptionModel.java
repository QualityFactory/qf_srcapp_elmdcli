package br.com.qualityfactory.el.elmd.model;

import lombok.Data;

@SuppressWarnings("unused")
@Data
public class ExceptionModel extends ModelDefault {
	private Short id;
	private String code;
	private String name;
	private String val;
}
