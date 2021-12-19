package com.p2082ss.android.ugc.aweme.p2929fe.method;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.SetNativeItemMethod */
public class SetNativeItemMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(56576);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public SetNativeItemMethod() {
    }

    public SetNativeItemMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        try {
            if (C47809e.C47810a.f110762a.mo79874a(jSONObject.getString("key"), (Object) jSONObject.getString("value"))) {
                aVar.mo79886a((Object) null);
            } else {
                aVar.mo79885a(-1, "");
            }
        } catch (Exception e) {
            aVar.mo79885a(-1, "");
            e.printStackTrace();
        }
    }
}
