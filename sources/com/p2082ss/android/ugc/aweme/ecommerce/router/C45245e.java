package com.p2082ss.android.ugc.aweme.ecommerce.router;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.e */
public final class C45245e implements IInterceptor {

    /* renamed from: a */
    public static final Uri f105475a;

    /* renamed from: b */
    public static final C45246a f105476b = new C45246a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.e$a */
    public static final class C45246a {
        static {
            Covode.recordClassIndex(53698);
        }

        private C45246a() {
        }

        public /* synthetic */ C45246a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(53697);
        Uri parse = Uri.parse("aweme://echybrid");
        C89219l.m154716b(parse, "");
        f105475a = parse;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String queryParameter;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (queryParameter = uri.getQueryParameter("url")) == null || !C89219l.m154714a((Object) "1", (Object) Uri.parse(queryParameter).getQueryParameter("outer_ecom_product"))) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        Uri uri;
        IECommerceService createIECommerceServicebyMonsterPlugin = ECommerceService.createIECommerceServicebyMonsterPlugin(false);
        if (routeIntent == null || (uri = routeIntent.getUri()) == null) {
            str = null;
        } else {
            str = uri.getQueryParameter("url");
        }
        createIECommerceServicebyMonsterPlugin.showThirdpartyDisclaimerTips(context, str);
        return false;
    }
}
