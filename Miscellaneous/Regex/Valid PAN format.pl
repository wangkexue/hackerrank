my $count = <>;
while (<>) {
    if (/[A-Z]{5}[0-9]{4}[A-Z]/) {
        print "YES\n";
    }
    else {
        print "NO\n";
    }
}
