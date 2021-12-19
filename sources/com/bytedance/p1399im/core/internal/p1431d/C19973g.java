package com.bytedance.p1399im.core.internal.p1431d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19517i;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.im.core.internal.d.g */
public final class C19973g {

    /* renamed from: a */
    public static final C19973g f47476a = new C19973g();

    private C19973g() {
    }

    static {
        Covode.recordClassIndex(22817);
    }

    /* renamed from: a */
    public static void m37677a(C19517i iVar, C19978k kVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(kVar, "");
        try {
            JSONObject jSONObject = new JSONObject(C19999h.f47538a.mo46674b(kVar.f47481e.body));
            Iterator<String> keys = jSONObject.keys();
            C89219l.m154709a((Object) keys, "");
            while (keys.hasNext()) {
                JSONObject optJSONObject = jSONObject.optJSONObject(keys.next());
                if (optJSONObject != null) {
                    Iterator<String> keys2 = optJSONObject.keys();
                    C89219l.m154709a((Object) keys2, "");
                    while (keys2.hasNext()) {
                        String next = keys2.next();
                        if (C89219l.m154714a((Object) next, (Object) "conversation_id")) {
                            iVar.mo31180a("conversation_id", optJSONObject.opt(next));
                        }
                        if (C89219l.m154714a((Object) next, (Object) "client_message_id")) {
                            iVar.mo31180a("uuid", optJSONObject.opt(next));
                        }
                    }
                }
            }
            if (kVar.f47482f != null) {
                iVar.mo31180a("log_id", kVar.f47482f.log_id);
                iVar.mo31180a("status", kVar.f47482f.status_code);
            }
        } catch (Exception e) {
            e.printStackTrace();
            C19510e.m36439a(e);
        }
    }

    /* renamed from: a */
    public static void m37678a(C19978k kVar, long j, boolean z) {
        String str;
        C89219l.m154719c(kVar, "");
        C19517i a = C19517i.m36463a().mo31179a("imsdk_network_request").mo31180a("imsdk_cmd", Integer.valueOf(kVar.mo31868k())).mo31180a("url_path", C19981n.m37715a(kVar.mo31868k())).mo31180a("imsdk_result", 1).mo31180a("seq_id", Long.valueOf(kVar.f47477a)).mo31180a("duration", Long.valueOf(j));
        if (z) {
            str = "ws";
        } else {
            str = "http";
        }
        C19517i a2 = a.mo31180a("net_type", str).mo31180a("retry_times", kVar.f47481e.retry_count);
        C89219l.m154709a((Object) a2, "");
        m37677a(a2, kVar);
        a2.mo31181b();
    }
}
