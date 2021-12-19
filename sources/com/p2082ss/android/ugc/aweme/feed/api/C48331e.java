package com.p2082ss.android.ugc.aweme.feed.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;

/* renamed from: com.ss.android.ugc.aweme.feed.api.e */
public final class C48331e {

    /* renamed from: a */
    public static volatile long f112003a;

    /* renamed from: b */
    public static volatile String f112004b;

    static {
        Covode.recordClassIndex(57103);
    }

    /* renamed from: a */
    public static boolean m91791a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.contains("/aweme/v1/feed/") || str.contains("/aweme/v2/feed/")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m91790a(Request request) {
        if (request == null) {
            return false;
        }
        String path = request.getPath();
        if (TextUtils.isEmpty(path) || (!path.contains("/aweme/v1/feed/") && !path.contains("/aweme/v2/feed/"))) {
            return false;
        }
        return true;
    }
}
