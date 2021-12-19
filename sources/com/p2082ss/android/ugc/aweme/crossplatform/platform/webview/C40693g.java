package com.p2082ss.android.ugc.aweme.crossplatform.platform.webview;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.p2082ss.android.sdk.webview.AbstractC30268l;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.g */
public final class C40693g implements AbstractC30268l {

    /* renamed from: a */
    public static final C40694a f95288a = new C40694a((byte) 0);

    static {
        Covode.recordClassIndex(48539);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.g$a */
    public static final class C40694a {
        static {
            Covode.recordClassIndex(48540);
        }

        private C40694a() {
        }

        public /* synthetic */ C40694a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.g$b */
    static final class C40695b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ JSONObject f95289a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89187q f95290b;

        static {
            Covode.recordClassIndex(48541);
        }

        C40695b(JSONObject jSONObject, AbstractC89187q qVar) {
            this.f95289a = jSONObject;
            this.f95290b = qVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            JSONArray optJSONArray;
            try {
                HashMap hashMap = new HashMap();
                String optString = this.f95289a.optString("config_json");
                C89219l.m154716b(optString, "");
                hashMap.put("config_json", optString);
                String str = Api.f79771d;
                C89219l.m154716b(str, "");
                JSONObject jSONObject = new JSONObject((String) ((JsbNetworkApi) C18097a.m33696a().mo28816a(str).mo28858a(JsbNetworkApi.class)).doPost(-1, "/aweme/v1/open/jsb/list/", new LinkedHashMap(), hashMap, null, null, true).execute().f52262b);
                if (!Api.m68820a(jSONObject) || (optJSONArray = jSONObject.optJSONArray("jsb_list")) == null) {
                    this.f95290b.invoke(null, false, jSONObject);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj2 = optJSONArray.get(i);
                    if (obj2 != null) {
                        String str2 = (String) obj2;
                        hashMap2.put(str2, str2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                this.f95290b.invoke(hashMap2, true, null);
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
                this.f95290b.invoke(null, false, null);
            }
        }
    }

    @Override // com.p2082ss.android.sdk.webview.AbstractC30268l
    /* renamed from: a */
    public final void mo53729a(JSONObject jSONObject, AbstractC89187q<? super HashMap<String, String>, ? super Boolean, ? super JSONObject, C89391z> qVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(qVar, "");
        AbstractC88979t.m154310b("").mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C40695b(jSONObject, qVar));
    }
}
