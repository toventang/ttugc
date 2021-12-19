package com.google.android.gms.p1940d;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.api.internal.AbstractC25458j;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.C25565r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.d.ac */
public final class C25622ac<TResult> extends AbstractC25631h<TResult> {

    /* renamed from: a */
    private final Object f60744a = new Object();

    /* renamed from: b */
    private final C25620aa<TResult> f60745b = new C25620aa<>();

    /* renamed from: c */
    private boolean f60746c;

    /* renamed from: d */
    private volatile boolean f60747d;

    /* renamed from: e */
    private TResult f60748e;

    /* renamed from: f */
    private Exception f60749f;

    static {
        Covode.recordClassIndex(31033);
    }

    C25622ac() {
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: a */
    public final boolean mo41880a() {
        boolean z;
        MethodCollector.m26663i(3561);
        synchronized (this.f60744a) {
            try {
                z = this.f60746c;
            } finally {
                MethodCollector.m26664o(3561);
            }
        }
        return z;
    }

    /* renamed from: com.google.android.gms.d.ac$a */
    static class C25623a extends LifecycleCallback {

        /* renamed from: b */
        private final List<WeakReference<AbstractC25652z<?>>> f60750b = new ArrayList();

        static {
            Covode.recordClassIndex(31034);
        }

        /* renamed from: b */
        public static C25623a m49482b(Activity activity) {
            AbstractC25458j a = m48794a(activity);
            C25623a aVar = (C25623a) a.mo41670a("TaskOnStopCallback", C25623a.class);
            return aVar == null ? new C25623a(a) : aVar;
        }

        private C25623a(AbstractC25458j jVar) {
            super(jVar);
            this.f60170a.mo41671a("TaskOnStopCallback", this);
        }

        /* renamed from: a */
        public final <T> void mo41889a(AbstractC25652z<T> zVar) {
            MethodCollector.m26663i(4591);
            synchronized (this.f60750b) {
                try {
                    this.f60750b.add(new WeakReference<>(zVar));
                } finally {
                    MethodCollector.m26664o(4591);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        /* renamed from: d */
        public final void mo41559d() {
            MethodCollector.m26663i(4662);
            synchronized (this.f60750b) {
                try {
                    for (WeakReference<AbstractC25652z<?>> weakReference : this.f60750b) {
                        AbstractC25652z<?> zVar = weakReference.get();
                        if (zVar != null) {
                            zVar.mo41898N_();
                        }
                    }
                    this.f60750b.clear();
                } finally {
                    MethodCollector.m26664o(4662);
                }
            }
        }
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: c */
    public final boolean mo41885c() {
        return this.f60747d;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: b */
    public final boolean mo41882b() {
        boolean z;
        MethodCollector.m26663i(3562);
        synchronized (this.f60744a) {
            try {
                z = this.f60746c && !this.f60747d && this.f60749f == null;
            } finally {
                MethodCollector.m26664o(3562);
            }
        }
        return z;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: d */
    public final TResult mo41886d() {
        TResult tresult;
        MethodCollector.m26663i(3566);
        synchronized (this.f60744a) {
            try {
                m49456g();
                m49458i();
                if (this.f60749f == null) {
                    tresult = this.f60748e;
                } else {
                    C25629f fVar = new C25629f(this.f60749f);
                    MethodCollector.m26664o(3566);
                    throw fVar;
                }
            } finally {
                MethodCollector.m26664o(3566);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: a */
    public final <X extends Throwable> TResult mo41877a(Class<X> cls) {
        TResult tresult;
        MethodCollector.m26663i(3569);
        synchronized (this.f60744a) {
            try {
                m49456g();
                m49458i();
                if (cls.isInstance(this.f60749f)) {
                    X cast = cls.cast(this.f60749f);
                    MethodCollector.m26664o(3569);
                    throw cast;
                } else if (this.f60749f == null) {
                    tresult = this.f60748e;
                } else {
                    C25629f fVar = new C25629f(this.f60749f);
                    MethodCollector.m26664o(3569);
                    throw fVar;
                }
            } finally {
                MethodCollector.m26664o(3569);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: e */
    public final Exception mo41887e() {
        Exception exc;
        MethodCollector.m26663i(3573);
        synchronized (this.f60744a) {
            try {
                exc = this.f60749f;
            } finally {
                MethodCollector.m26664o(3573);
            }
        }
        return exc;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: a */
    public final AbstractC25631h<TResult> mo41870a(AbstractC25628e<? super TResult> eVar) {
        return mo41875a(C25633j.f60754a, eVar);
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: a */
    public final AbstractC25631h<TResult> mo41875a(Executor executor, AbstractC25628e<? super TResult> eVar) {
        this.f60745b.mo41865a(new C25648v(executor, eVar));
        m49459j();
        return this;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: a */
    public final AbstractC25631h<TResult> mo41868a(Activity activity, AbstractC25628e<? super TResult> eVar) {
        C25648v vVar = new C25648v(C25633j.f60754a, eVar);
        this.f60745b.mo41865a(vVar);
        C25623a.m49482b(activity).mo41889a(vVar);
        m49459j();
        return this;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: a */
    public final AbstractC25631h<TResult> mo41874a(Executor executor, AbstractC25627d dVar) {
        this.f60745b.mo41865a(new C25646t(executor, dVar));
        m49459j();
        return this;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: a */
    public final AbstractC25631h<TResult> mo41867a(Activity activity, AbstractC25627d dVar) {
        C25646t tVar = new C25646t(C25633j.f60754a, dVar);
        this.f60745b.mo41865a(tVar);
        C25623a.m49482b(activity).mo41889a(tVar);
        m49459j();
        return this;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: a */
    public final AbstractC25631h<TResult> mo41869a(AbstractC25626c<TResult> cVar) {
        return mo41873a(C25633j.f60754a, cVar);
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: a */
    public final AbstractC25631h<TResult> mo41873a(Executor executor, AbstractC25626c<TResult> cVar) {
        this.f60745b.mo41865a(new C25644r(executor, cVar));
        m49459j();
        return this;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: a */
    public final <TContinuationResult> AbstractC25631h<TContinuationResult> mo41871a(Executor executor, AbstractC25619a<TResult, TContinuationResult> aVar) {
        C25622ac acVar = new C25622ac();
        this.f60745b.mo41865a(new C25638l(executor, aVar, acVar));
        m49459j();
        return acVar;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: a */
    public final AbstractC25631h<TResult> mo41872a(Executor executor, AbstractC25625b bVar) {
        this.f60745b.mo41865a(new C25642p(executor, bVar));
        m49459j();
        return this;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: b */
    public final <TContinuationResult> AbstractC25631h<TContinuationResult> mo41881b(Executor executor, AbstractC25619a<TResult, AbstractC25631h<TContinuationResult>> aVar) {
        C25622ac acVar = new C25622ac();
        this.f60745b.mo41865a(new C25640n(executor, aVar, acVar));
        m49459j();
        return acVar;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25631h
    /* renamed from: a */
    public final <TContinuationResult> AbstractC25631h<TContinuationResult> mo41876a(Executor executor, AbstractC25630g<TResult, TContinuationResult> gVar) {
        C25622ac acVar = new C25622ac();
        this.f60745b.mo41865a(new C25650x(executor, gVar, acVar));
        m49459j();
        return acVar;
    }

    /* renamed from: a */
    public final void mo41879a(TResult tresult) {
        MethodCollector.m26663i(3654);
        synchronized (this.f60744a) {
            try {
                m49457h();
                this.f60746c = true;
                this.f60748e = tresult;
            } catch (Throwable th) {
                MethodCollector.m26664o(3654);
                throw th;
            }
        }
        this.f60745b.mo41864a(this);
        MethodCollector.m26664o(3654);
    }

    /* renamed from: b */
    public final boolean mo41884b(TResult tresult) {
        MethodCollector.m26663i(3656);
        synchronized (this.f60744a) {
            try {
                if (this.f60746c) {
                    return false;
                }
                this.f60746c = true;
                this.f60748e = tresult;
                this.f60745b.mo41864a(this);
                MethodCollector.m26664o(3656);
                return true;
            } finally {
                MethodCollector.m26664o(3656);
            }
        }
    }

    /* renamed from: a */
    public final void mo41878a(Exception exc) {
        MethodCollector.m26663i(3660);
        C25565r.m49315a(exc, "Exception must not be null");
        synchronized (this.f60744a) {
            try {
                m49457h();
                this.f60746c = true;
                this.f60749f = exc;
            } catch (Throwable th) {
                MethodCollector.m26664o(3660);
                throw th;
            }
        }
        this.f60745b.mo41864a(this);
        MethodCollector.m26664o(3660);
    }

    /* renamed from: b */
    public final boolean mo41883b(Exception exc) {
        MethodCollector.m26663i(3662);
        C25565r.m49315a(exc, "Exception must not be null");
        synchronized (this.f60744a) {
            try {
                if (this.f60746c) {
                    return false;
                }
                this.f60746c = true;
                this.f60749f = exc;
                this.f60745b.mo41864a(this);
                MethodCollector.m26664o(3662);
                return true;
            } finally {
                MethodCollector.m26664o(3662);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo41888f() {
        MethodCollector.m26663i(3782);
        synchronized (this.f60744a) {
            try {
                if (this.f60746c) {
                    return false;
                }
                this.f60746c = true;
                this.f60747d = true;
                this.f60745b.mo41864a(this);
                MethodCollector.m26664o(3782);
                return true;
            } finally {
                MethodCollector.m26664o(3782);
            }
        }
    }

    /* renamed from: g */
    private final void m49456g() {
        C25565r.m49321a(this.f60746c, "Task is not yet complete");
    }

    /* renamed from: h */
    private final void m49457h() {
        C25565r.m49321a(!this.f60746c, "Task is already complete");
    }

    /* renamed from: i */
    private final void m49458i() {
        if (this.f60747d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: j */
    private final void m49459j() {
        MethodCollector.m26663i(3827);
        synchronized (this.f60744a) {
            try {
                if (this.f60746c) {
                    this.f60745b.mo41864a(this);
                    MethodCollector.m26664o(3827);
                }
            } finally {
                MethodCollector.m26664o(3827);
            }
        }
    }
}
