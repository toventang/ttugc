package com.p2082ss.android.ugc.aweme.p2479ck;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.commercialize.p2570im.C38024a;

/* renamed from: com.ss.android.ugc.aweme.ck.n */
public final class C36115n implements IInterceptor {

    /* renamed from: a */
    public static final C36116a f85316a = new C36116a((byte) 0);

    static {
        Covode.recordClassIndex(43368);
    }

    /* renamed from: com.ss.android.ugc.aweme.ck.n$a */
    public static final class C36116a {
        static {
            Covode.recordClassIndex(43369);
        }

        private C36116a() {
        }

        public /* synthetic */ C36116a(byte b) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r4 != null) goto L_0x000d;
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0022
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = r0.getHost()
        L_0x000d:
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0017
            java.lang.String r2 = r0.getPath()
        L_0x0017:
            java.lang.String r1 = p4600h.p4611f.p4613b.C89219l.m154704a(r1, r2)
            java.lang.String r0 = "chatting/message"
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r0, r1)
            return r0
        L_0x0022:
            r1 = r2
            if (r4 == 0) goto L_0x0017
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2479ck.C36115n.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        String str2 = null;
        if (context instanceof Activity) {
            C38024a aVar = C38024a.f89849a;
            Activity activity = (Activity) context;
            if (routeIntent != null) {
                str2 = routeIntent.getUrl();
            }
            aVar.mo63240a(activity, str2);
            return true;
        }
        C38024a aVar2 = C38024a.f89849a;
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        } else {
            str = null;
        }
        aVar2.mo63240a((Activity) null, str);
        return true;
    }
}
