package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import androidx.p025c.C0484a;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.e */
public final class C89982e extends Exception {
    public final int code;
    public final String error;
    public final String errorDescription;
    public final Uri errorUri;
    public final int type;

    static {
        Covode.recordClassIndex(106153);
    }

    public final int hashCode() {
        return ((this.type + 31) * 31) + this.code;
    }

    public final Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationException", toJsonString());
        return intent;
    }

    public final String toJsonString() {
        return toJson().toString();
    }

    public final String toString() {
        return "AuthorizationException: " + toJsonString();
    }

    /* renamed from: net.openid.appauth.e$b */
    public static final class C89984b {

        /* renamed from: a */
        public static final C89982e f203900a = C89982e.generalEx(0, "Invalid discovery document");

        /* renamed from: b */
        public static final C89982e f203901b = C89982e.generalEx(1, "User cancelled flow");

        /* renamed from: c */
        public static final C89982e f203902c = C89982e.generalEx(2, "Flow cancelled programmatically");

        /* renamed from: d */
        public static final C89982e f203903d = C89982e.generalEx(3, "Network error");

        /* renamed from: e */
        public static final C89982e f203904e = C89982e.generalEx(4, "Server error");

        /* renamed from: f */
        public static final C89982e f203905f = C89982e.generalEx(5, "JSON deserialization error");

        /* renamed from: g */
        public static final C89982e f203906g = C89982e.generalEx(6, "Token response construction error");

        /* renamed from: h */
        public static final C89982e f203907h = C89982e.generalEx(7, "Invalid registration response");

        static {
            Covode.recordClassIndex(106155);
        }
    }

    /* renamed from: net.openid.appauth.e$c */
    public static final class C89985c {

        /* renamed from: a */
        public static final C89982e f203908a;

        /* renamed from: b */
        public static final C89982e f203909b;

        /* renamed from: c */
        public static final C89982e f203910c;

        /* renamed from: d */
        public static final C89982e f203911d;

        /* renamed from: e */
        public static final C89982e f203912e;

        /* renamed from: f */
        public static final C89982e f203913f;

        /* renamed from: g */
        public static final C89982e f203914g;

        /* renamed from: h */
        public static final C89982e f203915h;

        /* renamed from: i */
        static final Map<String, C89982e> f203916i;

        static {
            Covode.recordClassIndex(106156);
            C89982e eVar = C89982e.tokenEx(LiveNetAdaptiveHurryTimeSetting.DEFAULT, "invalid_request");
            f203908a = eVar;
            C89982e eVar2 = C89982e.tokenEx(2001, "invalid_client");
            f203909b = eVar2;
            C89982e eVar3 = C89982e.tokenEx(2002, "invalid_grant");
            f203910c = eVar3;
            C89982e eVar4 = C89982e.tokenEx(2003, "unauthorized_client");
            f203911d = eVar4;
            C89982e eVar5 = C89982e.tokenEx(2004, "unsupported_grant_type");
            f203912e = eVar5;
            C89982e eVar6 = C89982e.tokenEx(2005, "invalid_scope");
            f203913f = eVar6;
            C89982e eVar7 = C89982e.tokenEx(2006, null);
            f203914g = eVar7;
            C89982e eVar8 = C89982e.tokenEx(2007, null);
            f203915h = eVar8;
            f203916i = C89982e.exceptionMapByString(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8);
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        C90001n.m156183a(jSONObject, StringSet.type, this.type);
        C90001n.m156183a(jSONObject, "code", this.code);
        C90001n.m156187b(jSONObject, "error", this.error);
        C90001n.m156187b(jSONObject, "errorDescription", this.errorDescription);
        Uri uri = this.errorUri;
        C90009p.m156198a(jSONObject, "json must not be null");
        C90009p.m156198a((Object) "errorUri", (Object) "field must not be null");
        if (uri != null) {
            try {
                jSONObject.put("errorUri", uri.toString());
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
        return jSONObject;
    }

    /* renamed from: net.openid.appauth.e$a */
    public static final class C89983a {

        /* renamed from: a */
        public static final C89982e f203889a;

        /* renamed from: b */
        public static final C89982e f203890b;

        /* renamed from: c */
        public static final C89982e f203891c;

        /* renamed from: d */
        public static final C89982e f203892d;

        /* renamed from: e */
        public static final C89982e f203893e;

        /* renamed from: f */
        public static final C89982e f203894f;

        /* renamed from: g */
        public static final C89982e f203895g;

        /* renamed from: h */
        public static final C89982e f203896h;

        /* renamed from: i */
        public static final C89982e f203897i;

        /* renamed from: j */
        public static final C89982e f203898j = C89982e.generalEx(9, "Response state param did not match request state");

        /* renamed from: k */
        static final Map<String, C89982e> f203899k;

        static {
            Covode.recordClassIndex(106154);
            C89982e authEx = C89982e.authEx(1000, "invalid_request");
            f203889a = authEx;
            C89982e authEx2 = C89982e.authEx(1001, "unauthorized_client");
            f203890b = authEx2;
            C89982e authEx3 = C89982e.authEx(1002, "access_denied");
            f203891c = authEx3;
            C89982e authEx4 = C89982e.authEx(1003, "unsupported_response_type");
            f203892d = authEx4;
            C89982e authEx5 = C89982e.authEx(1004, "invalid_scope");
            f203893e = authEx5;
            C89982e authEx6 = C89982e.authEx(1005, "server_error");
            f203894f = authEx6;
            C89982e authEx7 = C89982e.authEx(1006, "temporarily_unavailable");
            f203895g = authEx7;
            C89982e authEx8 = C89982e.authEx(1007, null);
            f203896h = authEx8;
            C89982e authEx9 = C89982e.authEx(1008, null);
            f203897i = authEx9;
            f203899k = C89982e.exceptionMapByString(authEx, authEx2, authEx3, authEx4, authEx5, authEx6, authEx7, authEx8, authEx9);
        }
    }

    public static C89982e fromJson(String str) {
        C90009p.m156199a(str, (Object) "jsonStr cannot be null or empty");
        return fromJson(new JSONObject(str));
    }

    public static C89982e fromIntent(Intent intent) {
        C90009p.m156197a(intent);
        if (!intent.hasExtra("net.openid.appauth.AuthorizationException")) {
            return null;
        }
        try {
            return fromJson(m156133xffbc2189(intent, "net.openid.appauth.AuthorizationException"));
        } catch (JSONException e) {
            throw new IllegalArgumentException("Intent contains malformed exception data", e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof C89982e)) {
            C89982e eVar = (C89982e) obj;
            if (this.type == eVar.type && this.code == eVar.code) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static Map<String, C89982e> exceptionMapByString(C89982e... eVarArr) {
        int i;
        if (eVarArr != null) {
            i = eVarArr.length;
        } else {
            i = 0;
        }
        C0484a aVar = new C0484a(i);
        if (eVarArr != null) {
            for (C89982e eVar : eVarArr) {
                String str = eVar.error;
                if (str != null) {
                    aVar.put(str, eVar);
                }
            }
        }
        return Collections.unmodifiableMap(aVar);
    }

    public static C89982e fromJson(JSONObject jSONObject) {
        C90009p.m156198a(jSONObject, "json cannot be null");
        return new C89982e(jSONObject.getInt(StringSet.type), jSONObject.getInt("code"), C90001n.m156186b(jSONObject, "error"), C90001n.m156186b(jSONObject, "errorDescription"), C90001n.m156189d(jSONObject, "errorUri"), null);
    }

    public static C89982e fromOAuthRedirect(Uri uri) {
        Uri uri2;
        String queryParameter = uri.getQueryParameter("error");
        String queryParameter2 = uri.getQueryParameter("error_description");
        String queryParameter3 = uri.getQueryParameter("error_uri");
        C89982e eVar = C89983a.f203899k.get(queryParameter);
        if (eVar == null) {
            eVar = C89983a.f203897i;
        }
        int i = eVar.type;
        int i2 = eVar.code;
        if (queryParameter2 == null) {
            queryParameter2 = eVar.errorDescription;
        }
        if (queryParameter3 != null) {
            uri2 = Uri.parse(queryParameter3);
        } else {
            uri2 = eVar.errorUri;
        }
        return new C89982e(i, i2, queryParameter, queryParameter2, uri2, null);
    }

    /* renamed from: net_openid_appauth_AuthorizationException_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra */
    public static String m156133xffbc2189(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static C89982e authEx(int i, String str) {
        return new C89982e(1, i, str, null, null, null);
    }

    public static C89982e fromTemplate(C89982e eVar, Throwable th) {
        return new C89982e(eVar.type, eVar.code, eVar.error, eVar.errorDescription, eVar.errorUri, th);
    }

    public static C89982e generalEx(int i, String str) {
        return new C89982e(0, i, null, str, null, null);
    }

    public static C89982e registrationEx(int i, String str) {
        return new C89982e(4, i, str, null, null, null);
    }

    public static C89982e tokenEx(int i, String str) {
        return new C89982e(2, i, str, null, null, null);
    }

    public static C89982e fromOAuthTemplate(C89982e eVar, String str, String str2, Uri uri) {
        String str3 = str;
        String str4 = str2;
        Uri uri2 = uri;
        int i = eVar.type;
        int i2 = eVar.code;
        if (str3 == null) {
            str3 = eVar.error;
        }
        if (str4 == null) {
            str4 = eVar.errorDescription;
        }
        if (uri2 == null) {
            uri2 = eVar.errorUri;
        }
        return new C89982e(i, i2, str3, str4, uri2, null);
    }

    public C89982e(int i, int i2, String str, String str2, Uri uri, Throwable th) {
        super(str2, th);
        this.type = i;
        this.code = i2;
        this.error = str;
        this.errorDescription = str2;
        this.errorUri = uri;
    }
}
