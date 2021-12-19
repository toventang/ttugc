package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.C2959a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdkapi.model.C11835a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.common.util.C29844g;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aa */
final /* synthetic */ class C7073aa implements AbstractC88434g {

    /* renamed from: a */
    private final C7225z f17685a;

    /* renamed from: b */
    private final String f17686b;

    /* renamed from: c */
    private final JSONObject f17687c;

    /* renamed from: d */
    private final JSONObject f17688d;

    /* renamed from: e */
    private final JSONObject f17689e;

    static {
        Covode.recordClassIndex(7819);
    }

    C7073aa(C7225z zVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f17685a = zVar;
        this.f17686b = str;
        this.f17687c = jSONObject;
        this.f17688d = jSONObject2;
        this.f17689e = jSONObject3;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        C11835a a;
        C7225z zVar = this.f17685a;
        String str = this.f17686b;
        JSONObject jSONObject = this.f17687c;
        JSONObject jSONObject2 = this.f17688d;
        JSONObject jSONObject3 = this.f17689e;
        String str2 = (String) obj;
        C29844g gVar = new C29844g(str);
        for (C2959a aVar : C7225z.m15134a(jSONObject)) {
            gVar.mo52130a(aVar.getName(), aVar.getValue());
        }
        C3854a.m9453a(3, "FetchMethod", "build url is " + gVar.mo52126a());
        zVar.f17994c = gVar.mo52126a();
        if (TextUtils.equals(str2, UGCMonitor.TYPE_POST)) {
            a = C7225z.m15133a(zVar.f17994c, jSONObject2, jSONObject3);
        } else {
            a = C7225z.m15132a(zVar.f17994c, jSONObject2);
        }
        zVar.f17992a = a.f28193b;
        zVar.f17993b = a.f28197f;
        zVar.mo13404a(a);
        return new JSONObject(new String(a.f28196e));
    }
}
