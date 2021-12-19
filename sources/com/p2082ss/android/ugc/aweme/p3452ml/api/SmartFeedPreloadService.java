package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.impl.SmartFeedPreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService */
public abstract class SmartFeedPreloadService implements ISmartFeedPreloadService {
    public static final C60006a Companion = new C60006a((byte) 0);
    public static boolean debug = C59975a.f136570a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService$a */
    public static final class C60006a {
        static {
            Covode.recordClassIndex(70464);
        }

        private C60006a() {
        }

        public /* synthetic */ C60006a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService$b */
    public static final class C60007b {

        /* renamed from: a */
        public static ISmartFeedPreloadService f136663a;

        /* renamed from: b */
        public static final C60007b f136664b = new C60007b();

        private C60007b() {
        }

        static {
            Covode.recordClassIndex(70465);
            ISmartFeedPreloadService a = SmartFeedPreloadServiceImpl.m109538a();
            C89219l.m154716b(a, "");
            f136663a = a;
        }
    }

    public static final ISmartFeedPreloadService instance() {
        return C60007b.f136663a;
    }

    static {
        Covode.recordClassIndex(70463);
    }
}
