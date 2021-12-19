package com.p2082ss.android.ugc.aweme.ecommerce.router;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.C44482a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.a */
public final class C45235a implements IInterceptor {
    static {
        Covode.recordClassIndex(53687);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.a$a */
    public static final class C45236a extends C27895a<List<? extends C44482a.C44483a>> {
        static {
            Covode.recordClassIndex(53688);
        }

        C45236a() {
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getHost();
        } else {
            str = null;
        }
        return C89219l.m154714a((Object) str, (Object) "ec");
    }

    /* renamed from: a */
    private static String m87828a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r5v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0101, code lost:
        if (r4.equals("/order/detail") != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b1, code lost:
        if (p4600h.p4622m.C89361p.m154872a(r7, r4, false) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x060a  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d9  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r31, com.bytedance.router.RouteIntent r32) {
        /*
        // Method dump skipped, instructions count: 1866
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.router.C45235a.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
