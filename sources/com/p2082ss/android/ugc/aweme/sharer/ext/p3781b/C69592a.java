package com.p2082ss.android.ugc.aweme.sharer.ext.p3781b;

import android.app.Activity;
import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.b.a */
public final class C69592a {

    /* renamed from: a */
    public static final C69593a f155431a = new C69593a((byte) 0);

    static {
        Covode.recordClassIndex(81964);
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.b.a$a */
    public static final class C69593a {
        static {
            Covode.recordClassIndex(81965);
        }

        private C69593a() {
        }

        public /* synthetic */ C69593a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m122891a(Activity activity) {
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
