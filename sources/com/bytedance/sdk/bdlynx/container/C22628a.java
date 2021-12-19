package com.bytedance.sdk.bdlynx.container;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1687e.p1689b.p1690a.C22643f;
import com.bytedance.sdk.bdlynx.p1687e.p1689b.p1691b.C22645a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.container.a */
public final class C22628a {

    /* renamed from: a */
    public static final C22628a f53449a = new C22628a();

    private C22628a() {
    }

    static {
        Covode.recordClassIndex(26445);
    }

    /* renamed from: a */
    public static C22629b m42692a(Uri uri) {
        boolean z;
        String queryParameter;
        C89219l.m154719c(uri, "");
        if (!C89219l.m154714a((Object) "bdlynx", (Object) uri.getScheme()) || !C89219l.m154714a((Object) "lynxview", (Object) uri.getAuthority())) {
            z = false;
        } else {
            z = true;
        }
        List<String> list = null;
        if (!z || (queryParameter = uri.getQueryParameter("groupid")) == null || queryParameter.length() == 0 || queryParameter == null) {
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("cardid");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        C89219l.m154709a((Object) queryParameter2, "");
        C22643f fVar = new C22643f();
        try {
            List<String> queryParameters = uri.getQueryParameters("providers");
            if (queryParameters != null && !queryParameters.isEmpty()) {
                list = queryParameters;
            }
            fVar.f53478b = list;
            List<? extends Object> a = C89070n.m154516a(new C22645a(uri.getQueryParameter("url"), 6));
            C89219l.m154719c(a, "");
            fVar.f53477a = a;
            fVar.f53482f = uri.getQueryParameter("accesskey");
            fVar.f53483g = uri.getQueryParameter("lynxcardpath");
        } catch (Exception unused) {
        }
        String queryParameter3 = uri.getQueryParameter("post_url");
        C89219l.m154709a((Object) queryParameter, "");
        C22629b bVar = new C22629b(queryParameter, queryParameter2, fVar);
        bVar.f53450a = queryParameter3;
        return bVar;
    }
}
