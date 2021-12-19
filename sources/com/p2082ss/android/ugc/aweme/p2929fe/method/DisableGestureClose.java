package com.p2082ss.android.ugc.aweme.p2929fe.method;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.DisableGestureClose */
public final class DisableGestureClose extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47825a f110779a = new C47825a((byte) 0);

    static {
        Covode.recordClassIndex(56464);
    }

    private DisableGestureClose(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DisableGestureClose$a */
    public static final class C47825a {
        static {
            Covode.recordClassIndex(56465);
        }

        private C47825a() {
        }

        public /* synthetic */ C47825a(byte b) {
            this();
        }
    }

    private /* synthetic */ DisableGestureClose() {
        this((C18288a) null);
    }

    public DisableGestureClose(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("args")) != null) {
            optJSONObject.optInt("disable_gesture");
        }
    }
}
