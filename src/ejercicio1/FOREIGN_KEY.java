package ejercicio1;


import java.util.*;

/**
 * 
 */
public class FOREIGN_KEY extends Constraint {

    /**
     * Default constructor
     */
    public FOREIGN_KEY() {
    }

    /**
     * 
     */
    public Column ReferencedColumn;

    /**
     * 
     */
    public ReferencialIntegretyRule onDelete;

    /**
     * 
     */
    public ReferencialIntegretyRule onUpdate;

}