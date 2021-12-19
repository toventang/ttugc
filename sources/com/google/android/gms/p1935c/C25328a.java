package com.google.android.gms.p1935c;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.p1937b.C25494a;
import com.google.android.gms.common.util.C25611m;
import com.google.android.gms.common.util.C25613o;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.c.a */
public final class C25328a {

    /* renamed from: j */
    public static ScheduledExecutorService f60065j;

    /* renamed from: o */
    private static volatile AbstractC25329a f60066o = new C25330b();

    /* renamed from: a */
    public final Object f60067a;

    /* renamed from: b */
    public final PowerManager.WakeLock f60068b;

    /* renamed from: c */
    public final int f60069c;

    /* renamed from: d */
    public final String f60070d;

    /* renamed from: e */
    public final Context f60071e;

    /* renamed from: f */
    public boolean f60072f;

    /* renamed from: g */
    public final Map<String, Integer[]> f60073g;

    /* renamed from: h */
    public int f60074h;

    /* renamed from: i */
    public AtomicInteger f60075i;

    /* renamed from: k */
    private WorkSource f60076k;

    /* renamed from: l */
    private final String f60077l;

    /* renamed from: m */
    private final String f60078m;

    /* renamed from: n */
    private final Set<Future<?>> f60079n;

    /* renamed from: com.google.android.gms.c.a$a */
    public interface AbstractC25329a {
        static {
            Covode.recordClassIndex(30719);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25328a(android.content.Context r2, java.lang.String r3) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0007
            r0 = 0
        L_0x0003:
            r1.<init>(r2, r3, r0)
            return
        L_0x0007:
            java.lang.String r0 = r2.getPackageName()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p1935c.C25328a.<init>(android.content.Context, java.lang.String):void");
    }

    private C25328a(Context context, String str, String str2) {
        this(context, 1, str, str2);
    }

    private C25328a(Context context, int i, String str, String str2) {
        this.f60067a = this;
        this.f60072f = true;
        this.f60073g = new HashMap();
        this.f60079n = Collections.synchronizedSet(new HashSet());
        this.f60075i = new AtomicInteger(0);
        C25565r.m49315a(context, "WakeLock: context must not be null");
        C25565r.m49317a(str, (Object) "WakeLock: wakeLockName must not be empty");
        this.f60069c = 1;
        this.f60077l = null;
        this.f60078m = null;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f60071e = applicationContext;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f60070d = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f60070d = str;
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) m48696a(context, "power")).newWakeLock(1, str);
        this.f60068b = newWakeLock;
        if (C25613o.m49437a(context)) {
            WorkSource a = C25613o.m49433a(context, C25611m.m49428a(str2) ? context.getPackageName() : str2);
            this.f60076k = a;
            if (a != null && C25613o.m49437a(applicationContext)) {
                WorkSource workSource = this.f60076k;
                if (workSource != null) {
                    workSource.add(a);
                } else {
                    this.f60076k = a;
                }
                try {
                    newWakeLock.setWorkSource(this.f60076k);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (f60065j == null) {
            f60065j = C25494a.m49165a().mo41729a();
        }
    }

    /* renamed from: a */
    public final List<String> mo41429a() {
        int a;
        WorkSource workSource = this.f60076k;
        if (workSource == null || (a = C25613o.m49431a(workSource)) == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < a; i++) {
            String a2 = C25613o.m49435a(workSource, i);
            if (!C25611m.m49428a(a2)) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo41430b() {
        if (this.f60068b.isHeld()) {
            try {
                this.f60068b.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    String.valueOf(this.f60070d).concat(" was already released!");
                } else {
                    throw e;
                }
            }
            this.f60068b.isHeld();
        }
    }

    /* renamed from: c */
    public final String mo41431c() {
        if (!this.f60072f) {
            return this.f60077l;
        }
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        return this.f60077l;
    }

    static {
        Covode.recordClassIndex(30718);
    }

    /* renamed from: a */
    private static Object m48696a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7916);
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
                    MethodCollector.m26664o(7916);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
