package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.CopyMethod */
public class CopyMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    protected WeakReference<Context> f182371a;

    static {
        Covode.recordClassIndex(94942);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public CopyMethod(C18288a aVar, WeakReference<Context> weakReference) {
        super(aVar);
        this.f182371a = weakReference;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        aVar.mo79885a(0, "clip board manager not supported");
    }
}
