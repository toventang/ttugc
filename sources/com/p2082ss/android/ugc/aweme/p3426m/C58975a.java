package com.p2082ss.android.ugc.aweme.p3426m;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.math.BigDecimal;

/* renamed from: com.ss.android.ugc.aweme.m.a */
public final class C58975a {

    /* renamed from: a */
    public static AudioManager f134217a;

    /* renamed from: b */
    public static int f134218b = -1;

    /* renamed from: c */
    public static boolean f134219c = false;

    /* renamed from: d */
    public static C58976a f134220d = null;

    /* renamed from: e */
    private static final boolean f134221e = false;

    /* renamed from: f */
    private static int f134222f = -1;

    static {
        Covode.recordClassIndex(69303);
    }

    /* renamed from: com.ss.android.ugc.aweme.m.a$a */
    public static class C58976a extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<AudioManager> f134223a;

        static {
            Covode.recordClassIndex(69304);
        }

        public C58976a(AudioManager audioManager) {
            this.f134223a = new WeakReference<>(audioManager);
        }

        public final void onReceive(Context context, Intent intent) {
            int streamVolume;
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && this.f134223a.get() != null && (streamVolume = this.f134223a.get().getStreamVolume(3)) >= 0) {
                    C58975a.f134218b = streamVolume;
                }
            } catch (Exception unused) {
                C58975a.f134218b = -1;
            }
        }
    }

    /* renamed from: a */
    public static int m108342a(Context context) {
        if (m108349d(context)) {
            return -1;
        }
        if (f134222f < 0) {
            f134222f = f134217a.getStreamMaxVolume(3);
        }
        return f134222f;
    }

    /* renamed from: b */
    public static int m108346b(Context context) {
        if (m108349d(context)) {
            return -1;
        }
        try {
            return f134217a.getStreamVolume(3);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static boolean m108349d(Context context) {
        if (f134217a == null) {
            try {
                f134217a = (AudioManager) m108344a(context, DataType.AUDIO);
            } catch (Exception unused) {
            }
        }
        if (f134217a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static double m108341a(int i) {
        if (m108349d(C17867d.m33078a())) {
            return 0.0d;
        }
        try {
            if (f134222f < 0) {
                f134222f = m108342a(C17867d.m33078a());
            }
            if (f134218b < 0 || !f134219c) {
                f134218b = m108346b(C17867d.m33078a());
            }
            double d = (double) f134218b;
            Double.isNaN(d);
            double d2 = (double) f134222f;
            Double.isNaN(d2);
            return new BigDecimal((d * 1.0d) / d2).setScale(i, 4).doubleValue();
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    /* renamed from: c */
    public static boolean m108348c(Context context) {
        if (m108349d(context)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            AudioDeviceInfo[] devices = f134217a.getDevices(2);
            if (devices == null) {
                return false;
            }
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                int type = audioDeviceInfo.getType();
                if (type == 3 || type == 4 || type == 7 || type == 8) {
                    return true;
                }
            }
            return false;
        } else if (f134217a.isWiredHeadsetOn() || f134217a.isBluetoothScoOn() || f134217a.isBluetoothA2dpOn()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static Object m108344a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(13251);
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
                    MethodCollector.m26664o(13251);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static boolean m108345a(Context context, int i) {
        if (m108349d(context)) {
            return false;
        }
        try {
            f134217a.setStreamVolume(3, i, 16);
            return true;
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return false;
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
    public static android.content.Intent m108343a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m108347b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3426m.C58975a.m108343a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    /* renamed from: b */
    private static Intent m108347b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
