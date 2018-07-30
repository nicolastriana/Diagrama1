package ejercicio1;


import com.oracle.jrockit.jfr.DataType;
import java.util.*;

/**
 * 
 */
public class Column {

    /**
     * Default constructor
     */
    public Column() {
    }

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public DataType dataType;

    /**
     * 
     */
    public Set<Constraint> contraints;

    /**
     * 
     */
    public Domain domainType;

}