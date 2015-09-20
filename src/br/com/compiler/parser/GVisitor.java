// Generated from G.g4 by ANTLR 4.5.1
package br.com.compiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#classList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassList(GParser.ClassListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(GParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(GParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(GParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(GParser.BranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#loopWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopWhile(GParser.LoopWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#branchSwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranchSwitch(GParser.BranchSwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases(GParser.CasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#caseSwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseSwitch(GParser.CaseSwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#loopFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopFor(GParser.LoopForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link GParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(GParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link GParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(GParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link GParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(GParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link GParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link GParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(GParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link GParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallExpression}
	 * labeled alternative in {@link GParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpression(GParser.FuncCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link GParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(GParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(GParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(GParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(GParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(GParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(GParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(GParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(GParser.PrimitiveTypeContext ctx);
}