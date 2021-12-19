package com.p2082ss.android.ugc.aweme.commercialize.utils;

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
import com.p2082ss.android.ugc.aweme.commercialize.event.C37837f;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.lang.reflect.Field;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.l */
public final class C38754l {

    /* renamed from: a */
    public static final C38754l f91524a = new C38754l();

    private C38754l() {
    }

    static {
        Covode.recordClassIndex(46295);
    }

    /* renamed from: b */
    private static InputMethodManager m78611b(Context context) {
        Object a = m78607a(context, "input_method");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) a;
    }

    /* renamed from: a */
    public static /* synthetic */ void m78608a(Context context) {
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
        m78612b(context, view);
    }

    /* renamed from: b */
    public static final void m78612b(Context context, View view) {
        if (context != null && view != null) {
            try {
                m78611b(context).hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
            view.clearFocus();
        }
    }

    /* renamed from: a */
    public static final void m78609a(Context context, View view) {
        if (context != null && view != null) {
            try {
                view.requestFocus();
                m78611b(context).showSoftInput(view, 2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static Object m78607a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6139);
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
                    MethodCollector.m26664o(6139);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static final void m78610a(Context context, boolean z) {
        int i;
        C37837f fVar = new C37837f(z);
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            i = activity.hashCode();
        } else {
            i = 0;
        }
        fVar.f89332b = i;
        AbstractC81915c.m141874a(fVar);
    }
}
