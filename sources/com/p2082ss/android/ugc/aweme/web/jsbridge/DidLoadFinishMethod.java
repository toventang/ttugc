package com.p2082ss.android.ugc.aweme.web.jsbridge;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod */
public final class DidLoadFinishMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C81559a f182372a = new C81559a((byte) 0);

    static {
        Covode.recordClassIndex(94943);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod$a */
    public static final class C81559a {
        static {
            Covode.recordClassIndex(94944);
        }

        private C81559a() {
        }

        public /* synthetic */ C81559a(byte b) {
            this();
        }
    }

    public DidLoadFinishMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (jSONObject != null) {
            jSONObject.optInt("status", 0);
            if (aVar != null) {
                aVar.mo79886a((Object) null);
            }
        }
    }
}
