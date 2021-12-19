package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37609a;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ChooseArticleInfoMethod */
public class ChooseArticleInfoMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(56452);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public ChooseArticleInfoMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (jSONObject == null) {
            aVar.mo79885a(0, "no params found");
            return;
        }
        String optString = jSONObject.optString("data");
        if (TextUtils.isEmpty(optString)) {
            aVar.mo79885a(0, "no data in params");
            return;
        }
        JSONObject jSONObject2 = new JSONObject(optString);
        String optString2 = jSONObject2.optString("article_title");
        if (TextUtils.isEmpty(optString2)) {
            aVar.mo79885a(0, "no article_title in data");
        } else if (TextUtils.isEmpty(jSONObject2.optString("micro_app_id"))) {
            aVar.mo79885a(0, "no micro_app_id in data");
        } else {
            if (this.mContextRef != null) {
                AbstractC81915c.m141874a(new C37609a(new C39053a(EnumC31359ab.ARTICLE.getTYPE(), optString, optString2, "", 1)));
            }
            aVar.mo79886a((Object) 1);
        }
    }
}
