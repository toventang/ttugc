package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.AccessToken;
import com.facebook.C24006ab;
import com.facebook.C24012b;
import com.facebook.C24798j;
import com.facebook.C24815l;
import com.facebook.C24872m;
import com.facebook.C24910o;
import com.facebook.EnumC24020c;
import com.facebook.FacebookRequestError;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.login.LoginClient;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Locale;

public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: a */
    private String f58966a;

    static {
        Covode.recordClassIndex(29030);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract EnumC24020c mo40632b();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo40634d() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo40633c() {
        StringBuilder sb = new StringBuilder("fb");
        C24699ae.m47299a();
        return sb.append(C24872m.f59041a).append("://authorize").toString();
    }

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Bundle mo40713b(LoginClient.Request request) {
        String str;
        Bundle bundle = new Bundle();
        if (!C24693ad.m47262a(request.f58932b)) {
            String join = TextUtils.join(",", request.f58932b);
            bundle.putString("scope", join);
            mo40707a("scope", join);
        }
        bundle.putString("default_audience", request.f58933c.getNativeProtocolAudience());
        bundle.putString("state", mo40705a(request.f58935e));
        AccessToken accessToken = C24012b.m45437a().f56861b;
        if (accessToken != null) {
            str = accessToken.f56404e;
        } else {
            str = null;
        }
        String str2 = "0";
        if (str == null || !str.equals(C34822d.m71158a(this.f58965c.f58921c.getActivity(), "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
            try {
                C24693ad.m47268b(this.f58965c.f58921c.getActivity());
            } catch (Exception unused) {
            }
            mo40707a("access_token", str2);
        } else {
            bundle.putString("access_token", str);
            mo40707a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        if (C24006ab.m45407b()) {
            str2 = "1";
        }
        bundle.putString("ies", str2);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo40711a(Bundle bundle, LoginClient.Request request) {
        String str;
        bundle.putString("redirect_uri", mo40633c());
        bundle.putString("client_id", request.f58934d);
        bundle.putString("e2e", LoginClient.m47578e());
        bundle.putString("response_type", "token,signed_request,graph_domain");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", request.f58938h);
        bundle.putString("login_behavior", request.f58931a.name());
        bundle.putString("sdk", C1764a.m5929a(Locale.ROOT, "android-%s", new Object[]{"9.0.0"}));
        if (mo40634d() != null) {
            bundle.putString("sso", mo40634d());
        }
        if (C24872m.f59049i) {
            str = "1";
        } else {
            str = "0";
        }
        bundle.putString("cct_prefetching", str);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40712a(LoginClient.Request request, Bundle bundle, C24798j jVar) {
        LoginClient.Result result;
        String str;
        this.f58966a = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f58966a = bundle.getString("e2e");
            }
            try {
                AccessToken a = m47613a(request.f58932b, bundle, mo40632b(), request.f58934d);
                result = LoginClient.Result.m47587a(this.f58965c.f58925g, a);
                CookieSyncManager.createInstance(this.f58965c.f58921c.getActivity()).sync();
                C34822d.m71158a(this.f58965c.f58921c.getActivity(), "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", a.f56404e).apply();
            } catch (C24798j e) {
                result = LoginClient.Result.m47589a(this.f58965c.f58925g, null, e.getMessage(), null);
            }
        } else if (jVar instanceof C24815l) {
            result = LoginClient.Result.m47588a(this.f58965c.f58925g, "User canceled log in.");
        } else {
            this.f58966a = null;
            String message = jVar.getMessage();
            if (jVar instanceof C24910o) {
                FacebookRequestError requestError = ((C24910o) jVar).getRequestError();
                str = C1764a.m5929a(Locale.ROOT, "%d", new Object[]{Integer.valueOf(requestError.f56432d)});
                message = requestError.toString();
            } else {
                str = null;
            }
            result = LoginClient.Result.m47589a(this.f58965c.f58925g, null, message, str);
        }
        if (!C24693ad.m47261a(this.f58966a)) {
            mo40708b(this.f58966a);
        }
        this.f58965c.mo40676a(result);
    }
}
