package com.p2082ss.android.ugc.aweme.p4173ug.guide.p4182a;

import android.app.Activity;
import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.a.a */
public final class C79640a {

    /* renamed from: a */
    public static final C79641a f178718a = new C79641a((byte) 0);

    static {
        Covode.recordClassIndex(92856);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.a.a$a */
    public static final class C79641a {
        static {
            Covode.recordClassIndex(92857);
        }

        private C79641a() {
        }

        public /* synthetic */ C79641a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m138452a(Activity activity) {
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
