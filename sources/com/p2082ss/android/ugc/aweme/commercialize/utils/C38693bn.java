package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bn */
public final class C38693bn {
    static {
        Covode.recordClassIndex(46234);
    }

    /* renamed from: a */
    public static String m78503a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m78504a(Uri uri, Intent intent) {
        String queryParameter;
        if (uri != null && intent != null && (queryParameter = uri.getQueryParameter("trigger_by")) != null) {
            intent.putExtra("trigger_by", queryParameter);
        }
    }
}
