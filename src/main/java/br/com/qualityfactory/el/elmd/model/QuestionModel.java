package br.com.qualityfactory.el.elmd.model;

import lombok.Data;

@SuppressWarnings("unused")
@Data
public class QuestionModel extends ModelDefault {
	private Short id;
	private String code;	
	private String val;
}
