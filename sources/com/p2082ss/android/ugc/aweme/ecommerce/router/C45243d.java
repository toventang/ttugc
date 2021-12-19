package com.p2082ss.android.ugc.aweme.ecommerce.router;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.p3070im.IIMAdapterService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.IMAdapterServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.d */
public final class C45243d implements IInterceptor {

    /* renamed from: a */
    public static final C45244a f105474a = new C45244a((byte) 0);

    static {
        Covode.recordClassIndex(53695);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.d$a */
    public static final class C45244a {
        static {
            Covode.recordClassIndex(53696);
        }

        private C45244a() {
        }

        public /* synthetic */ C45244a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        if (!(routeIntent == null || routeIntent.getUri() == null)) {
            StringBuilder sb = new StringBuilder();
            Uri uri = routeIntent.getUri();
            C89219l.m154716b(uri, "");
            StringBuilder append = sb.append(uri.getAuthority());
            Uri uri2 = routeIntent.getUri();
            C89219l.m154716b(uri2, "");
            if (C89219l.m154714a((Object) "chat/launchchat", (Object) append.append(uri2.getPath()).toString())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String queryParameter;
        IIMAdapterService d;
        if (routeIntent == null || routeIntent.getUri() == null || (queryParameter = routeIntent.getUri().getQueryParameter("uid")) == null || queryParameter.length() == 0) {
            return false;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        String str = "";
        C89219l.m154716b(createIIMServicebyMonsterPlugin, str);
        if (!(createIIMServicebyMonsterPlugin == null || (d = IMAdapterServiceImpl.m101068d()) == null || !d.mo90129a())) {
            IMUser iMUser = new IMUser();
            Uri uri = routeIntent.getUri();
            iMUser.setUid(queryParameter);
            iMUser.setNickName(uri.getQueryParameter("nickname"));
            iMUser.setSignature(uri.getQueryParameter("alias"));
            iMUser.setFake(true);
            C56245a.C56246a a = C56245a.C56247b.m102214a(context, iMUser);
            String queryParameter2 = routeIntent.getUri().getQueryParameter("enter_from");
            if (queryParameter2 != null) {
                str = queryParameter2;
            }
            C56245a aVar = a.mo93274c(str).mo93261a().f128281a;
            String userId = aVar.getUserId();
            if (userId != null && userId.length() > 0) {
                createIIMServicebyMonsterPlugin.startChat(aVar);
            }
        }
        return true;
    }
}
