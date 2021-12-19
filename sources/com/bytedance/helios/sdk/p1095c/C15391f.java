package com.bytedance.helios.sdk.p1095c;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.C15302a;
import com.bytedance.helios.api.p1088b.C15317m;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.p1097d.AbstractC15412n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.c.f */
public final class C15391f {

    /* renamed from: a */
    public static final C15391f f37559a = new C15391f();

    private C15391f() {
    }

    /* renamed from: com.bytedance.helios.sdk.c.f$a */
    public static final class RunnableC15392a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C15318n f37560a;

        static {
            Covode.recordClassIndex(17644);
        }

        public RunnableC15392a(C15318n nVar) {
            this.f37560a = nVar;
        }

        public final void run() {
            C15320o.m28228a(this.f37560a, false);
        }
    }

    static {
        Covode.recordClassIndex(17643);
    }

    /* renamed from: a */
    public static final void m28290a(C15318n nVar) {
        C15302a aVar;
        C89219l.m154719c(nVar, "");
        if (nVar.f37362h && nVar.f37374t == 0) {
            C15320o.m28228a(nVar, false);
        } else if (nVar.f37374t == 1 && ((!C89219l.m154714a((Object) nVar.f37363i, (Object) AbstractC15412n.f37629d[0])) || (aVar = nVar.f37349A) == null || aVar.f37318a != 0)) {
            C15320o.m28228a(nVar, false);
        } else if (HeliosEnvImpl.INSTANCE.isTestEnv()) {
            C15320o.m28228a(nVar, true);
        }
    }

    /* renamed from: a */
    public static final void m28291a(String str, long j) {
        C89219l.m154719c(str, "");
        m28292a(str, j, false);
    }

    /* renamed from: a */
    public static final void m28292a(String str, long j, boolean z) {
        C89219l.m154719c(str, "");
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis <= 1) {
            return;
        }
        if (C12290b.m22068a("sky_eye_apm_log") || z) {
            C15320o.m28227a(new C15317m(str, currentTimeMillis));
        }
    }
}
