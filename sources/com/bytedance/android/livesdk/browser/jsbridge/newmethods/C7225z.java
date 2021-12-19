package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.live.base.model.C2959a;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.livesdk.browser.jsbridge.p471b.C7042a;
import com.bytedance.android.livesdkapi.model.C11835a;
import com.bytedance.android.monitor.lynx.C11969b;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11986c;
import com.bytedance.android.monitor.p706d.C11921d;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.lynx.tasm.LynxView;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.z */
public final class C7225z extends AbstractC18334e<JSONObject, JSONObject> {

    /* renamed from: a */
    int f17992a;

    /* renamed from: b */
    String f17993b;

    /* renamed from: c */
    String f17994c;

    /* renamed from: d */
    public String f17995d = "";

    /* renamed from: e */
    public AbstractC88412b f17996e;

    /* renamed from: f */
    private final int f17997f;

    static {
        Covode.recordClassIndex(7971);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        AbstractC88412b bVar = this.f17996e;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public C7225z(int i) {
        this.f17997f = i;
    }

    /* renamed from: a */
    static List<C2959a> m15134a(JSONObject jSONObject) {
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

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13404a(C11835a aVar) {
        List<C2959a> list = aVar.f28194c;
        if (!(list == null || list.isEmpty())) {
            for (int i = 0; i < list.size(); i++) {
                C2959a aVar2 = list.get(i);
                if (aVar2.getName().equals("x-tt-logid")) {
                    this.f17995d = aVar2.getValue();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    static C11835a m15132a(String str, JSONObject jSONObject) {
        return C5809h.m12739a().mo11584a(str, m15134a(jSONObject), null).mo18908a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, final C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("url", "");
        final String optString2 = jSONObject2.optString("method", "get");
        String lowerCase = optString2.toLowerCase(Locale.US);
        JSONObject optJSONObject = jSONObject2.optJSONObject("headers");
        AbstractC88403ab.m153602a(lowerCase).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142925c(new C7073aa(this, optString, jSONObject2.optJSONObject("params"), optJSONObject, jSONObject2.optJSONObject("data"))).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new AbstractC88406ae<JSONObject>() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7225z.C72261 */

            static {
                Covode.recordClassIndex(7972);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
                C7225z.this.f17996e = bVar;
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
                C7225z.this.finishWithFailure(th);
                C7225z.this.mo13403a(gVar.f43862d, optString2, th);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* synthetic */ void onSuccess(JSONObject jSONObject) {
                JSONObject jSONObject2 = jSONObject;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject2.put("_AME_Header_RequestID", C7225z.this.f17995d);
                    jSONObject3.put("raw", jSONObject2);
                    C7225z.this.finishWithResult(jSONObject3);
                } catch (JSONException e) {
                    C7225z.this.finishWithFailure(e);
                    C7225z.this.mo13403a(gVar.f43862d, optString2, e);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo13403a(View view, String str, Throwable th) {
        int i = this.f17997f;
        if (i == 0) {
            if (view instanceof WebView) {
                C11921d dVar = new C11921d();
                dVar.f28491a = str;
                dVar.f28492b = this.f17994c;
                dVar.f28494d = this.f17992a;
                dVar.f28495e = this.f17993b;
                dVar.f28497g = Log.getStackTraceString(th);
                C12044i.f28862a.mo19241a((WebView) view, dVar);
            }
        } else if (i == 1 && (view instanceof LynxView)) {
            C11986c cVar = new C11986c();
            cVar.f28701b = str;
            cVar.f28702c = this.f17994c;
            cVar.f28704e = this.f17992a;
            cVar.f28705f = this.f17993b;
            cVar.f28708i = Log.getStackTraceString(th);
            C11969b.f28620f.mo19180a((LynxView) view, cVar);
        }
    }

    /* renamed from: a */
    static C11835a m15133a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        MethodCollector.m26663i(7193);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str2 = "application/x-www-form-urlencoded; charset=UTF-8";
        if (jSONObject == null) {
            ArrayList<C29934d> arrayList = new ArrayList();
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(new C29934d(next, jSONObject2.optString(next, "")));
                }
            }
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
                    MethodCollector.m26664o(7193);
                    throw runtimeException;
                }
            }
        } else {
            String optString = jSONObject.optString("Content-Type");
            if (TextUtils.isEmpty(optString) || !optString.contains("json")) {
                ArrayList<C29934d> arrayList2 = new ArrayList();
                if (jSONObject2 != null) {
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        arrayList2.add(new C29934d(next2, jSONObject2.optString(next2, "")));
                    }
                }
                for (C29934d dVar2 : arrayList2) {
                    if (byteArrayOutputStream.size() > 0) {
                        byteArrayOutputStream.write(38);
                    }
                    try {
                        String encode3 = URLEncoder.encode(dVar2.f71419a, "UTF-8");
                        String encode4 = URLEncoder.encode(dVar2.f71420b, "UTF-8");
                        byteArrayOutputStream.write(encode3.getBytes(Charset.forName("UTF-8")));
                        byteArrayOutputStream.write(61);
                        byteArrayOutputStream.write(encode4.getBytes(Charset.forName("UTF-8")));
                    } catch (IOException e2) {
                        RuntimeException runtimeException2 = new RuntimeException(e2);
                        MethodCollector.m26664o(7193);
                        throw runtimeException2;
                    }
                }
            } else {
                byteArrayOutputStream.write(jSONObject2.toString().getBytes(Charset.forName("UTF-8")));
                str2 = "application/json; charset=UTF-8";
            }
        }
        C11835a a = C5809h.m12739a().mo11585a(C7042a.m15006a(str), m15134a(jSONObject), str2, byteArrayOutputStream.toByteArray()).mo18908a();
        MethodCollector.m26664o(7193);
        return a;
    }
}
