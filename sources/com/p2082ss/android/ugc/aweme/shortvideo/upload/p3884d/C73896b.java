package com.p2082ss.android.ugc.aweme.shortvideo.upload.p3884d;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73842ac;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.utils.C80540hn;
import java.util.concurrent.TimeUnit;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.d.b */
public final class C73896b {

    /* renamed from: h */
    public static final C73897a f165906h = new C73897a((byte) 0);

    /* renamed from: a */
    public final C27252o f165907a = C27252o.m54254a(C80540hn.f180153b);

    /* renamed from: b */
    public long f165908b = -1;

    /* renamed from: c */
    public long f165909c = -1;

    /* renamed from: d */
    public int f165910d;

    /* renamed from: e */
    public long f165911e = -1;

    /* renamed from: f */
    public long f165912f = -1;

    /* renamed from: g */
    public boolean f165913g;

    /* renamed from: i */
    private final AbstractC89244h f165914i = C89250i.m154773a((AbstractC89171a) C73898b.f165916a);

    /* renamed from: j */
    private final AbstractC89244h f165915j = C89250i.m154773a((AbstractC89171a) C73899c.f165917a);

    static {
        Covode.recordClassIndex(86642);
    }

    /* renamed from: a */
    public final C27252o mo116341a() {
        return (C27252o) this.f165914i.getValue();
    }

    /* renamed from: b */
    public final C73842ac mo116343b() {
        return (C73842ac) this.f165915j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.d.b$a */
    public static final class C73897a {
        static {
            Covode.recordClassIndex(86643);
        }

        private C73897a() {
        }

        public /* synthetic */ C73897a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.d.b$b */
    static final class C73898b extends AbstractC89220m implements AbstractC89171a<C27252o> {

        /* renamed from: a */
        public static final C73898b f165916a = new C73898b();

        static {
            Covode.recordClassIndex(86644);
        }

        C73898b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27252o invoke() {
            return C27252o.m54254a(C80540hn.f180153b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.d.b$c */
    static final class C73899c extends AbstractC89220m implements AbstractC89171a<C73842ac> {

        /* renamed from: a */
        public static final C73899c f165917a = new C73899c();

        static {
            Covode.recordClassIndex(86645);
        }

        C73899c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C73842ac invoke() {
            return new C73842ac();
        }
    }

    /* renamed from: c */
    public final boolean mo116344c() {
        if (this.f165909c != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final long mo116345d() {
        return mo116341a().mo45339a(TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public static void m129982a(String str) {
        String concat = "PublishPerformanceRecorder : ".concat(String.valueOf(str));
        C63244g.m114602a();
        C73991bj.m130131b(concat);
    }

    /* renamed from: a */
    public final void mo116342a(int i) {
        if (!mo116341a().f64413a) {
            m129982a("repeat endSynthetic");
            return;
        }
        mo116341a().mo45341c();
        this.f165909c = System.currentTimeMillis();
        this.f165910d = i;
    }
}
