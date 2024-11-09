#include <iostream>
using namespace std;

int main() {
    for(int i = 19; i >= 0; cout<<"hanu made this thing"[i--]<<'\r'){
    	for(volatile int _=0;_<25e6;_++);
    	for(int j = i+1; j>1; j--){
    		int t = time(NULL);
    		int z = (((t^(t<<13))^(t>>17))^(t<<5))/j%t^i;
    		putchar((((((z^((t<<z)|(t>>z)))^(t^((z<<t)|(z>>t))))^(214013*(z+t)+2531011+z))>>16)&0x5D)+33);
    	}
    }
    return 0;
}
