/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bimark
 */
public class ElseAndIf {
    public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people )
		{
		System.out.println( "We should take the cars." );
		}
		else if ( cars < people )
		{
		System.out.println( "We should not take the cars." );
		}
		else
		{
		System.out.println( "We can't decide." );
        		}
    

		if ( buses > cars )
		{
		System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
		System.out.println( "Maybe we could take the buses." );
		}
		else
		{
		System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
		System.out.println( "All right, let's just take the buses." );
		}
		else
		{
		System.out.println( "Fine, let's stay home then." );
		}
                //the if and else are used in making a decision. if block statement is executed when the condition is met otherwise the else condition is executed.
	}      //the program outcome did not change because the if confition was met
    
}
