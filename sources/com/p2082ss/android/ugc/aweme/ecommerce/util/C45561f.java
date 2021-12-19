package com.p2082ss.android.ugc.aweme.ecommerce.util;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.f */
public final class C45561f {
    static {
        Covode.recordClassIndex(54054);
    }

    /* renamed from: a */
    public static final Uri m88107a(Uri uri, String str, String str2) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        C89219l.m154716b(queryParameterNames, "");
        for (T t : queryParameterNames) {
            if (!C89219l.m154714a((Object) t, (Object) str)) {
                buildUpon.appendQueryParameter(t, uri.getQueryParameter(t));
            } else {
                buildUpon.appendQueryParameter(str, str2);
            }
        }
        Uri build = buildUpon.build();
        C89219l.m154716b(build, "");
        return build;
    }
}
