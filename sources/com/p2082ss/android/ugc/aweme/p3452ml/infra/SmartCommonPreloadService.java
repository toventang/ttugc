package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService */
public abstract class SmartCommonPreloadService implements ISmartCommonPreloadService {
    public static final C60067a Companion = new C60067a((byte) 0);
    public static boolean debug = C59975a.f136570a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService$a */
    public static final class C60067a {
        static {
            Covode.recordClassIndex(70558);
        }

        private C60067a() {
        }

        public /* synthetic */ C60067a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService$b */
    public static final class C60068b {

        /* renamed from: a */
        public static ISmartCommonPreloadService f136879a;

        /* renamed from: b */
        public static final C60068b f136880b = new C60068b();

        private C60068b() {
        }

        static {
            Covode.recordClassIndex(70559);
            ISmartCommonPreloadService a = SmartCommonPreloadServiceImpl.m109543a();
            C89219l.m154716b(a, "");
            f136879a = a;
        }
    }

    public static final ISmartCommonPreloadService instance() {
        return C60068b.f136879a;
    }

    static {
        Covode.recordClassIndex(70557);
    }
}
