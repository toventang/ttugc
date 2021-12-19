package com.p2082ss.ttvideoengine.p4415h;

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
import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.ttvideoengine.p4430s.C86631b;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.h */
public final class C86464h {

    /* renamed from: a */
    final Context f193907a;

    /* renamed from: b */
    public AbstractC86466b f193908b;

    /* renamed from: c */
    volatile int f193909c = 65280;

    /* renamed from: d */
    public volatile long f193910d;

    /* renamed from: e */
    final ArrayList<String> f193911e;

    /* renamed from: f */
    private C86465a f193912f;

    /* renamed from: com.ss.ttvideoengine.h.h$b */
    public interface AbstractC86466b {
        static {
            Covode.recordClassIndex(101694);
        }

        /* renamed from: a */
        void mo137511a(boolean z, boolean z2);
    }

    static {
        Covode.recordClassIndex(101692);
    }

    /* renamed from: a */
    public final void mo137504a() {
        m149221b(this.f193907a);
    }

    /* renamed from: d */
    public final ArrayList<String> mo137509d() {
        return new ArrayList<>(this.f193911e);
    }

    /* renamed from: c */
    public final boolean mo137508c() {
        if (this.f193909c == 65280) {
            this.f193909c = m149216a(this.f193907a);
        }
        if ((this.f193909c & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m149222e() {
        if (mo137507b()) {
            m149219a(true, false);
        }
        if (mo137508c()) {
            m149219a(true, true);
        }
        if (!mo137508c() && !mo137507b()) {
            m149219a(false, false);
        }
    }

    /* renamed from: b */
    public final boolean mo137507b() {
        if (this.f193909c == 65280) {
            this.f193909c = m149216a(this.f193907a);
        }
        if ((this.f193909c & 1) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.h.h$a */
    public class C86465a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(101693);
        }

        private C86465a() {
        }

        /* synthetic */ C86465a(C86464h hVar, byte b) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
                C86641i.m150113b("HeadsetStateMonitor", "onReceiver: ".concat(String.valueOf(intent.getAction())));
                String action = intent.getAction();
                action.hashCode();
                if (action.equals("android.intent.action.HEADSET_PLUG")) {
                    int intExtra = intent.getIntExtra("state", -1);
                    if (intExtra == 1) {
                        C86464h.this.mo137505a(1);
                    } else if (intExtra == 0) {
                        C86464h.this.mo137506b(1);
                    }
                } else if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                    int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    if (intExtra2 == 2) {
                        C86464h.this.mo137505a(2);
                    } else if (intExtra2 == 0) {
                        C86464h.this.mo137506b(2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m149221b(Context context) {
        C86465a aVar = this.f193912f;
        if (aVar != null) {
            try {
                context.unregisterReceiver(aVar);
            } catch (Exception e) {
                C86641i.m150115c("HeadsetStateMonitor", e.getMessage());
            }
            this.f193912f = null;
        }
    }

    public C86464h(Context context) {
        this.f193907a = context;
        this.f193911e = new ArrayList<>();
        C86631b.m150044a(new RunnableC86467i(this));
        if (this.f193912f == null) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            C86465a aVar = new C86465a(this, (byte) 0);
            this.f193912f = aVar;
            m149220b(context, aVar, intentFilter);
        }
    }

    /* renamed from: b */
    public final void mo137506b(int i) {
        boolean z;
        C86641i.m150113b("HeadsetStateMonitor", "onDisconnected");
        if (this.f193909c == 65280) {
            this.f193909c = m149216a(this.f193907a);
        }
        int i2 = (i ^ -1) & this.f193909c;
        if (i2 != this.f193909c) {
            this.f193909c = i2;
            m149222e();
            this.f193910d = System.currentTimeMillis();
            AbstractC86466b bVar = this.f193908b;
            if (bVar != null) {
                if (mo137507b() || mo137508c()) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.mo137511a(z, mo137508c());
            }
        }
    }

    /* renamed from: a */
    static int m149216a(Context context) {
        try {
            AudioManager audioManager = (AudioManager) m149218a(context, DataType.AUDIO);
            if (audioManager == null) {
                C86641i.m150117e("HeadsetStateMonitor", "AudioManager is null");
                return 65280;
            } else if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT == 25) {
                boolean isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
                if (audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn()) {
                    return (isWiredHeadsetOn ? 1 : 0) | 2;
                }
                return isWiredHeadsetOn ? 1 : 0;
            } else {
                AudioDeviceInfo[] devices = audioManager.getDevices(2);
                int i = 0;
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                        i |= 1;
                        C86641i.m150113b("HeadsetStateMonitor", "wired device: " + ((Object) audioDeviceInfo.getProductName()));
                    }
                    if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7) {
                        i |= 2;
                        C86641i.m150113b("HeadsetStateMonitor", "bluetooth device: " + ((Object) audioDeviceInfo.getProductName()));
                    }
                }
                return i;
            }
        } catch (Throwable unused) {
            return 65280;
        }
    }

    /* renamed from: a */
    public final void mo137505a(int i) {
        boolean z;
        C86641i.m150113b("HeadsetStateMonitor", "onConnected, ".concat(String.valueOf(i)));
        if (this.f193909c == 65280) {
            this.f193909c = m149216a(this.f193907a);
        }
        int i2 = this.f193909c | i;
        if (i2 != this.f193909c) {
            this.f193909c = i2;
            m149222e();
            this.f193910d = System.currentTimeMillis();
            AbstractC86466b bVar = this.f193908b;
            if (bVar != null) {
                boolean z2 = false;
                if (mo137507b() || mo137508c()) {
                    z = true;
                } else {
                    z = false;
                }
                if (i == 2) {
                    z2 = true;
                }
                bVar.mo137511a(z, z2);
            }
        }
    }

    /* renamed from: a */
    private void m149219a(boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("bt", Integer.valueOf(z2 ? 1 : 0));
        hashMap.put("con", Integer.valueOf(z ? 1 : 0));
        this.f193911e.add(new JSONObject(hashMap).toString());
    }

    /* renamed from: a */
    private static Object m149218a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6407);
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
                    MethodCollector.m26664o(6407);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static Intent m149217a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m149220b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m149217a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4415h.C86464h.m149220b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
