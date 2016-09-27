package br.com.qualityfactory.el.elmd.model;

import java.util.List;

import lombok.Data;

/**
 * Model para a tabela Verb
 * @author Eduardo Dicarte
 *
 */
@SuppressWarnings("unused")
@Data
public class VerbModel extends ModelDefault {
	private Short id;
	private String code;	
	private String val;
	private List<RuleModel> rules;
	private TranslationModel translation;
}
