package com.p2082ss.android.ugc.aweme.shoutouts.p3902b;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.b.a */
public final class C74387a {

    /* renamed from: a */
    public static final C74387a f167289a = new C74387a();

    private C74387a() {
    }

    static {
        Covode.recordClassIndex(87165);
    }

    /* renamed from: a */
    public static void m130851a(Context context) {
        C89219l.m154721d(context, "");
        m130855b(context, "https://www.tiktok.com/inapp/feedback/main/?hide_nav_bar=1&id=13188&entrance=TikTok_shoutouts");
    }

    /* renamed from: b */
    public static void m130855b(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview/");
        if (!(context instanceof Activity)) {
            buildRoute.addFlags(268435456);
        }
        buildRoute.withParam("url", str).open();
    }

    /* renamed from: a */
    public static void m130853a(Context context, String str) {
        C89219l.m154721d(context, "");
        if (str != null) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                AbstractC34892bo b = C31575b.m65860b();
                IAccountService.C31274d dVar = new IAccountService.C31274d();
                dVar.f74960a = (Activity) context;
                dVar.f74964e = new C74388a(context, str);
                b.showLoginAndRegisterView(dVar.mo57084a());
                return;
            }
            SmartRouter.buildRoute(context, "//shoutouts/detail?creator_id=" + str + "&enter_from=home_page").open();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shoutouts.b.a$a */
    public static final class C74388a implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ Context f167290a;

        /* renamed from: b */
        final /* synthetic */ String f167291b;

        static {
            Covode.recordClassIndex(87166);
        }

        C74388a(Context context, String str) {
            this.f167290a = context;
            this.f167291b = str;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i2 == 1) {
                C74387a.m130853a(this.f167290a, this.f167291b);
            }
        }
    }

    /* renamed from: a */
    public static void m130852a(Context context, Integer num, String str) {
        C89219l.m154721d(context, "");
        String concat = "https://www.tiktok.com/web-inapp/shoutouts/creator/dashboard/?__status_bar=true&hide_nav_bar=1&should_full_screen=1&enter_from=".concat(String.valueOf(str));
        if (num != null) {
            num.intValue();
            concat = concat + "&order_filter=" + num;
        }
        m130855b(context, concat);
    }

    /* renamed from: a */
    public static void m130854a(Context context, String str, String str2) {
        C89219l.m154721d(context, "");
        m130855b(context, "https://www.tiktok.com/web-inapp/shoutouts/place-order?hide_nav_bar=1&__status_bar=true&should_full_screen=1&product_id=" + str + "&enter_from=" + str2);
    }
}
