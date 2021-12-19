package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.shoutouts.C74381a;
import com.p2082ss.android.ugc.aweme.shoutouts.C74386b;
import com.p2082ss.android.ugc.aweme.shoutouts.C74426g;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.BroadcastMethod */
public final class BroadcastMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35004a f82579b = new C35004a((byte) 0);

    /* renamed from: c */
    private final String f82580c = "broadcast";

    static {
        Covode.recordClassIndex(42085);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.BroadcastMethod$a */
    public static final class C35004a {
        static {
            Covode.recordClassIndex(42086);
        }

        private C35004a() {
        }

        public /* synthetic */ C35004a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m71558a(JSONObject jSONObject) {
            C89219l.m154721d(jSONObject, "");
            try {
                if ("shoutouts_coins_setting".equals(jSONObject.optString("eventName"))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("buyer_payment");
                    C74426g gVar = (C74426g) new C27910f().mo46670a(jSONObject2.toString(), C74426g.class);
                    C74381a aVar = (C74381a) new C27910f().mo46670a(jSONObject3.toString(), C74381a.class);
                    C89219l.m154716b(gVar, "");
                    C89219l.m154716b(aVar, "");
                    AbstractC81915c.m141874a(new C74386b(gVar, aVar));
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82580c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            C89219l.m154721d(jSONObject, "");
            mo61865a("notification", jSONObject);
            com.p2082ss.android.ugc.aweme.p2929fe.method.BroadcastMethod.m90846a(mo26893e(), jSONObject, null, mo61867h());
            C35004a.m71558a(jSONObject);
            aVar.mo61872a("");
        } catch (JSONException e) {
            aVar.mo61871a(-1, "");
            e.printStackTrace();
        }
    }
}
