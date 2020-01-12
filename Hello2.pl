#!/usr/bin/perl
use strict;
use warnings FATAL => 'all';

my @a; #配列の宣言は「@配列名」
@a = (1, 3, -5); #配列に要素を代入するには、「@配列名 = (要素0,要素1,要素2,・・・)」
print @a; # 13-5
print "\n";

my @b = (2,4,6);
print "@b\n"; # 2 4 6

my @c = (3,6,9);
print "$c[0]\n";
print "$c[1]\n";
print "$c[2]\n";

my @d;
$d[0] = 4;
$d[1] = 8;
$d[2] = -12;
print "@d\n"; # 4 8 -12

my @e = (5,10,15,20);
my $size = @e; #配列の要素数をみるには、スカラー変数に配列を代入する。
print "$size\n"; # 4

my $f = 123;
my $g = "ABC";
my @f = ($f, $g, 3.14);
print "@f\n"; # 123 ABC 3.14

my $h = 123;
my @h = (2,4,6);
my @i = ("AB", "CD");
my @j =  ($h,@h,@i);
print "@j\n"; # 123 2 4 6 AB CD

my @k = (10 .. 15); #数値の範囲を指定して、配列を作成する
print "@k\n"; #10 11 12 13 14 15

my @l = ("Blue", "Yellow", "Red");
for(my $i = 0; $i < @l; $i++) {
    print "$l[$i]\n";
}

my @m = ("Sun", "Mon", "Tue");
foreach $b (@m) {
    print "$b\n";
}

#CSVの文字列から配列の要素に変換
my $a = "Jan, Feb, Mar";
my @n = split(/,/,$a); #splitの第一仮引数は、分割するためのセパレータ(パターン)
print "@n\n"; # Jan  Feb  Mar

my @o = ("windows", "Mac", "Unix");
my $b = join(",", @o);
print "$b\n"; # windows,Mac,Unix

my @p = sort(@o);
print "@p\n"; # Mac Unix windows

my @q = reverse(@o);
print "@q\n"; # Unix Mac windows

sub method {
    print "Hello Method\n";
}
&method; # サブルーチンを呼び出すには、アンパサンド(&)と「サブルーチン名」を記述

&methodA("Taro");
sub methodA {
    my @a = @_;
    print "Hello @a !\n"; # Hello Taro !
}

my $q = "Hello World//";
&methodD($q, 5);
sub methodD {
    my($q, $b) = @_;
    my $c = $q x $b;
    print "$c\n"; # Hello World//Hello World//Hello World//Hello World//Hello World//
}

my $z = "A/";
my $zz = $z x 3;
print "$zz\n"; # A/A/A/

#連想記憶
my %data;
$data{'Apple'} = 500;
$data{'Orange'} = 200;
foreach my $k (keys(%data)) {
    my $v = $data{$k};
    print "$k $v\n";
}
#Apple 500
#Orange 200

