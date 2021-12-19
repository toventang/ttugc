package com.p2082ss.android.ugc.aweme.search.p3699m;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.search.C67435g;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.m.b */
public final class C67649b implements IInterceptor {
    static {
        Covode.recordClassIndex(79289);
    }

    /* renamed from: a */
    private static Bundle m119793a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r4 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r4 != null) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x004b
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x004b
            java.lang.String r1 = r0.getHost()
        L_0x000d:
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r0.getPath()
        L_0x0017:
            java.lang.String r1 = p4600h.p4611f.p4613b.C89219l.m154704a(r1, r0)
            java.lang.String r0 = "search"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0045
            if (r4 == 0) goto L_0x0047
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r0.getHost()
        L_0x002f:
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = r0.getPath()
        L_0x0039:
            java.lang.String r1 = p4600h.p4611f.p4613b.C89219l.m154704a(r1, r2)
            java.lang.String r0 = "search/"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x0051
        L_0x0045:
            r0 = 1
            return r0
        L_0x0047:
            r1 = r2
            if (r4 == 0) goto L_0x0039
            goto L_0x002f
        L_0x004b:
            r1 = r2
            if (r4 == 0) goto L_0x004f
            goto L_0x000d
        L_0x004f:
            r0 = r2
            goto L_0x0017
        L_0x0051:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.search.p3699m.C67649b.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    /* renamed from: a */
    private static Object m119794a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Bundle a;
        Set<String> set = null;
        if (routeIntent == null || routeIntent.getUri() == null || context == null) {
            return false;
        }
        Uri uri = routeIntent != null ? routeIntent.getUri() : null;
        Intent extra = routeIntent.getExtra();
        Bundle a2 = extra != null ? m119793a(extra) : null;
        Intent extra2 = routeIntent.getExtra();
        if (!(extra2 == null || (a = m119793a(extra2)) == null)) {
            set = a.keySet();
        }
        if (!(a2 == null || set == null)) {
            Uri.Builder buildUpon = uri.buildUpon();
            for (T t : set) {
                Object a3 = m119794a(a2, t);
                if (a3 == null) {
                    a3 = "";
                }
                buildUpon.appendQueryParameter(t, String.valueOf(a3));
            }
            uri = buildUpon.build();
        }
        C89219l.m154716b(uri, "");
        Bundle animationBundle = routeIntent.getAnimationBundle();
        C89219l.m154721d(context, "");
        C89219l.m154721d(uri, "");
        C67674b.C67675a newBuilder = C67674b.Companion.newBuilder();
        C67648a.m119791a(uri, newBuilder);
        C67674b a4 = newBuilder.mo106686a();
        C67678d dVar = new C67678d();
        C67648a.m119792a(uri, dVar);
        dVar.setSearchEnterParam(a4);
        C67435g.m119470a(context, dVar, a4, animationBundle);
        return true;
    }
}
