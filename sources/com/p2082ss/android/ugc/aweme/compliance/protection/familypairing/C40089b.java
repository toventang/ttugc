package com.p2082ss.android.ugc.aweme.compliance.protection.familypairing;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.SetTimeLockActivity;
import com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j;
import com.p2082ss.android.ugc.aweme.p2479ck.C36132v;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.familypairing.b */
public final class C40089b implements IInterceptor, AbstractC36109j {
    static {
        Covode.recordClassIndex(47865);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j
    /* renamed from: c */
    public final boolean mo63242c(String str) {
        return m81072b(null, str);
    }

    /* renamed from: a */
    private static int m81070a(String str) {
        String b = C36132v.m73608b(str, StringSet.type);
        b.hashCode();
        if (b.equals("teen_mode")) {
            return 1;
        }
        if (!b.equals("time_lock")) {
            return -1;
        }
        return 0;
    }

    /* renamed from: b */
    private static int m81071b(String str) {
        String b = C36132v.m73608b(str, "time_lock");
        if (TextUtils.isEmpty(b)) {
            return 0;
        }
        try {
            return Integer.parseInt(b);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: d */
    private static int m81073d(String str) {
        String b = C36132v.m73608b(str, "teen_mode");
        if (TextUtils.isEmpty(b)) {
            return 0;
        }
        try {
            return Integer.parseInt(b);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent == null || routeIntent.getUri() == null) {
            str = null;
        } else {
            str = routeIntent.getUri().getHost();
        }
        return "teen_protection".equals(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j
    /* renamed from: a */
    public final boolean mo63240a(Activity activity, String str) {
        return m81072b(activity, str);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        m81072b((Activity) context, routeIntent.getOriginUrl());
        return true;
    }

    /* renamed from: b */
    private static boolean m81072b(Activity activity, String str) {
        boolean z;
        Context context = activity;
        if (context == null && (context = C17873f.m33102j()) == null) {
            context = C17867d.m33078a();
        }
        if (m81073d(str) == -1 || TextUtils.isEmpty(C36132v.m73608b(str, "user_id"))) {
            return false;
        }
        int a = m81070a(str);
        if (a != 0 ? !(a == 1 && m81073d(str) == 1) : m81071b(str) <= 0) {
            z = false;
        } else {
            z = true;
        }
        SetTimeLockActivity.m81133a(context, m81070a(str), C36132v.m73608b(str, "user_id"), C36132v.m73608b(str, "sec_user_id"), C36132v.m73608b(str, "username"), z, m81071b(str));
        return true;
    }
}
