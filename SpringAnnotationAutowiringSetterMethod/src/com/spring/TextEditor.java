package com.spring;
import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	// Spring @Autowired Annotation and @Qualifier Bean autowiring by protperty mode

	@Autowired
	public SpellChecker spellChecker; /// created the reference of another class "SpellChecker"

	public TextEditor() {

		System.out.println(" Construtor from TextEditor ");
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void SpellChk() {

		spellChecker.SpellCheckerMy(); // HAS- A Relationship

	}

}