package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.data.SmartDataTrackerServiceImpl;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService */
public abstract class SmartDataTrackerService implements ISmartDataTrackerService {
    public static final C60000a Companion = new C60000a((byte) 0);
    public static boolean debug = C59975a.f136570a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService$a */
    public static final class C60000a {
        static {
            Covode.recordClassIndex(70452);
        }

        private C60000a() {
        }

        public /* synthetic */ C60000a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService$b */
    public static final class C60001b {

        /* renamed from: a */
        public static ISmartDataTrackerService f136657a;

        /* renamed from: b */
        public static final C60001b f136658b = new C60001b();

        private C60001b() {
        }

        static {
            Covode.recordClassIndex(70453);
            ISmartDataTrackerService a = SmartDataTrackerServiceImpl.m109519a();
            C89219l.m154716b(a, "");
            f136657a = a;
        }
    }

    public static final ISmartDataTrackerService instance() {
        return C60001b.f136657a;
    }

    static {
        Covode.recordClassIndex(70451);
    }
}
