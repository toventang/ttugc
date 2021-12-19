package com.p2082ss.android.ugc.aweme.account.p2274n;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.account.util.C33035e;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.n.a */
public final class C32847a {

    /* renamed from: a */
    public static final C32847a f78220a = new C32847a();

    /* renamed from: b */
    private static final boolean f78221b = false;

    private C32847a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.n.a$a */
    public static final class CallableC32848a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC32848a f78222a = new CallableC32848a();

        static {
            Covode.recordClassIndex(39633);
        }

        CallableC32848a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    CookieManager.getInstance().flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(39632);
    }

    /* renamed from: a */
    public static final void m67442a(Context context) {
        if (context != null && !C36085cj.m73550d()) {
            JSONObject a = new C33743c().mo59976a("enter_from", "normal").mo59977a();
            C89219l.m154716b(a, "");
            C32837b.m67403a("monitor_clear_cookie", 1, a);
            if (Build.VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(context);
            }
            CookieManager a2 = C33035e.m67668a();
            if (a2 != null) {
                a2.removeAllCookie();
                if (Build.VERSION.SDK_INT >= 21) {
                    a2.flush();
                } else {
                    CookieSyncManager.getInstance().sync();
                }
            }
        }
    }
}
