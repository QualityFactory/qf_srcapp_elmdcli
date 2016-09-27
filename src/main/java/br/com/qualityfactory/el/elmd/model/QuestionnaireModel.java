package br.com.qualityfactory.el.elmd.model;

import lombok.Data;

@SuppressWarnings("unused")
@Data
public class QuestionnaireModel extends ModelDefault {
	private Short id;
	private String code;	
	private QuestionModel question;
	private AnswerModel answer;
}
