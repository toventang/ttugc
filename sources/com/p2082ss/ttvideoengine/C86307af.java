package com.p2082ss.ttvideoengine;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.p2082ss.ttvideoengine.p4414g.AbstractC86444a;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.ttvideoengine.af */
public final class C86307af extends BroadcastReceiver {

    /* renamed from: g */
    public static volatile int f192804g = 10;

    /* renamed from: i */
    public static int[] f192805i;

    /* renamed from: j */
    public static String[] f192806j;

    /* renamed from: k */
    public static int f192807k;

    /* renamed from: l */
    public static int f192808l;

    /* renamed from: m */
    public static boolean f192809m;

    /* renamed from: n */
    public static boolean f192810n;

    /* renamed from: p */
    private static C86307af f192811p;

    /* renamed from: a */
    public int f192812a = 1000;

    /* renamed from: b */
    public int f192813b = 10;

    /* renamed from: c */
    public Lock f192814c = new ReentrantLock();

    /* renamed from: d */
    public ArrayList<WeakReference<AbstractC86311ag>> f192815d = new ArrayList<>();

    /* renamed from: e */
    int f192816e = 0;

    /* renamed from: f */
    C86310c f192817f = null;

    /* renamed from: h */
    public AbstractC86444a f192818h = null;

    /* renamed from: o */
    private Thread f192819o;

    /* renamed from: q */
    private Timer f192820q = null;

    /* renamed from: r */
    private TimerTask f192821r = null;

    /* renamed from: c */
    static int m148607c(int i) {
        if (i == 20) {
            return 4;
        }
        switch (i) {
            case 1:
            case 2:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case 16:
                return 2;
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_SELECT_SCENE:
            case 15:
            case 17:
                return 3;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return 1;
            default:
                return 6;
        }
    }

    /* renamed from: a */
    public final void mo137126a(WeakReference<AbstractC86311ag> weakReference) {
        if (weakReference != null) {
            this.f192814c.lock();
            this.f192815d.add(weakReference);
            this.f192814c.unlock();
        }
    }

    /* renamed from: com.ss.ttvideoengine.af$a */
    public static class C86308a {

        /* renamed from: d */
        private static final ReentrantLock f192822d = new ReentrantLock();

        /* renamed from: e */
        private static C86308a f192823e;

        /* renamed from: a */
        private Map<String, Double> f192824a;

        /* renamed from: b */
        private Map<String, Double> f192825b;

        /* renamed from: c */
        private Map<String, Integer> f192826c;

        /* renamed from: f */
        private int f192827f = -1;

        /* renamed from: g */
        private boolean f192828g = true;

        static {
            Covode.recordClassIndex(101536);
        }

        /* renamed from: c */
        public final int mo137130c() {
            if (this.f192828g) {
                mo137129b();
                this.f192828g = false;
            }
            return this.f192827f;
        }

        /* renamed from: a */
        public static C86308a m148612a() {
            if (f192823e == null) {
                ReentrantLock reentrantLock = f192822d;
                reentrantLock.lock();
                if (f192823e == null) {
                    f192823e = new C86308a();
                }
                reentrantLock.unlock();
            }
            return f192823e;
        }

        private C86308a() {
            HashMap hashMap = new HashMap();
            this.f192824a = hashMap;
            hashMap.put("-1", Double.valueOf(1.8d));
            this.f192824a.put("2", Double.valueOf(93.0d));
            this.f192824a.put("3", Double.valueOf(70.0d));
            this.f192824a.put("4", Double.valueOf(26.0d));
            this.f192824a.put("5", Double.valueOf(12.0d));
            this.f192824a.put("6", Double.valueOf(7.0d));
            this.f192824a.put("7", Double.valueOf(2.0d));
            Map<String, Double> map = this.f192824a;
            Double valueOf = Double.valueOf(1.0d);
            map.put("8", valueOf);
            HashMap hashMap2 = new HashMap();
            this.f192825b = hashMap2;
            hashMap2.put("excellent", valueOf);
            this.f192825b.put("good", Double.valueOf(2.4d));
            this.f192825b.put("unknown", Double.valueOf(5.4d));
            this.f192825b.put("medium", Double.valueOf(7.6d));
            this.f192825b.put("weak", Double.valueOf(20.6d));
            this.f192825b.put("unavailable", Double.valueOf(36.0d));
            HashMap hashMap3 = new HashMap();
            this.f192826c = hashMap3;
            hashMap3.put("1_1", 0);
            this.f192826c.put("1_2", 1);
            this.f192826c.put("1_3", 2);
            this.f192826c.put("2_1", 3);
            this.f192826c.put("2_2", 4);
            this.f192826c.put("1_4", 5);
            this.f192826c.put("2_3", 6);
            this.f192826c.put("3_1", 7);
            this.f192826c.put("3_2", 8);
            this.f192826c.put("3_3", 9);
            this.f192826c.put("2_4", 10);
            this.f192826c.put("3_4", 11);
            this.f192826c.put("4_1", 12);
            this.f192826c.put("4_2", 13);
            this.f192826c.put("4_3", 14);
            this.f192826c.put("4_4", 15);
        }

        /* renamed from: b */
        public final void mo137129b() {
            double d;
            double d2;
            if (!(this.f192824a == null || this.f192825b == null || this.f192826c == null)) {
                if (!C86307af.f192809m && C86307af.f192807k == 0) {
                    return;
                }
                if (C86307af.f192810n || C86307af.f192808l != 0) {
                    int i = C86307af.f192807k;
                    if (C86307af.f192809m) {
                        i = C86307af.f192804g;
                    }
                    double d3 = 0.0d;
                    for (int i2 = 0; i2 < i; i2++) {
                        try {
                            String valueOf = String.valueOf(C86307af.f192805i[i2]);
                            if (this.f192824a.containsKey(valueOf)) {
                                d2 = this.f192824a.get(valueOf).doubleValue();
                            } else {
                                d2 = 0.0d;
                            }
                            d3 += d2;
                        } catch (Exception e) {
                            C86641i.m150117e("TTNetWorkListener", e.toString());
                        }
                    }
                    double d4 = (double) i;
                    Double.isNaN(d4);
                    d3 /= d4;
                    if (d3 >= 1.0d) {
                        int i3 = C86307af.f192808l;
                        if (C86307af.f192810n) {
                            i3 = C86307af.f192804g;
                        }
                        double d5 = 0.0d;
                        for (int i4 = 0; i4 < i3; i4++) {
                            try {
                                String str = C86307af.f192806j[i4];
                                if (str != null) {
                                    if (this.f192825b.containsKey(str)) {
                                        d = this.f192825b.get(str).doubleValue();
                                    } else {
                                        d = 0.0d;
                                    }
                                    d5 += d;
                                }
                            } catch (Exception e2) {
                                C86641i.m150117e("TTNetWorkListener", e2.toString());
                            }
                        }
                        double d6 = (double) i3;
                        Double.isNaN(d6);
                        d5 /= d6;
                        if (d5 >= 1.0d) {
                            StringBuilder sb = new StringBuilder();
                            if (d3 <= 2.0d) {
                                sb.append('1');
                            } else if (d3 <= 11.0d) {
                                sb.append('2');
                            } else if (d3 <= 26.0d) {
                                sb.append('3');
                            } else {
                                sb.append('4');
                            }
                            sb.append('_');
                            if (d5 == 1.0d) {
                                sb.append('1');
                            } else if (d5 <= 3.0d) {
                                sb.append('2');
                            } else if (d5 <= 7.0d) {
                                sb.append('3');
                            } else {
                                sb.append('4');
                            }
                            String sb2 = sb.toString();
                            int i5 = -1;
                            if (this.f192826c.containsKey(sb2)) {
                                i5 = this.f192826c.get(sb2).intValue();
                            }
                            this.f192827f = i5;
                            C86641i.m150113b("TTNetWorkListener", "rtt score:" + d3 + " sig score:" + d5 + " level:" + sb2);
                        }
                    }
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(101535);
    }

    private C86307af() {
        f192805i = new int[f192804g];
        f192806j = new String[f192804g];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.af$b */
    public static class C86309b extends Thread {

        /* renamed from: a */
        private WeakReference<Context> f192829a;

        /* renamed from: b */
        private WeakReference<C86307af> f192830b;

        static {
            Covode.recordClassIndex(101537);
        }

        public final void run() {
            Context context;
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            C86307af a = C86307af.m148603a();
            Context context2 = this.f192829a.get();
            try {
                C86641i.m150113b("TTNetWorkListener", "enter start listen");
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
                Intent a2 = C86307af.m148600a(context2, a, intentFilter);
                a.f192812a = C86307af.m148605b(context2);
                if (a.f192812a == 0) {
                    a.f192813b = C86307af.m148599a(context2, a2);
                }
                a.f192817f = new C86310c(context2, a);
                C86310c cVar = a.f192817f;
                if (cVar.f192831a != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        try {
                            C86641i.m150113b("TTNetWorkListener", "start listen signal strength");
                            cVar.f192831a.listen(cVar, 256);
                        } catch (Exception unused) {
                            C86641i.m150117e("TTNetWorkListener", "listen signal strength failed");
                        }
                    }
                    cVar.f192831a.listen(cVar, 64);
                }
                a.f192816e = 1;
            } catch (Exception unused2) {
                C86641i.m150113b("TTNetWorkListener", "start listen network state failed");
            }
            Looper.loop();
            C86307af afVar = this.f192830b.get();
            if (afVar != null && (context = this.f192829a.get()) != null && afVar.f192817f != null) {
                try {
                    context.unregisterReceiver(afVar);
                    C86310c cVar2 = afVar.f192817f;
                    if (cVar2.f192831a != null) {
                        cVar2.f192831a.listen(cVar2, 0);
                    }
                } catch (Exception unused3) {
                    C86641i.m150117e("TTNetWorkListener", "Receiver has been unregistered!");
                }
            }
        }

        public C86309b(Context context, C86307af afVar) {
            this.f192829a = new WeakReference<>(context);
            this.f192830b = new WeakReference<>(afVar);
        }
    }

    /* renamed from: a */
    public static synchronized C86307af m148603a() {
        C86307af afVar;
        synchronized (C86307af.class) {
            MethodCollector.m26663i(2017);
            if (f192811p == null) {
                f192811p = new C86307af();
            }
            afVar = f192811p;
            MethodCollector.m26664o(2017);
        }
        return afVar;
    }

    /* renamed from: a */
    private static NetworkInfo m148601a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: com.ss.ttvideoengine.af$c */
    static class C86310c extends PhoneStateListener {

        /* renamed from: a */
        TelephonyManager f192831a;

        /* renamed from: b */
        private WeakReference<C86307af> f192832b;

        static {
            Covode.recordClassIndex(101538);
        }

        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            if (signalStrength != null && Build.VERSION.SDK_INT >= 23) {
                C86307af afVar = null;
                WeakReference<C86307af> weakReference = this.f192832b;
                if (weakReference == null || (afVar = weakReference.get()) == null || afVar.f192812a != 0) {
                    int i = -1;
                    try {
                        i = signalStrength.getLevel();
                        if (i == 0) {
                            i = 1;
                        }
                    } catch (Exception unused) {
                        C86641i.m150117e("TTNetWorkListener", "failed to get signalStrength");
                    }
                    if (afVar != null) {
                        afVar.mo137124a(i);
                    }
                }
            }
        }

        public C86310c(Context context, C86307af afVar) {
            this.f192832b = new WeakReference<>(afVar);
            try {
                TelephonyManager telephonyManager = (TelephonyManager) m148615a(context, "phone");
                if (telephonyManager != null) {
                    this.f192831a = telephonyManager;
                }
            } catch (Exception unused) {
                C86641i.m150117e("TTNetWorkListener", "create telephonyManager failed");
                this.f192831a = null;
            }
        }

        /* renamed from: a */
        private static Object m148615a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(5322);
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
                        MethodCollector.m26664o(5322);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        public final void onDataConnectionStateChanged(int i, int i2) {
            WeakReference<C86307af> weakReference;
            C86307af afVar;
            super.onDataConnectionStateChanged(i, i2);
            C86641i.m150113b("TTNetWorkListener", "data connection state changed, state: " + i + ", networkType: " + i2);
            if (i == 2 && (weakReference = this.f192832b) != null && (afVar = weakReference.get()) != null && afVar.f192812a != 0) {
                int c = C86307af.m148607c(i2);
                C86641i.m150113b("TTNetWorkListener", "network change to: ".concat(String.valueOf(c)));
                afVar.mo137127b(c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo137127b(int i) {
        if (i != this.f192812a) {
            this.f192814c.lock();
            int i2 = this.f192812a;
            this.f192812a = i;
            C86641i.m150113b("TTNetWorkListener", "access changed, from: " + i2 + " to: " + this.f192812a + " callback list size: " + this.f192815d.size());
            Iterator<WeakReference<AbstractC86311ag>> it = this.f192815d.iterator();
            while (it.hasNext()) {
                AbstractC86311ag agVar = it.next().get();
                if (agVar == null) {
                    it.remove();
                } else {
                    agVar.mo137134a(0, i2, this.f192812a);
                }
            }
            this.f192814c.unlock();
        }
    }

    /* renamed from: b */
    static int m148605b(Context context) {
        NetworkInfo.State state;
        if (context == null) {
            return 1000;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) m148604a(context, "connectivity");
        if (connectivityManager == null) {
            C86641i.m150113b("TTNetWorkListener", "disconnect");
            return -1;
        }
        NetworkInfo a = m148601a(connectivityManager);
        if (a == null || !a.isAvailable()) {
            C86641i.m150113b("TTNetWorkListener", "disconnect 1");
            return -1;
        }
        NetworkInfo a2 = m148602a(connectivityManager, 1);
        if (a2 == null || (state = a2.getState()) == null || !(state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            try {
                NetworkInfo a3 = m148602a(connectivityManager, 0);
                if (a3 != null) {
                    NetworkInfo.State state2 = a3.getState();
                    int subtype = a.getSubtype();
                    C86641i.m150113b("TTNetWorkListener", "state: " + state2 + ", subtype: " + subtype);
                    if (state2 != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
                        return m148607c(subtype);
                    }
                }
                return 1000;
            } catch (Exception e) {
                C86641i.m150117e("TTNetWorkListener", e.toString());
                return 1000;
            }
        } else {
            C86641i.m150113b("TTNetWorkListener", "wifi");
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo137124a(int i) {
        if (i != this.f192813b) {
            this.f192814c.lock();
            int i2 = this.f192813b;
            this.f192813b = i;
            C86641i.m150110a("TTNetWorkListener", "strength changed, from: " + i2 + " to: " + this.f192813b + " callback list size: " + this.f192815d.size());
            Iterator<WeakReference<AbstractC86311ag>> it = this.f192815d.iterator();
            while (it.hasNext()) {
                AbstractC86311ag agVar = it.next().get();
                if (agVar == null) {
                    it.remove();
                } else {
                    agVar.mo137134a(1, i2, this.f192813b);
                }
            }
            this.f192814c.unlock();
        }
    }

    /* renamed from: a */
    public final synchronized void mo137125a(Context context) {
        MethodCollector.m26663i(2032);
        if (this.f192816e != 0) {
            MethodCollector.m26664o(2032);
            return;
        }
        this.f192816e = 1;
        C86309b bVar = new C86309b(context, this);
        this.f192819o = bVar;
        bVar.start();
        MethodCollector.m26664o(2032);
    }

    /* renamed from: a */
    private static NetworkInfo m148602a(ConnectivityManager connectivityManager, int i) {
        try {
            return connectivityManager.getNetworkInfo(i);
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    static int m148599a(Context context, Intent intent) {
        NetworkInfo a;
        if (context == null) {
            return 10;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) m148604a(context, "connectivity");
            if (connectivityManager == null || (a = m148602a(connectivityManager, 1)) == null || !a.isConnected() || context.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", context.getPackageName()) != 0) {
                return 10;
            }
            int i = -1;
            if (intent == null) {
                WifiInfo connectionInfo = ((WifiManager) m148604a(context, "wifi")).getConnectionInfo();
                if (connectionInfo != null) {
                    i = connectionInfo.getRssi();
                }
            } else {
                i = intent.getIntExtra("newRssi", -70);
            }
            int calculateSignalLevel = WifiManager.calculateSignalLevel(i, 4);
            C86641i.m150113b("TTNetWorkListener", "wifi dbm:" + i + ", level:" + calculateSignalLevel);
            return calculateSignalLevel + 1;
        } catch (Exception e) {
            C86641i.m150117e("TTNetWorkListener", e.toString());
            return 10;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast() && intent != null) {
            if ("android.net.wifi.RSSI_CHANGED".equals(intent.getAction()) && this.f192812a == 0) {
                mo137124a(m148599a(context, intent));
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                C86641i.m150113b("TTNetWorkListener", "network broadcast:" + intent.getAction());
                mo137127b(m148605b(context));
            }
        }
    }

    /* renamed from: a */
    private static Object m148604a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2705);
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
                    MethodCollector.m26664o(2705);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: b */
    private static Intent m148606b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    public static android.content.Intent m148600a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m148606b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.C86307af.m148600a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
