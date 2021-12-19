package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.CopyTextToPasteBoardMethod */
public final class CopyTextToPasteBoardMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C56602a f129033b = new C56602a((byte) 0);

    /* renamed from: c */
    private final String f129034c = "copyTextToPasteBoard";

    static {
        Covode.recordClassIndex(66437);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.CopyTextToPasteBoardMethod$a */
    public static final class C56602a {
        static {
            Covode.recordClassIndex(66438);
        }

        private C56602a() {
        }

        public /* synthetic */ C56602a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f129034c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CopyTextToPasteBoardMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("copied_text");
        Context e = mo26893e();
        if (e != null) {
            C89219l.m154716b(optString, "");
            C56611a.m102593a(e, optString, PrivacyCert.Builder.Companion.with("bpea-224").usage("On the product promotion page, ecommerce creators can copy the merchant’s contact information to the clipboard. ").tag("clipToCopyMerchantInformation").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
            aVar.mo61872a((Object) null);
            return;
        }
        aVar.mo61871a(0, null);
    }
}
