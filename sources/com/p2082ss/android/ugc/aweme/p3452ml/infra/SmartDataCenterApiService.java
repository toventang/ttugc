package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiService */
public abstract class SmartDataCenterApiService implements ISmartDataCenterApiService {
    public static final C60069a Companion = new C60069a((byte) 0);
    public static boolean debug = C59975a.f136570a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiService$a */
    public static final class C60069a {
        static {
            Covode.recordClassIndex(70563);
        }

        private C60069a() {
        }

        public /* synthetic */ C60069a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiService$b */
    public static final class C60070b {

        /* renamed from: a */
        public static ISmartDataCenterApiService f136882a;

        /* renamed from: b */
        public static final C60070b f136883b = new C60070b();

        private C60070b() {
        }

        static {
            Covode.recordClassIndex(70564);
            ISmartDataCenterApiService a = SmartDataCenterApiServiceImpl.m109544a();
            C89219l.m154716b(a, "");
            f136882a = a;
        }
    }

    public static final ISmartDataCenterApiService instance() {
        return C60070b.f136882a;
    }

    static {
        Covode.recordClassIndex(70562);
    }
}
