package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.c */
public final class C1416c<T> {

    /* renamed from: a */
    public final Executor f4658a;

    /* renamed from: b */
    public final Executor f4659b;

    /* renamed from: c */
    public final C1445j.AbstractC1451e<T> f4660c;

    static {
        Covode.recordClassIndex(1554);
    }

    /* renamed from: androidx.recyclerview.widget.c$a */
    public static final class C1417a<T> {

        /* renamed from: d */
        private static final Object f4661d = new Object();

        /* renamed from: e */
        private static Executor f4662e = null;

        /* renamed from: a */
        private Executor f4663a;

        /* renamed from: b */
        private Executor f4664b;

        /* renamed from: c */
        private final C1445j.AbstractC1451e<T> f4665c;

        static {
            Covode.recordClassIndex(1555);
        }

        /* renamed from: a */
        public final C1416c<T> mo4887a() {
            if (this.f4664b == null) {
                synchronized (f4661d) {
                    if (f4662e == null) {
                        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
                        a.f95505c = 2;
                        f4662e = C40780g.m82242a(a.mo70028a());
                    }
                }
                this.f4664b = f4662e;
            }
            return new C1416c<>(this.f4663a, this.f4664b, this.f4665c);
        }

        public C1417a(C1445j.AbstractC1451e<T> eVar) {
            this.f4665c = eVar;
        }
    }

    C1416c(Executor executor, Executor executor2, C1445j.AbstractC1451e<T> eVar) {
        this.f4658a = executor;
        this.f4659b = executor2;
        this.f4660c = eVar;
    }
}
