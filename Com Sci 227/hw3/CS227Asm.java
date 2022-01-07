package hw3;
/**
 * 
 * @author Kent Mark
 * 
 * A class that simulates the activity of an assembler for assembly language programs targeting the CS227Comp machine.
 *
 */
import java.util.*;

import api.Instruction;
import api.NVPair;
import api.SymbolTable;

public class CS227Asm {
	/**
	 * ArrayList used to store user inputed text array.
	 */
	private ArrayList<java.lang.String> prgm = new ArrayList<>();
	/**
	 * Variable used to store scanned in text.
	 */
	private String name;
	/**
	 * Variable used to store scanner in integer numbers.
	 */
	private int value;
	
	
	/**
	 * Instruction type ArrayList.
	 */
	private ArrayList<Instruction> instruct = new ArrayList<>();
	/**
	 * ArrayList used to store processed data.
	 */
	private ArrayList<java.lang.String> code = new ArrayList<>();
	
	/**
	 * SymbolTable to hold data entries.
	 */
	private SymbolTable dataTable = new SymbolTable();
	/**
	 * SymbolTable to hold label entries.
	 */
	private SymbolTable labelTable = new SymbolTable();
	
	
	/**
	 * Constructs an assembler for the given assembly language program, given as an ArrayList of strings (one per line of the program).
	 * @param program User entered text array contain the instructions for the machine.
	 */
	public CS227Asm(java.util.ArrayList<java.lang.String> program) {
		
		prgm = program;
		
		
	
	}
	/**
	 * Creates the symbol table for the data section of this assembler's program.
	 */
	public void parseData() {
		
		
	    name = "";
	    value = 0;
	    for(int i = prgm.indexOf("data:") + 1; prgm.get(i) != "labels:"; i++) {
	    	
	    	Scanner sc = new Scanner(prgm.get(i));
	    	
	    	 name = sc.next();
	    	 value = sc.nextInt();
	    	
	    	//System.out.println(value);
	    	//System.out.println(name + ":" + value);
	    	dataTable.add(name, value);
	    
	    	   
	    }
	}
	
	/**
	 * Returns the symbol table for data (variables).
	 * @return dataTable - SymbolTable to hold data entries.
	 */
	public SymbolTable getData() {
		
		return dataTable;
	}

	/**
	 * Creates the symbol table for the label section of this assembler's program, leaving all label values as zeros.
	 */
	public void parseLabels() {
		
		name = "";
	   // value = 0;
	    for(int i = prgm.indexOf("labels:") + 1; prgm.get(i) != "instructions:" ; i++) {
	    	
	    	Scanner sc = new Scanner(prgm.get(i));
	    	
	    	 name = sc.next();
	    	 //value = sc.nextInt();
	    	// helper = labelTable.findByName(prgm.get(i)).getValue();
	    	//System.out.println(value);
	    	//System.out.println(name + ":" + value);
	    	labelTable.add(name);
	    
	    	
	}

	}


	/**
	 * Returns the symbol table for labels (jump targets).
	 * @return labelTable - SymbolTable to hold label entries.
	 */
	public SymbolTable getLabels() {
		
		
		return labelTable;
	}
	
	/**
	 * Creates instruction stream from the instruction section of this assembler's program and fills in label 
	 * addresses in the symbol table for labels.
	 */
	public void parseInstructions() {
		
		
		name = "";
		 value = 0;
		    for(int i = prgm.indexOf("instructions:") + 1; i < prgm.size() ; i++) {
		    	
		    	//Scanner sc = new Scanner(prgm.get(i));
		    	
		    	//name = sc.next();
		    	 
		    	 	if(!labelTable.containsName(prgm.get(i))) {
		    		 Instruction instr = new Instruction(prgm.get(i));
		    		 
		    		 		
		    		 		
		    			 instruct.add(instr);
		    			 //instr.setOperand(helper);
		    			 value++;
		    	 	}
		    	
		  
		    	 	
		    	 	
		    	 	if(labelTable.containsName(prgm.get(i))) {
		    	 		
		    	 		
		    	 		
		    	 		getLabels().findByName(prgm.get(i)).setValue(value);
		    	 		
		    	 	}
		    	 
		    	// instruction = instr.getOperandString();
		    	//value = sc.nextInt();
		    	 
		    	//System.out.println(value);
		    	//System.out.println(name + ":" + value);
		    	//labelTable.add(name);
		    	//Instruction d = new Instruction(name);
		    	 
		    	//instr.add(d);
		    	 
		    	// instruct.add(new Instruction(prgm.get(i)));
		    	 
		    	 
		
	}
		    
    
}


	/**
	 * Returns the instruction stream. The index of each instruction in the list is its memory location in the generated code.
	 * @return instruct - Instruction type ArrayList.
	 */
		public java.util.ArrayList<Instruction> getInstructionStream(){
			
			//instruct.add(i);
			return instruct;
		}
    	
    /**
     * Fills in the correct operand value for all instructions (either a data address or jump target address, 
     * depending on the instruction).
     */
		public void setOperandValues() {
			
			name = "";
			 value = 0;
			   
			 //NVPair p = la
			 
			 
			 
			 
			 for(int i = prgm.indexOf("instructions:") + 1; i < prgm.size() ; i++) {
			    	
			    	
			    	 	
			    	 	if(!labelTable.containsName(prgm.get(i))) {
			    		 Instruction instr = new Instruction(prgm.get(i));
			    		 
			    		 		
			    			 instruct.add(instr);
			    			 value++;
			    			 
			    			 
			    			 if(instr.requiresDataAddress()) {
			    		 	
			    		 			instr.setOperand(i);
			    		 			
			    		 		
			    		 		}
				    		 		
			    			 if(instr.requiresJumpTarget()) {
			    				 
			    				 
			    				 
			    				instr.setOperand(0);
			    				 
			    			 }
			    	 	
			    	 	}
			  
			    	 	
			    	 	
			    	 	if(labelTable.containsName(prgm.get(i))) {
			    	 		
			    	 		
			    	 		
			    	 		labelTable.findByName(prgm.get(i)).setValue(value);
			    	 		//helper = labelTable.findByName(prgm.get(i)).getValue();
			    	 		
			    	 	}
			    	 	
			    	 	
			    	 
			 	}
		
		}

		/**
		 * For each instruction in the instruction stream that is a jump target, adds the label to the instruction's description. 
		 * (See the method addLabelToDescription in the Instruction class.)
		 */
		public void addLabelAnnotations() {
			
			value = 0;
			   
			 
			 for(int i = prgm.indexOf("instructions:") + 1; i < prgm.size() ; i++) {
			    	
			    	
			    	 
			    	 	if(!labelTable.containsName(prgm.get(i))) {
			    		 Instruction instr = new Instruction(prgm.get(i));
			    		 
			    	
			    		 if(instr.requiresJumpTarget()) {
			    			 
			    			 instr.addLabelToDescription(prgm.get(i));
			    		 }
			    			 instruct.add(instr);
			    			 value++;
			    			 code.add(instr.toString());
			    	
			    	 	}
			  
			    	 	
			    	 	
			    	 	if(labelTable.containsName(prgm.get(i))) {
			    	 		
			    	 		
			    	 		
			    	 		labelTable.findByName(prgm.get(i)).setValue(value);
			    	 		//helper = labelTable.findByName(prgm.get(i)).getValue();
			    	 		
			    	 	}
			    	 	
			    	 	
			    	 
			 	}
		}

		/**
		 * Generates the machine code and data for this assembler's program, terminated by the string "-99999". Strings for instructions are produced by the Instruction method toString, and strings for data have the value formatted as a four-digit signed integer, followed by a space, followed by the variable name.
		 * @return code - ArrayList used to store processed data.
		 */
		public java.util.ArrayList<java.lang.String> writeCode(){
			 
			code.add("-99999");
			
			return code;

}
		/**
		 * Assembles the source program represented by this assembler instance and returns the generated machine code and data as an array of strings.
		 * @return writeCode() - Function that generates machine code.
		 */
		public java.util.ArrayList<java.lang.String> assemble(){
			
			
			 parseData();     
			 parseLabels();     
			 parseInstructions();     
			 setOperandValues();     
			 addLabelAnnotations(); 
			 return writeCode();
			
			
		}


}

