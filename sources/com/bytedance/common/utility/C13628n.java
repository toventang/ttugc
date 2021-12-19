package com.bytedance.common.utility;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;

/* renamed from: com.bytedance.common.utility.n */
public final class C13628n {

    /* renamed from: a */
    public static final boolean f33109a;

    /* renamed from: b */
    public static C13631a f33110b = new C13631a();

    /* renamed from: c */
    private static AbstractC13632b f33111c;

    /* renamed from: d */
    private static String f33112d = "";

    /* renamed from: e */
    private static int f33113e = -1;

    /* renamed from: com.bytedance.common.utility.n$a */
    public static class C13631a {
        static {
            Covode.recordClassIndex(15658);
        }
    }

    /* renamed from: com.bytedance.common.utility.n$b */
    public interface AbstractC13632b {
        static {
            Covode.recordClassIndex(15659);
        }

        /* renamed from: a */
        boolean mo21888a(Context context, CharSequence charSequence, long j);
    }

    /* renamed from: a */
    private static boolean m24518a(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    /* renamed from: a */
    public static void m24513a(final View view, final int i, final int i2, final int i3, final int i4) {
        view.post(new Runnable() {
            /* class com.bytedance.common.utility.C13628n.RunnableC136302 */

            static {
                Covode.recordClassIndex(15657);
            }

            public final void run() {
                Rect rect = new Rect();
                view.getHitRect(rect);
                rect.top += i2;
                rect.bottom += i4;
                rect.left += i;
                rect.right += i3;
                TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                if (View.class.isInstance(view.getParent())) {
                    ((View) view.getParent()).setTouchDelegate(touchDelegate);
                }
            }
        });
    }

    /* renamed from: a */
    public static boolean m24517a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    public static void m24512a(View view, int i, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            m24514a(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3);
        }
    }

    /* renamed from: a */
    private static void m24514a(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3) {
        if (view != null && marginLayoutParams != null) {
            if (marginLayoutParams.leftMargin != -3 || marginLayoutParams.topMargin != i || marginLayoutParams.rightMargin != i2 || marginLayoutParams.bottomMargin != i3) {
                if (i != -3) {
                    marginLayoutParams.topMargin = i;
                }
                if (i2 != -3) {
                    marginLayoutParams.rightMargin = i2;
                }
                if (i3 != -3) {
                    marginLayoutParams.bottomMargin = i3;
                }
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: a */
    public static void m24515a(TextView textView, CharSequence charSequence) {
        if (textView != null && !TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public static boolean m24519a(View view) {
        if (view == null || view.getAnimation() == null) {
            return false;
        }
        view.clearAnimation();
        return true;
    }

    /* renamed from: a */
    private static void m24516a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(toast);
        }
        toast.show();
    }

    static {
        boolean z;
        Covode.recordClassIndex(15655);
        if (Build.VERSION.SDK_INT > 19) {
            z = true;
        } else {
            z = false;
        }
        f33109a = z;
    }

    /* renamed from: e */
    public static int m24525e(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public static int m24504a(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static int m24521b(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    /* renamed from: c */
    public static String m24523c(Context context) {
        if (C13627m.m24498a(f33112d) && context != null) {
            int a = m24504a(context);
            int b = m24521b(context);
            if (a > 0 && b > 0) {
                f33112d = a + "*" + b;
            }
        }
        return f33112d;
    }

    /* renamed from: d */
    public static int m24524d(Context context) {
        if (f33113e == -1 && context != null) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            f33113e = applicationContext.getResources().getDisplayMetrics().densityDpi;
        }
        return f33113e;
    }

    /* renamed from: a */
    public static void m24506a(Context context, int i) {
        m24508a(context, 0, context.getString(i));
    }

    /* renamed from: a */
    public static float m24503a(Context context, float f) {
        if (context != null) {
            return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m24520b(Context context, float f) {
        if (context != null) {
            return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static int m24522c(Context context, float f) {
        if (context != null) {
            return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        return 0;
    }

    /* renamed from: a */
    public static void m24505a(Activity activity, boolean z) {
        if (activity != null && !activity.isFinishing()) {
            activity.setRequestedOrientation(!z ? 1 : 0);
            if (z) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    /* renamed from: a */
    public static void m24510a(View view, int i) {
        if (view != null && view.getVisibility() != i && m24518a(i)) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m24507a(Context context, int i, int i2) {
        m24508a(context, i, context.getString(i2));
    }

    /* renamed from: a */
    public static void m24508a(Context context, int i, String str) {
        m24509a(context, i, str, 0, 17);
    }

    /* renamed from: a */
    public static void m24511a(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            if (layoutParams.width != i || layoutParams.height != i2) {
                if (i != -3) {
                    layoutParams.width = i;
                }
                if (i2 != -3) {
                    layoutParams.height = i2;
                }
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    public static void m24509a(final Context context, final int i, final String str, final int i2, final int i3) {
        if (context != null && !C13627m.m24498a(str)) {
            if (!m24517a()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    /* class com.bytedance.common.utility.C13628n.RunnableC136291 */

                    static {
                        Covode.recordClassIndex(15656);
                    }

                    public final void run() {
                        C13628n.m24509a(context, i, str, i2, i3);
                    }
                });
                return;
            }
            AbstractC13632b bVar = f33111c;
            if (bVar != null && bVar.mo21888a(context, str, (long) i2)) {
                return;
            }
            if (!(context instanceof AbstractC13615f)) {
                try {
                    Toast makeText = Toast.makeText(context, str, i2);
                    if (makeText != null) {
                        makeText.setGravity(i3, 0, 0);
                        m24516a(makeText);
                    }
                } catch (Exception e) {
                    Logger.throwException(e);
                }
            } else if (i2 == 1) {
                ((AbstractC13615f) context).showCustomLongToast(i, str);
            } else {
                AbstractC13615f fVar = (AbstractC13615f) context;
                if (i2 == 0) {
                    i2 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                }
                fVar.showCustomToast(i, str, i2, i3);
            }
        }
    }
}
