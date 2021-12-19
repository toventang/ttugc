package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.data.MLDataCenterServiceImpl;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.api.MLDataCenterService */
public abstract class MLDataCenterService implements IMLDataCenterService {
    public static final C59998a Companion = new C59998a((byte) 0);
    public static boolean debug = C59975a.f136570a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.MLDataCenterService$a */
    public static final class C59998a {
        static {
            Covode.recordClassIndex(70447);
        }

        private C59998a() {
        }

        public /* synthetic */ C59998a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.MLDataCenterService$b */
    public static final class C59999b {

        /* renamed from: a */
        public static IMLDataCenterService f136655a;

        /* renamed from: b */
        public static final C59999b f136656b = new C59999b();

        private C59999b() {
        }

        static {
            Covode.recordClassIndex(70448);
            IMLDataCenterService a = MLDataCenterServiceImpl.m109517a();
            C89219l.m154716b(a, "");
            f136655a = a;
        }
    }

    public static final IMLDataCenterService instance() {
        return C59999b.f136655a;
    }

    static {
        Covode.recordClassIndex(70446);
    }
}
