package com.p2082ss.android.ugc.aweme.notification.utils;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.g */
public final class C62262g {

    /* renamed from: a */
    private static float f141313a;

    static {
        Covode.recordClassIndex(73036);
    }

    /* renamed from: b */
    public static void m112636b(Context context) {
        if (context != null) {
            f141313a = m112638c(context);
        }
    }

    /* renamed from: a */
    public static int m112633a(Context context) {
        float f = f141313a;
        if (f > 0.0f) {
            return (int) f;
        }
        float c = m112638c(context);
        f141313a = c;
        return (int) c;
    }

    /* renamed from: b */
    public static void m112637b(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setForeground(null);
        } else {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: a */
    public static void m112634a(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setForeground(view.getResources().getDrawable(R.drawable.oj));
        } else {
            C62023a.m112168a(view);
        }
    }

    /* renamed from: c */
    private static float m112638c(Context context) {
        float f = 0.0f;
        if (context == null) {
            return 0.0f;
        }
        int[] iArr = {R.string.d6v, R.string.baw, R.string.d9f, R.string.d6z, R.string.dj5, R.string.dk6, R.string.bay, R.string.bxw, R.string.d2m};
        Paint paint = new Paint();
        paint.setTextSize(C13628n.m24520b(context, 14.0f));
        float b = C13628n.m24520b(context, 88.0f);
        float b2 = C13628n.m24520b(context, 120.0f);
        int i = 0;
        do {
            float measureText = paint.measureText(context.getString(iArr[i]));
            if (measureText > f) {
                f = measureText;
            }
            i++;
        } while (i < 9);
        float b3 = f + C13628n.m24520b(context, 16.0f);
        if (b3 > b2) {
            return b2;
        }
        if (b3 < b) {
            return b;
        }
        return b3;
    }

    /* renamed from: a */
    public static void m112635a(final View view, final int i, final int i2, final int i3, final int i4) {
        ((View) view.getParent()).post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.notification.utils.C62262g.RunnableC622631 */

            static {
                Covode.recordClassIndex(73037);
            }

            public final void run() {
                Rect rect = new Rect();
                view.setEnabled(true);
                view.getHitRect(rect);
                rect.top -= i;
                rect.bottom += i2;
                rect.left -= i3;
                rect.right += i4;
                TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                if (view.getParent() instanceof View) {
                    ((View) view.getParent()).setTouchDelegate(touchDelegate);
                }
            }
        });
    }
}
