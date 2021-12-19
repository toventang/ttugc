package com.p2082ss.android.ugc.aweme.bullet.bridge.commerce;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37609a;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.AsyncGoodsEditInfoMethod */
public final class AsyncGoodsEditInfoMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C34993a f82558b = new C34993a((byte) 0);

    /* renamed from: c */
    private final String f82559c = "asyncGoodsEditInfo";

    static {
        Covode.recordClassIndex(42064);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.AsyncGoodsEditInfoMethod$a */
    public static final class C34993a {
        static {
            Covode.recordClassIndex(42065);
        }

        private C34993a() {
        }

        public /* synthetic */ C34993a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82559c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncGoodsEditInfoMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C39053a aVar2;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("draftId");
        String optString2 = jSONObject.optString("title");
        HashMap hashMap = new HashMap();
        C89219l.m154716b(optString, "");
        hashMap.put("shop_draft_id", optString);
        if (optString.length() == 0) {
            aVar2 = null;
        } else {
            int type = EnumC31359ab.SHOP.getTYPE();
            String b = new C27910f().mo46674b(hashMap);
            C89219l.m154716b(b, "");
            aVar2 = new C39053a(type, b, optString2, "", 1, null, null, false, null, null, null, null, null, 8160, null);
        }
        AbstractC81915c.m141874a(new C37609a(aVar2));
    }
}
