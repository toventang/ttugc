package com.p2082ss.android.ugc.aweme.common.p2634f;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.common.f.e */
public final class C39115e {
    static {
        Covode.recordClassIndex(46731);
    }

    /* renamed from: a */
    public static int m79409a(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: b */
    public static void m79414b(View view) {
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            view.getLayoutParams().height = m79409a(view.getContext());
        }
    }

    /* renamed from: a */
    public static void m79413a(final View view) {
        final InputMethodManager inputMethodManager = (InputMethodManager) m79411a(view.getContext(), "input_method");
        if (!inputMethodManager.showSoftInput(view, 0)) {
            view.postDelayed(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.common.p2634f.C39115e.RunnableC391161 */

                /* renamed from: c */
                final /* synthetic */ int f92316c = 0;

                static {
                    Covode.recordClassIndex(46732);
                }

                public final void run() {
                    inputMethodManager.showSoftInput(view, this.f92316c);
                }
            }, 100);
        }
    }

    /* renamed from: a */
    public static void m79412a(Activity activity, View view) {
        if (activity != null) {
            ((InputMethodManager) m79410a(activity, "input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    private static Object m79410a(Activity activity, String str) {
        Object obj;
        MethodCollector.m26663i(13861);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = activity.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = activity.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(13861);
                }
            }
        } else {
            obj = activity.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static Object m79411a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(13817);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(13817);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
