package com.bytedance.common.wschannel.channel.p916a.p917a.p918a;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;
import okhttp3.C90029ac;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.a.a */
public class C13674a implements AbstractC13675b {

    /* renamed from: a */
    private final Context f33205a;

    /* renamed from: b */
    private int f33206b;

    static {
        Covode.recordClassIndex(15708);
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p918a.AbstractC13675b
    /* renamed from: c */
    public void mo21992c() {
        this.f33206b = 0;
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p918a.AbstractC13675b
    /* renamed from: b */
    public final long mo21991b() {
        return (long) ((Math.random() * 4500.0d) + 500.0d);
    }

    /* renamed from: a */
    public long mo21989a() {
        if (!m24617a(this.f33205a)) {
            return -1;
        }
        int i = this.f33206b + 1;
        this.f33206b = i;
        double min = (double) Math.min(((long) (1 << i)) * 5000, 120000L);
        Double.isNaN(min);
        return (long) (min + (Math.random() * 10.0d * 1000.0d));
    }

    C13674a(Context context) {
        this.f33205a = context;
    }

    /* renamed from: a */
    private static NetworkInfo m24615a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    private static boolean m24617a(Context context) {
        try {
            NetworkInfo a = m24615a((ConnectivityManager) m24616a(context, "connectivity"));
            if (a == null || !a.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p918a.AbstractC13675b
    /* renamed from: a */
    public final long mo21990a(C90029ac acVar) {
        String a;
        long a2 = mo21989a();
        if (a2 == -1) {
            return -1;
        }
        if (acVar == null) {
            return a2;
        }
        try {
            if (acVar.mo144720a()) {
                return a2;
            }
            int i = acVar.f204107c;
            if (!(i == 414 || i == 511 || i == 512) || (a = acVar.mo144718a("Handshake-Options", null)) == null) {
                return a2;
            }
            String[] split = a.split(";");
            for (String str : split) {
                if (!TextUtils.isEmpty(str)) {
                    String[] split2 = str.split("=");
                    if ("reconnect-interval".equals(split2[0])) {
                        try {
                            a2 = Long.parseLong(split2[1]);
                            return a2 * 1000;
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return a2;
        } catch (Exception e) {
            e.printStackTrace();
            return a2;
        }
    }

    /* renamed from: a */
    private static Object m24616a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12726);
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
                    MethodCollector.m26664o(12726);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
