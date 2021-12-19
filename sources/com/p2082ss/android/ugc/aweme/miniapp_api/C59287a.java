package com.p2082ss.android.ugc.aweme.miniapp_api;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.a */
public final class C59287a {
    static {
        Covode.recordClassIndex(69665);
    }

    /* renamed from: a */
    public static void m108997a(Activity activity) {
        Uri data;
        String queryParameter;
        if (activity.getIntent() != null && activity.getIntent().getData() != null && (queryParameter = (data = activity.getIntent().getData()).getQueryParameter("from")) != null && queryParameter.contains("com.tt.miniapp") && "1".equals(data.getQueryParameter("isNeedRTLAnim")) && C80471gb.m139483a(activity)) {
            activity.overridePendingTransition(0, R.anim.dv);
        }
    }
}
