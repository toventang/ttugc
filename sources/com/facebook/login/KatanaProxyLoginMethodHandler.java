package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.internal.C24739e;
import com.facebook.internal.C24743g;
import com.facebook.internal.C24786y;
import com.facebook.login.LoginClient;
import java.util.List;

class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new Parcelable.Creator<KatanaProxyLoginMethodHandler>() {
        /* class com.facebook.login.KatanaProxyLoginMethodHandler.C248301 */

        static {
            Covode.recordClassIndex(29010);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ KatanaProxyLoginMethodHandler[] newArray(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            return new KatanaProxyLoginMethodHandler(parcel);
        }
    };

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public final String mo40629a() {
        return "katana_proxy_auth";
    }

    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: e */
    public final boolean mo40636e() {
        return true;
    }

    static {
        Covode.recordClassIndex(29009);
    }

    KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.NativeAppLoginMethodHandler, com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public final int mo40628a(LoginClient.Request request) {
        boolean z;
        EnumC24864d dVar = request.f58931a;
        if (!C24872m.f59050j || C24743g.m47374a() == null || !dVar.allowsCustomTabAuth) {
            z = false;
        } else {
            z = true;
        }
        String e = LoginClient.m47578e();
        this.f58965c.f58921c.getActivity();
        List<Intent> a = C24786y.m47471a(request.f58934d, request.f58932b, e, request.mo40685a(), request.f58933c, mo40705a(request.f58935e), request.f58938h, z);
        mo40707a("e2e", e);
        for (int i = 0; i < a.size(); i++) {
            if (mo40710a(a.get(i), C24739e.EnumC24741b.Login.toRequestCode())) {
                return i + 1;
            }
        }
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
