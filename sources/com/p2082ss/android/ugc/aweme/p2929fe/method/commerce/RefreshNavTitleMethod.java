package com.p2082ss.android.ugc.aweme.p2929fe.method.commerce;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.web.AbstractC81544f;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.RefreshNavTitleMethod */
public final class RefreshNavTitleMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47930a f111008a = new C47930a((byte) 0);

    /* renamed from: b */
    private final AbstractC81544f f111009b;

    static {
        Covode.recordClassIndex(56633);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.RefreshNavTitleMethod$a */
    public static final class C47930a {
        static {
            Covode.recordClassIndex(56634);
        }

        private C47930a() {
        }

        public /* synthetic */ C47930a(byte b) {
            this();
        }
    }

    public RefreshNavTitleMethod(AbstractC81544f fVar) {
        C89219l.m154721d(fVar, "");
        this.f111009b = fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String optString;
        if (jSONObject != null && (optString = jSONObject.optString("title")) != null) {
            this.f111009b.mo125257c(optString);
        }
    }
}
