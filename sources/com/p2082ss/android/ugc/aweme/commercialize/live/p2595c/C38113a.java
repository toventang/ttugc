package com.p2082ss.android.ugc.aweme.commercialize.live.p2595c;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.c.a */
public final class C38113a {

    /* renamed from: a */
    public static final C38113a f90052a = new C38113a();

    private C38113a() {
    }

    static {
        Covode.recordClassIndex(45580);
    }

    /* renamed from: a */
    private static Object m77222a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m77223a(String str, Bundle bundle) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bundle, "");
        Set<String> keySet = bundle.keySet();
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = Uri.parse(parse.getQueryParameter("fallback_url")).buildUpon();
        C89219l.m154716b(parse, "");
        Uri.Builder buildUpon2 = C38114b.m77224a(parse, "fallback_url").buildUpon();
        for (String str2 : keySet) {
            String valueOf = String.valueOf(m77222a(bundle, str2));
            buildUpon2.appendQueryParameter(str2, valueOf);
            buildUpon.appendQueryParameter(str2, valueOf);
        }
        buildUpon2.appendQueryParameter("fallback_url", Uri.decode(buildUpon.build().toString()));
        String uri = buildUpon2.build().toString();
        C89219l.m154716b(uri, "");
        return uri;
    }
}
