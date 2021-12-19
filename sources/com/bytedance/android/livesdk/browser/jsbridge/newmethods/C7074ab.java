package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.util.Base64;
import com.bytedance.android.live.base.model.C2959a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.livesdk.browser.jsbridge.p471b.C7042a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab */
public final class C7074ab extends AbstractC18334e<JSONObject, JSONObject> {

    /* renamed from: a */
    public AbstractC88412b f17690a;

    static {
        Covode.recordClassIndex(7820);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        AbstractC88412b bVar = this.f17690a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: a */
    static List<C2959a> m15034a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                arrayList.add(new C2959a(next, jSONObject.optString(next, "")));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static String m15032a(String str, JSONObject jSONObject) {
        C29844g gVar = new C29844g(str);
        for (C2959a aVar : m15034a(jSONObject)) {
            gVar.mo52130a(aVar.getName(), aVar.getValue());
        }
        C3854a.m9453a(3, "FetchPbMethod", "build url is " + gVar.mo52126a());
        return gVar.mo52126a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("url", "");
        AbstractC88403ab.m153602a(jSONObject2.optString("method", "get").toLowerCase()).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142925c(new C7076ac(optString, jSONObject2.optJSONObject("headers"), jSONObject2.optJSONObject("params"), jSONObject2.optJSONObject("data"))).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new AbstractC88406ae<String>() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7074ab.C70751 */

            static {
                Covode.recordClassIndex(7821);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
                C7074ab.this.finishWithFailure(th);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
                C7074ab.this.f17690a = bVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* synthetic */ void onSuccess(String str) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("raw", str);
                    C7074ab.this.finishWithResult(jSONObject);
                } catch (JSONException e) {
                    C7074ab.this.finishWithFailure(e);
                }
            }
        });
    }

    /* renamed from: a */
    static String m15033a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        MethodCollector.m26663i(6160);
        String a = m15032a(str, jSONObject2);
        ArrayList<C29934d> arrayList = new ArrayList();
        if (jSONObject3 != null) {
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                arrayList.add(new C29934d(next, jSONObject3.optString(next, "")));
            }
        }
        String a2 = C7042a.m15006a(a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (C29934d dVar : arrayList) {
            if (byteArrayOutputStream.size() > 0) {
                byteArrayOutputStream.write(38);
            }
            try {
                String encode = URLEncoder.encode(dVar.f71419a, "UTF-8");
                String encode2 = URLEncoder.encode(dVar.f71420b, "UTF-8");
                byteArrayOutputStream.write(encode.getBytes(Charset.forName("UTF-8")));
                byteArrayOutputStream.write(61);
                byteArrayOutputStream.write(encode2.getBytes(Charset.forName("UTF-8")));
            } catch (IOException e) {
                RuntimeException runtimeException = new RuntimeException(e);
                MethodCollector.m26664o(6160);
                throw runtimeException;
            }
        }
        String encodeToString = Base64.encodeToString(C5809h.m12739a().mo11585a(a2, m15034a(jSONObject), "application/x-www-form-urlencoded; charset=UTF-8", byteArrayOutputStream.toByteArray()).mo18908a().f28196e, 2);
        MethodCollector.m26664o(6160);
        return encodeToString;
    }
}
