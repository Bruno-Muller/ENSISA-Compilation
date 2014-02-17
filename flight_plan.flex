%%
   
%package chevalier_muller
%class Lexer
%line
%column
%cup

%%
[ \t\n\r]		{ }

";"							{ return getSymbolFactory().newSymbol ("TERM", Sym.TERM); }
"="							{ return getSymbolFactory().newSymbol ("EQUAL", Sym.EQUAL); }
"STRUCT"					{ return getSymbolFactory().newSymbol ("STRUCT", Sym.STRUCT); }
"END_STRUCT"				{ return getSymbolFactory().newSymbol ("END_STRUCT", Sym.END_STRUCT); }
"new"						{ return getSymbolFactory().newSymbol ("NEW", Sym.NEW); }
"."							{ return getSymbolFactory().newSymbol ("POINT", Sym.POINT); }
"\""						{ return getSymbolFactory().newSymbol ("DOUBLE_QUOTE", Sym.DOUBLE_QUOTE); }  
"PRINT"						{ return getSymbolFactory().newSymbol ("PRINT", Sym.PRINT); }    
   
//[A-Za-z_0-9][A-Za-z_ 0-9]*	{ return getSymbolFactory().newSymbol ("VALUE", Sym.VALUE, new String(yytext())); }
[A-Za-z_][A-Za-z_0-9]*		{ return getSymbolFactory().newSymbol ("NAME", Sym.NAME, new String(yytext())); }
   
[^]                    		{ throw new Error("Illegal character <"+yytext()+">"); }
