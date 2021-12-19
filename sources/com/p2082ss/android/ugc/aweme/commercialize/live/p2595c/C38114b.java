package com.p2082ss.android.ugc.aweme.commercialize.live.p2595c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.c.b */
public final class C38114b {
    static {
        Covode.recordClassIndex(45581);
    }

    /* renamed from: a */
    public static final Uri m77224a(Uri uri, String str) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(str, "");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        C89219l.m154716b(queryParameterNames, "");
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        C89219l.m154716b(clearQuery, "");
        for (String str2 : queryParameterNames) {
            if (!C89219l.m154714a((Object) str2, (Object) str)) {
                clearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        Uri build = clearQuery.build();
        C89219l.m154716b(build, "");
        return build;
    }
}
