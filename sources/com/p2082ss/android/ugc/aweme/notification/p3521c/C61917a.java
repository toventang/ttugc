package com.p2082ss.android.ugc.aweme.notification.p3521c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18137d;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c;
import com.p2082ss.android.ugc.aweme.notification.view.template.C62339d;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.c.a */
public final class C61917a implements AbstractC62329c {
    static {
        Covode.recordClassIndex(72666);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c
    /* renamed from: a */
    public final void mo100001a(C62339d dVar) {
        String str;
        String optString;
        String str2;
        String str3;
        C89219l.m154721d(dVar, "");
        C61630e eVar = dVar.f141467a.templateNotice;
        if (eVar != null && (str = eVar.f139893i) != null && str.length() != 0 && (optString = new JSONObject(str).optString("ad_extra_data")) != null && optString.length() != 0) {
            JSONObject jSONObject = new JSONObject(optString);
            String optString2 = jSONObject.optString("creative_id");
            if (optString2 == null) {
                optString2 = "0";
            }
            int optInt = jSONObject.optInt("cost_type");
            if (optInt != 1 || !dVar.f141472f) {
                str2 = "othershow";
                if (optInt == 3) {
                    str2 = "ad_message_show";
                }
            } else {
                str2 = "show";
            }
            String optString3 = jSONObject.optString("log_extra");
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            C89219l.m154716b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                C89219l.m154716b(next, "");
                Object obj = jSONObject.get(next);
                C89219l.m154716b(obj, "");
                hashMap.put(next, obj);
            }
            hashMap.put("show_message_order", Integer.valueOf(dVar.f141468b));
            if (dVar.f141472f) {
                str3 = "secondpage_message";
            } else {
                str3 = "preview_message";
            }
            C18137d.m33763a("message_ad", str2, optString2, optString3, null).mo28910a("refer", str3).mo28911a(hashMap).mo28914b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        if (r12 == 3) goto L_0x00be;
     */
    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo100002a(com.p2082ss.android.ugc.aweme.notification.view.template.C62341f r17) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3521c.C61917a.mo100002a(com.ss.android.ugc.aweme.notification.view.template.f):boolean");
    }
}
