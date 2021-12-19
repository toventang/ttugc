package com.linecorp.linesdk.p2028a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.linecorp.p2025a.p2026a.p2027a.C28135b;

/* renamed from: com.linecorp.linesdk.a.c */
public final class C28158c {

    /* renamed from: a */
    static final C28135b f65888a = new C28135b("com.linecorp.linesdk.sharedpreference.encryptionsalt");

    /* renamed from: b */
    public static volatile boolean f65889b = false;

    /* renamed from: com.linecorp.linesdk.a.c$a */
    public static class RunnableC28159a implements Runnable {

        /* renamed from: a */
        private final Context f65890a;

        static {
            Covode.recordClassIndex(34100);
        }

        public final void run() {
            C28158c.f65888a.mo48095a(this.f65890a);
        }

        public RunnableC28159a(Context context) {
            this.f65890a = context;
        }
    }

    static {
        Covode.recordClassIndex(34099);
    }
}
