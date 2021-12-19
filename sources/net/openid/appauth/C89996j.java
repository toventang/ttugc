package net.openid.appauth;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.openid.appauth.C90001n;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.j */
public final class C89996j {

    /* renamed from: A */
    static final C90001n.C90007f f203983A = m156172a("service_documentation");

    /* renamed from: B */
    static final C90001n.C90006e f203984B = m156173b("claims_locales_supported");

    /* renamed from: C */
    static final C90001n.C90006e f203985C = m156173b("ui_locales_supported");

    /* renamed from: D */
    static final C90001n.C90002a f203986D = m156170a("claims_parameter_supported", false);

    /* renamed from: E */
    static final C90001n.C90002a f203987E = m156170a("request_parameter_supported", false);

    /* renamed from: F */
    static final C90001n.C90002a f203988F = m156170a("request_uri_parameter_supported", true);

    /* renamed from: G */
    static final C90001n.C90002a f203989G = m156170a("require_request_uri_registration", false);

    /* renamed from: H */
    static final C90001n.C90007f f203990H = m156172a("op_policy_uri");

    /* renamed from: I */
    static final C90001n.C90007f f203991I = m156172a("op_tos_uri");

    /* renamed from: K */
    private static final List<String> f203992K;

    /* renamed from: a */
    static final C90001n.C90005d f203993a;

    /* renamed from: b */
    static final C90001n.C90007f f203994b;

    /* renamed from: c */
    static final C90001n.C90007f f203995c = m156172a("token_endpoint");

    /* renamed from: d */
    static final C90001n.C90007f f203996d = m156172a("userinfo_endpoint");

    /* renamed from: e */
    static final C90001n.C90007f f203997e;

    /* renamed from: f */
    static final C90001n.C90007f f203998f = m156172a("registration_endpoint");

    /* renamed from: g */
    static final C90001n.C90006e f203999g = m156173b("scopes_supported");

    /* renamed from: h */
    static final C90001n.C90006e f204000h;

    /* renamed from: i */
    static final C90001n.C90006e f204001i = m156173b("response_modes_supported");

    /* renamed from: j */
    static final C90001n.C90006e f204002j = m156171a("grant_types_supported", Arrays.asList("authorization_code", "implicit"));

    /* renamed from: k */
    static final C90001n.C90006e f204003k = m156173b("acr_values_supported");

    /* renamed from: l */
    static final C90001n.C90006e f204004l;

    /* renamed from: m */
    static final C90001n.C90006e f204005m;

    /* renamed from: n */
    static final C90001n.C90006e f204006n = m156173b("id_token_encryption_enc_values_supported");

    /* renamed from: o */
    static final C90001n.C90006e f204007o = m156173b("id_token_encryption_enc_values_supported");

    /* renamed from: p */
    static final C90001n.C90006e f204008p = m156173b("userinfo_signing_alg_values_supported");

    /* renamed from: q */
    static final C90001n.C90006e f204009q = m156173b("userinfo_encryption_alg_values_supported");

    /* renamed from: r */
    static final C90001n.C90006e f204010r = m156173b("userinfo_encryption_enc_values_supported");

    /* renamed from: s */
    static final C90001n.C90006e f204011s = m156173b("request_object_signing_alg_values_supported");

    /* renamed from: t */
    static final C90001n.C90006e f204012t = m156173b("request_object_encryption_alg_values_supported");

    /* renamed from: u */
    static final C90001n.C90006e f204013u = m156173b("request_object_encryption_enc_values_supported");

    /* renamed from: v */
    static final C90001n.C90006e f204014v = m156171a("token_endpoint_auth_methods_supported", Collections.singletonList("client_secret_basic"));

    /* renamed from: w */
    static final C90001n.C90006e f204015w = m156173b("token_endpoint_auth_signing_alg_values_supported");

    /* renamed from: x */
    static final C90001n.C90006e f204016x = m156173b("display_values_supported");

    /* renamed from: y */
    static final C90001n.C90006e f204017y = m156171a("claim_types_supported", Collections.singletonList("normal"));

    /* renamed from: z */
    static final C90001n.C90006e f204018z = m156173b("claims_supported");

    /* renamed from: J */
    public final JSONObject f204019J;

    /* renamed from: net.openid.appauth.j$a */
    public static class C89997a extends Exception {

        /* renamed from: a */
        private String f204020a;

        static {
            Covode.recordClassIndex(106168);
        }

        public final String getMissingField() {
            return this.f204020a;
        }

        public C89997a(String str) {
            super("Missing mandatory configuration field: ".concat(String.valueOf(str)));
            this.f204020a = str;
        }
    }

    static {
        Covode.recordClassIndex(106167);
        C90001n.C90005d dVar = new C90001n.C90005d("issuer", (byte) 0);
        f203993a = dVar;
        C90001n.C90007f a = m156172a("authorization_endpoint");
        f203994b = a;
        C90001n.C90007f a2 = m156172a("jwks_uri");
        f203997e = a2;
        C90001n.C90006e b = m156173b("response_types_supported");
        f204000h = b;
        C90001n.C90006e b2 = m156173b("subject_types_supported");
        f204004l = b2;
        C90001n.C90006e b3 = m156173b("id_token_signing_alg_values_supported");
        f204005m = b3;
        f203992K = Arrays.asList(dVar.f204022a, a.f204022a, a2.f204022a, b.f204024a, b2.f204024a, b3.f204024a);
    }

    /* renamed from: b */
    private static C90001n.C90006e m156173b(String str) {
        return new C90001n.C90006e(str);
    }

    /* renamed from: a */
    private static C90001n.C90007f m156172a(String str) {
        return new C90001n.C90007f(str, (byte) 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C89996j(org.json.JSONObject r4) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = net.openid.appauth.C90009p.m156197a(r4)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r3.f204019J = r0
            java.util.List<java.lang.String> r0 = net.openid.appauth.C89996j.f203992K
            java.util.Iterator r2 = r0.iterator()
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            org.json.JSONObject r0 = r3.f204019J
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L_0x002e
            org.json.JSONObject r0 = r3.f204019J
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x002e
            goto L_0x0011
        L_0x002e:
            net.openid.appauth.j$a r0 = new net.openid.appauth.j$a
            r0.<init>(r1)
            throw r0
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.C89996j.<init>(org.json.JSONObject):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T> T mo144665a(C90001n.AbstractC90003b<T> bVar) {
        return (T) C90001n.m156180a(this.f204019J, bVar);
    }

    /* renamed from: a */
    private static C90001n.C90002a m156170a(String str, boolean z) {
        return new C90001n.C90002a(str, z);
    }

    /* renamed from: a */
    private static C90001n.C90006e m156171a(String str, List<String> list) {
        return new C90001n.C90006e(str, list);
    }
}
