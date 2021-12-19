package com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.ugc.aweme.utils.C80517gw;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a */
public final class C81577a {

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a$a */
    public interface AbstractC81578a {
        static {
            Covode.recordClassIndex(94975);
        }

        /* renamed from: a */
        void mo61884a(JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a$c */
    public interface AbstractC81580c {
        static {
            Covode.recordClassIndex(94977);
        }

        /* renamed from: a */
        void mo61885a(C81579b bVar, C81581d dVar);
    }

    static {
        Covode.recordClassIndex(94974);
    }

    /* renamed from: a */
    public static String m141440a(C18297h hVar) {
        JSONObject jSONObject;
        boolean z;
        boolean z2;
        if (hVar != null) {
            jSONObject = hVar.f43671d;
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            String optString = hVar.f43671d.optString("url", "");
            boolean z3 = false;
            if (optString == null || optString.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String optString2 = hVar.f43671d.optString("method", "get");
                if (optString2 == null || optString2.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    Locale locale = Locale.getDefault();
                    C89219l.m154716b(locale, "");
                    Objects.requireNonNull(optString2, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase = optString2.toLowerCase(locale);
                    C89219l.m154716b(lowerCase, "");
                    if (TextUtils.equals(lowerCase, "get")) {
                        JSONObject optJSONObject = hVar.f43671d.optJSONObject("params");
                        try {
                            Uri parse = Uri.parse(optString);
                            C89219l.m154716b(parse, "");
                            Set<String> queryParameterNames = parse.getQueryParameterNames();
                            if (queryParameterNames == null || queryParameterNames.isEmpty()) {
                                z3 = true;
                            }
                            if (!z3) {
                                if (optJSONObject == null) {
                                    optJSONObject = new JSONObject();
                                }
                                for (String str : queryParameterNames) {
                                    if (str != null) {
                                        String queryParameter = parse.getQueryParameter(str);
                                        if (queryParameter != null) {
                                            C89219l.m154716b(queryParameter, "");
                                            optJSONObject.put(str, queryParameter);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (optJSONObject != null && optJSONObject.length() > 0) {
                            C80517gw.m139563a();
                            C80517gw.m139565a(optString, optJSONObject);
                        }
                    }
                }
            }
        }
        if (TextUtils.isEmpty(hVar.f43669b)) {
            return "v2";
        }
        try {
            return hVar.f43671d.getString("proto");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a$d */
    public static class C81581d {

        /* renamed from: a */
        public JSONObject f182425a;

        /* renamed from: b */
        public Exception f182426b;

        static {
            Covode.recordClassIndex(94978);
        }

        public C81581d(JSONObject jSONObject, Exception exc) {
            this.f182425a = jSONObject;
            this.f182426b = exc;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a$b */
    public static class C81579b {

        /* renamed from: a */
        public String f182422a;

        /* renamed from: b */
        public String f182423b;

        /* renamed from: c */
        public JSONObject f182424c;

        static {
            Covode.recordClassIndex(94976);
        }

        public C81579b(String str, String str2, JSONObject jSONObject) {
            this.f182422a = str;
            this.f182423b = str2;
            this.f182424c = jSONObject;
        }
    }

    /* renamed from: a */
    public static AbstractC81582b m141439a(C18297h hVar, JSONObject jSONObject, C18288a aVar, AbstractC81578a aVar2, AbstractC81580c cVar) {
        String a = m141440a(hVar);
        a.hashCode();
        if (!a.equals("v2")) {
            return new C81583c(hVar, jSONObject, aVar, aVar2, cVar);
        }
        return new C81589d(hVar, jSONObject, aVar, aVar2, cVar);
    }
}
