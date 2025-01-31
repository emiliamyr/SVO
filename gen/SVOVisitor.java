// Generated from C:/Users/emili/PycharmProjects/pythonProject19/SVO.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SVOParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SVOVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SVOParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SVOParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(SVOParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#nounPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNounPhrase(SVOParser.NounPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#nounPhrasePlural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNounPhrasePlural(SVOParser.NounPhrasePluralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#nounPhraseI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNounPhraseI(SVOParser.NounPhraseIContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#prepositionalPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepositionalPhrase(SVOParser.PrepositionalPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#verbPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbPhrase(SVOParser.VerbPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#verbPhrasePlural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbPhrasePlural(SVOParser.VerbPhrasePluralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#verbPhraseI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbPhraseI(SVOParser.VerbPhraseIContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#tense}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTense(SVOParser.TenseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#tensePlural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTensePlural(SVOParser.TensePluralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#tenseI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTenseI(SVOParser.TenseIContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#past}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPast(SVOParser.PastContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#present}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresent(SVOParser.PresentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#future}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuture(SVOParser.FutureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#pastPlural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPastPlural(SVOParser.PastPluralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#presentPlural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresentPlural(SVOParser.PresentPluralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SVOParser#presentI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresentI(SVOParser.PresentIContext ctx);
}