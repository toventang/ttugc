package com.p2082ss.android.ugc.aweme.lancet.p3387d;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.lancet.d.a */
public class C58017a {

    /* renamed from: a */
    public static final AtomicBoolean f132225a = new AtomicBoolean(false);

    /* renamed from: b */
    public static C58018a f132226b;

    /* renamed from: c */
    public static boolean f132227c = false;

    /* renamed from: com.ss.android.ugc.aweme.lancet.d.a$a */
    public static class C58018a {

        /* renamed from: a */
        TelephonyManager f132228a;

        /* renamed from: b */
        public final AtomicInteger f132229b;

        /* renamed from: c */
        public volatile int f132230c;

        /* renamed from: d */
        private PhoneStateListener f132231d;

        static {
            Covode.recordClassIndex(68053);
        }

        private C58018a() {
            this.f132229b = new AtomicInteger(-1);
            this.f132230c = -1;
        }

        /* renamed from: a */
        public final void mo95542a() {
            C58254p.f132679a.post(new RunnableC58021b(this));
        }

        /* synthetic */ C58018a(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo95543a(int i) {
            this.f132228a.createForSubscriptionId(i);
            this.f132230c = i;
            this.f132229b.set(this.f132228a.getNetworkType());
            PhoneStateListener phoneStateListener = this.f132231d;
            if (phoneStateListener != null) {
                this.f132228a.listen(phoneStateListener, 0);
            } else {
                this.f132231d = new PhoneStateListener() {
                    /* class com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a.C58018a.C580202 */

                    static {
                        Covode.recordClassIndex(68055);
                    }

                    public final void onDataConnectionStateChanged(int i, int i2) {
                        super.onDataConnectionStateChanged(i, i2);
                        C58018a.this.f132229b.set(i2);
                    }
                };
            }
            this.f132228a.listen(this.f132231d, 64);
        }

        /* renamed from: a */
        public static Object m104841a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(11117);
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
                        MethodCollector.m26664o(11117);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    static {
        Covode.recordClassIndex(68052);
    }

    /* renamed from: a */
    public static C58018a m104840a() {
        MethodCollector.m26663i(9481);
        if (f132226b == null) {
            synchronized (C58017a.class) {
                try {
                    if (f132226b == null) {
                        f132226b = new C58018a((byte) 0);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9481);
                    throw th;
                }
            }
        }
        C58018a aVar = f132226b;
        MethodCollector.m26664o(9481);
        return aVar;
    }
}
