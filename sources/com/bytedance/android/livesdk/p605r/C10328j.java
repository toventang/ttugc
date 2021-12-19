package com.bytedance.android.livesdk.p605r;

import android.animation.TimeInterpolator;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.r.j */
public final class C10328j {

    /* renamed from: a */
    public static Map<String, AbstractC10312b> f24961a = new HashMap();

    /* renamed from: b */
    public static String f24962b = "live_default_window";

    /* renamed from: com.bytedance.android.livesdk.r.j$a */
    public static class C10329a {

        /* renamed from: a */
        Context f24963a;

        /* renamed from: b */
        public View f24964b;

        /* renamed from: c */
        int f24965c;

        /* renamed from: d */
        public int f24966d = -2;

        /* renamed from: e */
        public int f24967e = -2;

        /* renamed from: f */
        int f24968f = 8388659;

        /* renamed from: g */
        int f24969g;

        /* renamed from: h */
        int f24970h;

        /* renamed from: i */
        boolean f24971i = true;

        /* renamed from: j */
        Class[] f24972j;

        /* renamed from: k */
        public int f24973k = 3;

        /* renamed from: l */
        int f24974l;

        /* renamed from: m */
        int f24975m;

        /* renamed from: n */
        int f24976n;

        /* renamed from: o */
        int f24977o;

        /* renamed from: p */
        long f24978p = 300;

        /* renamed from: q */
        TimeInterpolator f24979q;

        /* renamed from: r */
        public String f24980r = C10328j.f24962b;

        /* renamed from: s */
        public boolean f24981s;

        /* renamed from: t */
        public AbstractC10317f f24982t;

        /* renamed from: u */
        boolean f24983u;

        /* renamed from: v */
        long f24984v;

        /* renamed from: w */
        TimeInterpolator f24985w;

        static {
            Covode.recordClassIndex(11895);
        }

        /* renamed from: a */
        public final C10329a mo17109a() {
            this.f24974l = 0;
            this.f24975m = 0;
            return this;
        }

        private C10329a() {
        }

        /* renamed from: b */
        public final void mo17111b() {
            MethodCollector.m26663i(11680);
            if (C10328j.f24961a.containsKey(this.f24980r)) {
                C3854a.m9453a(6, "LiveFloatWindowManager", "Float window has been added!");
                MethodCollector.m26664o(11680);
                return;
            }
            if (this.f24964b == null) {
                if (this.f24965c == 0) {
                    C3854a.m9453a(6, "LiveFloatWindowManager", "view can not be null!");
                    MethodCollector.m26664o(11680);
                    return;
                }
                this.f24964b = ((LayoutInflater) m18799a(this.f24963a, "layout_inflater")).inflate(this.f24965c, (ViewGroup) null);
            }
            C10328j.f24961a.put(this.f24980r, new C10319h(this));
            MethodCollector.m26664o(11680);
        }

        /* renamed from: a */
        public final C10329a mo17110a(TimeInterpolator timeInterpolator) {
            this.f24978p = 300;
            this.f24979q = timeInterpolator;
            return this;
        }

        C10329a(Context context) {
            this.f24963a = context;
        }

        /* renamed from: a */
        private static Object m18799a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(11847);
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
                        MethodCollector.m26664o(11847);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    static {
        Covode.recordClassIndex(11894);
    }

    /* renamed from: a */
    public static C10329a m18796a(Context context) {
        return new C10329a(context);
    }

    /* renamed from: a */
    public static void m18797a(String str) {
        f24961a.remove(str);
    }

    /* renamed from: b */
    public static AbstractC10312b m18798b(String str) {
        if (C13627m.m24498a(str)) {
            return null;
        }
        return f24961a.get(str);
    }
}
