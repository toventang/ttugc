package com.p2082ss.android.ugc.aweme.profile.api;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80517gw;
import java.util.Set;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.api.h */
public final class C63434h {

    /* renamed from: a */
    public static final C63434h f144032a = new C63434h();

    private C63434h() {
    }

    static {
        Covode.recordClassIndex(74739);
    }

    /* renamed from: a */
    public static final void m115029a(String str) {
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                C89219l.m154716b(parse, "");
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames == null) {
                    return;
                }
                if (!queryParameterNames.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (String str2 : queryParameterNames) {
                        if (str2 != null) {
                            String queryParameter = parse.getQueryParameter(str2);
                            if (queryParameter != null) {
                                C89219l.m154716b(queryParameter, "");
                                jSONObject.put(str2, queryParameter);
                            }
                        }
                    }
                    if (jSONObject.length() > 0) {
                        C80517gw.m139563a();
                        C80517gw.m139565a(parse.getPath(), jSONObject);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
