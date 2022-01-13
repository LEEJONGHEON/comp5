// Generated from compiler5.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiler5Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiler5Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(compiler5Parser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(compiler5Parser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(compiler5Parser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(compiler5Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(compiler5Parser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(compiler5Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#return_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_(compiler5Parser.Return_Context ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#lVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLVal(compiler5Parser.LValContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(compiler5Parser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(compiler5Parser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#bType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBType(compiler5Parser.BTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#constDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef(compiler5Parser.ConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#constInitVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInitVal(compiler5Parser.ConstInitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#constExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExp(compiler5Parser.ConstExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(compiler5Parser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(compiler5Parser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#initVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVal(compiler5Parser.InitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compiler5Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(compiler5Parser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#addSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(compiler5Parser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#mulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(compiler5Parser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#mulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(compiler5Parser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(compiler5Parser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#funcRParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncRParams(compiler5Parser.FuncRParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExp(compiler5Parser.PrimaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(compiler5Parser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(compiler5Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler5Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(compiler5Parser.IdentContext ctx);
}