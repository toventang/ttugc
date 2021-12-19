package com.p2082ss.android.ugc.aweme.p2929fe.method;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.feedback.reply.C50574d;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.HasFeedbackMethod */
public final class HasFeedbackMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47834a f110804a = new C47834a((byte) 0);

    static {
        Covode.recordClassIndex(56482);
    }

    private HasFeedbackMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.HasFeedbackMethod$a */
    public static final class C47834a {
        static {
            Covode.recordClassIndex(56483);
        }

        private C47834a() {
        }

        public /* synthetic */ C47834a(byte b) {
            this();
        }
    }

    private /* synthetic */ HasFeedbackMethod() {
        this((C18288a) null);
    }

    public HasFeedbackMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        Keva a = C50574d.m94806a();
        if (a != null) {
            a.storeBoolean("has", true);
        }
    }
}
