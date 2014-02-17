
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Feb 17 12:59:09 CET 2014
//----------------------------------------------------

package chevalier_muller;

import model.DataType;
import model.Struct;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Feb 17 12:59:09 CET 2014
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\012\000\002\003\002\000\002\002\004\000\002\003" +
    "\005\000\002\004\005\000\002\004\005\000\002\002\006" +
    "\000\002\005\007\000\002\006\012\000\002\006\010\000" +
    "\002\007\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\013\000\010\002\001\004\001\005\001\001\002\000" +
    "\010\002\010\004\005\005\006\001\002\000\004\007\014" +
    "\001\002\000\004\007\012\001\002\000\004\012\011\001" +
    "\002\000\004\002\000\001\002\000\010\002\uffff\004\uffff" +
    "\005\uffff\001\002\000\004\012\013\001\002\000\004\012" +
    "\ufffd\001\002\000\004\012\015\001\002\000\004\012\ufffe" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\013\000\004\003\003\001\001\000\004\004\006\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP_actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP_actions();
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP_do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
    public void report_error(String message, Object info) {
        StringBuffer m = new StringBuffer("Error");
		m.append (info.toString());
        m.append(" : "+message);
        System.err.println(m.toString());
    }
   
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }



/** Cup generated class to encapsulate user supplied action code.*/
class CUP_actions {

  /** Constructor */

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP_do_action(
    int                        CUP_act_num,
    java_cup.runtime.lr_parser CUP_parser,
    java.util.Stack            CUP_stack,
    int                        CUP_top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP_result;

      /* select the action based on the action number */
      switch (CUP_act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // to_string ::= PRINT NAME TERM 
            {
              Object RESULT =null;
		Object n = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 System.out.println(Struct.getStruct((String) n).toString()); 
              CUP_result = getSymbolFactory().newSymbol("to_string",5, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // assignement ::= NAME POINT NAME EQUAL NAME TERM 
            {
              Object RESULT =null;
		Object strct = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-5)).value;
		Object key = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-3)).value;
		Object val = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 Struct.getStruct((String) strct).putPointer((String) key, (String) val); 
              CUP_result = getSymbolFactory().newSymbol("assignement",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // assignement ::= NAME POINT NAME EQUAL DOUBLE_QUOTE VALUE DOUBLE_QUOTE TERM 
            {
              Object RESULT =null;
		Object strct = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-7)).value;
		Object key = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-5)).value;
		Object val = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		 Struct.getStruct((String) strct).putValue((String) key, (String) val); 
              CUP_result = getSymbolFactory().newSymbol("assignement",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // structure ::= NAME EQUAL NEW NAME TERM 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("structure",3, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // structure_def ::= STRUCT data_defs END_STRUCT TERM 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("structure_def",0, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // data_def ::= PTR NAME TERM 
            {
              Object RESULT =null;
		Object v = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 System.out.println(v); 
              CUP_result = getSymbolFactory().newSymbol("data_def",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // data_def ::= VAR NAME TERM 
            {
              Object RESULT =null;
		Object v = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 System.out.println(v); 
              CUP_result = getSymbolFactory().newSymbol("data_def",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // data_defs ::= data_defs data_def TERM 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("data_defs",1, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= data_defs EOF 
            {
              Object RESULT =null;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		RESULT = start_val;
              CUP_result = getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP_parser.done_parsing();
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // data_defs ::= 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("data_defs",1, RESULT);
            }
          return CUP_result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

}
