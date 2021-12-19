package com.p2082ss.android.ugc.aweme.p2479ck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33836o;
import com.p2082ss.android.ugc.aweme.app.PushLoginActivity;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.utils.p4200a.C80186c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ck.l */
public final class C36112l implements IInterceptor, AbstractC36109j {

    /* renamed from: a */
    public static final C36113a f85315a = new C36113a((byte) 0);

    static {
        Covode.recordClassIndex(43365);
    }

    /* renamed from: com.ss.android.ugc.aweme.ck.l$a */
    public static final class C36113a {
        static {
            Covode.recordClassIndex(43366);
        }

        private C36113a() {
        }

        public /* synthetic */ C36113a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j
    /* renamed from: c */
    public final boolean mo63242c(String str) {
        C89219l.m154721d(str, "");
        return m73577b(null, str);
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
        return C89219l.m154714a((Object) "login", (Object) str);
    }

    /* renamed from: a */
    private static void m73575a(Activity activity, Intent intent) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    private static void m73576a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j
    /* renamed from: a */
    public final boolean mo63240a(Activity activity, String str) {
        return m73577b(activity, str);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        String str2 = null;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (routeIntent != null) {
                str2 = routeIntent.getUrl();
            }
            m73577b(activity, str2);
            return true;
        }
        Activity j = C17873f.m33102j();
        if (j != null) {
            if (routeIntent != null) {
                str2 = routeIntent.getUrl();
            }
            m73577b(j, str2);
            return true;
        }
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        } else {
            str = null;
        }
        m73577b(null, str);
        return true;
    }

    /* renamed from: b */
    private static boolean m73577b(Activity activity, String str) {
        if (C89219l.m154714a((Object) "push", (Object) Uri.parse(str).getQueryParameter("enter_from"))) {
            Intent a = C80186c.m139003a(activity);
            Intent intent = new Intent(activity, PushLoginActivity.class);
            if (activity != null) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (!g.isLogin()) {
                    C33836o a2 = C33836o.m69201a();
                    C89219l.m154716b(a2, "");
                    if (a2.f80094a.mo89311a()) {
                        m73575a(activity, intent);
                    } else {
                        activity.startActivities(new Intent[]{a, intent});
                    }
                    return true;
                }
            }
            Context a3 = C17867d.m33078a();
            C89219l.m154716b(a, "");
            a.setFlags(268435456);
            m73576a(a3, a);
            return true;
        }
        if (activity == null) {
            C58957c.m108318a(C17873f.m33102j(), "h5", "");
        } else {
            C58957c.m108318a(activity, "h5", "");
        }
        return true;
    }
}
