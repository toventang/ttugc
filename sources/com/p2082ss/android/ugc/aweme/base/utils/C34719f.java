package com.p2082ss.android.ugc.aweme.base.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.base.utils.f */
public class C34719f implements C13624l.AbstractC13626b {

    /* renamed from: a */
    public C13624l.EnumC13625a f82007a;

    /* renamed from: b */
    private NetworkInfo f82008b;

    static {
        Covode.recordClassIndex(41711);
    }

    @Override // com.bytedance.common.utility.C13624l.AbstractC13626b
    /* renamed from: a */
    public final C13624l.EnumC13625a mo21885a() {
        return this.f82007a;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.utils.f$a */
    public static class C34720a {

        /* renamed from: a */
        public static final C34719f f82009a = new C34719f((byte) 0);

        static {
            Covode.recordClassIndex(41712);
        }
    }

    private C34719f() {
        this.f82007a = C13624l.EnumC13625a.NONE;
        try {
            NetworkInfo a = m70913a((ConnectivityManager) m70914a(C17867d.m33078a(), "connectivity"));
            this.f82008b = a;
            m70915b(a);
            C13624l.f33103a = this;
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final boolean mo61395c() {
        boolean z;
        MethodCollector.m26663i(13988);
        synchronized (C34719f.class) {
            try {
                NetworkInfo networkInfo = this.f82008b;
                if (networkInfo == null || !networkInfo.isAvailable()) {
                    z = false;
                } else {
                    z = true;
                }
            } finally {
                MethodCollector.m26664o(13988);
            }
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo61394b() {
        boolean z;
        MethodCollector.m26663i(13987);
        synchronized (C34719f.class) {
            try {
                NetworkInfo networkInfo = this.f82008b;
                z = true;
                if (networkInfo == null || !networkInfo.isAvailable() || 1 != this.f82008b.getType()) {
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(13987);
            }
        }
        return z;
    }

    /* synthetic */ C34719f(byte b) {
        this();
    }

    /* renamed from: a */
    private static NetworkInfo m70913a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    public final void mo61393a(NetworkInfo networkInfo) {
        MethodCollector.m26663i(13989);
        synchronized (C34719f.class) {
            try {
                this.f82008b = networkInfo;
                m70915b(networkInfo);
            } finally {
                MethodCollector.m26664o(13989);
            }
        }
    }

    /* renamed from: a */
    private static int m70912a(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT < 29) {
            return telephonyManager.getNetworkType();
        }
        if (!C58017a.f132225a.getAndSet(true)) {
            C58017a.m104840a().mo95542a();
        }
        int i = C58017a.m104840a().f132229b.get();
        if (C58017a.f132227c || i != -1) {
            return i;
        }
        return 0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    private void m70915b(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isAvailable()) {
            this.f82007a = C13624l.EnumC13625a.NONE;
            return;
        }
        int type = networkInfo.getType();
        if (1 == type) {
            this.f82007a = C13624l.EnumC13625a.WIFI;
        } else if (type == 0) {
            switch (m70912a((TelephonyManager) m70914a(C17867d.m33078a(), "phone"))) {
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                case ABRConfig.ABR_SELECT_SCENE:
                case 15:
                    this.f82007a = C13624l.EnumC13625a.MOBILE_3G;
                    this.f82007a = C13624l.EnumC13625a.MOBILE_4G;
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    this.f82007a = C13624l.EnumC13625a.MOBILE_4G;
                    break;
            }
            this.f82007a = C13624l.EnumC13625a.MOBILE;
        } else {
            this.f82007a = C13624l.EnumC13625a.MOBILE;
        }
    }

    /* renamed from: a */
    private static Object m70914a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(13986);
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
                    MethodCollector.m26664o(13986);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
