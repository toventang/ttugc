package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogV3Method */
public final class SendLogV3Method extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35089a f82800b = new C35089a((byte) 0);

    /* renamed from: c */
    private final String f82801c = "sendLogV3";

    static {
        Covode.recordClassIndex(42224);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogV3Method$a */
    public static final class C35089a {
        static {
            Covode.recordClassIndex(42225);
        }

        private C35089a() {
        }

        public /* synthetic */ C35089a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82801c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendLogV3Method(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        if (jSONObject == null) {
            aVar.mo61871a(0, "");
            return;
        }
        String optString = jSONObject.optString("eventName");
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        if (TextUtils.isEmpty(optString) || optJSONObject == null) {
            aVar.mo61871a(0, "");
            return;
        }
        Iterator<String> keys = optJSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString2 = optJSONObject.optString(next);
            keys.remove();
            C89219l.m154716b(next, "");
            C89219l.m154716b(optString2, "");
            hashMap.put(next, optString2);
        }
        C39161q.m79451a(optString, hashMap);
        aVar.mo61872a(new C28022o());
    }
}
