package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.ugc.trill.p4375d.C85081a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.c */
public final class C81602c implements AbstractC18293d {
    static {
        Covode.recordClassIndex(94999);
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        C29803q.m60037b(hashMap, false);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!C13627m.m24498a(str) && !C13627m.m24498a(str2)) {
                try {
                    jSONObject.put(str, str2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            String b = C85081a.m146287b();
            if (!TextUtils.isEmpty(b)) {
                jSONObject.put("gaid", b);
            }
            jSONObject.put("code", 1);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
