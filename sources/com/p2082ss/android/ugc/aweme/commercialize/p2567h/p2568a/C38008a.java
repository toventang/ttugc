package com.p2082ss.android.ugc.aweme.commercialize.p2567h.p2568a;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.commercialize.h.a.a */
public final class C38008a {

    /* renamed from: a */
    public static final C38008a f89816a = new C38008a();

    private C38008a() {
    }

    static {
        Covode.recordClassIndex(45469);
    }

    /* renamed from: b */
    private static InputMethodManager m77073b(Context context) {
        Object a = m77069a(context, "input_method");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) a;
    }

    /* renamed from: a */
    public static final void m77070a(Context context) {
        Context context2;
        Window window;
        View decorView;
        View view = null;
        if (!(context instanceof Activity)) {
            context2 = null;
        } else {
            context2 = context;
        }
        Activity activity = (Activity) context2;
        if (!(activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            view = decorView.findFocus();
        }
        if (context != null && view != null) {
            try {
                m77073b(context).hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
            view.clearFocus();
        }
    }

    /* renamed from: a */
    public static final void m77071a(Context context, View view) {
        if (context != null && view != null) {
            try {
                view.requestFocus();
                m77073b(context).showSoftInput(view, 2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static Object m77069a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11961);
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
                    MethodCollector.m26664o(11961);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static final void m77072a(Context context, boolean z) {
        int i;
        AbstractC37687t a = C37663b.f89031b.mo65688a();
        if (a != null) {
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                i = activity.hashCode();
            } else {
                i = 0;
            }
            a.mo65649a(i, z);
        }
    }
}
