package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3333a;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.a.a */
public final class C57384a {

    /* renamed from: a */
    public static final int f130794a = C34728n.m70946a(11.0d);

    /* renamed from: b */
    public static final int f130795b = C34728n.m70946a(8.0d);

    /* renamed from: h */
    static int f130796h;

    /* renamed from: i */
    static int f130797i;

    /* renamed from: n */
    private static int f130798n = -1;

    /* renamed from: c */
    public int f130799c;

    /* renamed from: d */
    public int f130800d;

    /* renamed from: e */
    public int f130801e;

    /* renamed from: f */
    public boolean f130802f;

    /* renamed from: g */
    public C57389d f130803g;

    /* renamed from: j */
    public boolean f130804j;

    /* renamed from: k */
    public boolean f130805k;

    /* renamed from: l */
    public boolean f130806l;

    /* renamed from: m */
    public boolean f130807m;

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.a.a$b */
    public interface AbstractC57386b {
        static {
            Covode.recordClassIndex(67306);
        }
    }

    /* renamed from: a */
    static boolean m104008a() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.a.a$a */
    public static class C57385a {

        /* renamed from: a */
        public static C57384a f130808a = new C57384a((byte) 0);

        static {
            Covode.recordClassIndex(67305);
        }
    }

    private C57384a() {
        this.f130803g = new C57389d();
    }

    static {
        Covode.recordClassIndex(67304);
    }

    /* synthetic */ C57384a(byte b) {
        this();
    }

    /* renamed from: a */
    public static boolean m104009a(Context context) {
        if (context == null || !m104008a() || Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m104010b(Context context) {
        if (!C29843f.m60128a()) {
            return 0;
        }
        int[] iArr = {0, 0};
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((int[]) loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]))[1];
        } catch (Throwable unused) {
            return iArr[1];
        }
    }

    /* renamed from: a */
    public static int m104006a(Activity activity) {
        int i;
        WindowManager windowManager = (WindowManager) m104007a(C17867d.m33078a(), "window");
        if (windowManager == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            int i2 = displayMetrics.heightPixels;
            if (activity == null || !TextUtils.equals("OnePlus", Build.BRAND)) {
                i = defaultDisplay.getHeight();
            } else {
                View decorView = activity.getWindow().getDecorView();
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                i = rect.bottom;
            }
            return i2 - i;
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return 0;
        }
    }

    /* renamed from: a */
    private static Object m104007a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6588);
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
                    MethodCollector.m26664o(6588);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
