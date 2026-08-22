class Main {
    public static void main(String[] args) {
        Z helloworld = new Z();
        helloworld.z();
    }
}
class A {
    public void a(){
        System.out.print("Hello, World!");
    }
}
class B {
    public void b(){
        A helloworld = new A();
        helloworld.a();
    }
}
class C {
    public void c(){
        B helloworld = new B();
        helloworld.b();
    }
}
class D {
    public void d(){
        C helloworld = new C();
        helloworld.c();
    }
}
class E {
    public void e(){
        D helloworld = new D();
        helloworld.d();
    }
}
class F {
    public void f(){
        E helloworld = new E();
        helloworld.e();
    }
}
class G {
    public void g(){
        F helloworld = new F();
        helloworld.f();
    }
}
class H {
    public void h(){
        G helloworld = new G();
        helloworld.g();
    }
}
class I {
    public void i(){
        H helloworld = new H();
        helloworld.h();
    }
}
class J {
    public void j(){
        I helloworld = new I();
        helloworld.i();
    }
}
class K {
    public void k(){
        J helloworld = new J();
        helloworld.j();
    }
}
class L {
    public void l(){
        K helloworld = new K();
        helloworld.k();
    }
}
class M {
    public void m(){
        L helloworld = new L();
        helloworld.l();
    }
}
class N {
    public void n(){
        M helloworld = new M();
        helloworld.m();
    }
}
class O {
    public void o(){
        N helloworld = new N();
        helloworld.n();
    }
}
class P {
    public void p(){
        O helloworld = new O();
        helloworld.o();
    }
}
class Q {
    public void q(){
        P helloworld = new P();
        helloworld.p();
    }
}
class R {
    public void r(){
        Q helloworld = new Q();
        helloworld.q();
    }
}
class S {
    public void s(){
        R helloworld = new R();
        helloworld.r();
    }
}
class T {
    public void t(){
        S helloworld = new S();
        helloworld.s();
    }
}
class U {
    public void u(){
        T helloworld = new T();
        helloworld.t();
    }
}
class V {
    public void v(){
        U helloworld = new U();
        helloworld.u();
    }
}
class W {
    public void w(){
        V helloworld = new V();
        helloworld.v();
    }
}
class X {
    public void x(){
        W helloworld = new W();
        helloworld.w();
    }
}
class Y {
    public void y(){
        X helloworld = new X();
        helloworld.x();
    }
}
class Z {
    public void z(){
        Y helloworld = new Y();
        helloworld.y();
    }
}