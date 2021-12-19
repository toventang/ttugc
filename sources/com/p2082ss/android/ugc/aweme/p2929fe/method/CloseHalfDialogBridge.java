package com.p2082ss.android.ugc.aweme.p2929fe.method;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.CloseHalfDialogBridge */
public final class CloseHalfDialogBridge extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(56453);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.CloseHalfDialogBridge$a */
    public static final class C47819a implements AbstractC81914b {

        /* renamed from: a */
        public JSONObject f110773a;

        static {
            Covode.recordClassIndex(56454);
        }

        C47819a(JSONObject jSONObject) {
            this.f110773a = jSONObject;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        AbstractC81915c.m141874a(new C47819a(jSONObject));
    }
}
