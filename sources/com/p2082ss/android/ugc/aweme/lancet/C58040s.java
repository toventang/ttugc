package com.p2082ss.android.ugc.aweme.lancet;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ttnet.TTNetInit;

/* renamed from: com.ss.android.ugc.aweme.lancet.s */
public final class C58040s {
    static {
        Covode.recordClassIndex(68076);
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.s$a */
    public static class RunnableC58041a implements Runnable {

        /* renamed from: a */
        public Activity f132270a;

        static {
            Covode.recordClassIndex(68077);
        }

        public final void run() {
            TTNetInit.onActivityResume(this.f132270a);
        }

        public RunnableC58041a(Activity activity) {
            this.f132270a = activity;
        }
    }
}
