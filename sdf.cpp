#include <cstdio>
#include <cmath>
#include <climits>
#include <cstring>
#include <algorithm>
#include <vector>
#include <set>
#include <map>
#include <queue>
#include <stack>
#include <string>
#include <sstream>
#include <iostream>
using namespace std;
#define sf scanf
#define pf printf
#define pub push_back
#define po  pop
#define pob pop_back
#define puf push_front
#define mp make_pair
#define MOD 1000000007
typedef vector<int> vi;
typedef vector<string> vs;
typedef vector<vi> vvi;
typedef map<int,int> mpii;
typedef set<int> si;
typedef multiset<int> msi;
typedef long int i32;
typedef unsigned long int ui32;
typedef long long int i64;
typedef unsigned long long int  ui64;
vector<string> split(const string& s, char delim)
{
    vector<string> elems;
    stringstream ss(s);
    string item;
    while (getline(ss, item, delim))
        elems.push_back(item);
    return elems;
}
long long  modularExponentiation(long long  x,long long  n,long long M){
	long long  result=1;
	while(n>0){
		if(n % 2 ==1)
		result=(result * x)%M;
		x=(x*x)%M;
		n=n/2;
	}
	return result;
}
long long d, z, y;
void extendedEuclid(long long  c,long long  m){
	if(m == 0){
		d = c;
		z = 1;
		y = 0;
	}
	else{
		extendedEuclid(m, c%m);
		long long int temp = z;
		z = y;
		y = temp - (c/m)*y;
	}
}
long long  modInverse(long long c, long long M){
	extendedEuclid(c,M);
	return (z%M+M)%M;
}
long long modInversePrime(long long A,long long M)//If M is a prime
 {
	 return modularExponentiation(A,M-2,M);
 }
long long fact(long long x){
	if(x==0)
		return 1;
	long long m=1,i;
	for(i=2;i<=x;++i)
		m=((m%MOD)*(i%MOD))%MOD;
	return m%MOD;
}
int power( int base, int exponent){   // Does not work for negative exponents. (But that would be leaving the range of int) 
    if (exponent == 0) return 1;  // base case;
    int temp = pow(base, exponent/2);
    if (exponent % 2 == 0)
        return temp * temp; 
    else
        return (base * temp * temp);
}
//Arbaz's template end s here....