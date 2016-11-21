// Generated from C:/Users/Hamza/github/Antlr Json Parser/src/main/java/com/example/antlr\Json.g4 by ANTLR 4.5.3
package com.example.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonParser}.
 */
public interface JsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JsonParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JsonParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JsonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JsonParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void enterKeyvalue(JsonParser.KeyvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void exitKeyvalue(JsonParser.KeyvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JsonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JsonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JsonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JsonParser.ValueContext ctx);
}