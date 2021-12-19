package com.p2082ss.android.ugc.aweme.feed.p2959p;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.C49791b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.feed.p.a */
public final class C49772a {

    /* renamed from: a */
    public static final C49772a f114516a = new C49772a();

    /* renamed from: b */
    private static final AbstractC89244h f114517b = C89250i.m154773a((AbstractC89171a) C49773a.f114518a);

    /* renamed from: a */
    public static C49791b m93221a() {
        return (C49791b) f114517b.getValue();
    }

    private C49772a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.p.a$a */
    static final class C49773a extends AbstractC89220m implements AbstractC89171a<C49791b> {

        /* renamed from: a */
        public static final C49773a f114518a = new C49773a();

        static {
            Covode.recordClassIndex(58878);
        }

        C49773a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C49791b invoke() {
            return new C49791b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.p.a$b */
    public static final class RunnableC49774b implements Runnable {

        /* renamed from: a */
        public static final RunnableC49774b f114519a = new RunnableC49774b();

        static {
            Covode.recordClassIndex(58879);
        }

        RunnableC49774b() {
        }

        public final void run() {
            C49772a.m93221a().mo84332b();
        }
    }

    static {
        Covode.recordClassIndex(58877);
    }

    /* renamed from: b */
    public static void m93222b() {
        if (C49783b.m93234a()) {
            new Handler().postDelayed(RunnableC49774b.f114519a, 5000);
        }
    }
}
