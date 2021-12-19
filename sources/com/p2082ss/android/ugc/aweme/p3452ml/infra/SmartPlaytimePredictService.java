package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService */
public abstract class SmartPlaytimePredictService implements ISmartPlaytimePredictService {
    public static final C60076a Companion = new C60076a((byte) 0);
    public static boolean debug = C59975a.f136570a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService$a */
    public static final class C60076a {
        static {
            Covode.recordClassIndex(70576);
        }

        private C60076a() {
        }

        public /* synthetic */ C60076a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService$b */
    public static final class C60077b {

        /* renamed from: a */
        public static ISmartPlaytimePredictService f136899a;

        /* renamed from: b */
        public static final C60077b f136900b = new C60077b();

        private C60077b() {
        }

        static {
            Covode.recordClassIndex(70577);
            ISmartPlaytimePredictService a = SmartPlaytimePredictServiceImpl.m109549a();
            C89219l.m154716b(a, "");
            f136899a = a;
        }
    }

    public static final ISmartPlaytimePredictService instance() {
        return C60077b.f136899a;
    }

    static {
        Covode.recordClassIndex(70575);
    }
}
