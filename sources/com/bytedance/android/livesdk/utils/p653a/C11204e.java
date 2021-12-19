package com.bytedance.android.livesdk.utils.p653a;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.utils.C11225an;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.utils.a.e */
public final class C11204e {

    /* renamed from: d */
    private static C11204e f26838d;

    /* renamed from: e */
    private static Context f26839e;

    /* renamed from: a */
    public boolean f26840a;

    /* renamed from: b */
    public long f26841b;

    /* renamed from: c */
    public long f26842c;

    /* renamed from: f */
    private final String f26843f;

    /* renamed from: g */
    private final long f26844g = 500;

    /* renamed from: h */
    private ConnectivityManager f26845h;

    /* renamed from: i */
    private long f26846i;

    static {
        Covode.recordClassIndex(12832);
    }

    /* renamed from: c */
    private long m19856c() {
        if (this.f26840a) {
            return SystemClock.elapsedRealtime() - this.f26842c;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: b */
    public final long mo17971b() {
        long j;
        long c;
        if (!this.f26840a) {
            j = System.currentTimeMillis();
            c = C11225an.f26870a;
        } else {
            j = this.f26841b;
            c = m19856c();
        }
        return j + c;
    }

    /* renamed from: a */
    public final boolean mo17970a() {
        NetworkInfo a;
        MethodCollector.m26663i(11699);
        if (TextUtils.isEmpty(this.f26843f)) {
            MethodCollector.m26664o(11699);
            return false;
        }
        synchronized (this) {
            try {
                if (this.f26845h == null) {
                    this.f26845h = (ConnectivityManager) m19855b(f26839e, "connectivity");
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(11699);
                throw th;
            }
        }
        ConnectivityManager connectivityManager = this.f26845h;
        if (connectivityManager == null || (a = m19853a(connectivityManager)) == null || !a.isConnected()) {
            MethodCollector.m26664o(11699);
            return false;
        }
        C11205f fVar = new C11205f();
        if (fVar.mo17972a(this.f26843f, (int) this.f26844g)) {
            this.f26840a = true;
            this.f26841b = fVar.f26847a;
            this.f26842c = fVar.f26848b;
            this.f26846i = fVar.f26849c / 2;
            MethodCollector.m26664o(11699);
            return true;
        }
        MethodCollector.m26664o(11699);
        return false;
    }

    private C11204e(String str) {
        this.f26843f = str;
    }

    /* renamed from: a */
    private static NetworkInfo m19853a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    public static synchronized C11204e m19854a(Context context, String str) {
        C11204e eVar;
        synchronized (C11204e.class) {
            MethodCollector.m26663i(11540);
            if (f26838d == null) {
                f26838d = new C11204e(str);
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c) {
                    if (applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                }
                f26839e = applicationContext;
            }
            eVar = f26838d;
            MethodCollector.m26664o(11540);
        }
        return eVar;
    }

    /* renamed from: b */
    private static Object m19855b(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11865);
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
                    MethodCollector.m26664o(11865);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
