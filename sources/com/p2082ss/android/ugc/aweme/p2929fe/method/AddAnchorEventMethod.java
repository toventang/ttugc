package com.p2082ss.android.ugc.aweme.p2929fe.method;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.AddAnchorEventMethod */
public final class AddAnchorEventMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47814a f110768a = new C47814a((byte) 0);

    static {
        Covode.recordClassIndex(56442);
    }

    private AddAnchorEventMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.AddAnchorEventMethod$a */
    public static final class C47814a {
        static {
            Covode.recordClassIndex(56443);
        }

        private C47814a() {
        }

        public /* synthetic */ C47814a(byte b) {
            this();
        }
    }

    private /* synthetic */ AddAnchorEventMethod() {
        this((C18288a) null);
    }

    public AddAnchorEventMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        if (aVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", -1);
            aVar.mo79888a(jSONObject2);
        }
    }
}
