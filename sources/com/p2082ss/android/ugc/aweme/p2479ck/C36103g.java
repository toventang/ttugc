package com.p2082ss.android.ugc.aweme.p2479ck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ck.g */
public final class C36103g implements IInterceptor {

    /* renamed from: a */
    public static final C36104a f85311a = new C36104a((byte) 0);

    static {
        Covode.recordClassIndex(43356);
    }

    /* renamed from: com.ss.android.ugc.aweme.ck.g$a */
    public static final class C36104a {
        static {
            Covode.recordClassIndex(43357);
        }

        private C36104a() {
        }

        public /* synthetic */ C36104a(byte b) {
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
        return C89219l.m154714a((Object) str, (Object) "draft_box");
    }

    /* renamed from: a */
    private static void m73570a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Context context2;
        Class<? extends Activity> draftBoxActivity = AVExternalServiceImpl.m113114a().classnameService().getDraftBoxActivity();
        if (context instanceof Activity) {
            m73570a(context, new Intent(context, draftBoxActivity));
            return true;
        }
        if (context == null) {
            context2 = C17867d.m33078a();
        } else {
            context2 = context;
        }
        Intent intent = new Intent(context, draftBoxActivity);
        intent.addFlags(268435456);
        m73570a(context2, intent);
        return true;
    }
}
