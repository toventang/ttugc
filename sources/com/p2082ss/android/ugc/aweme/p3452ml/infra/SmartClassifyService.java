package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartClassifyService */
public abstract class SmartClassifyService implements ISmartClassifyService {
    public static final C60065a Companion = new C60065a((byte) 0);
    public static boolean debug = C59975a.f136570a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartClassifyService$a */
    public static final class C60065a {
        static {
            Covode.recordClassIndex(70553);
        }

        private C60065a() {
        }

        public /* synthetic */ C60065a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartClassifyService$b */
    static final class C60066b {

        /* renamed from: a */
        static ISmartClassifyService f136877a;

        /* renamed from: b */
        public static final C60066b f136878b = new C60066b();

        private C60066b() {
        }

        static {
            Covode.recordClassIndex(70554);
            ISmartClassifyService a = SmartClassifyServiceImpl.m109542a();
            C89219l.m154716b(a, "");
            f136877a = a;
        }
    }

    public static final ISmartClassifyService instance() {
        return C60066b.f136877a;
    }

    static {
        Covode.recordClassIndex(70552);
    }
}
