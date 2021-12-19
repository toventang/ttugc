package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService */
public abstract class SmartRegressCalculateService implements ISmartRegressCalculateService {
    public static final C60078a Companion = new C60078a((byte) 0);
    public static boolean debug = C59975a.f136570a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService$a */
    public static final class C60078a {
        static {
            Covode.recordClassIndex(70581);
        }

        private C60078a() {
        }

        public /* synthetic */ C60078a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService$b */
    static final class C60079b {

        /* renamed from: a */
        static ISmartRegressCalculateService f136906a;

        /* renamed from: b */
        public static final C60079b f136907b = new C60079b();

        private C60079b() {
        }

        static {
            Covode.recordClassIndex(70582);
            ISmartRegressCalculateService a = SmartRegressCalculateServiceImpl.m109553a();
            C89219l.m154716b(a, "");
            f136906a = a;
        }
    }

    public static final ISmartRegressCalculateService instance() {
        return C60079b.f136906a;
    }

    static {
        Covode.recordClassIndex(70580);
    }
}
