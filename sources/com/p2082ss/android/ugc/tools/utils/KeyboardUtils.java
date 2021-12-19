package com.p2082ss.android.ugc.tools.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.tools.utils.KeyboardUtils */
public final class KeyboardUtils {

    /* renamed from: a */
    public static List<ClearCursorDecorator> f189693a = new ArrayList(2);

    /* renamed from: b */
    public static List<AndroidBug5497Workaround> f189694b = new ArrayList(2);

    /* renamed from: com.ss.android.ugc.tools.utils.KeyboardUtils$a */
    public interface AbstractC84878a {
        static {
            Covode.recordClassIndex(98872);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.utils.KeyboardUtils$ClearCursorDecorator */
    public static class ClearCursorDecorator implements AbstractC33974au {

        /* renamed from: a */
        public EditText f189698a;

        static {
            Covode.recordClassIndex(98871);
        }

        @Override // androidx.lifecycle.AbstractC1202k
        public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
                onDestroy();
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
        public void onDestroy() {
            this.f189698a = null;
            for (ClearCursorDecorator clearCursorDecorator : KeyboardUtils.f189693a) {
                if (clearCursorDecorator == this) {
                    KeyboardUtils.f189693a.remove(this);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(98869);
    }

    /* renamed from: com.ss.android.ugc.tools.utils.KeyboardUtils$AndroidBug5497Workaround */
    static class AndroidBug5497Workaround implements AbstractC33974au {

        /* renamed from: a */
        private ViewTreeObserver.OnGlobalLayoutListener f189695a;

        /* renamed from: b */
        private View f189696b;

        /* renamed from: c */
        private AbstractC84878a f189697c;

        static {
            Covode.recordClassIndex(98870);
        }

        @Override // androidx.lifecycle.AbstractC1202k
        public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
                onStop();
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
        public void onStop() {
            Iterator<AndroidBug5497Workaround> it = KeyboardUtils.f189694b.iterator();
            while (true) {
                if (it.hasNext()) {
                    AndroidBug5497Workaround next = it.next();
                    if (next == this) {
                        KeyboardUtils.f189694b.remove(next);
                        break;
                    }
                } else {
                    break;
                }
            }
            if (this.f189696b.getViewTreeObserver() != null && this.f189696b.getViewTreeObserver().isAlive()) {
                this.f189696b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f189695a);
            }
            this.f189696b = null;
            this.f189695a = null;
            this.f189697c = null;
        }
    }

    /* renamed from: a */
    public static void m145808a(View view, Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) m145807a(context, "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 2);
        }
    }

    /* renamed from: b */
    public static void m145809b(View view, Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) m145807a(context, "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    /* renamed from: c */
    public static void m145810c(View view, Context context) {
        InputMethodManager inputMethodManager;
        if (view != null && (inputMethodManager = (InputMethodManager) m145807a(context, "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    private static Object m145807a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8722);
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
                    MethodCollector.m26664o(8722);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
