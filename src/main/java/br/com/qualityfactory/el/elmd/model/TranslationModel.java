package br.com.qualityfactory.el.elmd.model;

import java.util.List;

import lombok.Data;

@SuppressWarnings("unused")
@Data
public class TranslationModel extends ModelDefault {
	private Short id;
	private String code;
	private String val;
	private GenderModel genderModel;
	private List<WordModel> words;
	private List<VerbModel> verbs;
	private List<KeyWordModel> keyWords;
	private List<NounModel> nouns;
	private List<PrepositionModel> prepositions;
	private List<NumberModel> numbers;
	private List<AdjectiveModel> adjectives;
	private List<PronounModel> pronouns;
}
