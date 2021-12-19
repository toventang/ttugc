package com.p2082ss.android.ugc.aweme.account.p2277p.p2278a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.C31975q;
import com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.p.a.e */
public final class C32922e implements AbstractC18293d {

    /* renamed from: a */
    public final C18288a f78333a;

    static {
        Covode.recordClassIndex(39710);
    }

    public C32922e(C18288a aVar) {
        C89219l.m154721d(aVar, "");
        this.f78333a = aVar;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        int i;
        String str;
        String str2;
        String str3;
        String secUid;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        if (hVar == null || (jSONObject2 = hVar.f43671d) == null) {
            i = 3;
        } else {
            i = jSONObject2.optInt("limit");
        }
        List<BaseLoginMethod> a = C31975q.m66343a(C36085cj.f85262b.mo57069e().allUidList());
        JSONArray jSONArray = new JSONArray();
        for (BaseLoginMethod baseLoginMethod : a) {
            JSONObject jSONObject4 = new JSONObject();
            CommonUserInfo commonUserInfo = baseLoginMethod.getCommonUserInfo();
            String str4 = "";
            if (commonUserInfo == null || (str2 = commonUserInfo.getAvatarUrl()) == null) {
                str2 = str4;
            }
            jSONObject4.put("avatar", str2);
            CommonUserInfo commonUserInfo2 = baseLoginMethod.getCommonUserInfo();
            if (commonUserInfo2 == null || (str3 = commonUserInfo2.getUserName()) == null) {
                str3 = str4;
            }
            jSONObject4.put("nickname", str3);
            CommonUserInfo commonUserInfo3 = baseLoginMethod.getCommonUserInfo();
            if (!(commonUserInfo3 == null || (secUid = commonUserInfo3.getSecUid()) == null)) {
                str4 = secUid;
            }
            jSONObject4.put("sec_uid", str4);
            jSONObject4.put("uid", baseLoginMethod.getUid());
            jSONArray.put(jSONObject4);
            if (jSONArray.length() >= i) {
                break;
            }
        }
        jSONObject3.put("data", jSONArray);
        C18288a aVar = this.f78333a;
        if (hVar != null) {
            str = hVar.f43669b;
        } else {
            str = null;
        }
        aVar.mo29249a(str, jSONObject3);
    }
}
