package com.p2082ss.android.ugc.aweme.app.p2328f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.app.f.d */
public final class C33744d {

    /* renamed from: b */
    public static boolean f79942b;

    /* renamed from: a */
    public Map<String, String> f79943a = new HashMap();

    static {
        Covode.recordClassIndex(40639);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.f.d$a */
    public interface AbstractC33745a {

        /* renamed from: a */
        public static final AbstractC33745a f79944a = new AbstractC33745a() {
            /* class com.p2082ss.android.ugc.aweme.app.p2328f.C33744d.AbstractC33745a.C337461 */

            static {
                Covode.recordClassIndex(40641);
            }

            @Override // com.p2082ss.android.ugc.aweme.app.p2328f.C33744d.AbstractC33745a
            /* renamed from: a */
            public final String mo59987a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final AbstractC33745a f79945b = new AbstractC33745a() {
            /* class com.p2082ss.android.ugc.aweme.app.p2328f.C33744d.AbstractC33745a.C337472 */

            static {
                Covode.recordClassIndex(40642);
            }

            @Override // com.p2082ss.android.ugc.aweme.app.p2328f.C33744d.AbstractC33745a
            /* renamed from: a */
            public final String mo59987a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo59987a(String str);

        static {
            Covode.recordClassIndex(40640);
        }
    }

    /* renamed from: a */
    public final C33744d mo59985a(HashMap<? extends String, ? extends String> hashMap) {
        if (hashMap != null) {
            this.f79943a.putAll(hashMap);
        }
        return this;
    }

    /* renamed from: a */
    public final C33744d mo59986a(Map<? extends String, ? extends String> map) {
        if (map != null) {
            this.f79943a.putAll(map);
        }
        return this;
    }

    /* renamed from: a */
    public final C33744d mo59983a(String str, String str2) {
        return mo59984a(str, str2, AbstractC33745a.f79944a);
    }

    /* renamed from: a */
    public final C33744d mo59980a(String str, int i) {
        return mo59984a(str, String.valueOf(i), AbstractC33745a.f79944a);
    }

    /* renamed from: a */
    public final C33744d mo59979a(String str, float f) {
        if (f79942b) {
            return mo59984a(str, String.valueOf(f), AbstractC33745a.f79944a);
        }
        return mo59982a(str, Float.valueOf(f));
    }

    /* renamed from: a */
    public final C33744d mo59981a(String str, long j) {
        return mo59984a(str, String.valueOf(j), AbstractC33745a.f79944a);
    }

    /* renamed from: a */
    public final C33744d mo59982a(String str, Object obj) {
        if (obj != null) {
            mo59983a(str, new C27910f().mo46674b(obj));
        }
        return this;
    }

    /* renamed from: a */
    public final C33744d mo59978a(Aweme aweme, String str, String str2) {
        for (Map.Entry<String, String> entry : C80632w.m139800a(aweme, str, str2).entrySet()) {
            mo59983a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    /* renamed from: a */
    public final C33744d mo59984a(String str, String str2, AbstractC33745a aVar) {
        this.f79943a.put(str, aVar.mo59987a(str2));
        return this;
    }
}
