package com.p2082ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ew */
public final class C71827ew {
    static {
        Covode.recordClassIndex(84373);
    }

    /* renamed from: a */
    public static void m126823a(Activity activity) {
        if (activity != null) {
            m126826a(activity.getWindow());
        }
    }

    /* renamed from: a */
    public static Activity m126821a(Context context) {
        while (context != null) {
            if (!(context instanceof Activity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m126828b(Activity activity) {
        InputMethodManager inputMethodManager;
        if (activity != null && activity.getCurrentFocus() != null && (inputMethodManager = (InputMethodManager) m126822a(activity, "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    public static void m126824a(Dialog dialog) {
        if (dialog != null) {
            m126826a(dialog.getWindow());
        }
    }

    /* renamed from: c */
    public static void m126830c(Activity activity) {
        Window window = activity.getWindow();
        if (Build.VERSION.SDK_INT < 21) {
            int i = Build.VERSION.SDK_INT;
            window.addFlags(67108864);
        } else if (window.getStatusBarColor() != 0) {
            window.clearFlags(67108864);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
    }

    /* renamed from: a */
    private static void m126826a(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            int i = Build.VERSION.SDK_INT;
            window.getDecorView().setSystemUiVisibility(4102);
        }
    }

    /* renamed from: b */
    public static void m126829b(View view, int i) {
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    private static Object m126822a(Activity activity, String str) {
        Object obj;
        MethodCollector.m26663i(5789);
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
                    MethodCollector.m26664o(5789);
                }
            }
        } else {
            obj = activity.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m126825a(View view, int i) {
        if (view != null && view.getVisibility() != i) {
            if (i == 0 && view.getAlpha() < Float.MIN_VALUE) {
                view.setAlpha(1.0f);
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m126827a(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            if (TextUtils.isEmpty(textView.getText())) {
                if (!TextUtils.isEmpty(charSequence)) {
                    textView.setText(charSequence);
                }
            } else if (!textView.getText().equals(charSequence)) {
                textView.setText(charSequence);
            }
        }
    }
}
