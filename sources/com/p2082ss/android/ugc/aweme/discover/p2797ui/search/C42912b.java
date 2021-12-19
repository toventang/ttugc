package com.p2082ss.android.ugc.aweme.discover.p2797ui.search;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.search.AbstractC67366e;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.b */
public final class C42912b implements AbstractC67366e {

    /* renamed from: a */
    public static final C42912b f100060a = new C42912b();

    @Override // com.p2082ss.android.ugc.aweme.search.AbstractC67366e
    /* renamed from: a */
    public final void mo73134a(String str) {
        C89219l.m154721d(str, "");
    }

    private C42912b() {
    }

    static {
        Covode.recordClassIndex(51017);
    }

    /* renamed from: a */
    public static void m85668a(Exception exc, String str) {
        C89219l.m154721d(exc, "");
        C89219l.m154721d(str, "");
        C13468b.m24211a(exc, str);
        C51423a.m95790a((Throwable) exc);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_message", exc.getMessage());
            jSONObject.put("bridge_type", str);
            C12290b.m22060a("get_search_history_exception", 0, C33743c.m69072a(jSONObject).mo59977a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
