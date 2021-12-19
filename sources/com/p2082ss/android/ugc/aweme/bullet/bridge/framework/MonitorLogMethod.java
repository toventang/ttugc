package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.MonitorLogMethod */
public final class MonitorLogMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35068a f82743b = new C35068a((byte) 0);

    /* renamed from: c */
    private final String f82744c = "monitorLog";

    static {
        Covode.recordClassIndex(42190);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.MonitorLogMethod$a */
    public static final class C35068a {
        static {
            Covode.recordClassIndex(42191);
        }

        private C35068a() {
        }

        public /* synthetic */ C35068a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82744c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonitorLogMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        if (jSONObject.length() == 0) {
            aVar.mo61871a(0, "params is empty");
            return;
        }
        String optString = jSONObject.optString("log_type");
        if (TextUtils.isEmpty(optString)) {
            aVar.mo61871a(0, "log_type is empty");
            return;
        }
        String optString2 = jSONObject.optString("service");
        if (!TextUtils.equals(optString, "service_monitor") || !TextUtils.isEmpty(optString2)) {
            JSONObject jSONObject2 = new JSONObject();
            m71686a(jSONObject, jSONObject2, "status");
            m71686a(jSONObject, jSONObject2, "value");
            C33830n.m69192a(optString, optString2, jSONObject2);
            aVar.mo61872a((Object) null);
            return;
        }
        aVar.mo61871a(0, "service is required while log_type=".concat(String.valueOf(optString)));
    }

    /* renamed from: a */
    private static void m71686a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        try {
            Object opt = jSONObject.opt(str);
            if (opt != null) {
                jSONObject2.put(str, opt);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
