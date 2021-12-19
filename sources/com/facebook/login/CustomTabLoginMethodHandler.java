package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.CustomTabMainActivity;
import com.facebook.EnumC24020c;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24742f;
import com.facebook.internal.C24743g;
import com.facebook.login.LoginClient;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new Parcelable.Creator() {
        /* class com.facebook.login.CustomTabLoginMethodHandler.C248161 */

        static {
            Covode.recordClassIndex(28990);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }
    };

    /* renamed from: a */
    public static boolean f58876a;

    /* renamed from: d */
    private String f58877d;

    /* renamed from: e */
    private String f58878e;

    /* renamed from: f */
    private String f58879f;

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public final String mo40629a() {
        return "custom_tab";
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: d */
    public final String mo40634d() {
        return "chrome_custom_tab";
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: b */
    public final EnumC24020c mo40632b() {
        return EnumC24020c.CHROME_CUSTOM_TAB;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: c */
    public final String mo40633c() {
        return this.f58879f;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ boolean mo40636e() {
        return super.mo40636e();
    }

    static {
        Covode.recordClassIndex(28989);
    }

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f58879f = "";
        this.f58878e = parcel.readString();
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public final void mo40630a(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.f58878e);
    }

    CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f58879f = "";
        this.f58878e = C24693ad.m47264b();
        f58876a = false;
        this.f58879f = C24743g.m47375a(super.mo40633c());
    }

    /* renamed from: a */
    private boolean m47531a(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f58878e);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public final int mo40628a(LoginClient.Request request) {
        if (this.f58879f.isEmpty()) {
            return 0;
        }
        Bundle a = mo40711a(mo40713b(request), request);
        if (f58876a) {
            a.putString("cct_over_app_switch", "1");
        }
        if (C24872m.f59049i) {
            C24846a.m47649a(C24742f.m47372a("oauth", a));
        }
        Intent intent = new Intent(this.f58965c.f58921c.getActivity(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f56415a, "oauth");
        intent.putExtra(CustomTabMainActivity.f56416b, a);
        String str = CustomTabMainActivity.f56417c;
        String str2 = this.f58877d;
        if (str2 == null) {
            str2 = C24743g.m47374a();
            this.f58877d = str2;
        }
        intent.putExtra(str, str2);
        this.f58965c.f58921c.startActivityForResult(intent, 1);
        return 1;
    }

    /* renamed from: a */
    private static String m47530a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f58878e);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d2  */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo40631a(int r11, int r12, android.content.Intent r13) {
        /*
        // Method dump skipped, instructions count: 233
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.mo40631a(int, int, android.content.Intent):boolean");
    }
}
