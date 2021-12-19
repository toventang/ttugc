package com.p2082ss.android.ugc.aweme.lancet.p3385b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.lancet.b.b */
public final class C58010b {

    /* renamed from: a */
    public static AtomicBoolean f132212a = new AtomicBoolean(false);

    /* renamed from: b */
    public static AtomicBoolean f132213b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(68045);
    }

    /* renamed from: a */
    public static int m104838a(Request request) {
        if (request == null) {
            return -1;
        }
        String path = request.getPath();
        if (TextUtils.isEmpty(path)) {
            return -1;
        }
        if (path.contains("/aweme/v1/feed/")) {
            return 1;
        }
        if (path.contains("/aweme/v2/feed/")) {
            return 2;
        }
        return -1;
    }
}
