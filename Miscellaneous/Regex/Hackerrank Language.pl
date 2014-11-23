my $count = <>;
while (<>) {
     if (/^(\d+) (C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)$/ && $1 >= 10000 && $1 < 100000) {
        print "VALID\n";
     }
     else {
	 print "INVALID\n";
     }
}
