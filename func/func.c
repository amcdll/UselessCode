#include <stdio.h>

void a(void){
    printf("Hello, World!");
}
void b(void){
    a();
}
void c(void){
    b();
}
void d(void){
    c();
}
void e(void){
    d();
}
void f(void){
    e();
}
void g(void){
    f();
}
void h(void){
    g();
}
void i(void){
    h();
}
void j(void){
    i();
}
void k(void){
    j();
}
void l(void){
    k();
}
void m(void){
    l();
}
void n(void){
    m();
}
void o(void){
    n();
}
void p(void){
    o();
}
void q(void){
    p();
}
void r(void){
    q();
}
void s(void){
    r();
}
void t(void){
    s();
}
void u(void){
    t();
}
void v(void){
    u();
}
void w(void){
    v();
}
void x(void){
    w();
}
void y(void){
    x();
}
void z(void){
    y();
}

int main(){
    z();
    return 0;
}