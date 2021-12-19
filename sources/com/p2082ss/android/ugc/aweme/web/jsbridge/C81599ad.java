package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ad */
public final class C81599ad implements AbstractC18293d {

    /* renamed from: a */
    WeakReference<Context> f182481a;

    /* renamed from: b */
    C18288a f182482b;

    static {
        Covode.recordClassIndex(94996);
    }

    public C81599ad(WeakReference<Context> weakReference, C18288a aVar) {
        this.f182481a = weakReference;
        this.f182482b = aVar;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        int i;
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (C39223a.m79601o().mo68703a()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject2.put("isTeenagersModel", i);
            jSONObject2.put("language", C58071d.m104913g());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C18288a aVar = this.f182482b;
        if (aVar != null) {
            aVar.mo29249a(hVar.f43669b, jSONObject2);
        }
    }
}
