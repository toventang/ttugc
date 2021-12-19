package com.p2082ss.android.ugc.aweme.commerce.p2505a;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.l */
public class C37476l {

    /* renamed from: e */
    private static final String f88458e = C37476l.class.getSimpleName();

    /* renamed from: a */
    Context f88459a;

    /* renamed from: b */
    boolean f88460b;

    /* renamed from: c */
    C37477a f88461c;

    /* renamed from: d */
    public AbstractC37478b f88462d;

    /* renamed from: f */
    private AudioManager f88463f;

    /* renamed from: g */
    private int f88464g = -1;

    /* renamed from: com.ss.android.ugc.aweme.commerce.a.l$b */
    public interface AbstractC37478b {
        static {
            Covode.recordClassIndex(44863);
        }

        /* renamed from: a */
        void mo65150a();

        /* renamed from: b */
        void mo65151b();
    }

    static {
        Covode.recordClassIndex(44861);
    }

    /* renamed from: a */
    public final int mo65176a() {
        AudioManager audioManager = this.f88463f;
        if (audioManager == null) {
            return -1;
        }
        try {
            return audioManager.getStreamVolume(3);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo65177b() {
        AudioManager audioManager = this.f88463f;
        int i = -1;
        if (audioManager != null) {
            try {
                i = audioManager.getStreamMaxVolume(3);
            } catch (Exception unused) {
            }
        }
        this.f88464g = i;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commerce.a.l$a */
    public static class C37477a extends BroadcastReceiver {

        /* renamed from: a */
        private C37476l f88465a;

        /* renamed from: b */
        private int f88466b;

        static {
            Covode.recordClassIndex(44862);
        }

        C37477a(C37476l lVar) {
            this.f88465a = lVar;
            this.f88466b = lVar.mo65176a();
        }

        public final void onReceive(Context context, Intent intent) {
            C37476l lVar;
            if ((("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) || "android.media.STREAM_MUTE_CHANGED_ACTION".equals(intent.getAction())) && (lVar = this.f88465a) != null) {
                AbstractC37478b bVar = lVar.f88462d;
                int i = this.f88466b;
                int a = lVar.mo65176a();
                this.f88466b = a;
                if (bVar == null) {
                    return;
                }
                if (a == 0) {
                    if (i > 0) {
                        bVar.mo65151b();
                    }
                } else if (a > 0 && i == 0) {
                    bVar.mo65150a();
                }
            }
        }
    }

    public C37476l(Context context) {
        this.f88459a = context;
        this.f88463f = (AudioManager) m75568a(context, DataType.AUDIO);
    }

    /* renamed from: a */
    private static Object m75568a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2808);
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
                    MethodCollector.m26664o(2808);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: b */
    private static Intent m75569b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    public static android.content.Intent m75567a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m75569b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commerce.p2505a.C37476l.m75567a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
