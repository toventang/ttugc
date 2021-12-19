package com.p2082ss.android.ugc.aweme.web.jsbridge;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37609a;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AsyncGoodsEditInfoMethod */
public class AsyncGoodsEditInfoMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(94937);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        C39053a aVar2;
        String optString = jSONObject.optString("draftId");
        String optString2 = jSONObject.optString("title");
        HashMap hashMap = new HashMap();
        hashMap.put("shop_draft_id", optString);
        if (!optString.isEmpty()) {
            aVar2 = new C39053a(EnumC31359ab.SHOP.getTYPE(), new C27910f().mo46674b(hashMap), optString2, "", 1);
        } else {
            aVar2 = null;
        }
        AbstractC81915c.m141874a(new C37609a(aVar2));
    }
}
