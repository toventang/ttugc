package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.impl.SmartPreloadCommentV2ServiceImpl;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service */
public abstract class SmartPreloadCommentV2Service implements ISmartPreloadCommentV2Service {
    public static final C60008a Companion = new C60008a((byte) 0);
    public static boolean debug = C59975a.f136570a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service$a */
    public static final class C60008a {
        static {
            Covode.recordClassIndex(70468);
        }

        private C60008a() {
        }

        public /* synthetic */ C60008a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service$b */
    public static final class C60009b {

        /* renamed from: a */
        public static ISmartPreloadCommentV2Service f136665a;

        /* renamed from: b */
        public static final C60009b f136666b = new C60009b();

        private C60009b() {
        }

        static {
            Covode.recordClassIndex(70469);
            ISmartPreloadCommentV2Service a = SmartPreloadCommentV2ServiceImpl.m109540a();
            C89219l.m154716b(a, "");
            f136665a = a;
        }
    }

    public static final ISmartPreloadCommentV2Service instance() {
        return C60009b.f136665a;
    }

    static {
        Covode.recordClassIndex(70467);
    }
}
