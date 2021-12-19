package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.j */
public final class C53697j {

    /* renamed from: c */
    public static final C53699a f123211c = new C53699a((byte) 0);

    /* renamed from: a */
    public long f123212a;

    /* renamed from: b */
    public long f123213b;

    /* renamed from: d */
    private final AbstractC89171a<Long> f123214d;

    static {
        Covode.recordClassIndex(63277);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.j$a */
    public static final class C53699a {
        static {
            Covode.recordClassIndex(63279);
        }

        private C53699a() {
        }

        /* renamed from: a */
        public static C53697j m98968a() {
            C53697j jVar = new C53697j();
            jVar.mo90241a();
            return jVar;
        }

        public /* synthetic */ C53699a(byte b) {
            this();
        }
    }

    public /* synthetic */ C53697j() {
        this(C536981.f123215a);
    }

    /* renamed from: c */
    public final long mo90243c() {
        return this.f123213b - this.f123212a;
    }

    /* renamed from: a */
    public final void mo90241a() {
        this.f123212a = this.f123214d.invoke().longValue();
    }

    /* renamed from: b */
    public final void mo90242b() {
        this.f123213b = this.f123214d.invoke().longValue();
    }

    /* renamed from: d */
    public final boolean mo90244d() {
        if (this.f123212a <= 0 || this.f123213b != 0) {
            return false;
        }
        return true;
    }

    private C53697j(AbstractC89171a<Long> aVar) {
        this.f123214d = aVar;
    }
}
