package net.openid.appauth;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: net.openid.appauth.n */
public final class C90001n {
    static {
        Covode.recordClassIndex(106172);
    }

    /* renamed from: net.openid.appauth.n$d */
    static final class C90005d extends AbstractC90003b<String> {
        static {
            Covode.recordClassIndex(106176);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // net.openid.appauth.C90001n.AbstractC90003b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ String mo144669a(String str) {
            return str;
        }

        private C90005d(String str) {
            super(str, null);
        }

        C90005d(String str, byte b) {
            this(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.openid.appauth.n$e */
    public static final class C90006e extends AbstractC90004c<String> {
        static {
            Covode.recordClassIndex(106177);
        }

        C90006e(String str) {
            super(str, null);
        }

        C90006e(String str, List<String> list) {
            super(str, list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.openid.appauth.n$f */
    public static final class C90007f extends AbstractC90003b<Uri> {
        static {
            Covode.recordClassIndex(106178);
        }

        private C90007f(String str) {
            super(str, null);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // net.openid.appauth.C90001n.AbstractC90003b
        /* renamed from: a */
        public final /* synthetic */ Uri mo144669a(String str) {
            return Uri.parse(str);
        }

        C90007f(String str, byte b) {
            this(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.openid.appauth.n$a */
    public static final class C90002a extends AbstractC90003b<Boolean> {
        static {
            Covode.recordClassIndex(106173);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // net.openid.appauth.C90001n.AbstractC90003b
        /* renamed from: a */
        public final /* synthetic */ Boolean mo144669a(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }

        C90002a(String str, boolean z) {
            super(str, Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public static JSONObject m156182a(Map<String, String> map) {
        C90009p.m156197a(map);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C90009p.m156198a((Object) entry.getKey(), (Object) "map entries must not have null keys");
            C90009p.m156198a((Object) entry.getValue(), (Object) "map entries must not have null values");
            m156184a(jSONObject, entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.openid.appauth.n$b */
    public static abstract class AbstractC90003b<T> {

        /* renamed from: a */
        public final String f204022a;

        /* renamed from: b */
        public final T f204023b;

        static {
            Covode.recordClassIndex(106174);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo144669a(String str);

        AbstractC90003b(String str, T t) {
            this.f204022a = str;
            this.f204023b = t;
        }
    }

    /* renamed from: net.openid.appauth.n$c */
    static abstract class AbstractC90004c<T> {

        /* renamed from: a */
        public final String f204024a;

        /* renamed from: b */
        public final List<T> f204025b;

        static {
            Covode.recordClassIndex(106175);
        }

        AbstractC90004c(String str, List<T> list) {
            this.f204024a = str;
            this.f204025b = list;
        }
    }

    /* renamed from: a */
    public static <T> T m156180a(JSONObject jSONObject, AbstractC90003b<T> bVar) {
        try {
            if (!jSONObject.has(bVar.f204022a)) {
                return bVar.f204023b;
            }
            return bVar.mo144669a(jSONObject.getString(bVar.f204022a));
        } catch (JSONException e) {
            throw new IllegalStateException("unexpected JSONException", e);
        }
    }

    /* renamed from: b */
    public static String m156186b(JSONObject jSONObject, String str) {
        C90009p.m156198a(jSONObject, "json must not be null");
        C90009p.m156198a((Object) str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    /* renamed from: c */
    public static Uri m156188c(JSONObject jSONObject, String str) {
        C90009p.m156198a(jSONObject, "json must not be null");
        C90009p.m156198a((Object) str, (Object) "field must not be null");
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    /* renamed from: d */
    public static Uri m156189d(JSONObject jSONObject, String str) {
        C90009p.m156198a(jSONObject, "json must not be null");
        C90009p.m156198a((Object) str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    /* renamed from: e */
    public static Long m156190e(JSONObject jSONObject, String str) {
        C90009p.m156198a(jSONObject, "json must not be null");
        C90009p.m156198a((Object) str, (Object) "field must not be null");
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Map<String, String> m156191f(JSONObject jSONObject, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C90009p.m156198a(jSONObject, "json must not be null");
        C90009p.m156198a((Object) str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return linkedHashMap;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            linkedHashMap.put(next, C90009p.m156198a((Object) jSONObject2.getString(next), (Object) "additional parameter values must not be null"));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static String m156181a(JSONObject jSONObject, String str) {
        C90009p.m156198a(jSONObject, "json must not be null");
        C90009p.m156198a((Object) str, (Object) "field must not be null");
        if (jSONObject.has(str)) {
            String string = jSONObject.getString(str);
            if (string != null) {
                return string;
            }
            throw new JSONException("field \"" + str + "\" is mapped to a null value");
        }
        throw new JSONException("field \"" + str + "\" not found in json object");
    }

    /* renamed from: b */
    public static void m156187b(JSONObject jSONObject, String str, String str2) {
        C90009p.m156198a(jSONObject, "json must not be null");
        C90009p.m156198a((Object) str, (Object) "field must not be null");
        if (str2 != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
    }

    /* renamed from: a */
    public static void m156183a(JSONObject jSONObject, String str, int i) {
        C90009p.m156198a(jSONObject, "json must not be null");
        C90009p.m156198a((Object) str, (Object) "field must not be null");
        C90009p.m156198a(Integer.valueOf(i), "value must not be null");
        try {
            jSONObject.put(str, i);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    /* renamed from: a */
    public static void m156184a(JSONObject jSONObject, String str, String str2) {
        C90009p.m156198a(jSONObject, "json must not be null");
        C90009p.m156198a((Object) str, (Object) "field must not be null");
        C90009p.m156198a((Object) str2, (Object) "value must not be null");
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    /* renamed from: a */
    public static void m156185a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        C90009p.m156198a(jSONObject, "json must not be null");
        C90009p.m156198a((Object) str, (Object) "field must not be null");
        C90009p.m156198a(jSONObject2, "value must not be null");
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }
}
