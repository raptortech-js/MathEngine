package com.tumblr.j_scholl.mathlib.engine.functions;

public abstract class UnaryFunction extends BaseFunction {
	protected final Function f;
	
	public UnaryFunction(Function f) {
		this.f = f;
	}
	
	public abstract double eval(double x);
	
	protected abstract Function diff2();
	
	public Function base() {
		return f;
	}
	
	public int compareTo(Function other) {
		if (getClass() != other.getClass())
			return super.compareTo(other);
		UnaryFunction o = (UnaryFunction) other;
		return f.compareTo(o.f);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((f == null) ? 0 : f.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnaryFunction other = (UnaryFunction) obj;
		if (f == null) {
			if (other.f != null)
				return false;
		} else if (!f.equals(other.f))
			return false;
		return true;
	}
	
}
