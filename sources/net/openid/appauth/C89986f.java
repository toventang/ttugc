package net.openid.appauth;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.openid.appauth.p4651c.C89980b;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.f */
public final class C89986f {

    /* renamed from: a */
    public static final Set<String> f203917a = Collections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "redirect_uri", "response_mode", "response_type", "scope", "state")));

    /* renamed from: b */
    public final C89993i f203918b;

    /* renamed from: c */
    public final String f203919c;

    /* renamed from: d */
    public final String f203920d;

    /* renamed from: e */
    public final String f203921e;

    /* renamed from: f */
    public final String f203922f;

    /* renamed from: g */
    public final String f203923g;

    /* renamed from: h */
    public final Uri f203924h;

    /* renamed from: i */
    public final String f203925i;

    /* renamed from: j */
    public final String f203926j;

    /* renamed from: k */
    public final String f203927k;

    /* renamed from: l */
    public final String f203928l;

    /* renamed from: m */
    public final String f203929m;

    /* renamed from: n */
    public final String f203930n;

    /* renamed from: o */
    public final Map<String, String> f203931o;

    /* renamed from: net.openid.appauth.f$a */
    public static final class C89987a {

        /* renamed from: a */
        String f203932a;

        /* renamed from: b */
        String f203933b;

        /* renamed from: c */
        String f203934c;

        /* renamed from: d */
        String f203935d;

        /* renamed from: e */
        String f203936e;

        /* renamed from: f */
        String f203937f;

        /* renamed from: g */
        String f203938g;

        /* renamed from: h */
        Map<String, String> f203939h = new HashMap();

        /* renamed from: i */
        private C89993i f203940i;

        /* renamed from: j */
        private String f203941j;

        /* renamed from: k */
        private String f203942k;

        /* renamed from: l */
        private Uri f203943l;

        /* renamed from: m */
        private String f203944m;

        /* renamed from: n */
        private String f203945n;

        static {
            Covode.recordClassIndex(106158);
        }

        /* renamed from: a */
        public final C89986f mo144646a() {
            return new C89986f(this.f203940i, this.f203941j, this.f203942k, this.f203943l, this.f203932a, this.f203933b, this.f203934c, this.f203944m, this.f203945n, this.f203935d, this.f203936e, this.f203937f, this.f203938g, Collections.unmodifiableMap(new HashMap(this.f203939h)), (byte) 0);
        }

        /* renamed from: a */
        public final C89987a mo144644a(Iterable<String> iterable) {
            this.f203944m = C89976c.m156115a(iterable);
            return this;
        }

        /* renamed from: a */
        public final C89987a mo144645a(String str) {
            this.f203945n = C90009p.m156201b(str, "state cannot be empty if defined");
            return this;
        }

        public C89987a(C89993i iVar, String str, String str2, Uri uri) {
            this.f203940i = (C89993i) C90009p.m156198a(iVar, "configuration cannot be null");
            this.f203941j = C90009p.m156199a(str, (Object) "client ID cannot be null or empty");
            this.f203942k = C90009p.m156199a(str2, (Object) "expected response type cannot be null or empty");
            this.f203943l = (Uri) C90009p.m156198a(uri, "redirect URI cannot be null or empty");
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            mo144645a(Base64.encodeToString(bArr, 11));
            SecureRandom secureRandom = new SecureRandom();
            C90009p.m156198a(secureRandom, "entropySource cannot be null");
            C90009p.m156200a(true, (Object) "entropyBytes is less than the minimum permitted");
            C90009p.m156200a(true, (Object) "entropyBytes is greater than the maximum permitted");
            byte[] bArr2 = new byte[64];
            secureRandom.nextBytes(bArr2);
            String encodeToString = Base64.encodeToString(bArr2, 11);
            if (encodeToString != null) {
                C90000m.m156178a(encodeToString);
                this.f203935d = encodeToString;
                this.f203936e = C90000m.m156179b(encodeToString);
                this.f203937f = C90000m.m156177a();
                return;
            }
            this.f203935d = null;
            this.f203936e = null;
            this.f203937f = null;
        }
    }

    static {
        Covode.recordClassIndex(106157);
    }

    /* renamed from: b */
    public final JSONObject mo144643b() {
        JSONObject jSONObject = new JSONObject();
        C89993i iVar = this.f203918b;
        JSONObject jSONObject2 = new JSONObject();
        C90001n.m156184a(jSONObject2, "authorizationEndpoint", iVar.f203975a.toString());
        C90001n.m156184a(jSONObject2, "tokenEndpoint", iVar.f203976b.toString());
        if (iVar.f203977c != null) {
            C90001n.m156184a(jSONObject2, "registrationEndpoint", iVar.f203977c.toString());
        }
        if (iVar.f203978d != null) {
            C90001n.m156185a(jSONObject2, "discoveryDoc", iVar.f203978d.f204019J);
        }
        C90001n.m156185a(jSONObject, "configuration", jSONObject2);
        C90001n.m156184a(jSONObject, "clientId", this.f203919c);
        C90001n.m156184a(jSONObject, "responseType", this.f203923g);
        C90001n.m156184a(jSONObject, "redirectUri", this.f203924h.toString());
        C90001n.m156187b(jSONObject, "display", this.f203920d);
        C90001n.m156187b(jSONObject, "login_hint", this.f203921e);
        C90001n.m156187b(jSONObject, "scope", this.f203925i);
        C90001n.m156187b(jSONObject, "prompt", this.f203922f);
        C90001n.m156187b(jSONObject, "state", this.f203926j);
        C90001n.m156187b(jSONObject, "codeVerifier", this.f203927k);
        C90001n.m156187b(jSONObject, "codeVerifierChallenge", this.f203928l);
        C90001n.m156187b(jSONObject, "codeVerifierChallengeMethod", this.f203929m);
        C90001n.m156187b(jSONObject, "responseMode", this.f203930n);
        C90001n.m156185a(jSONObject, "additionalParameters", C90001n.m156182a(this.f203931o));
        return jSONObject;
    }

    /* renamed from: a */
    public final Uri mo144642a() {
        Uri.Builder appendQueryParameter = this.f203918b.f203975a.buildUpon().appendQueryParameter("redirect_uri", this.f203924h.toString()).appendQueryParameter("client_id", this.f203919c).appendQueryParameter("response_type", this.f203923g);
        C89980b.m156131a(appendQueryParameter, "display", this.f203920d);
        C89980b.m156131a(appendQueryParameter, "login_hint", this.f203921e);
        C89980b.m156131a(appendQueryParameter, "prompt", this.f203922f);
        C89980b.m156131a(appendQueryParameter, "state", this.f203926j);
        C89980b.m156131a(appendQueryParameter, "scope", this.f203925i);
        C89980b.m156131a(appendQueryParameter, "response_mode", this.f203930n);
        if (this.f203927k != null) {
            appendQueryParameter.appendQueryParameter("code_challenge", this.f203928l).appendQueryParameter("code_challenge_method", this.f203929m);
        }
        for (Map.Entry<String, String> entry : this.f203931o.entrySet()) {
            appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return appendQueryParameter.build();
    }

    /* renamed from: a */
    public static C89986f m156134a(String str) {
        C90009p.m156198a((Object) str, (Object) "json string cannot be null");
        return m156135a(new JSONObject(str));
    }

    /* renamed from: a */
    public static C89986f m156135a(JSONObject jSONObject) {
        boolean z;
        LinkedHashSet linkedHashSet;
        C90009p.m156198a(jSONObject, "json cannot be null");
        C89987a aVar = new C89987a(C89993i.m156167a(jSONObject.getJSONObject("configuration")), C90001n.m156181a(jSONObject, "clientId"), C90001n.m156181a(jSONObject, "responseType"), C90001n.m156188c(jSONObject, "redirectUri"));
        aVar.f203932a = C90009p.m156201b(C90001n.m156186b(jSONObject, "display"), "display must be null or not empty");
        aVar.f203933b = C90009p.m156201b(C90001n.m156186b(jSONObject, "login_hint"), "login hint must be null or not empty");
        aVar.f203934c = C90009p.m156201b(C90001n.m156186b(jSONObject, "prompt"), "prompt must be null or non-empty");
        C89987a a = aVar.mo144645a(C90001n.m156186b(jSONObject, "state"));
        String b = C90001n.m156186b(jSONObject, "codeVerifier");
        String b2 = C90001n.m156186b(jSONObject, "codeVerifierChallenge");
        String b3 = C90001n.m156186b(jSONObject, "codeVerifierChallengeMethod");
        if (b != null) {
            C90000m.m156178a(b);
            C90009p.m156199a(b2, (Object) "code verifier challenge cannot be null or empty if verifier is set");
            C90009p.m156199a(b3, (Object) "code verifier challenge method cannot be null or empty if verifier is set");
        } else {
            boolean z2 = true;
            if (b2 == null) {
                z = true;
            } else {
                z = false;
            }
            C90009p.m156200a(z, "code verifier challenge must be null if verifier is null");
            if (b3 != null) {
                z2 = false;
            }
            C90009p.m156200a(z2, "code verifier challenge method must be null if verifier is null");
        }
        a.f203935d = b;
        a.f203936e = b2;
        a.f203937f = b3;
        String b4 = C90001n.m156186b(jSONObject, "responseMode");
        C90009p.m156201b(b4, "responseMode must not be empty");
        a.f203938g = b4;
        a.f203939h = C89965a.m156102a(C90001n.m156191f(jSONObject, "additionalParameters"), f203917a);
        if (jSONObject.has("scope")) {
            String a2 = C90001n.m156181a(jSONObject, "scope");
            if (a2 == null) {
                linkedHashSet = null;
            } else {
                List asList = Arrays.asList(TextUtils.split(a2, " "));
                linkedHashSet = new LinkedHashSet(asList.size());
                linkedHashSet.addAll(asList);
            }
            a.mo144644a(linkedHashSet);
        }
        return a.mo144646a();
    }

    private C89986f(C89993i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map<String, String> map) {
        this.f203918b = iVar;
        this.f203919c = str;
        this.f203923g = str2;
        this.f203924h = uri;
        this.f203931o = map;
        this.f203920d = str3;
        this.f203921e = str4;
        this.f203922f = str5;
        this.f203925i = str6;
        this.f203926j = str7;
        this.f203927k = str8;
        this.f203928l = str9;
        this.f203929m = str10;
        this.f203930n = str11;
    }

    /* synthetic */ C89986f(C89993i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map map, byte b) {
        this(iVar, str, str2, uri, str3, str4, str5, str6, str7, str8, str9, str10, str11, map);
    }
}
