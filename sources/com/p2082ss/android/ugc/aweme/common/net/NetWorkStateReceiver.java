package com.p2082ss.android.ugc.aweme.common.net;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.wschannel.p921e.C13747d;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.video.C80938q;
import java.lang.reflect.Field;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver */
public class NetWorkStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static boolean f92359a;

    /* renamed from: b */
    boolean f92360b;

    /* renamed from: c */
    private C13624l.EnumC13625a f92361c = C13624l.EnumC13625a.UNKNOWN;

    static {
        Covode.recordClassIndex(46767);
    }

    public NetWorkStateReceiver() {
        if (C13747d.m24781a(C17867d.m33078a())) {
            this.f92360b = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo67910a() {
        C34719f.C34720a.f82009a.mo61393a(m79442a((ConnectivityManager) m79443a(C17867d.m33078a(), "connectivity")));
        C13624l.EnumC13625a aVar = C34719f.C34720a.f82009a.f82007a;
        if (aVar != this.f92361c) {
            C80938q.m140455b();
        }
        if (this.f92361c != C13624l.EnumC13625a.UNKNOWN) {
            f92359a = true;
        }
        this.f92361c = aVar;
        return null;
    }

    /* renamed from: a */
    private static NetworkInfo m79442a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            try {
                C1731i.m5640b(new CallableC39149d(this), C40780g.m82241a()).mo5534a(new C39150e(this), C1731i.f5564c, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static Object m79443a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2243);
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
                    MethodCollector.m26664o(2243);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
