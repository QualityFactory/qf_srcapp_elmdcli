package br.com.qualityfactory.el.elmd.model;

import java.util.List;

import lombok.Data;

@SuppressWarnings("unused")
@Data
public class WordModel extends ModelDefault {
	private Short id;
	private String code;	
	private String val;
	private List<RuleModel> rules;
	private TranslationModel translation;
}
