package com.ureca;

public class MyTest {
	int su = 100;
	A a = new A();
	My my = new My();
    my.hello();
    my.hello(1000);   
    int i=1000;
    my.hello(i);
    my.hello(new A());
    my.hello(a); 

    my.hello(new Parent());
    my.hello(new Child());
}
