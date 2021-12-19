package com.facebook;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24699ae;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.v */
public final class C25030v {

    /* renamed from: a */
    private final SharedPreferences f59372a = C34822d.m71158a(C24872m.f59047g, "com.facebook.AccessTokenManager.SharedPreferences", 0);

    static {
        Covode.recordClassIndex(30362);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo40921b() {
        this.f59372a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    C25030v() {
        C24699ae.m47299a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Profile mo40919a() {
        String string = this.f59372a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40920a(Profile profile) {
        C24699ae.m47301a(profile, "profile");
        JSONObject b = profile.mo39359b();
        if (b != null) {
            this.f59372a.edit().putString("com.facebook.ProfileManager.CachedProfile", b.toString()).apply();
        }
    }
}
