package com.p2082ss.android.ugc.aweme.p2479ck;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.shortvideo.p3895y.C74325a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ck.p */
public final class C36121p implements IInterceptor {

    /* renamed from: a */
    private final String f85330a = "openShoot";

    static {
        Covode.recordClassIndex(43374);
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
            java.lang.String r0 = r3.f85330a
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r1, r0)
            return r0
        L_0x0022:
            r1 = r2
            if (r4 == 0) goto L_0x0017
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2479ck.C36121p.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (routeIntent == null || routeIntent.getUri() == null || !(context instanceof Activity)) {
            return true;
        }
        Uri uri = routeIntent.getUri();
        C89219l.m154716b(uri, "");
        C74325a.m130797a((Activity) context, uri);
        return true;
    }
}
