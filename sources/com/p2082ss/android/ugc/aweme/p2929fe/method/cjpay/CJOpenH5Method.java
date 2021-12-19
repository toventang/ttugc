package com.p2082ss.android.ugc.aweme.p2929fe.method.cjpay;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.cjpay.CJOpenH5Method */
public final class CJOpenH5Method extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C47925a f111002b = new C47925a((byte) 0);

    /* renamed from: a */
    public final C18288a f111003a;

    static {
        Covode.recordClassIndex(56623);
    }

    private CJOpenH5Method(byte b) {
        this();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.cjpay.CJOpenH5Method$a */
    public static final class C47925a {
        static {
            Covode.recordClassIndex(56624);
        }

        private C47925a() {
        }

        public /* synthetic */ C47925a(byte b) {
            this();
        }
    }

    private /* synthetic */ CJOpenH5Method() {
        this((C18288a) null);
    }

    public CJOpenH5Method(C18288a aVar) {
        super(aVar);
        this.f111003a = aVar;
    }
}
