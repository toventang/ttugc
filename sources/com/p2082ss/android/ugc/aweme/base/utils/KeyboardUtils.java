package com.p2082ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.utils.KeyboardUtils */
public final class KeyboardUtils {

    /* renamed from: a */
    public static List<ClearCursorDecorator> f81995a = new ArrayList(2);

    /* renamed from: b */
    public static List<AndroidBug5497Workaround> f81996b = new ArrayList(2);

    /* renamed from: c */
    private static final int f81997c = C34728n.m70946a(73.0d);

    /* renamed from: com.ss.android.ugc.aweme.base.utils.KeyboardUtils$a */
    public interface AbstractC34711a {
        static {
            Covode.recordClassIndex(41703);
        }

        /* renamed from: b */
        void mo61027b();

        /* renamed from: c */
        void mo61028c();
    }

    /* renamed from: com.ss.android.ugc.aweme.base.utils.KeyboardUtils$ClearCursorDecorator */
    public static class ClearCursorDecorator implements AbstractC33974au {

        /* renamed from: a */
        public EditText f82001a;

        static {
            Covode.recordClassIndex(41702);
        }

        @Override // androidx.lifecycle.AbstractC1202k
        public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
                onDestroy();
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
        public void onDestroy() {
            this.f82001a = null;
            for (ClearCursorDecorator clearCursorDecorator : KeyboardUtils.f81995a) {
                if (clearCursorDecorator == this) {
                    KeyboardUtils.f81995a.remove(this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.base.utils.KeyboardUtils$AndroidBug5497Workaround */
    public static class AndroidBug5497Workaround implements AbstractC33974au {

        /* renamed from: a */
        View f81998a;

        /* renamed from: b */
        AbstractC34711a f81999b;

        /* renamed from: c */
        private ViewTreeObserver.OnGlobalLayoutListener f82000c;

        static {
            Covode.recordClassIndex(41701);
        }

        @Override // androidx.lifecycle.AbstractC1202k
        public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
                onStop();
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
        public void onStop() {
            Iterator<AndroidBug5497Workaround> it = KeyboardUtils.f81996b.iterator();
            while (true) {
                if (it.hasNext()) {
                    AndroidBug5497Workaround next = it.next();
                    if (next == this) {
                        KeyboardUtils.f81996b.remove(next);
                        break;
                    }
                } else {
                    break;
                }
            }
            View view = this.f81998a;
            if (!(view == null || view.getViewTreeObserver() == null || !this.f81998a.getViewTreeObserver().isAlive())) {
                this.f81998a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f82000c);
            }
            this.f81998a = null;
            this.f82000c = null;
            this.f81999b = null;
        }

        private AndroidBug5497Workaround(AbstractC1204m mVar, View view, AbstractC34711a aVar) {
            mVar.getLifecycle().mo4012a(this);
            this.f81999b = aVar;
            this.f82000c = new ViewTreeObserver$OnGlobalLayoutListenerC34716c(this);
            View rootView = view.getRootView();
            this.f81998a = rootView;
            rootView.getViewTreeObserver().addOnGlobalLayoutListener(this.f82000c);
        }

        /* synthetic */ AndroidBug5497Workaround(AbstractC1204m mVar, View view, AbstractC34711a aVar, byte b) {
            this(mVar, view, aVar);
        }
    }

    static {
        Covode.recordClassIndex(41700);
    }

    /* renamed from: b */
    public static void m70896b(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) m70892a(C17867d.m33078a(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    /* renamed from: c */
    public static void m70897c(View view) {
        InputMethodManager inputMethodManager;
        if (view != null && (inputMethodManager = (InputMethodManager) m70892a(C17867d.m33078a(), "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    public static void m70894a(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) m70892a(C17867d.m33078a(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 2);
        }
    }

    /* renamed from: a */
    public static void m70893a(Activity activity, int i) {
        Window window = activity.getWindow();
        int i2 = window.getAttributes().softInputMode;
        int i3 = i & 240;
        if ((i2 & 240) != i3) {
            window.setSoftInputMode(i3 ^ (i2 & -241));
        }
    }

    /* renamed from: a */
    private static Object m70892a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(14016);
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
                    MethodCollector.m26664o(14016);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m70895a(AbstractC1204m mVar, View view, AbstractC34711a aVar) {
        f81996b.add(new AndroidBug5497Workaround(mVar, view, aVar, (byte) 0));
    }
}
