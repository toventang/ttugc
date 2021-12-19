package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.impl.SmartFeedAdUIServiceImpl;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService */
public abstract class SmartFeedAdUIService implements ISmartFeedAdUIService {
    public static final C60002a Companion = new C60002a((byte) 0);
    public static boolean debug = C59975a.f136570a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService$a */
    public static final class C60002a {
        static {
            Covode.recordClassIndex(70456);
        }

        private C60002a() {
        }

        public /* synthetic */ C60002a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService$b */
    public static final class C60003b {

        /* renamed from: a */
        public static ISmartFeedAdUIService f136659a;

        /* renamed from: b */
        public static final C60003b f136660b = new C60003b();

        private C60003b() {
        }

        static {
            Covode.recordClassIndex(70457);
            ISmartFeedAdUIService a = SmartFeedAdUIServiceImpl.m109533a();
            C89219l.m154716b(a, "");
            f136659a = a;
        }
    }

    public static final ISmartFeedAdUIService instance() {
        return C60003b.f136659a;
    }

    static {
        Covode.recordClassIndex(70455);
    }
}
