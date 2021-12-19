package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.utils.C80540hn;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.concurrent.TimeUnit;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ac */
public final class C73842ac {

    /* renamed from: a */
    private final AbstractC89244h f165763a = C89250i.m154773a((AbstractC89171a) C73843a.f165764a);

    static {
        Covode.recordClassIndex(86588);
    }

    /* renamed from: d */
    private final C27252o m129904d() {
        return (C27252o) this.f165763a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ac$a */
    static final class C73843a extends AbstractC89220m implements AbstractC89171a<C27252o> {

        /* renamed from: a */
        public static final C73843a f165764a = new C73843a();

        static {
            Covode.recordClassIndex(86589);
        }

        C73843a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27252o invoke() {
            return C27252o.m54254a(C80540hn.f180153b);
        }
    }

    /* renamed from: c */
    public final long mo116300c() {
        return m129904d().mo45339a(TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public final void mo116299b() {
        if (!m129904d().f64413a) {
            m129903a("repeat stop");
        } else {
            m129904d().mo45341c();
        }
    }

    /* renamed from: a */
    public final void mo116298a() {
        if (m129904d().f64413a) {
            m129903a("repeat start");
        } else {
            m129904d().mo45340b();
        }
    }

    /* renamed from: a */
    private static void m129903a(String str) {
        String concat = "UploadWaitTimeCounter upload sdk call error: ".concat(String.valueOf(str));
        C63244g.m114602a();
        C84911q.m145926b(concat);
    }
}
