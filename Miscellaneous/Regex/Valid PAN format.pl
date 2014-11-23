my $count = <>;
while (<>) {
    if (/[A-Z]{5}\d{4}[A-Z]/) {
        print "YES\n";
    }
    else {
        print "NO\n";
    }
}
