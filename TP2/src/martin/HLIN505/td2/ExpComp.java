package martin.HLIN505.td2;

import java.util.Objects;

public class ExpComp {
	
	private ExpComp op1;
	private ExpComp op2;
	
	private Operateur op;
	
	public ExpComp() {}
	
	public ExpComp(ExpComp c1, Operateur o, ExpComp c2) {
		op1 = c1;
		op2 = c2;
		op = o;
	}
	
	public int eval() { 
		int ret = 0 ;
		
		switch (op.getLabel()) {
		case "+":
			ret = op1.eval() + op2.eval() ;
			break;
			
		case "-":
			ret = op1.eval() - op2.eval() ;
			break;
			
		case "*":
			ret = op1.eval() * op2.eval() ;
			break;
			
		case "/":
			if (op2.eval() != 0) {
				ret = op1.eval() / op2.eval() ;
			}
			break;
		default:
			ret = -1 ;
			break;
		}		
		return ret;		
	}

	@Override
	public boolean equals(Object o) {/*
		if(this == o ) { return true; }
		if (o == null) { return false;}
		
		if (getClass() != o.getClass()) { return false ;}
		*/
		ExpComp exp = (ExpComp) o ;		
		return Objects.equals(this.eval(), exp.eval());
		//return this.eval() == exp.eval();
	}
	
	
}
