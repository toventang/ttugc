package com.p2082ss.android.ugc.aweme.commercialize.util;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.d */
public final class C38584d {

    /* renamed from: a */
    public static final C38584d f91181a = new C38584d();

    private C38584d() {
    }

    static {
        Covode.recordClassIndex(46116);
    }

    /* renamed from: a */
    private static Object m78288a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m78289a(String str, Bundle bundle) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bundle, "");
        Set<String> keySet = bundle.keySet();
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = Uri.parse(parse.getQueryParameter("fallback_url")).buildUpon();
        C89219l.m154716b(parse, "");
        C89219l.m154721d(parse, "");
        C89219l.m154721d("fallback_url", "");
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        C89219l.m154716b(queryParameterNames, "");
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        C89219l.m154716b(clearQuery, "");
        for (String str2 : queryParameterNames) {
            if (!C89219l.m154714a((Object) str2, (Object) "fallback_url")) {
                clearQuery.appendQueryParameter(str2, parse.getQueryParameter(str2));
            }
        }
        Uri build = clearQuery.build();
        C89219l.m154716b(build, "");
        Uri.Builder buildUpon2 = build.buildUpon();
        for (String str3 : keySet) {
            String valueOf = String.valueOf(m78288a(bundle, str3));
            buildUpon2.appendQueryParameter(str3, valueOf);
            buildUpon.appendQueryParameter(str3, valueOf);
        }
        buildUpon2.appendQueryParameter("fallback_url", Uri.decode(buildUpon.build().toString()));
        String uri = buildUpon2.build().toString();
        C89219l.m154716b(uri, "");
        return uri;
    }
}
