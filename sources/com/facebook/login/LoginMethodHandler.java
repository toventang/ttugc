package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.facebook.AccessToken;
import com.facebook.C24798j;
import com.facebook.EnumC24020c;
import com.facebook.internal.C24693ad;
import com.facebook.login.LoginClient;
import com.facebook.p1814a.C23998m;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: b */
    Map<String, String> f58964b;

    /* renamed from: c */
    protected LoginClient f58965c;

    static {
        Covode.recordClassIndex(29028);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo40628a(LoginClient.Request request);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract String mo40629a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40630a(JSONObject jSONObject) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo40631a(int i, int i2, Intent intent) {
        return false;
    }

    /* renamed from: e */
    public boolean mo40636e() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo40709f() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v_ */
    public void mo40669v_() {
    }

    LoginMethodHandler(LoginClient loginClient) {
        this.f58965c = loginClient;
    }

    LoginMethodHandler(Parcel parcel) {
        this.f58964b = C24693ad.m47245a(parcel);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40706a(LoginClient loginClient) {
        if (this.f58965c == null) {
            this.f58965c = loginClient;
            return;
        }
        throw new C24798j("Can't set LoginClient if it is already set.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo40705a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo40629a());
            mo40630a(jSONObject);
        } catch (JSONException e) {
            e.getMessage();
        }
        return jSONObject.toString();
    }

    /* renamed from: c */
    private static String m47614c(String str) {
        if (str == null || str.isEmpty()) {
            throw new C24798j("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new C24798j("Failed to retrieve user_id from signed_request");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo40708b(String str) {
        String str2 = this.f58965c.f58925g.f58934d;
        C23998m mVar = new C23998m(this.f58965c.f58921c.getActivity(), str2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", str2);
        mVar.mo39477c();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24693ad.m47250a(parcel, this.f58964b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40707a(String str, Object obj) {
        String obj2;
        if (this.f58964b == null) {
            this.f58964b = new HashMap();
        }
        Map<String, String> map = this.f58964b;
        if (obj == null) {
            obj2 = null;
        } else {
            obj2 = obj.toString();
        }
        map.put(str, obj2);
    }

    /* renamed from: a */
    static AccessToken m47612a(Bundle bundle, EnumC24020c cVar, String str) {
        Date a = C24693ad.m47241a(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date a2 = C24693ad.m47241a(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
        if (C24693ad.m47261a(string)) {
            return null;
        }
        return new AccessToken(string, str, bundle.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, null, cVar, a, new Date(), a2, bundle.getString("graph_domain"));
    }

    /* renamed from: a */
    public static AccessToken m47613a(Collection<String> collection, Bundle bundle, EnumC24020c cVar, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Collection<String> collection2 = collection;
        Date a = C24693ad.m47241a(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        Date a2 = C24693ad.m47241a(bundle, "data_access_expiration_time", new Date(0));
        String string2 = bundle.getString("granted_scopes");
        if (!C24693ad.m47261a(string2)) {
            collection2 = new ArrayList<>(Arrays.asList(string2.split(",")));
        }
        String string3 = bundle.getString("denied_scopes");
        if (!C24693ad.m47261a(string3)) {
            arrayList = new ArrayList(Arrays.asList(string3.split(",")));
        } else {
            arrayList = null;
        }
        String string4 = bundle.getString("expired_scopes");
        if (!C24693ad.m47261a(string4)) {
            arrayList2 = new ArrayList(Arrays.asList(string4.split(",")));
        } else {
            arrayList2 = null;
        }
        if (C24693ad.m47261a(string)) {
            return null;
        }
        return new AccessToken(string, str, m47614c(bundle.getString("signed_request")), collection2, arrayList, arrayList2, cVar, a, new Date(), a2, bundle.getString("graph_domain"));
    }
}
