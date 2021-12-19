package com.p2082ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p2335aq.p2337b.C33922a;
import com.p2082ss.android.ugc.aweme.p4243y.C81779c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitServiceSettingTask */
public final class InitServiceSettingTask extends BaseInitServiceSettingTask {
    static {
        Covode.recordClassIndex(68495);
    }

    @Override // com.p2082ss.android.ugc.aweme.legoImp.task.BaseInitServiceSettingTask, com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return "InitServiceSettingTask";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.legoImp.task.BaseInitServiceSettingTask
    /* renamed from: a */
    public final void mo95741a(JSONObject jSONObject) {
        super.mo95741a(jSONObject);
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("aweme_activity_setting");
            if (optJSONObject != null) {
                try {
                    C81779c cVar = (C81779c) new C27910f().mo46670a(optJSONObject.toString(), C81779c.class);
                    if (cVar != null) {
                        C33918a.f80230d = cVar;
                    }
                } catch (Exception unused) {
                }
                C33842s sVar = C33842s.C33843a.f80132a;
                C89219l.m154716b(sVar, "");
                sVar.mo60077u().mo59940b(optJSONObject.toString());
                AbstractC81915c.m141874a(new C33922a());
                return;
            }
            C33842s sVar2 = C33842s.C33843a.f80132a;
            C89219l.m154716b(sVar2, "");
            sVar2.mo60077u().mo59940b("");
        }
    }
}
