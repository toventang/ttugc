package com.p2082ss.android.ugc.aweme.live.p3410g;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.live.g.a */
public final class C58635a {
    static {
        Covode.recordClassIndex(68935);
    }

    /* renamed from: a */
    public static void m107765a(View view, Rect rect, Runnable runnable) {
        if (view == null) {
            runnable.run();
            return;
        }
        view.setPivotX((float) rect.centerX());
        view.setPivotY((float) rect.centerY());
        view.animate().scaleX(0.0f).scaleY(0.0f).setDuration(200).setInterpolator(new DecelerateInterpolator()).withEndAction(runnable).start();
    }
}
