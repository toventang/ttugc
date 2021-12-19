package com.p2082ss.android.ugc.aweme.bridge;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bridge.OpenVideoDetailMethod */
public final class OpenVideoDetailMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    private final String f82388b = "openVideoDetail";

    static {
        Covode.recordClassIndex(41939);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82388b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenVideoDetailMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k
    /* renamed from: a */
    public final void mo25748a(JSONObject jSONObject, AbstractC16183k.AbstractC16185b bVar) {
        ArrayList arrayList;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(bVar, "");
        String optString = jSONObject.optString("question_id");
        String optString2 = jSONObject.optString("question_text");
        JSONArray optJSONArray = jSONObject.optJSONArray("aweme_id_list");
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(optJSONArray.optString(i));
            }
        } else {
            arrayList = null;
        }
        int optInt = jSONObject.optInt("index");
        jSONObject.optLong("offset");
        jSONObject.optInt("has_more");
        SmartRoute withParam = SmartRouter.buildRoute(mo26893e(), "aweme://aweme/detail/").withParam("id", arrayList != null ? (String) C89070n.m154561b((List) arrayList, optInt) : null).withParam("ids", arrayList != null ? C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62) : null);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        SmartRoute withParam2 = withParam.withParam("userid", g.getCurUserId());
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        SmartRoute withParam3 = withParam2.withParam("sec_userid", g2.getCurSecUserId()).withParam("enter_from", "eoy_hub").withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "question").withParam("video_from", "from_question").withParam("video_type", 28);
        if (!(optString2 == null || optString2.length() == 0)) {
            withParam3.withParam("question_content", optString2);
            withParam3.withParam("show_answer_question_button", 1);
        }
        withParam3.withParam("question_id", optString).open();
        C34927a.m71314a(bVar, (JSONObject) null);
    }
}
