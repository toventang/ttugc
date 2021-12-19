package com.p2082ss.android.sdk.webview.p2175a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.sdk.webview.AbstractC30268l;
import com.p2082ss.android.sdk.webview.C30245c;
import com.p2082ss.android.sdk.webview.C30275p;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.sdk.webview.a.f */
public final class C30240f extends AbstractC18337f<JSONObject, JSONObject> {

    /* renamed from: a */
    public static final C30241a f72155a = new C30241a((byte) 0);

    /* renamed from: b */
    private final C30275p f72156b;

    /* renamed from: c */
    private final C30245c f72157c;

    static {
        Covode.recordClassIndex(36751);
    }

    /* renamed from: com.ss.android.sdk.webview.a.f$a */
    public static final class C30241a {
        static {
            Covode.recordClassIndex(36752);
        }

        private C30241a() {
        }

        public /* synthetic */ C30241a(byte b) {
            this();
        }
    }

    public C30240f(C30275p pVar, C30245c cVar) {
        this.f72156b = pVar;
        this.f72157c = cVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, C18338g gVar) {
        C34337k kVar;
        C34337k kVar2;
        AbstractC34346s a;
        JSONObject jSONObject2 = jSONObject;
        C89219l.m154719c(jSONObject2, "");
        C89219l.m154719c(gVar, "");
        C30245c cVar = this.f72157c;
        if (!(cVar == null || (kVar2 = (C34337k) cVar.mo53698a(C34337k.class)) == null || (a = kVar2.mo60793a(AbstractC34340m.class)) == null)) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(StringSet.type, "jsb");
            jSONObject3.put("bridge_name", "openConfig");
            jSONObject3.put("bridge_access", "true");
            jSONObject3.put("stage", "open_jsb_auth");
            a.mo60779a("open_jsb_monitor", "open_jsb_invoke", jSONObject3, null, null);
        }
        C30275p pVar = this.f72156b;
        if (pVar != null) {
            String str = gVar.f43860b;
            C89219l.m154719c(jSONObject2, "");
            if (str != null) {
                Uri parse = Uri.parse(str);
                C30245c cVar2 = pVar.f72225c;
                if (cVar2 != null) {
                    kVar = (C34337k) cVar2.mo53698a(C34337k.class);
                } else {
                    kVar = null;
                }
                AbstractC30268l lVar = pVar.f72223a;
                if (lVar != null) {
                    lVar.mo53729a(jSONObject2, new C30275p.C30277b(pVar, kVar, parse));
                }
            }
        }
        return null;
    }
}
