package com.bytedance.p1552n;

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
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.n.a */
public final class C21513a {

    /* renamed from: p */
    private static final Object f51060p = new Object();

    /* renamed from: t */
    private static C21513a f51061t;

    /* renamed from: a */
    public int f51062a = -2;

    /* renamed from: b */
    public Context f51063b;

    /* renamed from: c */
    public String f51064c = "NOT_REGISTERED";

    /* renamed from: d */
    public String f51065d = "NOT_REGISTERED";

    /* renamed from: e */
    public int f51066e = -2;

    /* renamed from: f */
    public int f51067f = -2;

    /* renamed from: g */
    public int f51068g = -2;

    /* renamed from: h */
    public boolean f51069h;

    /* renamed from: i */
    public final Object f51070i = new Object();

    /* renamed from: j */
    public final Object f51071j = new Object();

    /* renamed from: k */
    public final Object f51072k = new Object();

    /* renamed from: l */
    public final Object f51073l = new Object();

    /* renamed from: m */
    public ConnectivityManager f51074m = null;

    /* renamed from: n */
    public C21516b f51075n = null;

    /* renamed from: o */
    public C21515a f51076o = null;

    /* renamed from: q */
    private final Object f51077q = new Object();

    /* renamed from: r */
    private TelephonyManager f51078r = null;

    /* renamed from: s */
    private WifiManager f51079s = null;

    /* renamed from: u */
    private int f51080u = -2;

    /* renamed from: v */
    private Handler f51081v = null;

    static {
        Covode.recordClassIndex(25140);
    }

    /* renamed from: a */
    public final boolean mo35112a() {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        try {
            int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
            if (this.f51080u == defaultDataSubscriptionId) {
                return true;
            }
            TelephonyManager createForSubscriptionId = this.f51078r.createForSubscriptionId(defaultDataSubscriptionId);
            this.f51078r = createForSubscriptionId;
            createForSubscriptionId.listen(this.f51075n, 321);
            this.f51080u = defaultDataSubscriptionId;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public final synchronized int mo35114b() {
        int i;
        MethodCollector.m26663i(11418);
        if ("WIFI".equals(this.f51065d) && this.f51068g == -2) {
            try {
                WifiInfo connectionInfo = this.f51079s.getConnectionInfo();
                if (connectionInfo != null && Build.VERSION.SDK_INT >= 21) {
                    this.f51068g = connectionInfo.getFrequency();
                }
            } catch (Throwable unused) {
                int i2 = this.f51068g;
                MethodCollector.m26664o(11418);
                return i2;
            }
        }
        i = this.f51068g;
        MethodCollector.m26664o(11418);
        return i;
    }

    /* renamed from: c */
    public final String mo35115c() {
        String str;
        MethodCollector.m26663i(11419);
        if (Build.VERSION.SDK_INT < 24) {
            MethodCollector.m26664o(11419);
            return "NOT_SUPPORTED";
        }
        synchronized (this.f51070i) {
            try {
                str = this.f51064c;
            } finally {
                MethodCollector.m26664o(11419);
            }
        }
        return str;
    }

    /* renamed from: d */
    public final String mo35116d() {
        String str;
        MethodCollector.m26663i(11420);
        if (Build.VERSION.SDK_INT < 24) {
            MethodCollector.m26664o(11420);
            return "NOT_SUPPORTED";
        }
        synchronized (this.f51072k) {
            try {
                str = this.f51065d;
            } finally {
                MethodCollector.m26664o(11420);
            }
        }
        return str;
    }

    public final String toString() {
        return "NetworkQualityCollect{mGSMType='" + this.f51064c + '\'' + ", mNetworkType='" + this.f51065d + '\'' + ", mDataLevel=" + this.f51066e + ", mWifiLevel=" + this.f51067f + ", lastDataSim=" + this.f51080u + '}';
    }

    /* renamed from: com.bytedance.n.a$a */
    class C21515a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(25142);
        }

        C21515a() {
        }

        /* renamed from: a */
        private static NetworkInfo m40420a(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
                return C61338a.m111034a();
            }
        }

        public final void onReceive(Context context, Intent intent) {
            MethodCollector.m26663i(10795);
            try {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    NetworkInfo a = m40420a(C21513a.this.f51074m);
                    synchronized (C21513a.this.f51072k) {
                        if (a == null) {
                            C21513a.this.f51065d = "DISCONNECTED";
                            C21513a.this.f51065d = "DISCONNECTED";
                        } else {
                            try {
                                if (a.isConnected()) {
                                    C21513a.this.mo35112a();
                                    C21513a.this.f51065d = a.getTypeName();
                                }
                                C21513a.this.f51065d = "DISCONNECTED";
                            } catch (Throwable th) {
                                MethodCollector.m26664o(10795);
                                throw th;
                            }
                        }
                    }
                    if ("DISCONNECTED".equals(C21513a.this.f51065d)) {
                        synchronized (C21513a.this.f51073l) {
                            try {
                                C21513a.this.f51067f = -2;
                                C21513a.this.f51068g = -2;
                            } finally {
                                MethodCollector.m26664o(10795);
                            }
                        }
                        return;
                    }
                    MethodCollector.m26664o(10795);
                } else if ("android.net.wifi.RSSI_CHANGED".equals(intent.getAction())) {
                    synchronized (C21513a.this.f51073l) {
                        try {
                            int intExtra = intent.getIntExtra("newRssi", -70);
                            C21513a aVar = C21513a.this;
                            int i = 4;
                            if (intExtra <= -88) {
                                i = 0;
                            } else if (intExtra < -55) {
                                i = ((intExtra - -88) * 4) / 33;
                            }
                            aVar.f51067f = i;
                        } finally {
                            MethodCollector.m26664o(10795);
                        }
                    }
                } else {
                    MethodCollector.m26664o(10795);
                }
            } catch (Exception e) {
                e.printStackTrace();
                MethodCollector.m26664o(10795);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.n.a$b */
    public class C21516b extends PhoneStateListener {
        static {
            Covode.recordClassIndex(25143);
        }

        C21516b() {
        }

        public final void onServiceStateChanged(ServiceState serviceState) {
            super.onServiceStateChanged(serviceState);
            try {
                C21513a.this.mo35113a(serviceState.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            MethodCollector.m26663i(9339);
            super.onSignalStrengthsChanged(signalStrength);
            synchronized (C21513a.this.f51071j) {
                try {
                    if (Build.VERSION.SDK_INT >= 23) {
                        try {
                            C21513a.this.f51066e = signalStrength.getLevel();
                        } catch (Throwable unused) {
                        }
                    }
                } finally {
                    MethodCollector.m26664o(9339);
                }
            }
        }

        public final void onDataConnectionStateChanged(int i, int i2) {
            String str;
            MethodCollector.m26663i(9337);
            super.onDataConnectionStateChanged(i, i2);
            synchronized (C21513a.this.f51070i) {
                try {
                    C21513a.this.f51062a = i2;
                    C21513a aVar = C21513a.this;
                    switch (i2) {
                        case 1:
                            str = "GPRS";
                            break;
                        case 2:
                            str = "EDGE";
                            break;
                        case 3:
                            str = "UMTS";
                            break;
                        case 4:
                            str = "CDMA";
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            str = "CDMA - EvDo rev. 0";
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            str = "CDMA - EvDo rev. A";
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            str = "CDMA - 1xRTT";
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            str = "HSDPA";
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            str = "HSUPA";
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            str = "HSPA";
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            str = "iDEN";
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            str = "CDMA - EvDo rev. B";
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                            str = "LTE";
                            break;
                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            str = "CDMA - eHRPD";
                            break;
                        case 15:
                            str = "HSPA+";
                            break;
                        case 16:
                            str = "GSM";
                            break;
                        case 17:
                            str = "TD_SCDMA";
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            str = "IWLAN";
                            break;
                        case 19:
                            str = "LTE_CA";
                            break;
                        case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                            str = "NR";
                            break;
                        default:
                            str = "UNKNOWN";
                            break;
                    }
                    aVar.f51064c = str;
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    MethodCollector.m26664o(9337);
                    throw th;
                }
            }
            MethodCollector.m26664o(9337);
        }
    }

    /* renamed from: a */
    public static C21513a m40411a(Context context) {
        MethodCollector.m26663i(11266);
        synchronized (f51060p) {
            try {
                if (f51061t == null) {
                    f51061t = new C21513a(context);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(11266);
                throw th;
            }
        }
        C21513a aVar = f51061t;
        MethodCollector.m26664o(11266);
        return aVar;
    }

    private C21513a(Context context) {
        try {
            this.f51063b = context;
            this.f51078r = (TelephonyManager) m40412a(context, "phone");
            this.f51074m = (ConnectivityManager) m40412a(this.f51063b, "connectivity");
            Context applicationContext = this.f51063b.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            this.f51079s = (WifiManager) m40412a(applicationContext, "wifi");
            HandlerThread handlerThread = new HandlerThread("listener_thread");
            handlerThread.start();
            HandlerC215141 r1 = new Handler(handlerThread.getLooper()) {
                /* class com.bytedance.p1552n.C21513a.HandlerC215141 */

                static {
                    Covode.recordClassIndex(25141);
                }

                public final void handleMessage(Message message) {
                    if (message != null) {
                        super.handleMessage(message);
                        C21513a.this.f51075n = new C21516b();
                        C21513a.this.f51076o = new C21515a();
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
                        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                        m40419b(C21513a.this.f51063b, C21513a.this.f51076o, intentFilter);
                        C21513a.this.mo35112a();
                    }
                }

                /* renamed from: a */
                private static Intent m40418a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
                private static android.content.Intent m40419b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
                    /*
                        android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
                        com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
                        android.content.Intent r0 = m40418a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1552n.C21513a.HandlerC215141.m40419b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
                }
            };
            this.f51081v = r1;
            r1.sendEmptyMessage(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final boolean mo35113a(String str) {
        MethodCollector.m26663i(11265);
        if (str == null) {
            MethodCollector.m26664o(11265);
            return false;
        }
        synchronized (this.f51077q) {
            try {
                this.f51069h = false;
                if (!TextUtils.isEmpty(str) && (str.contains("nrState=NOT_RESTRICTED") || str.contains("nrState=CONNECTED"))) {
                    this.f51069h = true;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(11265);
                throw th;
            }
        }
        boolean z = this.f51069h;
        MethodCollector.m26664o(11265);
        return z;
    }

    /* renamed from: a */
    private static Object m40412a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11264);
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
                    MethodCollector.m26664o(11264);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
