package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.p3195a;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.d */
public final class C55298d<T> {

    /* renamed from: a */
    public final C1445j.AbstractC1451e<T> f126420a;

    /* renamed from: b */
    public final Executor f126421b;

    /* renamed from: c */
    public final Executor f126422c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.d$a */
    public static final class C55299a<T> {

        /* renamed from: c */
        public static final C55300a f126423c = new C55300a((byte) 0);

        /* renamed from: e */
        private static final Object f126424e = new Object();

        /* renamed from: f */
        private static Executor f126425f;

        /* renamed from: a */
        Executor f126426a;

        /* renamed from: b */
        Executor f126427b;

        /* renamed from: d */
        private final C1445j.AbstractC1451e<T> f126428d;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.d$a$a */
        public static final class C55300a {
            static {
                Covode.recordClassIndex(65057);
            }

            private C55300a() {
            }

            public /* synthetic */ C55300a(byte b) {
                this();
            }
        }

        static {
            Covode.recordClassIndex(65056);
        }

        /* renamed from: a */
        public final C55298d<T> mo92319a() {
            MethodCollector.m26663i(3229);
            if (this.f126427b == null) {
                synchronized (f126424e) {
                    try {
                        if (f126425f == null) {
                            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
                            a.f95505c = 2;
                            f126425f = C40780g.m82242a(a.mo70028a());
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(3229);
                        throw th;
                    }
                }
                this.f126427b = f126425f;
            }
            C1445j.AbstractC1451e<T> eVar = this.f126428d;
            Executor executor = this.f126427b;
            if (executor == null) {
                C89219l.m154715b();
            }
            C55298d<T> dVar = new C55298d<>(eVar, executor, this.f126426a, (byte) 0);
            MethodCollector.m26664o(3229);
            return dVar;
        }

        public C55299a(C1445j.AbstractC1451e<T> eVar) {
            C89219l.m154721d(eVar, "");
            this.f126428d = eVar;
        }
    }

    static {
        Covode.recordClassIndex(65055);
    }

    private C55298d(C1445j.AbstractC1451e<T> eVar, Executor executor, Executor executor2) {
        this.f126420a = eVar;
        this.f126421b = executor;
        this.f126422c = executor2;
    }

    public /* synthetic */ C55298d(C1445j.AbstractC1451e eVar, Executor executor, Executor executor2, byte b) {
        this(eVar, executor, executor2);
    }
}
