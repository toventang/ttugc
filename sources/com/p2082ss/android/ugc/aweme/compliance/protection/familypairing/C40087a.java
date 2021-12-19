package com.p2082ss.android.ugc.aweme.compliance.protection.familypairing;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j;
import com.p2082ss.android.ugc.aweme.p2479ck.C36132v;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.familypairing.a */
public final class C40087a implements IInterceptor, AbstractC36109j {
    static {
        Covode.recordClassIndex(47861);
    }

    /* renamed from: b */
    private static String m81060b(String str) {
        String b = C36132v.m73608b(str, StringSet.type);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: d */
    private static String m81062d(String str) {
        String b = C36132v.m73608b(str, "user_id");
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: e */
    private static String m81063e(String str) {
        String b = C36132v.m73608b(str, "sec_user_id");
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j
    /* renamed from: c */
    public final boolean mo63242c(String str) {
        C89219l.m154721d(str, "");
        return mo63240a(null, str);
    }

    /* renamed from: a */
    private static int m81059a(String str) {
        String b = C36132v.m73608b(str, "search_restriction_option");
        try {
            C89219l.m154716b(b, "");
            return Integer.parseInt(b);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: f */
    private static int m81064f(String str) {
        try {
            String b = C36132v.m73608b(str, "chat_set");
            C89219l.m154716b(b, "");
            return Integer.parseInt(b);
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        C89219l.m154721d(routeIntent, "");
        String originUrl = routeIntent.getOriginUrl();
        C89219l.m154716b(originUrl, "");
        return C89361p.m154908a((CharSequence) originUrl, (CharSequence) "privacy/setting/modify", false);
    }

    /* renamed from: h */
    private static int m81066h(String str) {
        String b = C36132v.m73608b(str, "cur_value");
        if (b == null || !(!TextUtils.isEmpty(str))) {
            b = C36132v.m73608b(str, "chat_privacy");
        }
        if (TextUtils.isEmpty(b)) {
            return 0;
        }
        try {
            C89219l.m154716b(b, "");
            return Integer.parseInt(b);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: g */
    private static String m81065g(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1875914648:
                if (str.equals("dm_permission_set")) {
                    return "aweme://chatcontrol/setting";
                }
                return null;
            case -1354594911:
                if (str.equals("chat_privacy")) {
                    return "aweme://chatcontrol/setting/familypairing";
                }
                return null;
            case 950398559:
                if (str.equals(UGCMonitor.EVENT_COMMENT)) {
                    return "aweme://commentcontrol/setting/familypairing";
                }
                return null;
            case 1339783250:
                if (str.equals("favorite_permission")) {
                    return "aweme://mylikelistcontrol/setting/familypairing";
                }
                return null;
            case 1437733627:
                if (str.equals("chat_set")) {
                    return "aweme://chatcontrol/setting/familypairing";
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j
    /* renamed from: a */
    public final boolean mo63240a(Activity activity, String str) {
        C89219l.m154721d(str, "");
        return m81061b(activity, str);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(routeIntent, "");
        if (!(context instanceof Activity)) {
            context = null;
        }
        String originUrl = routeIntent.getOriginUrl();
        C89219l.m154716b(originUrl, "");
        mo63240a((Activity) context, originUrl);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        if (r4.equals("chat_set") != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        if (r4.equals("chat_privacy") != false) goto L_0x005f;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m81061b(android.app.Activity r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.C40087a.m81061b(android.app.Activity, java.lang.String):boolean");
    }
}
