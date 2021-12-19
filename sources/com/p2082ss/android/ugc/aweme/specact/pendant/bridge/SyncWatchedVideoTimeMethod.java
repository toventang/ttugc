package com.p2082ss.android.ugc.aweme.specact.pendant.bridge;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.specact.SpecActServiceImpl;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.bridge.SyncWatchedVideoTimeMethod */
public final class SyncWatchedVideoTimeMethod extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(87833);
    }

    private SyncWatchedVideoTimeMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private /* synthetic */ SyncWatchedVideoTimeMethod() {
        this((C18288a) null);
    }

    public SyncWatchedVideoTimeMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        Long l;
        Boolean bool;
        Boolean bool2 = null;
        if (jSONObject != null) {
            l = Long.valueOf(jSONObject.optLong("time"));
            bool = Boolean.valueOf(jSONObject.optBoolean("start"));
            bool2 = Boolean.valueOf(jSONObject.optBoolean("show_bubble"));
        } else {
            l = null;
            bool = null;
        }
        SpecActServiceImpl.m131497i().mo118024a(l, bool, bool2);
        if (aVar != null) {
            aVar.mo79887a("", 1, "");
        }
    }
}
