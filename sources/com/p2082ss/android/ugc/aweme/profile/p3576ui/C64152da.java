package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.powerpage.p1236b.C17737a;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.da */
public final class C64152da implements IInterceptor {
    static {
        Covode.recordClassIndex(75596);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        if (C16048b.m29633a().mo25412a(true, "profile_refactor_power_page", 1) == 2) {
            if (routeIntent != null) {
                str = routeIntent.getUrl();
            } else {
                str = null;
            }
            Uri.Builder path = Uri.parse(str).buildUpon().scheme("aweme").authority("user_profile_page").path("");
            if (routeIntent != null) {
                routeIntent.setUrl(path.build().toString());
            }
            if (new C17737a().onInterceptRoute(context, routeIntent)) {
                return true;
            }
            if (routeIntent != null) {
                routeIntent.setUrl(str);
            }
        }
        return false;
    }
}
