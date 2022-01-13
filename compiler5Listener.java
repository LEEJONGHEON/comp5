// Generated from compiler5.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiler5Parser}.
 */
public interface compiler5Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(compiler5Parser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(compiler5Parser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(compiler5Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(compiler5Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(compiler5Parser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(compiler5Parser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(compiler5Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(compiler5Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(compiler5Parser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(compiler5Parser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(compiler5Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(compiler5Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#return_}.
	 * @param ctx the parse tree
	 */
	void enterReturn_(compiler5Parser.Return_Context ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#return_}.
	 * @param ctx the parse tree
	 */
	void exitReturn_(compiler5Parser.Return_Context ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#lVal}.
	 * @param ctx the parse tree
	 */
	void enterLVal(compiler5Parser.LValContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#lVal}.
	 * @param ctx the parse tree
	 */
	void exitLVal(compiler5Parser.LValContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(compiler5Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(compiler5Parser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(compiler5Parser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(compiler5Parser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#bType}.
	 * @param ctx the parse tree
	 */
	void enterBType(compiler5Parser.BTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#bType}.
	 * @param ctx the parse tree
	 */
	void exitBType(compiler5Parser.BTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(compiler5Parser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(compiler5Parser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void enterConstInitVal(compiler5Parser.ConstInitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void exitConstInitVal(compiler5Parser.ConstInitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#constExp}.
	 * @param ctx the parse tree
	 */
	void enterConstExp(compiler5Parser.ConstExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#constExp}.
	 * @param ctx the parse tree
	 */
	void exitConstExp(compiler5Parser.ConstExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(compiler5Parser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(compiler5Parser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(compiler5Parser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(compiler5Parser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#initVal}.
	 * @param ctx the parse tree
	 */
	void enterInitVal(compiler5Parser.InitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#initVal}.
	 * @param ctx the parse tree
	 */
	void exitInitVal(compiler5Parser.InitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiler5Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiler5Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(compiler5Parser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(compiler5Parser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(compiler5Parser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(compiler5Parser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(compiler5Parser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(compiler5Parser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(compiler5Parser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(compiler5Parser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(compiler5Parser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(compiler5Parser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncRParams(compiler5Parser.FuncRParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncRParams(compiler5Parser.FuncRParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp(compiler5Parser.PrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp(compiler5Parser.PrimaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(compiler5Parser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(compiler5Parser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(compiler5Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(compiler5Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(compiler5Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(compiler5Parser.IdentContext ctx);
}