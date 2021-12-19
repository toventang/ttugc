package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.impl.MLCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.api.MLCommonService */
public abstract class MLCommonService implements IMLCommonService {
    public static final C59996a Companion = new C59996a((byte) 0);
    public static boolean debug = C59975a.f136570a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.MLCommonService$a */
    public static final class C59996a {
        static {
            Covode.recordClassIndex(70443);
        }

        private C59996a() {
        }

        public /* synthetic */ C59996a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.MLCommonService$b */
    public static final class C59997b {

        /* renamed from: a */
        public static IMLCommonService f136653a;

        /* renamed from: b */
        public static final C59997b f136654b = new C59997b();

        private C59997b() {
        }

        static {
            Covode.recordClassIndex(70444);
            IMLCommonService a = MLCommonServiceImpl.m109529a();
            C89219l.m154716b(a, "");
            f136653a = a;
        }
    }

    public static final IMLCommonService instance() {
        return C59997b.f136653a;
    }

    static {
        Covode.recordClassIndex(70442);
    }
}
