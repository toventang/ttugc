package com.p2082ss.android.ugc.aweme.feed.p2979x;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.x.s */
public final class C50553s {
    static {
        Covode.recordClassIndex(59700);
    }

    /* renamed from: a */
    public static void m94778a(final View view) {
        if (view != null) {
            view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2979x.C50553s.RunnableC505541 */

                static {
                    Covode.recordClassIndex(59701);
                }

                public final void run() {
                    view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
    }
}
