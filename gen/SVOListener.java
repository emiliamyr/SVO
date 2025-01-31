// Generated from C:/Users/emili/PycharmProjects/pythonProject19/SVO.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SVOParser}.
 */
public interface SVOListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SVOParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SVOParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SVOParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(SVOParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(SVOParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#nounPhrase}.
	 * @param ctx the parse tree
	 */
	void enterNounPhrase(SVOParser.NounPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#nounPhrase}.
	 * @param ctx the parse tree
	 */
	void exitNounPhrase(SVOParser.NounPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#nounPhrasePlural}.
	 * @param ctx the parse tree
	 */
	void enterNounPhrasePlural(SVOParser.NounPhrasePluralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#nounPhrasePlural}.
	 * @param ctx the parse tree
	 */
	void exitNounPhrasePlural(SVOParser.NounPhrasePluralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#nounPhraseI}.
	 * @param ctx the parse tree
	 */
	void enterNounPhraseI(SVOParser.NounPhraseIContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#nounPhraseI}.
	 * @param ctx the parse tree
	 */
	void exitNounPhraseI(SVOParser.NounPhraseIContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#prepositionalPhrase}.
	 * @param ctx the parse tree
	 */
	void enterPrepositionalPhrase(SVOParser.PrepositionalPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#prepositionalPhrase}.
	 * @param ctx the parse tree
	 */
	void exitPrepositionalPhrase(SVOParser.PrepositionalPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#verbPhrase}.
	 * @param ctx the parse tree
	 */
	void enterVerbPhrase(SVOParser.VerbPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#verbPhrase}.
	 * @param ctx the parse tree
	 */
	void exitVerbPhrase(SVOParser.VerbPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#verbPhrasePlural}.
	 * @param ctx the parse tree
	 */
	void enterVerbPhrasePlural(SVOParser.VerbPhrasePluralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#verbPhrasePlural}.
	 * @param ctx the parse tree
	 */
	void exitVerbPhrasePlural(SVOParser.VerbPhrasePluralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#verbPhraseI}.
	 * @param ctx the parse tree
	 */
	void enterVerbPhraseI(SVOParser.VerbPhraseIContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#verbPhraseI}.
	 * @param ctx the parse tree
	 */
	void exitVerbPhraseI(SVOParser.VerbPhraseIContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#tense}.
	 * @param ctx the parse tree
	 */
	void enterTense(SVOParser.TenseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#tense}.
	 * @param ctx the parse tree
	 */
	void exitTense(SVOParser.TenseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#tensePlural}.
	 * @param ctx the parse tree
	 */
	void enterTensePlural(SVOParser.TensePluralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#tensePlural}.
	 * @param ctx the parse tree
	 */
	void exitTensePlural(SVOParser.TensePluralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#tenseI}.
	 * @param ctx the parse tree
	 */
	void enterTenseI(SVOParser.TenseIContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#tenseI}.
	 * @param ctx the parse tree
	 */
	void exitTenseI(SVOParser.TenseIContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#past}.
	 * @param ctx the parse tree
	 */
	void enterPast(SVOParser.PastContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#past}.
	 * @param ctx the parse tree
	 */
	void exitPast(SVOParser.PastContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#present}.
	 * @param ctx the parse tree
	 */
	void enterPresent(SVOParser.PresentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#present}.
	 * @param ctx the parse tree
	 */
	void exitPresent(SVOParser.PresentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#future}.
	 * @param ctx the parse tree
	 */
	void enterFuture(SVOParser.FutureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#future}.
	 * @param ctx the parse tree
	 */
	void exitFuture(SVOParser.FutureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#pastPlural}.
	 * @param ctx the parse tree
	 */
	void enterPastPlural(SVOParser.PastPluralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#pastPlural}.
	 * @param ctx the parse tree
	 */
	void exitPastPlural(SVOParser.PastPluralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#presentPlural}.
	 * @param ctx the parse tree
	 */
	void enterPresentPlural(SVOParser.PresentPluralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#presentPlural}.
	 * @param ctx the parse tree
	 */
	void exitPresentPlural(SVOParser.PresentPluralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVOParser#presentI}.
	 * @param ctx the parse tree
	 */
	void enterPresentI(SVOParser.PresentIContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVOParser#presentI}.
	 * @param ctx the parse tree
	 */
	void exitPresentI(SVOParser.PresentIContext ctx);
}