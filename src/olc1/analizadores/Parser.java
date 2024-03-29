
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package olc1.analizadores;

import java.util.LinkedList;
import java_cup.runtime.*;
import olc1.ht1.TokenError;
import olc1.ht1.Nodo;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\006\000\002\002\004\000\002\002\003\000\002\003" +
    "\007\000\002\004\005\000\002\004\005\000\002\004\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\015\000\004\010\005\001\002\000\004\002\000\001" +
    "\002\000\004\004\010\001\002\000\004\002\007\001\002" +
    "\000\004\002\001\001\002\000\004\011\011\001\002\000" +
    "\006\005\ufffc\006\ufffc\001\002\000\006\005\014\006\013" +
    "\001\002\000\006\011\016\012\017\001\002\000\004\007" +
    "\015\001\002\000\004\002\uffff\001\002\000\006\005\ufffe" +
    "\006\ufffe\001\002\000\006\005\ufffd\006\ufffd\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\015\000\006\002\005\003\003\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\004\011\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
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
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


    
    public static LinkedList<TokenError> tablaErrores = new LinkedList<TokenError>();
    public static String consola = "";

    public void syntax_error(Symbol s){ 
        tablaErrores.add(new TokenError(String.valueOf(s.value), (s.left + 1), (s.right + 1), "Sintáctico", "No se esperaba: " + s.value));
        System.err.println("Error sintáctico en la Línea: " + (s.left + 1) + ", Columna: " + (s.right + 1) + ". No se esperaba este componente: " + s.value + "."); 
    } 

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        tablaErrores.add(new TokenError(String.valueOf(s.value), (s.left + 1), (s.right + 1), "Sintáctico", "Error irrecuperable: " + s.value));
        System.err.println("Error sintáctico irrecuperable en la Línea: " + (s.left + 1) + ", Columna " + (s.right + 1) + ". Componente " + s.value + " no reconocido.");
    }  



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= INST 
            {
              Object RESULT =null;
		 RESULT = new Object(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INST ::= extraer para EXP parc puntoycoma 
            {
              Object RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Nodo exp = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 exp.validarContenido(); consola = exp.getValorLista(); System.err.println(exp.getContador() + exp.getValorLista()); RESULT = new Object(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("INST",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // EXP ::= EXP coma entero 
            {
              Nodo RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Nodo exp = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int entleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int entright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String ent = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 exp.setContador(exp.getContador()+1); exp.agregarValor(Integer.parseInt(ent)); /*System.err.println(exp.getContador() + " " + exp.getPosicionInicial() + " " + exp.getCantidadPalabras());*/ RESULT = exp; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // EXP ::= EXP coma identificador 
            {
              Nodo RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Nodo exp = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int identleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int identright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String ident = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 exp.setContador(exp.getContador()+1); exp.agregarValor(ident); /*System.err.println(exp.getContador() + " " + exp.getPosicionInicial() + " " + exp.getCantidadPalabras());*/ RESULT = exp; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // EXP ::= entero 
            {
              Nodo RESULT =null;
		int entleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int entright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String ent = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Nodo(Integer.parseInt(ent)); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
