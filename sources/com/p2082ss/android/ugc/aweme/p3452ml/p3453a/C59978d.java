package com.p2082ss.android.ugc.aweme.p3452ml.p3453a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ExecutorService;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.a.d */
public final class C59978d {

    /* renamed from: a */
    public static final C59978d f136575a = new C59978d();

    /* renamed from: com.ss.android.ugc.aweme.ml.a.d$a */
    public static final class C59979a {

        /* renamed from: a */
        public static ExecutorService f136576a;

        /* renamed from: b */
        public static final C59979a f136577b = new C59979a();

        private C59979a() {
        }

        static {
            Covode.recordClassIndex(70399);
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
            a.f95508f = 600;
            ExecutorService a2 = C40780g.m82242a(a.mo70028a());
            C89219l.m154716b(a2, "");
            f136576a = a2;
        }
    }

    private C59978d() {
    }

    static {
        Covode.recordClassIndex(70398);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ml.a.d$b */
    public static final class C59980b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ Runnable f136578a;

        static {
            Covode.recordClassIndex(70400);
        }

        C59980b(Runnable runnable) {
            this.f136578a = runnable;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            this.f136578a.run();
            return null;
        }
    }

    /* renamed from: a */
    public static void m109498a(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        C59979a.f136576a.execute(runnable);
    }

    /* renamed from: a */
    public static void m109499a(Runnable runnable, long j) {
        C89219l.m154721d(runnable, "");
        if (j <= 0) {
            m109498a(runnable);
        } else {
            C1731i.m5631a(j).mo5534a(new C59980b(runnable), C59979a.f136576a, null);
        }
    }
}
