package com.bytedance.ies.bullet.service.p1172f.p1177b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.f.b.a */
public final class C16857a {
    static {
        Covode.recordClassIndex(19297);
    }

    /* renamed from: a */
    public static final Set<String> m31079a(Uri uri) {
        C89219l.m154719c(uri, "");
        if (uri.isHierarchical()) {
            return uri.getQueryParameterNames();
        }
        return null;
    }

    /* renamed from: a */
    public static final String m31078a(Uri uri, String str) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(str, "");
        if (uri.isHierarchical()) {
            return uri.getQueryParameter(str);
        }
        return null;
    }

    /* renamed from: a */
    public static final Uri m31077a(Uri uri, List<String> list) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(list, "");
        if (!uri.isHierarchical()) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        C89219l.m154709a((Object) clearQuery, "");
        for (String str : uri.getQueryParameterNames()) {
            if (!list.contains(str)) {
                for (String str2 : uri.getQueryParameters(str)) {
                    clearQuery.appendQueryParameter(str, str2);
                }
            }
        }
        Uri build = clearQuery.build();
        C89219l.m154709a((Object) build, "");
        return build;
    }
}
