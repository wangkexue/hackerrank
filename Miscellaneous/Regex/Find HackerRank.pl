my $dummy = <>;
while (<>) {
    if (/^hackerrank.*/ && /.*hackerrank$/) {
        print "0\n";
    }
    elsif (/^hackerrank.*/) {
        print "1\n";
    }
    elsif (/.*hackerrank$/) {
        print "2\n";
    }
    else {
        print "-1\n"
    }
}
