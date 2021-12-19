package androidx.work;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;

/* renamed from: androidx.work.b */
public final class C1591b {

    /* renamed from: a */
    public final Executor f5191a;

    /* renamed from: b */
    public final AbstractC1718k f5192b;

    /* renamed from: c */
    public final int f5193c;

    /* renamed from: d */
    public final int f5194d;

    /* renamed from: e */
    public final int f5195e;

    /* renamed from: f */
    public final int f5196f;

    static {
        Covode.recordClassIndex(1744);
    }

    /* renamed from: androidx.work.b$a */
    public static final class C1592a {

        /* renamed from: a */
        Executor f5197a;

        /* renamed from: b */
        AbstractC1718k f5198b;

        /* renamed from: c */
        int f5199c = 4;

        /* renamed from: d */
        int f5200d;

        /* renamed from: e */
        int f5201e = Integer.MAX_VALUE;

        /* renamed from: f */
        int f5202f = 20;

        static {
            Covode.recordClassIndex(1745);
        }

        /* renamed from: a */
        public final C1591b mo5349a() {
            return new C1591b(this);
        }
    }

    C1591b(C1592a aVar) {
        if (aVar.f5197a == null) {
            int max = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
            a.f95505c = max;
            this.f5191a = C40780g.m82242a(a.mo70028a());
        } else {
            this.f5191a = aVar.f5197a;
        }
        if (aVar.f5198b == null) {
            this.f5192b = new AbstractC1718k() {
                /* class androidx.work.AbstractC1718k.C17191 */

                static {
                    Covode.recordClassIndex(1888);
                }
            };
        } else {
            this.f5192b = aVar.f5198b;
        }
        this.f5193c = aVar.f5199c;
        this.f5194d = aVar.f5200d;
        this.f5195e = aVar.f5201e;
        this.f5196f = aVar.f5202f;
    }
}
