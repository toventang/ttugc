package p4640l;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.util.Objects;
import okhttp3.AbstractC90031ad;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90051f;
import okhttp3.C90029ac;
import okhttp3.C90204w;
import okhttp3.Request;
import p4632k.AbstractC89426h;
import p4632k.AbstractC89431l;
import p4632k.C89420f;
import p4632k.C89436q;

/* renamed from: l.h */
final class C89754h<T> implements AbstractC89716b<T> {

    /* renamed from: a */
    private final C89785n<T, ?> f203506a;

    /* renamed from: b */
    private final Object[] f203507b;

    /* renamed from: c */
    private volatile boolean f203508c;

    /* renamed from: d */
    private AbstractC90049e f203509d;

    /* renamed from: e */
    private Throwable f203510e;

    /* renamed from: f */
    private boolean f203511f;

    static {
        Covode.recordClassIndex(105848);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.h$b */
    public static final class C89758b extends AbstractC90031ad {

        /* renamed from: a */
        private final C90204w f203517a;

        /* renamed from: b */
        private final long f203518b;

        static {
            Covode.recordClassIndex(105852);
        }

        @Override // okhttp3.AbstractC90031ad
        public final long contentLength() {
            return this.f203518b;
        }

        @Override // okhttp3.AbstractC90031ad
        public final C90204w contentType() {
            return this.f203517a;
        }

        @Override // okhttp3.AbstractC90031ad
        public final AbstractC89426h source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        C89758b(C90204w wVar, long j) {
            this.f203517a = wVar;
            this.f203518b = j;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.h$a */
    public static final class C89756a extends AbstractC90031ad {

        /* renamed from: a */
        IOException f203514a;

        /* renamed from: b */
        private final AbstractC90031ad f203515b;

        static {
            Covode.recordClassIndex(105850);
        }

        @Override // okhttp3.AbstractC90031ad, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f203515b.close();
        }

        @Override // okhttp3.AbstractC90031ad
        public final long contentLength() {
            return this.f203515b.contentLength();
        }

        @Override // okhttp3.AbstractC90031ad
        public final C90204w contentType() {
            return this.f203515b.contentType();
        }

        @Override // okhttp3.AbstractC90031ad
        public final AbstractC89426h source() {
            return C89436q.m155160a(new AbstractC89431l(this.f203515b.source()) {
                /* class p4640l.C89754h.C89756a.C897571 */

                static {
                    Covode.recordClassIndex(105851);
                }

                @Override // p4632k.AbstractC89408aa, p4632k.AbstractC89431l
                public final long read(C89420f fVar, long j) {
                    try {
                        return super.read(fVar, j);
                    } catch (IOException e) {
                        C89756a.this.f203514a = e;
                        throw e;
                    }
                }
            });
        }

        C89756a(AbstractC90031ad adVar) {
            this.f203515b = adVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C89754h<T> clone() {
        return new C89754h<>(this.f203506a, this.f203507b);
    }

    /* renamed from: f */
    private AbstractC90049e m155809f() {
        AbstractC90049e a = this.f203506a.f203582c.mo144767a(this.f203506a.mo144327a(this.f203507b));
        Objects.requireNonNull(a, "Call.Factory returned null.");
        return a;
    }

    @Override // p4640l.AbstractC89716b
    /* renamed from: b */
    public final boolean mo144269b() {
        MethodCollector.m26663i(8450);
        boolean z = true;
        if (this.f203508c) {
            MethodCollector.m26664o(8450);
            return true;
        }
        synchronized (this) {
            try {
                AbstractC90049e eVar = this.f203509d;
                if (eVar == null || !eVar.mo144712d()) {
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(8450);
            }
        }
        return z;
    }

    @Override // p4640l.AbstractC89716b
    /* renamed from: a */
    public final C89781l<T> mo144267a() {
        AbstractC90049e eVar;
        MethodCollector.m26663i(8447);
        synchronized (this) {
            try {
                if (!this.f203511f) {
                    this.f203511f = true;
                    Throwable th = this.f203510e;
                    if (th == null) {
                        eVar = this.f203509d;
                        if (eVar == null) {
                            try {
                                eVar = m155809f();
                                this.f203509d = eVar;
                            } catch (IOException | RuntimeException e) {
                                this.f203510e = e;
                                MethodCollector.m26664o(8447);
                                throw e;
                            }
                        }
                    } else if (th instanceof IOException) {
                        IOException iOException = (IOException) th;
                        MethodCollector.m26664o(8447);
                        throw iOException;
                    } else {
                        RuntimeException runtimeException = (RuntimeException) th;
                        MethodCollector.m26664o(8447);
                        throw runtimeException;
                    }
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Already executed.");
                    MethodCollector.m26664o(8447);
                    throw illegalStateException;
                }
            } catch (Throwable th2) {
                MethodCollector.m26664o(8447);
                throw th2;
            }
        }
        if (this.f203508c) {
            eVar.mo144710c();
        }
        C89781l<T> a = mo144302a(eVar.mo144709b());
        MethodCollector.m26664o(8447);
        return a;
    }

    @Override // p4640l.AbstractC89716b
    /* renamed from: d */
    public final synchronized Request mo144271d() {
        MethodCollector.m26663i(8149);
        AbstractC90049e eVar = this.f203509d;
        if (eVar != null) {
            Request a = eVar.mo144707a();
            MethodCollector.m26664o(8149);
            return a;
        }
        Throwable th = this.f203510e;
        if (th == null) {
            try {
                AbstractC90049e f = m155809f();
                this.f203509d = f;
                Request a2 = f.mo144707a();
                MethodCollector.m26664o(8149);
                return a2;
            } catch (RuntimeException e) {
                this.f203510e = e;
                MethodCollector.m26664o(8149);
                throw e;
            } catch (IOException e2) {
                this.f203510e = e2;
                RuntimeException runtimeException = new RuntimeException("Unable to create request.", e2);
                MethodCollector.m26664o(8149);
                throw runtimeException;
            }
        } else if (th instanceof IOException) {
            RuntimeException runtimeException2 = new RuntimeException("Unable to create request.", this.f203510e);
            MethodCollector.m26664o(8149);
            throw runtimeException2;
        } else {
            RuntimeException runtimeException3 = (RuntimeException) th;
            MethodCollector.m26664o(8149);
            throw runtimeException3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C89781l<T> mo144302a(C90029ac acVar) {
        AbstractC90031ad adVar = acVar.f204111g;
        C90029ac.C90030a b = acVar.mo144722b();
        b.f204124g = new C89758b(adVar.contentType(), adVar.contentLength());
        C90029ac a = b.mo144729a();
        int i = a.f204107c;
        if (i < 200 || i >= 300) {
            try {
                AbstractC90031ad a2 = C89787o.m155877a(adVar);
                C89787o.m155873a(a2, "body == null");
                C89787o.m155873a(a, "rawResponse == null");
                if (!a.mo144720a()) {
                    return new C89781l<>(a, null, a2);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } finally {
                adVar.close();
            }
        } else if (i == 204 || i == 205) {
            adVar.close();
            return C89781l.m155849a(null, a);
        } else {
            C89756a aVar = new C89756a(adVar);
            try {
                return C89781l.m155849a(this.f203506a.f203584e.mo144266a(aVar), a);
            } catch (RuntimeException e) {
                if (aVar.f203514a != null) {
                    throw aVar.f203514a;
                }
                throw e;
            }
        }
    }

    @Override // p4640l.AbstractC89716b
    /* renamed from: a */
    public final void mo144268a(final AbstractC89743d<T> dVar) {
        AbstractC90049e eVar;
        Throwable th;
        MethodCollector.m26663i(8289);
        C89787o.m155873a(dVar, "callback == null");
        synchronized (this) {
            try {
                if (!this.f203511f) {
                    this.f203511f = true;
                    eVar = this.f203509d;
                    th = this.f203510e;
                    if (eVar == null && th == null) {
                        try {
                            AbstractC90049e f = m155809f();
                            this.f203509d = f;
                            eVar = f;
                        } catch (Throwable th2) {
                            th = th2;
                            this.f203510e = th;
                        }
                    }
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Already executed.");
                    MethodCollector.m26664o(8289);
                    throw illegalStateException;
                }
            } catch (Throwable th3) {
                MethodCollector.m26664o(8289);
                throw th3;
            }
        }
        if (th != null) {
            dVar.mo34286a(this, th);
            MethodCollector.m26664o(8289);
            return;
        }
        if (this.f203508c) {
            eVar.mo144710c();
        }
        eVar.mo144708a(new AbstractC90051f() {
            /* class p4640l.C89754h.C897551 */

            static {
                Covode.recordClassIndex(105849);
            }

            @Override // okhttp3.AbstractC90051f
            public final void onFailure(AbstractC90049e eVar, IOException iOException) {
                try {
                    dVar.mo34286a(C89754h.this, iOException);
                } catch (Throwable unused) {
                }
            }

            @Override // okhttp3.AbstractC90051f
            public final void onResponse(AbstractC90049e eVar, C90029ac acVar) {
                try {
                    try {
                        dVar.mo34287a(C89754h.this, C89754h.this.mo144302a(acVar));
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
            }
        });
        MethodCollector.m26664o(8289);
    }

    C89754h(C89785n<T, ?> nVar, Object[] objArr) {
        this.f203506a = nVar;
        this.f203507b = objArr;
    }
}
