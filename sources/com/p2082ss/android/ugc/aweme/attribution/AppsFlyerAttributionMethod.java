package com.p2082ss.android.ugc.aweme.attribution;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.attribution.AppsFlyerAttributionMethod */
public final class AppsFlyerAttributionMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C33969a f80344a = new C33969a((byte) 0);

    static {
        Covode.recordClassIndex(40895);
    }

    private AppsFlyerAttributionMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.attribution.AppsFlyerAttributionMethod$a */
    public static final class C33969a {
        static {
            Covode.recordClassIndex(40896);
        }

        private C33969a() {
        }

        public /* synthetic */ C33969a(byte b) {
            this();
        }
    }

    private /* synthetic */ AppsFlyerAttributionMethod() {
        this((C18288a) null);
    }

    public AppsFlyerAttributionMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        JSONObject optJSONObject;
        Iterator<String> keys;
        String str = null;
        if (jSONObject != null) {
            str = jSONObject.optString("event_name", "");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(jSONObject == null || !jSONObject.has("params") || (optJSONObject = jSONObject.optJSONObject("params")) == null || (keys = optJSONObject.keys()) == null)) {
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = optJSONObject.opt(next);
                C89219l.m154716b(next, "");
                C89219l.m154716b(opt, "");
                linkedHashMap.put(next, opt);
            }
        }
        UgCommonServiceImpl.m138290j().mo123092a().mo123115a(str, linkedHashMap);
        if (aVar != null) {
            aVar.mo79886a("");
        }
    }
}
