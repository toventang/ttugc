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

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenWhatsAppChatMethodCrossPlatform */
public final class OpenWhatsAppChatMethodCrossPlatform extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C56608a f129043a = new C56608a((byte) 0);

    static {
        Covode.recordClassIndex(66449);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenWhatsAppChatMethodCrossPlatform$a */
    public static final class C56608a {
        static {
            Covode.recordClassIndex(66450);
        }

        private C56608a() {
        }

        public /* synthetic */ C56608a(byte b) {
            this();
        }
    }

    public OpenWhatsAppChatMethodCrossPlatform(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("phone");
        String optString2 = jSONObject.optString("text");
        Context actContext = getActContext();
        if (actContext != null) {
            C89219l.m154716b(optString, "");
            if (C56612b.m102594a(actContext, optString, optString2)) {
                aVar.mo79886a((Object) null);
            } else {
                aVar.mo79885a(0, null);
            }
        } else {
            aVar.mo79885a(0, null);
        }
    }
}
