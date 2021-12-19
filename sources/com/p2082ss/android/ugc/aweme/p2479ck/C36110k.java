package com.p2082ss.android.ugc.aweme.p2479ck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33569ac;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.utils.p4200a.C80186c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ck.k */
public final class C36110k implements IInterceptor {

    /* renamed from: a */
    public static final C36111a f85314a = new C36111a((byte) 0);

    static {
        Covode.recordClassIndex(43363);
    }

    /* renamed from: com.ss.android.ugc.aweme.ck.k$a */
    public static final class C36111a {
        static {
            Covode.recordClassIndex(43364);
        }

        private C36111a() {
        }

        public /* synthetic */ C36111a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null) {
            str = null;
        } else {
            str = uri.getHost();
        }
        return C89219l.m154714a((Object) "chat", (Object) str);
    }

    /* renamed from: a */
    private static void m73574a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (!(context == null || routeIntent == null)) {
            C31575b.m65859a();
            IAccountUserService e = C31575b.f75524a.mo57069e();
            C89219l.m154716b(e, "");
            if (!e.isLogin() && (context instanceof Activity)) {
                m73574a(context, C33569ac.C33570a.m68782a((Activity) context, routeIntent.getExtra(), routeIntent.getUri().getQueryParameter("multi_account_push_uid")));
                return true;
            } else if (C56318b.m102311b()) {
                Intent a = C80186c.m139003a(context);
                a.setFlags(67108864);
                a.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                a.putExtras(routeIntent.getExtra());
                m73574a(context, a);
                return true;
            }
        }
        return false;
    }
}
