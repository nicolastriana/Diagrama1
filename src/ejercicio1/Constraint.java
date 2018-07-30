package ejercicio1;


import java.util.*;

/**
 * 
 */
public abstract class Constraint {

    /**
     * Default constructor
     */
    public Constraint() {
    }

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public Set<Column> columnsUsedInTableConstraint;


}