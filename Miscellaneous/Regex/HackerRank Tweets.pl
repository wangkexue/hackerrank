# two solution: covert string to lowercase/uppercase then matching
# or use case insensitive matching
my $count = <>;
$count  = 0;
while (<>) {
    $count++ if /hackerrank/i;
}
print $count
