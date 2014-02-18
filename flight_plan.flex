%%
   
%package chevalier_muller
%class Lexer
%line
%column
%cup

%%

[ \t\n\r]					{ }
^#.*   						{ }

";"							{ return getSymbolFactory().newSymbol ("TERM", Sym.TERM); }
"="							{ return getSymbolFactory().newSymbol ("EQUAL", Sym.EQUAL); }
"."							{ return getSymbolFactory().newSymbol ("POINT", Sym.POINT); }
"\""						{ return getSymbolFactory().newSymbol ("DOUBLE_QUOTE", Sym.DOUBLE_QUOTE); }  

"STRUCT"					{ return getSymbolFactory().newSymbol ("STRUCT", Sym.STRUCT); }
"END_STRUCT"				{ return getSymbolFactory().newSymbol ("END_STRUCT", Sym.END_STRUCT); }
"NEW"						{ return getSymbolFactory().newSymbol ("NEW", Sym.NEW); }
"PRINT"						{ return getSymbolFactory().newSymbol ("PRINT", Sym.PRINT); }  
"VAR"						{ return getSymbolFactory().newSymbol ("VAR", Sym.VAR); }  
"PTR"						{ return getSymbolFactory().newSymbol ("PTR", Sym.PTR); }    
   
[A-Za-z_0-9\-]+		{ return getSymbolFactory().newSymbol ("TEXT", Sym.TEXT, yytext()); }
   
[^]                    		{ throw new Error("Illegal character <"+yytext()+">"); }
