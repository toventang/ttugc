package okhttp3;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.AbstractRunnableC90073b;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4653a.C90059a;
import okhttp3.internal.p4654b.C90074a;
import okhttp3.internal.p4654b.C90076c;
import okhttp3.internal.p4654b.C90082g;
import okhttp3.internal.p4655c.AbstractC90090c;
import okhttp3.internal.p4655c.C90087a;
import okhttp3.internal.p4655c.C90088b;
import okhttp3.internal.p4655c.C90095g;
import okhttp3.internal.p4655c.C90098j;
import okhttp3.internal.p4659g.C90160f;
import p4632k.C89409ab;
import p4632k.C89414d;

/* renamed from: okhttp3.aa */
public final class C90022aa implements AbstractC90049e {

    /* renamed from: a */
    final C90208y f204086a;

    /* renamed from: b */
    final C90098j f204087b;

    /* renamed from: c */
    final C89414d f204088c;

    /* renamed from: d */
    public AbstractC90191p f204089d;

    /* renamed from: e */
    final Request f204090e;

    /* renamed from: f */
    final boolean f204091f;

    /* renamed from: g */
    private boolean f204092g;

    static {
        Covode.recordClassIndex(106194);
    }

    @Override // okhttp3.AbstractC90049e
    /* renamed from: a */
    public final Request mo144707a() {
        return this.f204090e;
    }

    @Override // okhttp3.AbstractC90049e
    /* renamed from: e */
    public final C89409ab mo144713e() {
        return this.f204088c;
    }

    @Override // okhttp3.AbstractC90049e
    /* renamed from: d */
    public final boolean mo144712d() {
        return this.f204087b.f204492c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.aa$a */
    public final class C90024a extends AbstractRunnableC90073b {

        /* renamed from: b */
        static final /* synthetic */ boolean f204094b = true;

        /* renamed from: a */
        final AbstractC90051f f204095a;

        static {
            Covode.recordClassIndex(106196);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final String mo144716a() {
            return C90022aa.this.f204090e.url().f204861d;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[Catch:{ all -> 0x00ab }] */
        @Override // okhttp3.internal.AbstractRunnableC90073b
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo144717b() {
            /*
            // Method dump skipped, instructions count: 182
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C90022aa.C90024a.mo144717b():void");
        }

        C90024a(AbstractC90051f fVar) {
            super("OkHttp %s", C90022aa.this.mo144714f());
            this.f204095a = fVar;
        }
    }

    /* renamed from: h */
    private void m156236h() {
        this.f204087b.f204491b = C90160f.f204720c.mo144942a("response.body().close()");
    }

    @Override // java.lang.Object
    public final /* synthetic */ Object clone() {
        return m156235a(this.f204086a, this.f204090e, this.f204091f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final String mo144714f() {
        return this.f204090e.url().mo145059i();
    }

    @Override // okhttp3.AbstractC90049e
    /* renamed from: c */
    public final void mo144710c() {
        AbstractC90090c cVar;
        C90076c cVar2;
        MethodCollector.m26663i(6186);
        C90098j jVar = this.f204087b;
        jVar.f204492c = true;
        C90082g gVar = jVar.f204490a;
        if (gVar != null) {
            synchronized (gVar.f204433c) {
                try {
                    gVar.f204437g = true;
                    cVar = gVar.f204438h;
                    cVar2 = gVar.f204436f;
                } finally {
                    MethodCollector.m26664o(6186);
                }
            }
            if (cVar != null) {
                cVar.mo144854c();
                MethodCollector.m26664o(6186);
            } else if (cVar2 != null) {
                C90084c.m156416a(cVar2.f204402b);
            }
        }
    }

    @Override // okhttp3.AbstractC90049e
    /* renamed from: b */
    public final C90029ac mo144709b() {
        MethodCollector.m26663i(5888);
        synchronized (this) {
            try {
                if (!this.f204092g) {
                    this.f204092g = true;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Already Executed");
                    MethodCollector.m26664o(5888);
                    throw illegalStateException;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(5888);
                throw th;
            }
        }
        m156236h();
        this.f204088c.mo143791c();
        this.f204089d.callStart(this);
        try {
            this.f204086a.f204905c.mo145014a(this);
            C90029ac g = mo144715g();
            if (g != null) {
                this.f204086a.f204905c.mo145015b(this);
                MethodCollector.m26664o(5888);
                return g;
            }
            IOException iOException = new IOException("Canceled");
            MethodCollector.m26664o(5888);
            throw iOException;
        } catch (IOException e) {
            IOException a = mo144706a(e);
            this.f204089d.callFailed(this, a);
            MethodCollector.m26664o(5888);
            throw a;
        } catch (Throwable th2) {
            this.f204086a.f204905c.mo145015b(this);
            MethodCollector.m26664o(5888);
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C90029ac mo144715g() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f204086a.f204909g);
        arrayList.add(this.f204087b);
        arrayList.add(new C90087a(this.f204086a.f204913k));
        arrayList.add(new C90059a(this.f204086a.mo145085a()));
        arrayList.add(new C90074a(this.f204086a));
        if (!this.f204091f) {
            arrayList.addAll(this.f204086a.f204910h);
        }
        arrayList.add(new C90088b(this.f204091f));
        C90029ac a = new C90095g(arrayList, null, null, null, 0, this.f204090e, this, this.f204089d, this.f204086a.f204901A, this.f204086a.f204902B, this.f204086a.f204903C).mo144857a(this.f204090e);
        if (!this.f204087b.f204492c) {
            return a;
        }
        C90084c.m156415a(a);
        throw new IOException("Canceled");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final IOException mo144706a(IOException iOException) {
        if (!this.f204088c.mo143792d()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // okhttp3.AbstractC90049e
    /* renamed from: a */
    public final void mo144708a(AbstractC90051f fVar) {
        MethodCollector.m26663i(6033);
        synchronized (this) {
            try {
                if (!this.f204092g) {
                    this.f204092g = true;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Already Executed");
                    MethodCollector.m26664o(6033);
                    throw illegalStateException;
                }
            } finally {
                MethodCollector.m26664o(6033);
            }
        }
        m156236h();
        this.f204089d.callStart(this);
        C90188n nVar = this.f204086a.f204905c;
        C90024a aVar = new C90024a(fVar);
        synchronized (nVar) {
            try {
                nVar.f204836a.add(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        nVar.mo145016b();
        MethodCollector.m26664o(6033);
    }

    /* renamed from: a */
    public static C90022aa m156235a(C90208y yVar, Request request, boolean z) {
        C90022aa aaVar = new C90022aa(yVar, request, z);
        aaVar.f204089d = yVar.f204911i.create(aaVar);
        return aaVar;
    }

    private C90022aa(C90208y yVar, Request request, boolean z) {
        this.f204086a = yVar;
        this.f204090e = request;
        this.f204091f = z;
        this.f204087b = new C90098j(yVar, z);
        C900231 r3 = new C89414d() {
            /* class okhttp3.C90022aa.C900231 */

            static {
                Covode.recordClassIndex(106195);
            }

            @Override // p4632k.C89414d
            /* renamed from: a */
            public final void mo50807a() {
                C90022aa.this.mo144710c();
            }
        };
        this.f204088c = r3;
        r3.mo143784a((long) yVar.f204928z, TimeUnit.MILLISECONDS);
    }
}
