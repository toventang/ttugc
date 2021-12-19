package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.SendEmailMethodCrossPlatform */
public final class SendEmailMethodCrossPlatform extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C56610a f129046a = new C56610a((byte) 0);

    static {
        Covode.recordClassIndex(66453);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.SendEmailMethodCrossPlatform$a */
    public static final class C56610a {
        static {
            Covode.recordClassIndex(66454);
        }

        private C56610a() {
        }

        public /* synthetic */ C56610a(byte b) {
            this();
        }
    }

    public SendEmailMethodCrossPlatform(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("email");
        String optString2 = jSONObject.optString("subject");
        String optString3 = jSONObject.optString("content");
        Context actContext = getActContext();
        if (actContext != null) {
            C89219l.m154716b(optString, "");
            C89219l.m154716b(optString2, "");
            C89219l.m154716b(optString3, "");
            C56613c.m102596a(actContext, new String[]{optString}, optString2, optString3);
            aVar.mo79886a((Object) null);
            return;
        }
        aVar.mo79885a(0, null);
    }
}
