#!/usr/bin/perl
use strict;
use warnings FATAL => 'all';

print "Hello World";
print "\n";

$a = 1;
print $a; # 1
print "\n";

$a = 3;
print $a; # 3
print "\n";
$b = $a + 1;
print $b; # 4
print "\n";

$a = 4;
print $a, "\n"; # 4
$b = $a + 1;
print $b, "\n"; # 5

$a = 5;
print "$a\n"; # 5
$b = $a + 1;
print "$b\n"; # 6

$a = 6;
print "$a\n"; # 6
$b = "$a$a"; #66となる。
print "$b\n";

$a = "ABC";
print "$a\n"; #ダブルクォート「""」の場合は、変数展開をする。 # ABC
print '$b\n'; #シングルクォート「''」の場合は、単純に文字列を表す。 # $b\n

print "\n";

$b = $a.$a;
print "$b\n"; # ABCABC

$b = length($a); #$aの中身はABCの3つ
print "$b\n"; # 3

$a = "ABC";
my $i;
for($i = 0; $i < 5; $i++) {
    print $a; # ABCABCABCABCABC
}
print "\n";

$a =  "ABC";
for($i = 0; $i < 6; $i++) {
    $b = "$b$a";
}
print "$b\n"; # 3ABCABCABCABCABCABC

$a = "ABC";
print "$a\n"; # ABC
$b = $a x 7;
print "$b\n"; # ABCABCABCABCABCABCABC

$a = "ABC";
$b = "";
for($i = 0; $i < 3; $i++) {
    $b = "$b$a";
}
print "$b $i\n"; # ABCABCABC 3
