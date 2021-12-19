package com.p2082ss.android.ugc.aweme.newfollow.p3506c;

import android.content.ClipboardManager;
import android.content.Context;
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
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.newfollow.c.a */
public final class C61497a implements AbstractC33485al {

    /* renamed from: a */
    public static volatile boolean f139597a = true;

    /* renamed from: b */
    public static final C61498a f139598b = new C61498a((byte) 0);

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: b */
    public final void mo59569b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.c.a$a */
    public static final class C61498a {
        static {
            Covode.recordClassIndex(72155);
        }

        private C61498a() {
        }

        public /* synthetic */ C61498a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(72154);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: a */
    public final void mo59568a() {
        try {
            if (C31575b.m65865g() == null || f139597a) {
                f139597a = false;
                return;
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                C39223a.m79589c().mo68609d();
            }
            f139597a = false;
            try {
                Object a = m111335a(C17867d.m33078a(), "connectivity");
                if (a != null) {
                    C34719f.C34720a.f82009a.mo61393a(m111334a((ConnectivityManager) a));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private static NetworkInfo m111334a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    private static Object m111335a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8829);
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
                    MethodCollector.m26664o(8829);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
