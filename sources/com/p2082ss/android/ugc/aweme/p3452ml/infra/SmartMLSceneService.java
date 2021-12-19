package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService */
public abstract class SmartMLSceneService implements ISmartMLSceneService {
    public static final C60071a Companion = new C60071a((byte) 0);
    public static boolean debug = C59975a.f136570a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService$a */
    public static final class C60071a {
        static {
            Covode.recordClassIndex(70568);
        }

        private C60071a() {
        }

        public /* synthetic */ C60071a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService$b */
    public static final class C60072b {

        /* renamed from: a */
        static ISmartMLSceneService f136884a;

        /* renamed from: b */
        public static final C60072b f136885b = new C60072b();

        private C60072b() {
        }

        static {
            Covode.recordClassIndex(70569);
            ISmartMLSceneService a = SmartMLSceneServiceImpl.m109545a();
            C89219l.m154716b(a, "");
            f136884a = a;
        }
    }

    public static final ISmartMLSceneService instance() {
        return C60072b.f136884a;
    }

    static {
        Covode.recordClassIndex(70567);
    }
}
