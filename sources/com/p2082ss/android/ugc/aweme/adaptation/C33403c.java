package com.p2082ss.android.ugc.aweme.adaptation;

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
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.adaptation.c */
public final class C33403c {

    /* renamed from: a */
    public static boolean f79371a;

    /* renamed from: b */
    public static int f79372b = 49;

    /* renamed from: c */
    public static final int f79373c;

    /* renamed from: d */
    public static boolean f79374d = C16048b.m29633a().mo25421a(true, "enable_full_screen_read_adaption", true);

    /* renamed from: e */
    public static final int f79375e;

    /* renamed from: f */
    public static final int f79376f = C34728n.m70946a(8.0d);

    /* renamed from: m */
    public static int f79377m;

    /* renamed from: n */
    public static int f79378n;

    /* renamed from: o */
    static final C1213t<Integer> f79379o;

    /* renamed from: p */
    public static LiveData<Integer> f79380p;

    /* renamed from: u */
    private static int f79381u = -1;

    /* renamed from: g */
    public int f79382g;

    /* renamed from: h */
    public int f79383h;

    /* renamed from: i */
    public int f79384i;

    /* renamed from: j */
    public int f79385j;

    /* renamed from: k */
    public boolean f79386k;

    /* renamed from: l */
    public C33405a f79387l;

    /* renamed from: q */
    public boolean f79388q;

    /* renamed from: r */
    public boolean f79389r;

    /* renamed from: s */
    public boolean f79390s;

    /* renamed from: t */
    public boolean f79391t;

    /* renamed from: com.ss.android.ugc.aweme.adaptation.c$c */
    public interface AbstractC33407c {
        static {
            Covode.recordClassIndex(40264);
        }

        /* renamed from: d */
        void mo59483d();
    }

    /* renamed from: com.ss.android.ugc.aweme.adaptation.c$d */
    public interface AbstractC33408d {
        static {
            Covode.recordClassIndex(40265);
        }

        /* renamed from: a */
        void mo59484a();
    }

    /* renamed from: com.ss.android.ugc.aweme.adaptation.c$e */
    public interface AbstractC33409e {
        static {
            Covode.recordClassIndex(40266);
        }

        void bs_();
    }

    /* renamed from: b */
    static boolean m68508b() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.adaptation.c$b */
    public static class C33406b {

        /* renamed from: a */
        public static C33403c f79409a = new C33403c((byte) 0);

        static {
            Covode.recordClassIndex(40263);
        }
    }

    private C33403c() {
        this.f79387l = new C33405a();
    }

    /* renamed from: a */
    public static int m68502a() {
        double d;
        if (f79374d) {
            d = (double) f79373c;
        } else {
            d = 47.0d;
        }
        return C34728n.m70946a(d);
    }

    static {
        boolean z;
        int i;
        Covode.recordClassIndex(40260);
        Display defaultDisplay = ((WindowManager) m68504a(C17867d.m33078a(), "window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (m68508b()) {
            try {
                defaultDisplay.getRealMetrics(displayMetrics);
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
            }
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        if (((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) <= 640) {
            z = true;
        } else {
            z = false;
        }
        f79371a = z;
        if (z) {
            i = f79372b;
        } else {
            i = 58;
        }
        f79373c = i;
        f79375e = C34728n.m70946a((double) (i - 47));
        C1213t<Integer> tVar = new C1213t<>();
        f79379o = tVar;
        f79380p = tVar;
    }

    /* synthetic */ C33403c(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.adaptation.c$a */
    public class C33405a {

        /* renamed from: a */
        public boolean f79403a;

        /* renamed from: b */
        public int f79404b;

        /* renamed from: c */
        public int f79405c;

        /* renamed from: d */
        public int f79406d;

        /* renamed from: e */
        public Rect f79407e;

        static {
            Covode.recordClassIndex(40262);
        }

        public C33405a() {
        }
    }

    /* renamed from: d */
    public static int m68511d(Context context) {
        if (C29843f.m60128a()) {
            return m68510c(context);
        }
        return C13628n.m24525e(context);
    }

    /* renamed from: b */
    public static boolean m68509b(Context context) {
        if (!C29843f.m60128a()) {
            return false;
        }
        if (context == null || Settings.Secure.getInt(context.getContentResolver(), "display_notch_status", 0) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m68510c(Context context) {
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
    public static int m68503a(Activity activity) {
        int i;
        WindowManager windowManager = (WindowManager) m68504a(C17867d.m33078a(), "window");
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
    public static boolean m68507a(Context context) {
        if (context == null || !m68508b() || Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Object m68504a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4555);
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
                    MethodCollector.m26664o(4555);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m68506a(View view, View view2, View view3) {
        m68505a(2, view, view2, view3, false, null);
    }

    /* renamed from: a */
    public static void m68505a(int i, View view, View view2, View view3, boolean z, AbstractC33408d dVar) {
        if (f79374d && view != null && view2 != null) {
            C29339a.m58754b(new RunnableC33412f(i, view2, view, z, view3, dVar));
        }
    }
}
