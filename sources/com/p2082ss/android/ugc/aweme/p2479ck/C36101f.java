package com.p2082ss.android.ugc.aweme.p2479ck;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.ck.f */
public final class C36101f implements IInterceptor {

    /* renamed from: a */
    public static final C36102a f85310a = new C36102a((byte) 0);

    static {
        Covode.recordClassIndex(43354);
    }

    /* renamed from: com.ss.android.ugc.aweme.ck.f$a */
    public static final class C36102a {
        static {
            Covode.recordClassIndex(43355);
        }

        private C36102a() {
        }

        public /* synthetic */ C36102a(byte b) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r4 != null) goto L_0x000d;
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0023
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0023
            java.lang.String r1 = r0.getHost()
        L_0x000d:
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0017
            java.lang.String r2 = r0.getPath()
        L_0x0017:
            java.lang.String r2 = p4600h.p4611f.p4613b.C89219l.m154704a(r1, r2)
            r1 = 0
            java.lang.String r0 = "aweme/challenge/detail"
            boolean r0 = p4600h.p4622m.C89361p.m154874b(r2, r0, r1)
            return r0
        L_0x0023:
            r1 = r2
            if (r4 == 0) goto L_0x0017
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2479ck.C36101f.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        Uri.Builder buildUpon = Uri.parse("aweme://challenge/detail").buildUpon();
        Set<String> queryParameterNames = (routeIntent == null || (uri = routeIntent.getUri()) == null) ? null : uri.getQueryParameterNames();
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            for (String str : queryParameterNames) {
                Uri uri2 = routeIntent.getUri();
                buildUpon.appendQueryParameter(str, uri2 != null ? uri2.getQueryParameter(str) : null);
            }
        }
        if (routeIntent != null) {
            routeIntent.setUrl(buildUpon.toString());
        }
        return false;
    }
}
