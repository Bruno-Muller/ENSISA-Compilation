%%
   
%package chevalier_muller
%class Lexer
%line
%column
%cup

%%
[ \t\f]					{ }
";"						{ return getSymbolFactory().newSymbol ("TERM", Sym.TERM); }
"="						{ return getSymbolFactory().newSymbol ("EQUAL", Sym.EQUAL); }
"begin"					{ return getSymbolFactory().newSymbol ("BEGIN", Sym.BEGIN); }
"end"					{ return getSymbolFactory().newSymbol ("END", Sym.END); }
"new"					{ return getSymbolFactory().newSymbol ("NEW", Sym.NEW); }
"."						{ return getSymbolFactory().newSymbol ("POINT", Sym.POINT); }
"\""					{ return getSymbolFactory().newSymbol ("DOUBLE_QUOTE", Sym.DOUBLE_QUOTE); }   
   
[A-Za-z_][A-Za-z_0-9]*	{ return getSymbolFactory().newSymbol ("KEY", Sym.KEY, new String(yytext())); }
[A-Za-z_][A-Za-z_0-9]*	{ return getSymbolFactory().newSymbol ("VALUE", Sym.VALUE, new String(yytext())); }
   
[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
