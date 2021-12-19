package com.p1795d.p1796a.p1797a.p1798a.p1802c;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23781l;
import com.p1795d.p1796a.p1797a.p1798a.p1806g.AbstractC23805a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.Collections;

/* renamed from: com.d.a.a.a.c.b */
public final class C23784b {

    /* renamed from: a */
    public static C23784b f56272a = new C23784b();

    /* renamed from: b */
    public Context f56273b;

    /* renamed from: c */
    public BroadcastReceiver f56274c;

    /* renamed from: d */
    public boolean f56275d;

    /* renamed from: e */
    public boolean f56276e;

    /* renamed from: f */
    public AbstractC23786a f56277f;

    /* renamed from: com.d.a.a.a.c.b$a */
    public interface AbstractC23786a {
        static {
            Covode.recordClassIndex(27894);
        }

        /* renamed from: a */
        void mo39253a(boolean z);
    }

    static {
        Covode.recordClassIndex(27892);
    }

    private C23784b() {
    }

    /* renamed from: b */
    public final boolean mo39251b() {
        return !this.f56276e;
    }

    /* renamed from: a */
    private static Intent m44952a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m44954b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m44952a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p1795d.p1796a.p1797a.p1798a.p1802c.C23784b.m44954b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    /* renamed from: a */
    public final void mo39250a() {
        this.f56274c = new BroadcastReceiver() {
            /* class com.p1795d.p1796a.p1797a.p1798a.p1802c.C23784b.C237851 */

            static {
                Covode.recordClassIndex(27893);
            }

            public final void onReceive(Context context, Intent intent) {
                KeyguardManager keyguardManager;
                if (intent != null) {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        C23784b.m44953a(C23784b.this, true);
                    } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                        C23784b.m44953a(C23784b.this, false);
                    } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) m44958a(context, "keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                        C23784b.m44953a(C23784b.this, false);
                    }
                }
            }

            /* renamed from: a */
            private static Object m44958a(Context context, String str) {
                Object obj;
                MethodCollector.m26663i(4851);
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
                            MethodCollector.m26664o(4851);
                        }
                    }
                } else {
                    obj = context.getSystemService(str);
                }
                return obj;
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        m44954b(this.f56273b, this.f56274c, intentFilter);
        this.f56275d = true;
        m44955c();
    }

    /* renamed from: c */
    private void m44955c() {
        String str;
        boolean z = !this.f56276e;
        for (C23781l lVar : Collections.unmodifiableCollection(C23783a.f56269a.f56270b)) {
            AbstractC23805a aVar = lVar.f56260c;
            if (aVar.f56304a.get() != null) {
                if (z) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                C23789e.f56285a.mo39257a(aVar.mo39272c(), "setState", str);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m44953a(C23784b bVar, boolean z) {
        if (bVar.f56276e != z) {
            bVar.f56276e = z;
            if (bVar.f56275d) {
                bVar.m44955c();
                AbstractC23786a aVar = bVar.f56277f;
                if (aVar != null) {
                    aVar.mo39253a(bVar.mo39251b());
                }
            }
        }
    }
}
