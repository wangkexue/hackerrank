while (<>) {
  if (/<div +class="question-summary" +id="question-summary-(\d+)">/) {
    print "$1;";
  } elsif (/<div +class="summary">/) {
    $dummy = <>;
    #print "$dummy";
    $dummy =~ /<h3>[\s\r]*< *a +href=".+" +class="question-hyperlink" *>(.+)<\/a>/;
    $str = $1;
    $str =~ s/^\s+|\s+$//g;
    print "$str;"
  } elsif (/class="relativetime"*?> *(.+)<\/span>/) {
    $str = $1;
    $str =~ s/\s*$//;
    print "$str\n";
  }
}
