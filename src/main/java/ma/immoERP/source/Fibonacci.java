package ma.immoERP.source;

/**
 * Fibonacci function
 * created by Moaad AASSOU
 *
 */
public class Fibonacci 
{

	private int a;
	public Fibonacci(int a){
		this.a  = a;
	}

	public int fibonacci(int a){
		if( a == 0 ) return 0;
		else if ( a == 1) return 1;
		else return fibonacci( a - 1 ) + fibonacci( a - 2 );
	}
}


