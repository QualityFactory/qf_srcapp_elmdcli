package br.com.qualityfactory.el.elmd.model;

import java.util.List;

import lombok.Data;

@SuppressWarnings("unused")
@Data
public class RuleModel extends ModelDefault {
	private Short id;
	private String code;	
	private String name;
	private List<WordModel> words;
	private List<NounModel> nouns;
	private List<PrepositionModel> prepositions;
	private List<KeyWordModel> keyWords;
}
