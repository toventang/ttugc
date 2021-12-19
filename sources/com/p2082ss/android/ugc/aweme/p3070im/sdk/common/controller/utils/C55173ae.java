package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae */
public final class C55173ae {

    /* renamed from: a */
    public static Handler f126228a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(64918);
    }

    /* renamed from: a */
    public static void m100882a(View view) {
        view.setOnTouchListener(new View.OnTouchListener() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55173ae.View$OnTouchListenerC551762 */

            static {
                Covode.recordClassIndex(64921);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    C55173ae.m100883a(true, view);
                } else if (action == 1 || action == 3) {
                    C55173ae.m100883a(false, view);
                }
                return false;
            }
        });
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae$a */
    public static class View$OnTouchListenerC55177a implements View.OnTouchListener {
        static {
            Covode.recordClassIndex(64922);
        }

        /* renamed from: a */
        public final void mo92194a(View... viewArr) {
            if (viewArr.length > 0) {
                for (View view : viewArr) {
                    if (view != null) {
                        view.setOnTouchListener(this);
                    }
                }
            }
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                C55173ae.m100883a(true, view);
            } else if (action == 1 || action == 3) {
                C55173ae.m100883a(false, view);
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m100883a(boolean z, View view) {
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.5f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(100L);
        ofFloat.start();
    }

    /* renamed from: a */
    public static void m100881a(final int i, final int i2, View... viewArr) {
        int i3 = 0;
        do {
            final View view = viewArr[i3];
            view.setOnTouchListener(new View.OnTouchListener() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55173ae.View$OnTouchListenerC551741 */

                static {
                    Covode.recordClassIndex(64919);
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    view.setBackgroundColor(i2);
                    C55173ae.f126228a.postDelayed(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55173ae.View$OnTouchListenerC551741.RunnableC551751 */

                        static {
                            Covode.recordClassIndex(64920);
                        }

                        public final void run() {
                            view.setBackgroundColor(i);
                        }
                    }, 150);
                    return false;
                }
            });
            i3++;
        } while (i3 < 2);
    }
}
