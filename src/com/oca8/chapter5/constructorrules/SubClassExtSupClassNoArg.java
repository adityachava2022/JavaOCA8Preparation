package com.oca8.chapter5.constructorrules;

/*
 * According to rule 4, the subclass which extends a super class without a no argument constructor
 * does not compile since, the java will try to add no argument constructor in the child class.
 */
public class SubClassExtSupClassNoArg extends SuperClassNoArgConstructor { 
	/* According to rule 5, for this class to compile you need to add constructors in this subclass which make an
	 * explicit call to the super classes.
	 */
	public SubClassExtSupClassNoArg()
	{
		super(10);
	}
}
