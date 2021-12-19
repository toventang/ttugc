package com.p2082ss.android.ugc.aweme.web.jsbridge;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.utils.C80557hw;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.IsAppInstalledMethod */
public class IsAppInstalledMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(94949);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public IsAppInstalledMethod() {
    }

    public IsAppInstalledMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String string = jSONObject.getString("packageName");
        if (C80557hw.m139640a(C17867d.m33078a(), string)) {
            aVar.mo79886a((Object) new JSONObject());
        } else {
            aVar.mo79885a(-1, string);
        }
    }
}
