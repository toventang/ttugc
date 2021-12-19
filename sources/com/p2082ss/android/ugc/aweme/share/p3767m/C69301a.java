package com.p2082ss.android.ugc.aweme.share.p3767m;

import android.app.Activity;
import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.share.m.a */
public final class C69301a {

    /* renamed from: a */
    public static final C69302a f154868a = new C69302a((byte) 0);

    static {
        Covode.recordClassIndex(81631);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.m.a$a */
    public static final class C69302a {
        static {
            Covode.recordClassIndex(81632);
        }

        private C69302a() {
        }

        public /* synthetic */ C69302a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m122500a(Activity activity) {
            if (activity == null || activity.isFinishing()) {
                return true;
            }
            int i = Build.VERSION.SDK_INT;
            if (activity.isDestroyed()) {
                return true;
            }
            return false;
        }
    }
}
