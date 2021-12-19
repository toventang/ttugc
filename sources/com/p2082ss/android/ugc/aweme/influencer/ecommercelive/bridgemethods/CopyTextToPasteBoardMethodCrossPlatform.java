package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.CopyTextToPasteBoardMethodCrossPlatform */
public final class CopyTextToPasteBoardMethodCrossPlatform extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C56603a f129035a = new C56603a((byte) 0);

    static {
        Covode.recordClassIndex(66439);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.CopyTextToPasteBoardMethodCrossPlatform$a */
    public static final class C56603a {
        static {
            Covode.recordClassIndex(66440);
        }

        private C56603a() {
        }

        public /* synthetic */ C56603a(byte b) {
            this();
        }
    }

    public CopyTextToPasteBoardMethodCrossPlatform(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("copied_text");
        Context actContext = getActContext();
        if (actContext != null) {
            C89219l.m154716b(optString, "");
            C56611a.m102593a(actContext, optString, PrivacyCert.Builder.Companion.with("bpea-225").usage("On the product promotion page, ecommerce creators can copy the merchant’s contact information to the clipboard. ").tag("clipToCopyMerchantInformation").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
            aVar.mo79886a((Object) null);
            return;
        }
        aVar.mo79885a(0, null);
    }
}
