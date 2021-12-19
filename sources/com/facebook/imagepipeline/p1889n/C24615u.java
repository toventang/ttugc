package com.facebook.imagepipeline.p1889n;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1889n.AbstractC24529ag;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.facebook.imagepipeline.n.u */
public final class C24615u extends AbstractC24585c<C24614t> {

    /* renamed from: a */
    int f58499a;

    /* renamed from: b */
    private final ExecutorService f58500b;

    static {
        Covode.recordClassIndex(28759);
    }

    public C24615u() {
        this(m47114a());
    }

    /* renamed from: a */
    private static ExecutorService m47114a() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 3;
        return C40780g.m82242a(a.mo70028a());
    }

    public C24615u(int i) {
        this(m47114a());
        this.f58499a = i;
    }

    private C24615u(ExecutorService executorService) {
        this.f58500b = executorService;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24529ag
    public final C24614t createFetchState(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        return new C24614t(kVar, alVar);
    }

    /* renamed from: a */
    static String m47113a(String str, Object... objArr) {
        return C1764a.m5929a(Locale.getDefault(), str, objArr);
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24529ag
    public final void fetch(final C24614t tVar, final AbstractC24529ag.AbstractC24530a aVar) {
        final Future<?> submit = this.f58500b.submit(new Runnable() {
            /* class com.facebook.imagepipeline.p1889n.C24615u.RunnableC246161 */

            static {
                Covode.recordClassIndex(28760);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:67:0x0117, code lost:
                r0 = e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:68:0x0118, code lost:
                r1 = null;
             */
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[Catch:{ IOException -> 0x0117 }] */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x008a A[Catch:{ IOException -> 0x0117 }] */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x008e A[Catch:{ IOException -> 0x0117 }] */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x008f A[Catch:{ IOException -> 0x0117 }] */
            /* JADX WARNING: Removed duplicated region for block: B:80:0x012d A[SYNTHETIC, Splitter:B:80:0x012d] */
            /* JADX WARNING: Removed duplicated region for block: B:84:0x0132 A[DONT_GENERATE] */
            /* JADX WARNING: Removed duplicated region for block: B:86:0x00f7 A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 322
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1889n.C24615u.RunnableC246161.run():void");
            }
        });
        tVar.f58495e.mo40414a(new C24587e() {
            /* class com.facebook.imagepipeline.p1889n.C24615u.C246172 */

            static {
                Covode.recordClassIndex(28761);
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
            /* renamed from: a */
            public final void mo34237a() {
                if (submit.cancel(false)) {
                    aVar.mo40400a();
                }
            }
        });
    }
}
