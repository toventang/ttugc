package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.impl.SmartFeedLoadMoreServiceImpl;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService */
public abstract class SmartFeedLoadMoreService implements ISmartFeedLoadMoreService {
    public static final C60004a Companion = new C60004a((byte) 0);
    public static boolean debug = C59975a.f136570a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService$a */
    public static final class C60004a {
        static {
            Covode.recordClassIndex(70460);
        }

        private C60004a() {
        }

        public /* synthetic */ C60004a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService$b */
    public static final class C60005b {

        /* renamed from: a */
        public static ISmartFeedLoadMoreService f136661a;

        /* renamed from: b */
        public static final C60005b f136662b = new C60005b();

        private C60005b() {
        }

        static {
            Covode.recordClassIndex(70461);
            ISmartFeedLoadMoreService a = SmartFeedLoadMoreServiceImpl.m109535a();
            C89219l.m154716b(a, "");
            f136661a = a;
        }
    }

    public static final ISmartFeedLoadMoreService instance() {
        return C60005b.f136661a;
    }

    static {
        Covode.recordClassIndex(70459);
    }
}
