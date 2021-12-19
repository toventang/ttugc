package androidx.activity;

import android.app.Activity;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements AbstractC1202k {

    /* renamed from: a */
    private static int f492a;

    /* renamed from: b */
    private static Field f493b;

    /* renamed from: c */
    private static Field f494c;

    /* renamed from: d */
    private static Field f495d;

    /* renamed from: e */
    private Activity f496e;

    static {
        Covode.recordClassIndex(216);
    }

    /* renamed from: a */
    private static Object m612a(Activity activity, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return activity.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return activity.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = activity.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            if (f492a == 0) {
                try {
                    f492a = 2;
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    f494c = declaredField;
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    f495d = declaredField2;
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    f493b = declaredField3;
                    declaredField3.setAccessible(true);
                    f492a = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (f492a == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) m612a(this.f496e, "input_method");
                try {
                    Object obj = f493b.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                View view = (View) f494c.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        try {
                                            f495d.set(inputMethodManager, null);
                                            inputMethodManager.isActive();
                                        } catch (IllegalAccessException unused2) {
                                        }
                                    }
                                }
                            } catch (IllegalAccessException unused3) {
                            } catch (ClassCastException unused4) {
                            }
                        }
                    }
                } catch (IllegalAccessException unused5) {
                }
            }
        }
    }
}
