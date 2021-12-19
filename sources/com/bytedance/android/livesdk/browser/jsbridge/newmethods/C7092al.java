package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.al */
public final class C7092al extends AbstractC18337f<JSONObject, JSONObject> {
    static {
        Covode.recordClassIndex(7838);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, C18338g gVar) {
        boolean z;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(gVar, "");
        JSONObject jSONObject2 = new JSONObject();
        AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
        boolean z2 = false;
        if (aVar != null) {
            z = aVar.isMicAudience();
        } else {
            z = false;
        }
        jSONObject2.put("isLiveHouseAudience", z);
        AbstractC4367a aVar2 = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
        if (aVar2 != null) {
            z2 = aVar2.isMicRoomForCurrentRoom();
        }
        jSONObject2.put("isInLiveHouseRoom", z2);
        return jSONObject2;
    }
}
