class checkPower {
public static boolean isPower(int x, long y){
if(x==1){
return (y==1);
}

int pow =1;
while (pow < y){
     pow *=x; 
}

return pow==y; 
}

public static void main (String args[]){
System.out.println("checking power (T/F):"+isPower(2,128));
}
}