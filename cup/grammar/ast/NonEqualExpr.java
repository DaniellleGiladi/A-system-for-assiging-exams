package cup.grammar.ast;

public class NonEqualExpr extends Expr {
	private Expr left;
	private Expr right;

	public NonEqualExpr(Expr aleft, Expr aright) {
		left = aleft;
		right = aright;
	}

	@Override
	public Integer eval(Environment anEnvironment) {
		return left.eval(anEnvironment) != right.eval(anEnvironment) ? 1 : 0;
	}

}
