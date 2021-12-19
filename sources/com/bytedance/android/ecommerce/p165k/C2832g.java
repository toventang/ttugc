package com.bytedance.android.ecommerce.p165k;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.android.ecommerce.p165k.C2835h;
import com.bytedance.common.utility.collection.C13605d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Iterator;

/* renamed from: com.bytedance.android.ecommerce.k.g */
public final class C2832g {

    /* renamed from: f */
    private static C2832g f8434f;

    /* renamed from: a */
    final Context f8435a;

    /* renamed from: b */
    boolean f8436b;

    /* renamed from: c */
    BroadcastReceiver f8437c;

    /* renamed from: d */
    C2835h.EnumC2836a f8438d = C2835h.EnumC2836a.MOBILE;

    /* renamed from: e */
    public C13605d<AbstractC2834a> f8439e = new C13605d<>();

    /* renamed from: com.bytedance.android.ecommerce.k.g$a */
    public interface AbstractC2834a {
        static {
            Covode.recordClassIndex(3260);
        }

        /* renamed from: a */
        void mo7416a(C2835h.EnumC2836a aVar);
    }

    static {
        Covode.recordClassIndex(3258);
    }

    /* renamed from: a */
    public static synchronized C2832g m8105a(Context context) {
        C2832g gVar;
        synchronized (C2832g.class) {
            MethodCollector.m26663i(2819);
            if (f8434f == null) {
                f8434f = new C2832g(context);
            }
            gVar = f8434f;
            MethodCollector.m26664o(2819);
        }
        return gVar;
    }

    private C2832g(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f8435a = applicationContext;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        C28331 r0 = new BroadcastReceiver() {
            /* class com.bytedance.android.ecommerce.p165k.C2832g.C28331 */

            static {
                Covode.recordClassIndex(3259);
            }

            public final void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    try {
                        C2832g gVar = C2832g.this;
                        gVar.f8438d = C2835h.m8113b(gVar.f8435a);
                        C2832g gVar2 = C2832g.this;
                        C2835h.EnumC2836a aVar = gVar2.f8438d;
                        if (gVar2.f8439e != null) {
                            Iterator<AbstractC2834a> it = gVar2.f8439e.iterator();
                            while (it.hasNext()) {
                                AbstractC2834a next = it.next();
                                if (next != null) {
                                    next.mo7416a(aVar);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        };
        this.f8437c = r0;
        try {
            m8106b(applicationContext, r0, intentFilter);
            this.f8436b = true;
        } catch (Throwable unused) {
            this.f8436b = false;
        }
        this.f8438d = C2835h.m8113b(this.f8435a);
    }

    /* renamed from: a */
    private static Intent m8104a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m8106b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m8104a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.p165k.C2832g.m8106b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
