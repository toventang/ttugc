package com.p2082ss.android.ugc.aweme.shortvideo.p3858s;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s.b */
public class C72828b extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f163416a = C72828b.class.getSimpleName();

    /* renamed from: b */
    private static boolean f163417b = false;

    /* renamed from: c */
    private static int f163418c;

    /* renamed from: d */
    private static ArrayList<AbstractC72827a> f163419d = new ArrayList<>();

    /* renamed from: e */
    private static BroadcastReceiver f163420e;

    static {
        Covode.recordClassIndex(85514);
    }

    /* renamed from: a */
    private static BroadcastReceiver m128592a() {
        MethodCollector.m26663i(5520);
        if (f163420e == null) {
            synchronized (C72828b.class) {
                try {
                    if (f163420e == null) {
                        f163420e = new C72828b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5520);
                    throw th;
                }
            }
        }
        BroadcastReceiver broadcastReceiver = f163420e;
        MethodCollector.m26664o(5520);
        return broadcastReceiver;
    }

    /* renamed from: b */
    public static void m128597b(Context context) {
        if (f163420e != null) {
            try {
                m128599c(context).unregisterReceiver(f163420e);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private static Context m128599c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: b */
    public static void m128598b(AbstractC72827a aVar) {
        ArrayList<AbstractC72827a> arrayList = f163419d;
        if (arrayList != null && arrayList.contains(aVar)) {
            f163419d.remove(aVar);
        }
    }

    /* renamed from: a */
    public static void m128594a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ss.ugc.aweme.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        m128596b(m128599c(context), m128592a(), intentFilter);
    }

    /* renamed from: a */
    public static void m128595a(AbstractC72827a aVar) {
        if (f163419d == null) {
            f163419d = new ArrayList<>();
        }
        if (!f163419d.contains(aVar)) {
            f163419d.add(aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r0 == 1) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72828b.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: a */
    private static Intent m128593a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m128596b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m128593a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72828b.m128596b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
