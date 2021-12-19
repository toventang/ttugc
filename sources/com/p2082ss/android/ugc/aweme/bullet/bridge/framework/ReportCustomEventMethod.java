package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.C16607an;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ReportCustomEventMethod */
public final class ReportCustomEventMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35084a f82785b = new C35084a((byte) 0);

    /* renamed from: c */
    private final String f82786c = "reportCustomEvent";

    static {
        Covode.recordClassIndex(42215);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ReportCustomEventMethod$a */
    public static final class C35084a {
        static {
            Covode.recordClassIndex(42216);
        }

        private C35084a() {
        }

        public /* synthetic */ C35084a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82786c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportCustomEventMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        String str;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        AbstractC16654o k = mo61870k();
        if (k != null) {
            String optString = jSONObject.optString("service");
            if (optString == null || optString.length() == 0) {
                str = "service empty";
            } else {
                String optString2 = jSONObject.optString("trigger");
                if (optString2 == null || optString2.length() == 0) {
                    str = "trigger empty";
                } else {
                    JSONObject optJSONObject = jSONObject.optJSONObject("category");
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    optJSONObject.put("trigger", optString2);
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("metrics");
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("extra");
                    C16607an anVar = new C16607an(optString, null, null, 254);
                    anVar.f39742g = optJSONObject;
                    anVar.f39743h = optJSONObject2;
                    anVar.f39746k = optJSONObject3;
                    k.mo26319a(anVar);
                    aVar.mo61873a(new JSONObject(), 1, "report success");
                    return;
                }
            }
        } else {
            str = "state invalid";
        }
        aVar.mo61871a(0, "report error, reason: ".concat(str));
    }
}
