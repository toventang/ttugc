package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.impl.SmartPreloadProfileV2ServiceImpl;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service */
public abstract class SmartPreloadProfileV2Service implements ISmartPreloadProfileV2Service {
    public static final C60010a Companion = new C60010a((byte) 0);
    public static boolean debug = C59975a.f136570a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service$a */
    public static final class C60010a {
        static {
            Covode.recordClassIndex(70472);
        }

        private C60010a() {
        }

        public /* synthetic */ C60010a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service$b */
    public static final class C60011b {

        /* renamed from: a */
        public static ISmartPreloadProfileV2Service f136667a;

        /* renamed from: b */
        public static final C60011b f136668b = new C60011b();

        private C60011b() {
        }

        static {
            Covode.recordClassIndex(70473);
            ISmartPreloadProfileV2Service a = SmartPreloadProfileV2ServiceImpl.m109541a();
            C89219l.m154716b(a, "");
            f136667a = a;
        }
    }

    public static final ISmartPreloadProfileV2Service instance() {
        return C60011b.f136667a;
    }

    static {
        Covode.recordClassIndex(70471);
    }
}
