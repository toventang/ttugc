package com.bytedance.sdk.p1665b;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sdk.p1665b.p1668c.C22539a;
import com.bytedance.sdk.p1665b.p1675e.C22583a;
import com.bytedance.sdk.p1665b.p1676f.C22584a;
import com.bytedance.sdk.p1665b.p1676f.C22585b;
import com.bytedance.sdk.p1665b.p1676f.C22586c;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.b.d */
public final class C22541d {

    /* renamed from: a */
    final Context f53294a = C22518a.m42479c();

    /* renamed from: b */
    final C22583a f53295b = C22583a.m42598a();

    /* renamed from: c */
    final HandlerThread f53296c = new HandlerThread("mobile-data-monitor-thread");

    /* renamed from: d */
    BroadcastReceiver f53297d;

    /* renamed from: e */
    public AbstractC22548b f53298e;

    /* renamed from: f */
    public boolean f53299f;

    /* renamed from: g */
    public volatile int f53300g;

    /* renamed from: h */
    C22550d f53301h;

    /* renamed from: i */
    public AbstractC22549c f53302i;

    /* renamed from: j */
    public Handler f53303j;

    /* renamed from: k */
    Handler f53304k;

    /* renamed from: com.bytedance.sdk.b.d$b */
    public interface AbstractC22548b {
        static {
            Covode.recordClassIndex(26364);
        }

        /* renamed from: a */
        void mo36817a(int i);

        /* renamed from: b */
        void mo36820b(int i);
    }

    /* renamed from: com.bytedance.sdk.b.d$c */
    public interface AbstractC22549c {
        static {
            Covode.recordClassIndex(26365);
        }

        /* renamed from: a */
        void mo36818a(String str, int i);

        /* renamed from: b */
        void mo36821b(String str, int i);
    }

    static {
        Covode.recordClassIndex(26357);
    }

    C22541d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.b.d$a */
    public class C22547a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(26363);
        }

        private C22547a() {
        }

        /* synthetic */ C22547a(C22541d dVar, byte b) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && C22541d.this.f53303j != null) {
                C22541d.this.f53303j.sendEmptyMessage(1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.b.d$d */
    public class C22550d extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(26366);
        }

        private C22550d() {
        }

        /* synthetic */ C22550d(C22541d dVar, byte b) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (("android.intent.action.SIM_STATE_CHANGED".equals(action) || "android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED".equals(action)) && C22541d.this.f53303j != null) {
                C22541d.this.f53303j.sendEmptyMessage(2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.b.d$e */
    public static class HandlerC22551e extends Handler {

        /* renamed from: a */
        private final SoftReference<C22541d> f53318a;

        static {
            Covode.recordClassIndex(26367);
        }

        public final void handleMessage(Message message) {
            Runnable runnable;
            SoftReference<C22541d> softReference = this.f53318a;
            if (softReference != null && softReference.get() != null) {
                C22541d dVar = this.f53318a.get();
                if (message == null) {
                    return;
                }
                if (message.what == 3) {
                    dVar.f53300g = C22585b.m42612a(dVar.f53294a);
                    if (dVar.f53298e != null && dVar.f53304k != null) {
                        dVar.f53304k.post(new Runnable() {
                            /* class com.bytedance.sdk.p1665b.C22541d.RunnableC225421 */

                            static {
                                Covode.recordClassIndex(26358);
                            }

                            public final void run() {
                                C22541d.this.f53298e.mo36817a(C22541d.this.f53300g);
                                C22541d.this.f53303j.sendEmptyMessage(4);
                            }
                        });
                    }
                } else if (message.what == 1) {
                    int i = dVar.f53300g;
                    dVar.f53300g = C22585b.m42612a(dVar.f53294a);
                    if (dVar.f53298e != null && i != dVar.f53300g && dVar.f53304k != null) {
                        dVar.f53304k.post(new Runnable() {
                            /* class com.bytedance.sdk.p1665b.C22541d.RunnableC225432 */

                            static {
                                Covode.recordClassIndex(26359);
                            }

                            public final void run() {
                                C22541d.this.f53298e.mo36820b(C22541d.this.f53300g);
                            }
                        });
                    }
                } else if (message.what == 4) {
                    String a = C22586c.m42622a(dVar.f53294a, true);
                    C22586c.m42624b(dVar.f53294a, true);
                    int c = C22586c.m42625c(dVar.f53294a, true);
                    if (dVar.f53302i != null && dVar.f53304k != null) {
                        dVar.f53304k.post(new Runnable(a, c) {
                            /* class com.bytedance.sdk.p1665b.C22541d.RunnableC225443 */

                            /* renamed from: a */
                            final /* synthetic */ String f53307a;

                            /* renamed from: b */
                            final /* synthetic */ int f53308b;

                            static {
                                Covode.recordClassIndex(26360);
                            }

                            public final void run() {
                                C22541d.this.f53302i.mo36818a(this.f53307a, this.f53308b);
                            }

                            {
                                this.f53307a = r2;
                                this.f53308b = r3;
                            }
                        });
                    }
                } else if (message.what == 2 && dVar.f53294a != null) {
                    Runnable runnable2 = null;
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) C22541d.m42543a(dVar.f53294a, "phone");
                        String a2 = C22586c.m42622a(dVar.f53294a, true);
                        C22586c.m42624b(dVar.f53294a, true);
                        int c2 = C22586c.m42625c(dVar.f53294a, true);
                        if (telephonyManager != null && telephonyManager.getSimState() == 5) {
                            if (!C22584a.m42609a(dVar.f53294a, "android.permission.READ_PHONE_STATE")) {
                                String b = dVar.f53295b.mo36866b("sim_operator");
                                if (TextUtils.isEmpty(b) && TextUtils.isEmpty(a2)) {
                                    return;
                                }
                                if (TextUtils.isEmpty(b) || !b.equals(a2)) {
                                    runnable = new Runnable(a2, c2) {
                                        /* class com.bytedance.sdk.p1665b.C22541d.RunnableC225465 */

                                        /* renamed from: a */
                                        final /* synthetic */ String f53313a;

                                        /* renamed from: b */
                                        final /* synthetic */ int f53314b;

                                        static {
                                            Covode.recordClassIndex(26362);
                                        }

                                        public final void run() {
                                            if (C22541d.this.f53302i != null) {
                                                C22541d.this.f53302i.mo36821b(this.f53313a, this.f53314b);
                                            }
                                        }

                                        {
                                            this.f53313a = r2;
                                            this.f53314b = r3;
                                        }
                                    };
                                } else {
                                    return;
                                }
                            } else if (c2 != dVar.f53295b.mo36867c("key_sim_subscription_id")) {
                                runnable = new Runnable(a2, c2) {
                                    /* class com.bytedance.sdk.p1665b.C22541d.RunnableC225454 */

                                    /* renamed from: a */
                                    final /* synthetic */ String f53310a;

                                    /* renamed from: b */
                                    final /* synthetic */ int f53311b;

                                    static {
                                        Covode.recordClassIndex(26361);
                                    }

                                    public final void run() {
                                        if (C22541d.this.f53302i != null) {
                                            C22541d.this.f53302i.mo36821b(this.f53310a, this.f53311b);
                                        }
                                    }

                                    {
                                        this.f53310a = r2;
                                        this.f53311b = r3;
                                    }
                                };
                            } else {
                                return;
                            }
                            runnable2 = runnable;
                        }
                    } catch (Exception e) {
                        C22539a.m42536d(e.getMessage());
                    }
                    if (dVar.f53304k != null && runnable2 != null) {
                        dVar.f53304k.post(runnable2);
                    }
                }
            }
        }

        HandlerC22551e(Looper looper, C22541d dVar) {
            super(looper);
            this.f53318a = new SoftReference<>(dVar);
        }
    }

    /* renamed from: a */
    public static Object m42543a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5804);
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
                    MethodCollector.m26664o(5804);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: b */
    private static Intent m42544b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m42542a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m42544b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.p1665b.C22541d.m42542a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
