package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenWhatsAppChatMethod */
public final class OpenWhatsAppChatMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C56607a f129041b = new C56607a((byte) 0);

    /* renamed from: c */
    private final String f129042c = "routeToWhatsapp";

    static {
        Covode.recordClassIndex(66447);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenWhatsAppChatMethod$a */
    public static final class C56607a {
        static {
            Covode.recordClassIndex(66448);
        }

        private C56607a() {
        }

        public /* synthetic */ C56607a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f129042c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenWhatsAppChatMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("phone");
        String optString2 = jSONObject.optString("text");
        Context e = mo26893e();
        if (e != null) {
            C89219l.m154716b(optString, "");
            if (C56612b.m102594a(e, optString, optString2)) {
                aVar.mo61872a((Object) null);
            } else {
                aVar.mo61871a(0, null);
            }
        } else {
            aVar.mo61871a(0, null);
        }
    }
}
