package com.bytedance.webx.p1750a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.C23612h;
import com.bytedance.webx.p1751b.p1752a.C23556a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.webx.a.a */
public final class C23549a {

    /* renamed from: a */
    Map<String, C23550a> f55783a = new HashMap();

    static {
        Covode.recordClassIndex(27647);
    }

    /* renamed from: com.bytedance.webx.a.a$b */
    public static class C23551b implements C23612h.C23613a.AbstractC23614a {

        /* renamed from: a */
        private C23612h.C23613a.AbstractC23614a f55786a;

        /* renamed from: b */
        private volatile List<C23552a> f55787b;

        static {
            Covode.recordClassIndex(27649);
        }

        @Override // com.bytedance.webx.C23612h.C23613a.AbstractC23614a
        /* renamed from: a */
        public final String mo38634a() {
            return this.f55786a.mo38634a();
        }

        /* renamed from: a */
        public final String mo38635a(Uri uri) {
            MethodCollector.m26663i(5014);
            if (this.f55787b == null) {
                synchronized (this) {
                    try {
                        if (this.f55787b == null) {
                            this.f55787b = new ArrayList();
                            String a = mo38634a();
                            if (a != null) {
                                try {
                                    JSONArray optJSONArray = new JSONObject(a).optJSONArray("bdwk_extension");
                                    for (int i = 0; i < optJSONArray.length(); i++) {
                                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                                        this.f55787b.add(new C23552a(optJSONObject.optString("pattern"), optJSONObject.optString("content")));
                                    }
                                } catch (Exception unused) {
                                    C23556a.m44304a("AddressParam");
                                }
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(5014);
                        throw th;
                    }
                }
            }
            Iterator<C23552a> it = this.f55787b.iterator();
            while (true) {
                try {
                    if (it.hasNext()) {
                        C23552a next = it.next();
                        if (next.f55790c == null) {
                            next.f55790c = Pattern.compile(next.f55788a);
                        }
                        Matcher matcher = next.f55790c.matcher(uri.toString());
                        while (matcher.find()) {
                            matcher.group();
                            matcher.start();
                            C23556a.m44304a("AddressParam");
                            if (matcher.start() == 0) {
                                String str = next.f55789b;
                                MethodCollector.m26664o(5014);
                                return str;
                            }
                        }
                        continue;
                    }
                } catch (Exception unused2) {
                    C23556a.m44304a("AddressParam");
                }
                if (!it.hasNext()) {
                    MethodCollector.m26664o(5014);
                    return null;
                }
            }
        }

        /* renamed from: com.bytedance.webx.a.a$b$a */
        public static class C23552a {

            /* renamed from: a */
            public String f55788a;

            /* renamed from: b */
            public String f55789b;

            /* renamed from: c */
            Pattern f55790c;

            static {
                Covode.recordClassIndex(27650);
            }

            public C23552a(String str, String str2) {
                this.f55788a = str;
                this.f55789b = str2;
            }
        }
    }

    /* renamed from: a */
    public final void mo38633a(C23550a aVar) {
        this.f55783a.put(aVar.f55784a, aVar);
    }

    /* renamed from: com.bytedance.webx.a.a$a */
    public static class C23550a {

        /* renamed from: a */
        public String f55784a;

        /* renamed from: b */
        public String f55785b;

        static {
            Covode.recordClassIndex(27648);
        }

        public C23550a(String str, String str2) {
            this.f55784a = str;
            this.f55785b = str2;
        }
    }

    /* renamed from: a */
    public static String m44295a(HashSet<C23551b> hashSet, Uri uri) {
        if (hashSet == null) {
            return null;
        }
        try {
            Iterator<C23551b> it = hashSet.iterator();
            while (it.hasNext()) {
                String a = it.next().mo38635a(uri);
                if (a != null) {
                    return a;
                }
            }
        } catch (Exception unused) {
            C23556a.m44304a("AddressParam");
        }
        return null;
    }

    /* renamed from: a */
    public static List<C23550a> m44296a(int i, String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (i == 0) {
                JSONObject optJSONObject = jSONObject.optJSONObject("bdwk_create");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        arrayList.add(new C23550a(next, optJSONObject.optString(next)));
                    }
                }
            } else if (i == 1) {
                Iterator<String> keys2 = jSONObject.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!next2.equals("bdwk_create")) {
                        arrayList.add(new C23550a(next2, jSONObject.optString(next2)));
                    }
                }
            }
        } catch (Exception unused) {
            C23556a.m44304a("AddressParam");
        }
        return arrayList;
    }
}
