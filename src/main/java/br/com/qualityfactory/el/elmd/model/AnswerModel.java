package br.com.qualityfactory.el.elmd.model;

import lombok.Data;

@SuppressWarnings("unused")
@Data
public class AnswerModel extends ModelDefault {
	private Short id;
	private String code;	
	private String val;
}
