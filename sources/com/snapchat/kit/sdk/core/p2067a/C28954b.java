package com.snapchat.kit.sdk.core.p2067a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27889a;
import com.google.gson.p2018a.AbstractC27891c;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import java.io.Serializable;
import java.util.Objects;

/* renamed from: com.snapchat.kit.sdk.core.a.b */
public class C28954b implements Serializable {
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "mResponseType")

    /* renamed from: a */
    private String f68404a;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "mClientId")

    /* renamed from: b */
    private String f68405b;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "mScope")

    /* renamed from: c */
    private String f68406c;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "mRedirectUri")

    /* renamed from: d */
    private String f68407d;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "mState")

    /* renamed from: e */
    private String f68408e;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "mCodeVerifier")

    /* renamed from: f */
    private String f68409f;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "mCodeChallengeMethod")

    /* renamed from: g */
    private String f68410g;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "mCodeChallenge")

    /* renamed from: h */
    private String f68411h;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "mFeatures")

    /* renamed from: i */
    private String f68412i;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "mKitPluginType")

    /* renamed from: j */
    private KitPluginType f68413j;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "mSdkIsFromReactNativePlugin")

    /* renamed from: k */
    private boolean f68414k;
    @AbstractC27889a
    @AbstractC27891c(mo46611a = "mIsForFirebaseAuthentication")

    /* renamed from: l */
    private boolean f68415l;

    static {
        Covode.recordClassIndex(35138);
    }

    public String getCodeVerifier() {
        return this.f68409f;
    }

    public String getFeatures() {
        return this.f68412i;
    }

    public boolean getIsForFirebaseAuthentication() {
        return this.f68415l;
    }

    public String getRedirectUri() {
        return this.f68407d;
    }

    public String getResponseType() {
        return this.f68404a;
    }

    public boolean getSdkIsFromReactNativePlugin() {
        return this.f68414k;
    }

    public String getState() {
        return this.f68408e;
    }

    public String toString() {
        return toJson();
    }

    public String toJson() {
        return new C27910f().mo46674b(this);
    }

    public int hashCode() {
        return Objects.hash(this.f68404a, this.f68405b, this.f68406c, this.f68407d, this.f68408e, this.f68409f, this.f68410g, this.f68411h, this.f68412i, this.f68413j, Boolean.valueOf(this.f68414k), Boolean.valueOf(this.f68415l));
    }

    public C28954b withClientId(String str) {
        this.f68405b = str;
        return this;
    }

    public C28954b withCodeChallenge(String str) {
        this.f68411h = str;
        return this;
    }

    public C28954b withCodeChallengeMethod(String str) {
        this.f68410g = str;
        return this;
    }

    public C28954b withCodeVerifier(String str) {
        this.f68409f = str;
        return this;
    }

    public C28954b withFeatures(String str) {
        this.f68412i = str;
        return this;
    }

    public C28954b withIsForFirebaseAuthentication(boolean z) {
        this.f68415l = z;
        return this;
    }

    public C28954b withKitPluginType(KitPluginType kitPluginType) {
        this.f68413j = kitPluginType;
        return this;
    }

    public C28954b withRedirectUri(String str) {
        this.f68407d = str;
        return this;
    }

    public C28954b withResponseType(String str) {
        this.f68404a = str;
        return this;
    }

    public C28954b withScope(String str) {
        this.f68406c = str;
        return this;
    }

    public C28954b withSdkIsFromReactNativePlugin(boolean z) {
        this.f68414k = z;
        return this;
    }

    public C28954b withState(String str) {
        this.f68408e = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C28954b)) {
            return false;
        }
        C28954b bVar = (C28954b) obj;
        if (!Objects.equals(this.f68404a, bVar.f68404a) || !Objects.equals(this.f68405b, bVar.f68405b) || !Objects.equals(this.f68406c, bVar.f68406c) || !Objects.equals(this.f68407d, bVar.f68407d) || !Objects.equals(this.f68408e, bVar.f68408e) || !Objects.equals(this.f68409f, bVar.f68409f) || !Objects.equals(this.f68410g, bVar.f68410g) || !Objects.equals(this.f68411h, bVar.f68411h) || !Objects.equals(this.f68412i, bVar.f68412i) || !Objects.equals(this.f68413j, bVar.f68413j) || !Objects.equals(Boolean.valueOf(this.f68414k), Boolean.valueOf(bVar.f68414k)) || !Objects.equals(Boolean.valueOf(this.f68415l), Boolean.valueOf(bVar.f68415l))) {
            return false;
        }
        return true;
    }

    public Uri toUri(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            str = "https://accounts.snapchat.com/accounts";
        }
        Uri.Builder appendQueryParameter = Uri.parse(str + str2).buildUpon().appendQueryParameter("response_type", this.f68404a).appendQueryParameter("client_id", this.f68405b).appendQueryParameter("redirect_uri", this.f68407d).appendQueryParameter("scope", this.f68406c).appendQueryParameter("state", this.f68408e).appendQueryParameter("code_challenge_method", this.f68410g).appendQueryParameter("code_challenge", this.f68411h).appendQueryParameter("sdk_is_from_react_native_plugin", String.valueOf(this.f68414k)).appendQueryParameter("is_for_firebase_authentication", String.valueOf(this.f68415l));
        if (!TextUtils.isEmpty(str3)) {
            appendQueryParameter.appendQueryParameter("package_name", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            appendQueryParameter.appendQueryParameter("source", str4);
        }
        if (!TextUtils.isEmpty(this.f68412i)) {
            appendQueryParameter.appendQueryParameter("features", this.f68412i);
        }
        appendQueryParameter.appendQueryParameter("kit_version", "1.12.0");
        appendQueryParameter.appendQueryParameter("link", this.f68405b);
        if (this.f68413j != KitPluginType.NO_PLUGIN) {
            appendQueryParameter.appendQueryParameter("kitPluginType", this.f68413j.toString());
        }
        return appendQueryParameter.build();
    }
}
