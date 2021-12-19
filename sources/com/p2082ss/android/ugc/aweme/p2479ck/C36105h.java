package com.p2082ss.android.ugc.aweme.p2479ck;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ck.h */
public final class C36105h implements IInterceptor {

    /* renamed from: a */
    public static final C36106a f85312a = new C36106a((byte) 0);

    static {
        Covode.recordClassIndex(43358);
    }

    /* renamed from: com.ss.android.ugc.aweme.ck.h$a */
    public static final class C36106a {
        static {
            Covode.recordClassIndex(43359);
        }

        private C36106a() {
        }

        public /* synthetic */ C36106a(byte b) {
            this();
        }

        /* renamed from: a */
        static Uri m73571a(Uri uri, String str, String str2) {
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            C89219l.m154716b(queryParameterNames, "");
            for (T t : queryParameterNames) {
                if (!C89219l.m154714a((Object) t, (Object) str)) {
                    clearQuery.appendQueryParameter(t, uri.getQueryParameter(t));
                }
            }
            clearQuery.appendQueryParameter(str, str2);
            Uri build = clearQuery.build();
            C89219l.m154716b(build, "");
            return build;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Boolean valueOf;
        if (routeIntent != null && C16048b.m29633a().mo25412a(true, "bundle_dynamic_load", 0) == 1) {
            Uri parse = Uri.parse(routeIntent.getUrl());
            C89219l.m154716b(parse, "");
            if (C89219l.m154714a((Object) parse.getAuthority(), (Object) "reactnative")) {
                String queryParameter = parse.getQueryParameter("channel");
                if (queryParameter != null) {
                    valueOf = Boolean.valueOf(C80333dc.m139273a().contains(queryParameter));
                } else {
                    String queryParameter2 = parse.getQueryParameter("channel_name");
                    if (!(queryParameter2 == null || (queryParameter2 + "_android") == null)) {
                        valueOf = Boolean.valueOf(C80333dc.m139273a().contains(str));
                    }
                }
                if (valueOf == null || !valueOf.booleanValue()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        if (r0 == null) goto L_0x004a;
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r7, com.bytedance.router.RouteIntent r8) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2479ck.C36105h.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
