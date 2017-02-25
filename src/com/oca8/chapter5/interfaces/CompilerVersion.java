package com.oca8.chapter5.interfaces;

public class CompilerVersion {

}

public interface CanFly {
void fly(int speed);
abstract void takeoff();
public abstract double dive();
}
//this is inserted by the compiler.
public abstract interface CanFly {  
public abstract void fly(int speed);
public abstract void takeoff();
public abstract double dive();
}