package net.openid.appauth;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: net.openid.appauth.r */
public final class C90011r {

    /* renamed from: a */
    public static final Set<String> f204028a = Collections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code", "code_verifier", "grant_type", "redirect_uri", "refresh_token", "scope")));

    /* renamed from: b */
    public final C89993i f204029b;

    /* renamed from: c */
    public final String f204030c;

    /* renamed from: d */
    public final String f204031d;

    /* renamed from: e */
    public final Uri f204032e;

    /* renamed from: f */
    public final String f204033f;

    /* renamed from: g */
    public final String f204034g;

    /* renamed from: h */
    public final String f204035h;

    /* renamed from: i */
    public final String f204036i;

    /* renamed from: j */
    public final Map<String, String> f204037j;

    /* renamed from: net.openid.appauth.r$a */
    public static final class C90012a {

        /* renamed from: a */
        private C89993i f204038a;

        /* renamed from: b */
        private String f204039b;

        /* renamed from: c */
        private String f204040c;

        /* renamed from: d */
        private Uri f204041d;

        /* renamed from: e */
        private String f204042e;

        /* renamed from: f */
        private String f204043f;

        /* renamed from: g */
        private String f204044g;

        /* renamed from: h */
        private String f204045h;

        /* renamed from: i */
        private Map<String, String> f204046i = new LinkedHashMap();

        static {
            Covode.recordClassIndex(106183);
        }

        /* renamed from: b */
        private String m156206b() {
            String str = this.f204040c;
            if (str != null) {
                return str;
            }
            if (this.f204043f != null) {
                return "authorization_code";
            }
            if (this.f204044g != null) {
                return "refresh_token";
            }
            throw new IllegalStateException("grant type not specified and cannot be inferred");
        }

        /* renamed from: a */
        public final C90011r mo144673a() {
            String b = m156206b();
            if ("authorization_code".equals(b)) {
                C90009p.m156198a((Object) this.f204043f, (Object) "authorization code must be specified for grant_type = authorization_code");
            }
            if ("refresh_token".equals(b)) {
                C90009p.m156198a((Object) this.f204044g, (Object) "refresh token must be specified for grant_type = refresh_token");
            }
            if (!b.equals("authorization_code") || this.f204041d != null) {
                return new C90011r(this.f204038a, this.f204039b, b, this.f204041d, this.f204042e, this.f204043f, this.f204044g, this.f204045h, Collections.unmodifiableMap(this.f204046i), (byte) 0);
            }
            throw new IllegalStateException("no redirect URI specified on token request for code exchange");
        }

        /* renamed from: a */
        private C90012a m156204a(Iterable<String> iterable) {
            this.f204042e = C89976c.m156115a(iterable);
            return this;
        }

        /* renamed from: c */
        public final C90012a mo144675c(String str) {
            C90009p.m156201b(str, "authorization code must not be empty");
            this.f204043f = str;
            return this;
        }

        /* renamed from: e */
        public final C90012a mo144677e(String str) {
            if (str != null) {
                C90000m.m156178a(str);
            }
            this.f204045h = str;
            return this;
        }

        /* renamed from: a */
        private C90012a m156205a(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            m156204a(Arrays.asList(strArr));
            return this;
        }

        /* renamed from: d */
        public final C90012a mo144676d(String str) {
            if (str != null) {
                C90009p.m156199a(str, (Object) "refresh token cannot be empty if defined");
            }
            this.f204044g = str;
            return this;
        }

        /* renamed from: a */
        public final C90012a mo144670a(Uri uri) {
            if (uri != null) {
                C90009p.m156198a((Object) uri.getScheme(), (Object) "redirectUri must have a scheme");
            }
            this.f204041d = uri;
            return this;
        }

        /* renamed from: a */
        public final C90012a mo144671a(String str) {
            this.f204040c = C90009p.m156199a(str, (Object) "grantType cannot be null or empty");
            return this;
        }

        /* renamed from: b */
        public final C90012a mo144674b(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f204042e = null;
            } else {
                m156205a(str.split(" +"));
            }
            return this;
        }

        /* renamed from: a */
        public final C90012a mo144672a(Map<String, String> map) {
            this.f204046i = C89965a.m156102a(map, C90011r.f204028a);
            return this;
        }

        public C90012a(C89993i iVar, String str) {
            this.f204038a = (C89993i) C90009p.m156197a(iVar);
            this.f204039b = C90009p.m156199a(str, (Object) "clientId cannot be null or empty");
        }
    }

    static {
        Covode.recordClassIndex(106182);
    }

    /* renamed from: a */
    static void m156203a(Map<String, String> map, String str, Object obj) {
        if (obj != null) {
            map.put(str, obj.toString());
        }
    }

    private C90011r(C89993i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.f204029b = iVar;
        this.f204030c = str;
        this.f204031d = str2;
        this.f204032e = uri;
        this.f204034g = str3;
        this.f204033f = str4;
        this.f204035h = str5;
        this.f204036i = str6;
        this.f204037j = map;
    }

    /* synthetic */ C90011r(C89993i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, Map map, byte b) {
        this(iVar, str, str2, uri, str3, str4, str5, str6, map);
    }
}
