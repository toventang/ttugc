package com.bytedance.android.livesdk.survey.p637b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.b.a */
public final class C10796a {

    /* renamed from: a */
    public boolean f26000a;

    /* renamed from: b */
    public final AbstractC89171a<C89391z> f26001b;

    /* renamed from: c */
    private long f26002c;

    /* renamed from: d */
    private long f26003d;

    /* renamed from: e */
    private long f26004e;

    /* renamed from: f */
    private long f26005f;

    /* renamed from: g */
    private AbstractC88412b f26006g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.survey.b.a$b */
    public static final class C10798b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10798b f26008a = new C10798b();

        static {
            Covode.recordClassIndex(12400);
        }

        C10798b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(12398);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.survey.b.a$c */
    public static final class C10799c implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C10796a f26009a;

        static {
            Covode.recordClassIndex(12401);
        }

        C10799c(C10796a aVar) {
            this.f26009a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f26009a.f26000a = false;
        }
    }

    /* renamed from: b */
    public final void mo17710b() {
        this.f26004e = SystemClock.uptimeMillis();
        this.f26000a = false;
        AbstractC88412b bVar = this.f26006g;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: c */
    public final void mo17711c() {
        AbstractC88412b bVar = this.f26006g;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f26003d = 0;
        this.f26004e = 0;
        this.f26005f = 0;
        this.f26000a = false;
    }

    /* renamed from: a */
    public final void mo17708a() {
        if (this.f26002c > 0) {
            if (this.f26000a) {
                mo17711c();
            }
            long j = this.f26004e;
            if (j != 0) {
                this.f26005f += j - this.f26003d;
                this.f26004e = 0;
            }
            this.f26003d = SystemClock.uptimeMillis();
            m19395b(this.f26002c - this.f26005f);
            this.f26000a = true;
        }
    }

    /* renamed from: d */
    public final long mo17712d() {
        long j;
        long j2;
        long j3;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f26000a) {
            j = this.f26002c;
            j2 = uptimeMillis - this.f26003d;
            j3 = this.f26005f;
        } else {
            long j4 = this.f26004e;
            if (j4 == 0) {
                return this.f26002c - this.f26005f;
            }
            j = this.f26002c;
            j2 = j4 - this.f26003d;
            j3 = this.f26005f;
        }
        return j - (j2 + j3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.survey.b.a$a */
    public static final class C10797a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10796a f26007a;

        static {
            Covode.recordClassIndex(12399);
        }

        C10797a(C10796a aVar) {
            this.f26007a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f26007a.f26001b.invoke();
        }
    }

    /* renamed from: b */
    private final void m19395b(long j) {
        AbstractC88412b bVar = this.f26006g;
        if (bVar != null) {
            bVar.dispose();
        }
        if (j > 0) {
            this.f26006g = AbstractC88979t.m154307b(j, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143255a(new C10797a(this), C10798b.f26008a, new C10799c(this));
        }
    }

    /* renamed from: a */
    public final void mo17709a(long j) {
        this.f26002c = TimeUnit.SECONDS.toMillis(j);
        if (this.f26000a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j2 = this.f26005f + (uptimeMillis - this.f26003d);
            this.f26005f = j2;
            this.f26003d = uptimeMillis;
            m19395b(this.f26002c - j2);
        }
    }

    public C10796a(long j, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f26001b = aVar;
        this.f26002c = TimeUnit.SECONDS.toMillis(j);
    }
}
