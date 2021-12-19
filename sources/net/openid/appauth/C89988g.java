package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.C90011r;
import net.openid.appauth.p4651c.C89980b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.g */
public final class C89988g {

    /* renamed from: a */
    public static final Set<String> f203946a = Collections.unmodifiableSet(new HashSet(Arrays.asList("token_type", "state", "code", "access_token", "expires_in", "id_token", "scope")));

    /* renamed from: b */
    public final C89986f f203947b;

    /* renamed from: c */
    public final String f203948c;

    /* renamed from: d */
    public final String f203949d;

    /* renamed from: e */
    public final String f203950e;

    /* renamed from: f */
    public final String f203951f;

    /* renamed from: g */
    public final Long f203952g;

    /* renamed from: h */
    public final String f203953h;

    /* renamed from: i */
    public final String f203954i;

    /* renamed from: j */
    public final Map<String, String> f203955j;

    /* renamed from: a */
    public final Intent mo144647a() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationResponse", m156143b().toString());
        return intent;
    }

    static {
        Covode.recordClassIndex(106159);
    }

    /* renamed from: b */
    private JSONObject m156143b() {
        JSONObject jSONObject = new JSONObject();
        C90001n.m156185a(jSONObject, "request", this.f203947b.mo144643b());
        C90001n.m156187b(jSONObject, "state", this.f203948c);
        C90001n.m156187b(jSONObject, "token_type", this.f203949d);
        C90001n.m156187b(jSONObject, "code", this.f203950e);
        C90001n.m156187b(jSONObject, "access_token", this.f203951f);
        Long l = this.f203952g;
        C90009p.m156198a(jSONObject, "json must not be null");
        C90009p.m156198a((Object) "expires_at", (Object) "field must not be null");
        if (l != null) {
            try {
                jSONObject.put("expires_at", l);
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
        C90001n.m156187b(jSONObject, "id_token", this.f203953h);
        C90001n.m156187b(jSONObject, "scope", this.f203954i);
        C90001n.m156185a(jSONObject, "additional_parameters", C90001n.m156182a(this.f203955j));
        return jSONObject;
    }

    /* renamed from: net.openid.appauth.g$a */
    public static final class C89989a {

        /* renamed from: a */
        Long f203956a;

        /* renamed from: b */
        private C89986f f203957b;

        /* renamed from: c */
        private String f203958c;

        /* renamed from: d */
        private String f203959d;

        /* renamed from: e */
        private String f203960e;

        /* renamed from: f */
        private String f203961f;

        /* renamed from: g */
        private String f203962g;

        /* renamed from: h */
        private String f203963h;

        /* renamed from: i */
        private Map<String, String> f203964i = new LinkedHashMap();

        static {
            Covode.recordClassIndex(106160);
        }

        /* renamed from: a */
        public final C89988g mo144652a() {
            return new C89988g(this.f203957b, this.f203958c, this.f203959d, this.f203960e, this.f203961f, this.f203956a, this.f203962g, this.f203963h, Collections.unmodifiableMap(this.f203964i), (byte) 0);
        }

        /* renamed from: a */
        private C89989a m156147a(Iterable<String> iterable) {
            this.f203963h = C89976c.m156115a(iterable);
            return this;
        }

        /* renamed from: b */
        public final C89989a mo144653b(String str) {
            C90009p.m156201b(str, "tokenType must not be empty");
            this.f203959d = str;
            return this;
        }

        /* renamed from: c */
        public final C89989a mo144654c(String str) {
            C90009p.m156201b(str, "authorizationCode must not be empty");
            this.f203960e = str;
            return this;
        }

        /* renamed from: d */
        public final C89989a mo144655d(String str) {
            C90009p.m156201b(str, "accessToken must not be empty");
            this.f203961f = str;
            return this;
        }

        /* renamed from: e */
        public final C89989a mo144656e(String str) {
            C90009p.m156201b(str, "idToken cannot be empty");
            this.f203962g = str;
            return this;
        }

        /* renamed from: a */
        private C89989a m156149a(String... strArr) {
            if (strArr == null) {
                this.f203963h = null;
            } else {
                m156147a(Arrays.asList(strArr));
            }
            return this;
        }

        public C89989a(C89986f fVar) {
            this.f203957b = (C89986f) C90009p.m156198a(fVar, "authorization request cannot be null");
        }

        /* renamed from: f */
        public final C89989a mo144657f(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f203963h = null;
            } else {
                m156149a(str.split(" +"));
            }
            return this;
        }

        /* renamed from: a */
        public final C89989a mo144649a(Uri uri) {
            return m156146a(uri, C90010q.f204027a);
        }

        /* renamed from: a */
        public final C89989a mo144650a(String str) {
            C90009p.m156201b(str, "state must not be empty");
            this.f203958c = str;
            return this;
        }

        /* renamed from: a */
        public final C89989a mo144651a(Map<String, String> map) {
            this.f203964i = C89965a.m156102a(map, C89988g.f203946a);
            return this;
        }

        /* renamed from: a */
        private C89989a m156148a(Long l, AbstractC89999l lVar) {
            if (l == null) {
                this.f203956a = null;
            } else {
                this.f203956a = Long.valueOf(lVar.mo144668a() + TimeUnit.SECONDS.toMillis(l.longValue()));
            }
            return this;
        }

        /* renamed from: a */
        private C89989a m156146a(Uri uri, AbstractC89999l lVar) {
            mo144650a(uri.getQueryParameter("state"));
            mo144653b(uri.getQueryParameter("token_type"));
            mo144654c(uri.getQueryParameter("code"));
            mo144655d(uri.getQueryParameter("access_token"));
            m156148a(C89980b.m156128a(uri, "expires_in"), lVar);
            mo144656e(uri.getQueryParameter("id_token"));
            mo144657f(uri.getQueryParameter("scope"));
            mo144651a(C89965a.m156101a(uri, C89988g.f203946a));
            return this;
        }
    }

    /* renamed from: a */
    public final C90011r mo144648a(Map<String, String> map) {
        C90009p.m156198a(map, "additionalExchangeParameters cannot be null");
        if (this.f203950e != null) {
            return new C90011r.C90012a(this.f203947b.f203918b, this.f203947b.f203919c).mo144671a("authorization_code").mo144670a(this.f203947b.f203924h).mo144677e(this.f203947b.f203927k).mo144675c(this.f203950e).mo144672a(map).mo144673a();
        }
        throw new IllegalStateException("authorizationCode not available for exchange request");
    }

    /* renamed from: a */
    public static C89988g m156142a(Intent intent) {
        C90009p.m156198a(intent, "dataIntent must not be null");
        if (!intent.hasExtra("net.openid.appauth.AuthorizationResponse")) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(m156141a(intent, "net.openid.appauth.AuthorizationResponse"));
            if (jSONObject.has("request")) {
                C89989a a = new C89989a(C89986f.m156135a(jSONObject.getJSONObject("request"))).mo144653b(C90001n.m156186b(jSONObject, "token_type")).mo144655d(C90001n.m156186b(jSONObject, "access_token")).mo144654c(C90001n.m156186b(jSONObject, "code")).mo144656e(C90001n.m156186b(jSONObject, "id_token")).mo144657f(C90001n.m156186b(jSONObject, "scope")).mo144650a(C90001n.m156186b(jSONObject, "state"));
                a.f203956a = C90001n.m156190e(jSONObject, "expires_at");
                return a.mo144651a(C90001n.m156191f(jSONObject, "additional_parameters")).mo144652a();
            }
            throw new IllegalArgumentException("authorization request not provided and not found in JSON");
        } catch (JSONException e) {
            throw new IllegalArgumentException("Intent contains malformed auth response", e);
        }
    }

    /* renamed from: a */
    private static String m156141a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private C89988g(C89986f fVar, String str, String str2, String str3, String str4, Long l, String str5, String str6, Map<String, String> map) {
        this.f203947b = fVar;
        this.f203948c = str;
        this.f203949d = str2;
        this.f203950e = str3;
        this.f203951f = str4;
        this.f203952g = l;
        this.f203953h = str5;
        this.f203954i = str6;
        this.f203955j = map;
    }

    /* synthetic */ C89988g(C89986f fVar, String str, String str2, String str3, String str4, Long l, String str5, String str6, Map map, byte b) {
        this(fVar, str, str2, str3, str4, l, str5, str6, map);
    }
}
