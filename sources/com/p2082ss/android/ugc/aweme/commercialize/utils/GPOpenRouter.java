package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.route.IRouteAction;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38669b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.GPOpenRouter */
public final class GPOpenRouter implements IRouteAction {
    static {
        Covode.recordClassIndex(46141);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_utils_GPOpenRouter_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m78331x13a9d12a(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        m78331x13a9d12a("message_winter", "url = " + str + "   extra = " + bundle);
        String queryParameter = Uri.parse(str).getQueryParameter("package_name");
        if (queryParameter == null) {
            return false;
        }
        C89219l.m154716b(queryParameter, "");
        return Boolean.valueOf(C38669b.m78462a(context, queryParameter));
    }
}
