package com.p2082ss.android.ugc.aweme.p2929fe.method;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.GetContainerIdMethod */
public final class GetContainerIdMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(56475);
    }

    private GetContainerIdMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private /* synthetic */ GetContainerIdMethod() {
        this((C18288a) null);
    }

    public GetContainerIdMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        if (aVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            C34337k b = mo79881b();
            if (b == null || (str = b.bF_()) == null) {
                str = "";
            }
            jSONObject2.put("container_id", str);
            aVar.mo79886a((Object) jSONObject2);
        }
    }
}
