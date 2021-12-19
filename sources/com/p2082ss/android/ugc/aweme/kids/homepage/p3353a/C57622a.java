package com.p2082ss.android.ugc.aweme.kids.homepage.p3353a;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.a.a */
public final class C57622a extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(67582);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.a.a$a */
    static final class CallableC57623a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC57623a f131514a = new CallableC57623a();

        static {
            Covode.recordClassIndex(67583);
        }

        CallableC57623a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Object a = m104351a(C17867d.m33078a(), "connectivity");
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.net.ConnectivityManager");
            C34719f.C34720a.f82009a.mo61393a(m104350a((ConnectivityManager) a));
            return C89391z.f203057a;
        }

        /* renamed from: a */
        private static NetworkInfo m104350a(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
                return C61338a.m111034a();
            }
        }

        /* renamed from: a */
        private static Object m104351a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(2933);
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
                        MethodCollector.m26664o(2933);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        if (C89219l.m154714a((Object) "android.net.conn.CONNECTIVITY_CHANGE", (Object) intent.getAction())) {
            try {
                C1731i.m5640b(CallableC57623a.f131514a, C40780g.m82241a());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
