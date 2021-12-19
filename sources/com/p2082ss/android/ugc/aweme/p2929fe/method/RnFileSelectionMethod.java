package com.p2082ss.android.ugc.aweme.p2929fe.method;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.RnFileSelectionMethod */
public class RnFileSelectionMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    private AbstractC47909a f110903a;

    /* renamed from: b */
    private BaseCommonJavaMethod.AbstractC47813a f110904b;

    static {
        Covode.recordClassIndex(56560);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        this.f110904b = aVar;
        this.f110903a.mo79933a(jSONObject);
    }
}
