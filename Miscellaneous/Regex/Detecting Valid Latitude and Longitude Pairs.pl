my $count = <>;
while (<>) {
    if (/\([+-]?([1-9]\d*)(\.\d+)?, [+-]?([1-9]\d*)(\.\d+)?\)/ && $1+$2 <= 90 && $3+$4 <= 180) {
        print "Valid\n";
    }
    else {
        print "Invalid\n";
    }
}
