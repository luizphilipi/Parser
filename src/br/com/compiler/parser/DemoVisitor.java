// Generated from Demo.g4 by ANTLR 4.5.1
package br.com.compiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DemoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DemoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DemoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DemoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MainStatement}
	 * labeled alternative in {@link DemoParser#programPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatement(DemoParser.MainStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProgPartFunctionDefinition}
	 * labeled alternative in {@link DemoParser#programPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgPartFunctionDefinition(DemoParser.ProgPartFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DemoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(DemoParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(DemoParser.BranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DemoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(DemoParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(DemoParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(DemoParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(DemoParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DemoParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(DemoParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(DemoParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DemoParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(DemoParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallExpression}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpression(DemoParser.FuncCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(DemoParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(DemoParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(DemoParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(DemoParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(DemoParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DemoParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(DemoParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(DemoParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(DemoParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#parametersDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersDeclaration(DemoParser.ParametersDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(DemoParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(DemoParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(DemoParser.ForStatContext ctx);
}