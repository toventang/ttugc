package com.bytedance.android.livesdk.chatroom.p492g;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.g.e */
public final class C7573e {
    static {
        Covode.recordClassIndex(8346);
    }

    /* renamed from: a */
    public static void m15563a(Context context, final View view, final boolean z, int i) {
        float f;
        if (context != null && view != null) {
            C6229a.m13521a(context);
            if (z) {
                f = 0.0f;
            } else {
                f = (float) (i * 1);
            }
            view.animate().translationX(f).setDuration(200).setListener(new Animator.AnimatorListener() {
                /* class com.bytedance.android.livesdk.chatroom.p492g.C7573e.C75741 */

                static {
                    Covode.recordClassIndex(8347);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (!z) {
                        view.setVisibility(8);
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    if (view.getVisibility() != 8 || z) {
                        view.setVisibility(0);
                    }
                }
            }).start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r4 != false) goto L_0x0011;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15564a(android.content.Context r2, final android.view.View r3, final boolean r4, final boolean r5) {
        /*
            if (r2 == 0) goto L_0x0004
            if (r3 != 0) goto L_0x0005
        L_0x0004:
            return
        L_0x0005:
            if (r4 != 0) goto L_0x0011
            if (r5 == 0) goto L_0x000e
            r0 = 8
            r3.setVisibility(r0)
        L_0x000e:
            r1 = 0
            if (r4 == 0) goto L_0x0013
        L_0x0011:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0013:
            android.view.ViewPropertyAnimator r0 = r3.animate()
            android.view.ViewPropertyAnimator r2 = r0.alpha(r1)
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            com.bytedance.android.livesdk.chatroom.g.e$2 r0 = new com.bytedance.android.livesdk.chatroom.g.e$2
            r0.<init>(r4, r5, r3)
            android.view.ViewPropertyAnimator r0 = r1.setListener(r0)
            r0.start()
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p492g.C7573e.m15564a(android.content.Context, android.view.View, boolean, boolean):void");
    }
}
