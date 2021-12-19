package com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37838g;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.MessageTipMethod */
public final class MessageTipMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C34986a f82535b = new C34986a((byte) 0);

    /* renamed from: c */
    private final String f82536c = "messageTip";

    static {
        Covode.recordClassIndex(42044);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.MessageTipMethod$a */
    public static final class C34986a {
        static {
            Covode.recordClassIndex(42045);
        }

        private C34986a() {
        }

        public /* synthetic */ C34986a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82536c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageTipMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("func");
        if (jSONObject.has("msg")) {
            new C79459a(mo26893e()).mo123052a(jSONObject.getString("msg")).mo123053a();
            if (aVar != null) {
                aVar.mo61872a((Object) null);
            }
        } else if (aVar != null) {
            aVar.mo61871a(-1, "empty msg");
        }
        C89219l.m154716b(optString, "");
        AbstractC81915c.m141874a(new C37838g(optString, jSONObject));
    }
}
