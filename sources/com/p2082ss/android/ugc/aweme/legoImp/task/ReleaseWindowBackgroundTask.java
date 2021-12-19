package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask */
public final class ReleaseWindowBackgroundTask implements AbstractC58264w {

    /* renamed from: a */
    public static final C58383a f132936a = new C58383a((byte) 0);

    /* renamed from: b */
    private final WeakReference<Activity> f132937b;

    static {
        Covode.recordClassIndex(68586);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask$a */
    public static final class C58383a {
        static {
            Covode.recordClassIndex(68587);
        }

        private C58383a() {
        }

        public /* synthetic */ C58383a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    public ReleaseWindowBackgroundTask(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f132937b = new WeakReference<>(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        WeakReference<Activity> weakReference;
        Activity activity;
        Window window;
        View decorView;
        C89219l.m154721d(context, "");
        Drawable drawable = null;
        if (!(C16048b.m29633a().mo25421a(true, "is_release_window_background", true) || (weakReference = this.f132937b) == null || (activity = weakReference.get()) == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            drawable = decorView.getBackground();
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            Object a = m106459a(applicationContext, "input_method");
            if (a != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) a;
                if (inputMethodManager != null) {
                    try {
                        Field declaredField = inputMethodManager.getClass().getDeclaredField("mCurRootView");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(inputMethodManager);
                        if (obj != null && (obj instanceof View)) {
                            Field declaredField2 = ((View) obj).getClass().getDeclaredField("mResizingBackgroundDrawable");
                            declaredField2.setAccessible(true);
                            declaredField2.set(obj, drawable);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private static Object m106459a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6579);
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
                    MethodCollector.m26664o(6579);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
