package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.a */
public final class C23864a {

    /* renamed from: a */
    private final SharedPreferences f56486a;

    /* renamed from: b */
    private final C23865a f56487b;

    /* renamed from: c */
    private C25028t f56488c;

    static {
        Covode.recordClassIndex(27985);
    }

    /* renamed from: com.facebook.a$a */
    static class C23865a {
        static {
            Covode.recordClassIndex(27986);
        }

        C23865a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C23864a() {
        this(C34822d.m71158a(C24872m.f59047g, "com.facebook.AccessTokenManager.SharedPreferences", 0), new C23865a());
        C24699ae.m47299a();
    }

    /* renamed from: b */
    public final void mo39370b() {
        this.f56486a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (C24872m.f59046f) {
            m45119d().mo40918b();
        }
    }

    /* renamed from: d */
    private C25028t m45119d() {
        MethodCollector.m26663i(9353);
        if (this.f56488c == null) {
            synchronized (this) {
                try {
                    if (this.f56488c == null) {
                        C24699ae.m47299a();
                        this.f56488c = new C25028t(C24872m.f59047g);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9353);
                    throw th;
                }
            }
        }
        C25028t tVar = this.f56488c;
        MethodCollector.m26664o(9353);
        return tVar;
    }

    /* renamed from: a */
    public final AccessToken mo39368a() {
        Bundle a;
        String string;
        if (this.f56486a.contains("com.facebook.AccessTokenManager.CachedAccessToken")) {
            return m45118c();
        }
        if (!C24872m.f59046f || (a = m45119d().mo40917a()) == null || (string = a.getString("com.facebook.TokenCachingStrategy.Token")) == null || string.length() == 0 || a.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0) == 0) {
            return null;
        }
        AccessToken a2 = AccessToken.m45053a(a);
        if (a2 == null) {
            return a2;
        }
        mo39369a(a2);
        m45119d().mo40918b();
        return a2;
    }

    /* renamed from: c */
    private AccessToken m45118c() {
        Collection b;
        String string = this.f56486a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.getInt("version") <= 1) {
                String string2 = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray jSONArray = jSONObject.getJSONArray("permissions");
                JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jSONObject.getLong("last_refresh"));
                EnumC24020c valueOf = EnumC24020c.valueOf(jSONObject.getString("source"));
                String string3 = jSONObject.getString("application_id");
                String string4 = jSONObject.getString("user_id");
                try {
                    Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
                    String optString = jSONObject.optString("graph_domain", null);
                    List<String> b2 = C24693ad.m47267b(jSONArray);
                    List<String> b3 = C24693ad.m47267b(jSONArray2);
                    if (optJSONArray == null) {
                        b = new ArrayList();
                    } else {
                        b = C24693ad.m47267b(optJSONArray);
                    }
                    return new AccessToken(string2, string3, string4, b2, b3, b, valueOf, date, date2, date3, optString);
                } catch (JSONException unused) {
                    return null;
                }
            } else {
                throw new C24798j("Unknown AccessToken serialization format.");
            }
        } catch (JSONException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo39369a(AccessToken accessToken) {
        C24699ae.m47301a(accessToken, "accessToken");
        try {
            this.f56486a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.mo39309c().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    private C23864a(SharedPreferences sharedPreferences, C23865a aVar) {
        this.f56486a = sharedPreferences;
        this.f56487b = aVar;
    }
}
