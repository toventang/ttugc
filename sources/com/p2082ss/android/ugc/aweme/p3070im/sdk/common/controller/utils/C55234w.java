package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.w */
public final class C55234w {

    /* renamed from: a */
    public static final C55234w f126322a = new C55234w();

    private C55234w() {
    }

    static {
        Covode.recordClassIndex(64981);
    }

    /* renamed from: a */
    public static void m101006a(JSONObject jSONObject, C19538ai aiVar, BaseContent baseContent) {
        String str;
        String str2;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aiVar, "");
        boolean z = false;
        try {
            if (aiVar.getLocalExt() != null && aiVar.getLocalExt().containsKey("key_resend")) {
                z = true;
            }
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            jSONObject.put("is_resend", str);
            if (!C55231t.m100995a(aiVar, baseContent).equals("ttFarm")) {
                jSONObject.put("enter_from", C55059b.m100686a("enter_from", C55059b.m100686a("enter_from", aiVar.getLocalExt().get("enter_from"))));
            }
            jSONObject.put("enter_method", C55059b.m100686a("enter_method", C55059b.m100686a("enter_method", aiVar.getLocalExt().get("enter_from"))));
            IMUser b = C55085g.m100757b(String.valueOf(AbstractC17427b.C17428a.m32311c(aiVar.getConversationId())), C55080c.m100730a(aiVar.getConversationId()));
            if (b == null || b.getFriendRecType() != 1) {
                str2 = "";
            } else {
                str2 = "share_link_match";
            }
            jSONObject.put("rec_reason", str2);
        } catch (JSONException e) {
            C51423a.m95788a("", e);
        }
    }
}
