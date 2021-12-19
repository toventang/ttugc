package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.C26958r;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.q */
public final class C27075q<ResultT> extends AbstractC27062d<ResultT> {

    /* renamed from: a */
    private final Object f64057a = new Object();

    /* renamed from: b */
    private final C27070l<ResultT> f64058b = new C27070l<>();

    /* renamed from: c */
    private boolean f64059c;

    /* renamed from: d */
    private ResultT f64060d;

    /* renamed from: e */
    private Exception f64061e;

    static {
        Covode.recordClassIndex(32555);
    }

    C27075q() {
    }

    /* renamed from: e */
    private final void m53811e() {
        C26958r.m53563a(!this.f64059c, "Task is already complete");
    }

    /* renamed from: f */
    private final void m53812f() {
        boolean z;
        MethodCollector.m26663i(11415);
        synchronized (this.f64057a) {
            try {
                z = this.f64059c;
            } catch (Throwable th) {
                MethodCollector.m26664o(11415);
                throw th;
            }
        }
        if (!z) {
            MethodCollector.m26664o(11415);
            return;
        }
        this.f64058b.mo44780a(this);
        MethodCollector.m26664o(11415);
    }

    @Override // com.google.android.play.core.tasks.AbstractC27062d
    /* renamed from: a */
    public final AbstractC27062d<ResultT> mo44769a(AbstractC27059a aVar) {
        mo44771a(C27063e.f64040a, aVar);
        return this;
    }

    @Override // com.google.android.play.core.tasks.AbstractC27062d
    /* renamed from: a */
    public final AbstractC27062d<ResultT> mo44770a(AbstractC27060b<? super ResultT> bVar) {
        mo44772a(C27063e.f64040a, bVar);
        return this;
    }

    @Override // com.google.android.play.core.tasks.AbstractC27062d
    /* renamed from: a */
    public final AbstractC27062d<ResultT> mo44771a(Executor executor, AbstractC27059a aVar) {
        this.f64058b.mo44781a(new C27066h(executor, aVar));
        m53812f();
        return this;
    }

    @Override // com.google.android.play.core.tasks.AbstractC27062d
    /* renamed from: a */
    public final AbstractC27062d<ResultT> mo44772a(Executor executor, AbstractC27060b<? super ResultT> bVar) {
        this.f64058b.mo44781a(new C27068j(executor, bVar));
        m53812f();
        return this;
    }

    /* renamed from: a */
    public final void mo44787a(Exception exc) {
        MethodCollector.m26663i(11261);
        synchronized (this.f64057a) {
            try {
                m53811e();
                this.f64059c = true;
                this.f64061e = exc;
            } catch (Throwable th) {
                MethodCollector.m26664o(11261);
                throw th;
            }
        }
        this.f64058b.mo44780a(this);
        MethodCollector.m26664o(11261);
    }

    /* renamed from: a */
    public final void mo44788a(ResultT resultt) {
        MethodCollector.m26663i(10972);
        synchronized (this.f64057a) {
            try {
                m53811e();
                this.f64059c = true;
                this.f64060d = resultt;
            } catch (Throwable th) {
                MethodCollector.m26664o(10972);
                throw th;
            }
        }
        this.f64058b.mo44780a(this);
        MethodCollector.m26664o(10972);
    }

    @Override // com.google.android.play.core.tasks.AbstractC27062d
    /* renamed from: a */
    public final boolean mo44773a() {
        boolean z;
        MethodCollector.m26663i(10829);
        synchronized (this.f64057a) {
            try {
                z = this.f64059c;
            } finally {
                MethodCollector.m26664o(10829);
            }
        }
        return z;
    }

    @Override // com.google.android.play.core.tasks.AbstractC27062d
    /* renamed from: b */
    public final boolean mo44774b() {
        boolean z;
        MethodCollector.m26663i(10968);
        synchronized (this.f64057a) {
            try {
                z = false;
                if (this.f64059c && this.f64061e == null) {
                    z = true;
                }
            } finally {
                MethodCollector.m26664o(10968);
            }
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo44789b(Exception exc) {
        MethodCollector.m26663i(11262);
        synchronized (this.f64057a) {
            try {
                if (this.f64059c) {
                    MethodCollector.m26664o(11262);
                    return false;
                }
                this.f64059c = true;
                this.f64061e = exc;
                this.f64058b.mo44780a(this);
                MethodCollector.m26664o(11262);
                return true;
            } catch (Throwable th) {
                MethodCollector.m26664o(11262);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo44790b(ResultT resultt) {
        MethodCollector.m26663i(11108);
        synchronized (this.f64057a) {
            try {
                if (this.f64059c) {
                    MethodCollector.m26664o(11108);
                    return false;
                }
                this.f64059c = true;
                this.f64060d = resultt;
                this.f64058b.mo44780a(this);
                MethodCollector.m26664o(11108);
                return true;
            } catch (Throwable th) {
                MethodCollector.m26664o(11108);
                throw th;
            }
        }
    }

    @Override // com.google.android.play.core.tasks.AbstractC27062d
    /* renamed from: d */
    public final Exception mo44776d() {
        Exception exc;
        MethodCollector.m26663i(10970);
        synchronized (this.f64057a) {
            try {
                exc = this.f64061e;
            } finally {
                MethodCollector.m26664o(10970);
            }
        }
        return exc;
    }

    @Override // com.google.android.play.core.tasks.AbstractC27062d
    /* renamed from: c */
    public final ResultT mo44775c() {
        ResultT resultt;
        MethodCollector.m26663i(10969);
        synchronized (this.f64057a) {
            try {
                C26958r.m53563a(this.f64059c, "Task is not yet complete");
                Exception exc = this.f64061e;
                if (exc == null) {
                    resultt = this.f64060d;
                } else {
                    C27061c cVar = new C27061c(exc);
                    MethodCollector.m26664o(10969);
                    throw cVar;
                }
            } finally {
                MethodCollector.m26664o(10969);
            }
        }
        return resultt;
    }
}
