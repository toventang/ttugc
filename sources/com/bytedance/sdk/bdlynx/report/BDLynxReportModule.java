package com.bytedance.sdk.bdlynx.report;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14420a;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14421b;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14422c;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22591b;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22595c;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22599d;
import com.lynx.jsbridge.AbstractC28359d;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.ReadableMap;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

public final class BDLynxReportModule extends LynxModule {
    public static final C22663a Companion = new C22663a((byte) 0);
    private final Context context;

    static {
        Covode.recordClassIndex(26480);
    }

    /* renamed from: com.bytedance.sdk.bdlynx.report.BDLynxReportModule$a */
    public static final class C22663a {
        static {
            Covode.recordClassIndex(26481);
        }

        private C22663a() {
        }

        public /* synthetic */ C22663a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BDLynxReportModule(Context context2) {
        super(context2);
        C89219l.m154719c(context2, "");
        this.context = context2;
    }

    /* renamed from: com.bytedance.sdk.bdlynx.report.BDLynxReportModule$b */
    static final class C22664b extends AbstractC89220m implements AbstractC89172b<C14422c, C89391z> {

        /* renamed from: a */
        public static final C22664b f53532a = new C22664b();

        static {
            Covode.recordClassIndex(26482);
        }

        C22664b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14422c cVar) {
            boolean z;
            C14422c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            int i = cVar2.f34896a;
            if (200 <= i && 299 >= i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C22599d.m42633a("BDLynxReportModule", "errMsg:ok");
            } else {
                C22599d.m42633a("BDLynxReportModule", "errMsg:fail");
            }
            return C89391z.f203057a;
        }
    }

    @AbstractC28359d
    public final void systemLog(ReadableMap readableMap) {
        C89219l.m154719c(readableMap, "");
        String string = readableMap.getString("tag");
        ReadableMap map = readableMap.getMap("data");
        C89219l.m154709a((Object) string, "");
        C22591b bVar = new C22591b(string, (byte) 0);
        C89219l.m154709a((Object) map, "");
        C89219l.m154719c(map, "");
        C89219l.m154719c(map, "");
        bVar.mo36870a(new JSONObject(map.toHashMap())).mo36871a();
    }

    @AbstractC28359d
    public final void sentryReport(String str) {
        JSONObject jSONObject;
        Iterator<String> keys;
        C89219l.m154719c(str, "");
        JSONObject jSONObject2 = new JSONObject(str);
        String optString = jSONObject2.optString("url");
        String optString2 = jSONObject2.optString("method", C22595c.f53386a);
        C89219l.m154709a((Object) optString2, "");
        if (optString2.length() == 0) {
            optString2 = C22595c.f53387b;
        }
        String optString3 = jSONObject2.optString("data");
        JSONObject optJSONObject = jSONObject2.optJSONObject("header");
        jSONObject2.optString("responseType", "text");
        JSONArray optJSONArray = jSONObject2.optJSONArray("__nativeBuffers__");
        byte[] bArr = null;
        if (optJSONArray != null) {
            jSONObject = optJSONArray.optJSONObject(0);
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            String optString4 = jSONObject.optString("key");
            String optString5 = jSONObject.optString("base64");
            if (!TextUtils.isEmpty(optString4) && !TextUtils.isEmpty(optString5)) {
                C89219l.m154709a((Object) optString5, "");
                Charset charset = C89338d.f202990a;
                if (optString5 != null) {
                    byte[] bytes = optString5.getBytes(charset);
                    C89219l.m154709a((Object) bytes, "");
                    bArr = Base64.decode(bytes, 0);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(optJSONObject == null || (keys = optJSONObject.keys()) == null)) {
            while (keys.hasNext()) {
                String next = keys.next();
                C89219l.m154709a((Object) next, "");
                String optString6 = optJSONObject.optString(next);
                C89219l.m154709a((Object) optString6, "");
                linkedHashMap.put(next, optString6);
            }
        }
        C22664b bVar = C22664b.f53532a;
        if (C89219l.m154714a((Object) optString2, (Object) C22595c.f53386a)) {
            Context context2 = this.context;
            C89219l.m154709a((Object) optString, "");
            C89219l.m154719c(context2, "");
            C89219l.m154719c(optString, "");
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(context2, "");
            C89219l.m154719c(optString, "");
            C89219l.m154719c(bVar, "");
            C14421b bVar2 = new C14421b(C14420a.f34881a, optString);
            bVar2.f34888b.putAll(linkedHashMap);
            C22595c.m42631a().request(context2, bVar2.mo23239a(), new C22595c.C22596a(bVar));
        } else if (C89219l.m154714a((Object) optString2, (Object) C22595c.f53387b)) {
            if (bArr == null) {
                C89219l.m154709a((Object) optString3, "");
                Charset charset2 = C89338d.f202990a;
                if (optString3 != null) {
                    bArr = optString3.getBytes(charset2);
                    C89219l.m154709a((Object) bArr, "");
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            Context context3 = this.context;
            C89219l.m154709a((Object) optString, "");
            C89219l.m154719c(context3, "");
            C89219l.m154719c(optString, "");
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(context3, "");
            C89219l.m154719c(optString, "");
            C89219l.m154719c(bVar, "");
            C22595c.m42632a(context3, new C14421b(C14420a.f34882b, optString), linkedHashMap, bArr, bVar);
        }
    }
}
