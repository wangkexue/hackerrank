# or you can use (?i:.*) for partial case insensitive checking
# or (?i).*(?-i).*
my $count = <>;
while (<>) {
    if (/^[Hh][Ii]( [^dD].*)?$/) {
        print;
    }
}
