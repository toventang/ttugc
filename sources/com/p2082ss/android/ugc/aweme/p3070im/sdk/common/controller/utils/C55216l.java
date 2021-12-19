package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.l */
public final class C55216l {

    /* renamed from: a */
    public static final C55216l f126290a = new C55216l();

    private C55216l() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.l$a */
    public static final class RunnableC55217a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InputMethodManager f126291a;

        /* renamed from: b */
        final /* synthetic */ View f126292b;

        /* renamed from: c */
        final /* synthetic */ int f126293c = 0;

        static {
            Covode.recordClassIndex(64964);
        }

        public RunnableC55217a(InputMethodManager inputMethodManager, View view) {
            this.f126291a = inputMethodManager;
            this.f126292b = view;
        }

        public final void run() {
            this.f126291a.showSoftInput(this.f126292b, this.f126293c);
        }
    }

    static {
        Covode.recordClassIndex(64963);
    }

    /* renamed from: a */
    public static InputMethodManager m100961a(Context context) {
        Object a = m100962a(context, "input_method");
        if (!(a instanceof InputMethodManager)) {
            a = null;
        }
        return (InputMethodManager) a;
    }

    /* renamed from: a */
    public static final void m100963a(Activity activity, View view) {
        InputMethodManager a;
        if (activity != null && view != null && (a = m100961a(activity)) != null) {
            a.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    private static Object m100962a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3923);
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
                    MethodCollector.m26664o(3923);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
