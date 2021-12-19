package com.bytedance.apm.trace;

import com.bytedance.apm.C12397c;
import com.bytedance.apm.block.evil.EvilMethodSwitcher;
import com.bytedance.apm.p773f.p774a.C12455b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.trace.b */
public final class C12609b {

    /* renamed from: a */
    public static C12634e f30660a;

    /* renamed from: b */
    public static boolean f30661b;

    static {
        Covode.recordClassIndex(14426);
    }

    /* renamed from: a */
    public static void m22738a() {
        C12634e eVar = new C12634e("start_trace", "launch_stats");
        f30660a = eVar;
        eVar.f30757b = System.currentTimeMillis();
        if (C12397c.m22286c()) {
            boolean isOpenLaunchEvilMethod = EvilMethodSwitcher.isOpenLaunchEvilMethod();
            f30661b = isOpenLaunchEvilMethod;
            if (isOpenLaunchEvilMethod) {
                C12455b.m22420a();
            }
        }
    }

    /* renamed from: com.bytedance.apm.trace.b$a */
    public static class C12610a {

        /* renamed from: a */
        public boolean f30662a;

        /* renamed from: b */
        public boolean f30663b;

        /* renamed from: c */
        public boolean f30664c;

        /* renamed from: d */
        public boolean f30665d;

        /* renamed from: e */
        public boolean f30666e;

        /* renamed from: com.bytedance.apm.trace.b$a$a */
        public static class C12611a {

            /* renamed from: a */
            public boolean f30667a;

            /* renamed from: b */
            public boolean f30668b;

            /* renamed from: c */
            public boolean f30669c;

            /* renamed from: d */
            public boolean f30670d;

            /* renamed from: e */
            public boolean f30671e;

            static {
                Covode.recordClassIndex(14428);
            }
        }

        static {
            Covode.recordClassIndex(14427);
        }

        private C12610a(C12611a aVar) {
            this.f30662a = aVar.f30667a;
            this.f30663b = aVar.f30668b;
            this.f30664c = aVar.f30669c;
            this.f30665d = aVar.f30670d;
            this.f30666e = aVar.f30671e;
        }

        public /* synthetic */ C12610a(C12611a aVar, byte b) {
            this(aVar);
        }
    }
}
