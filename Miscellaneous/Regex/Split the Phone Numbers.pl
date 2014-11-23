my $count = <>;
while (<>) {
    /(\d{1,3})[- ](\d{1,3})[- ](\d{4,10})/;
    print "CountryCode=$1,LocalAreaCode=$2,Number=$3\n";
}
