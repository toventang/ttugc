package com.p2082ss.android.ugc.aweme.story.p4047g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46113u;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.g.a */
public final class C77261a {
    static {
        Covode.recordClassIndex(90278);
    }

    /* renamed from: a */
    public static final CreateAnchorInfo m135058a(C39053a aVar) {
        C46113u uVar;
        String str = "";
        C89219l.m154721d(aVar, str);
        try {
            uVar = (C46113u) C63244g.m114602a().mo73261G().mo46670a(aVar.getAnchorContent(), C46113u.class);
        } catch (Exception unused) {
            uVar = new C46113u(str, str);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("add_from", 1);
            String jSONObject2 = jSONObject.toString();
            C89219l.m154716b(jSONObject2, str);
            str = jSONObject2;
        } catch (Exception e) {
            C84911q.m145924a(e);
        }
        return new CreateAnchorInfo(aVar.getBusinessType(), uVar.f107371a, "", uVar.f107372b, str, "https://p16.tiktokcdn.com/obj/tiktok-obj/wiki_anchor_new.png", null, null, null, null, null, null, 4032, null);
    }
}
