package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24739e;
import com.facebook.internal.C24786y;
import com.facebook.login.LoginClient;

class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<FacebookLiteLoginMethodHandler> CREATOR = new Parcelable.Creator<FacebookLiteLoginMethodHandler>() {
        /* class com.facebook.login.FacebookLiteLoginMethodHandler.C248261 */

        static {
            Covode.recordClassIndex(29004);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FacebookLiteLoginMethodHandler[] newArray(int i) {
            return new FacebookLiteLoginMethodHandler[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FacebookLiteLoginMethodHandler createFromParcel(Parcel parcel) {
            return new FacebookLiteLoginMethodHandler(parcel);
        }
    };

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public final String mo40629a() {
        return "fb_lite_login";
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(29003);
    }

    FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.NativeAppLoginMethodHandler, com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public final int mo40628a(LoginClient.Request request) {
        String e = LoginClient.m47578e();
        Intent a = C24786y.m47463a(this.f58965c.f58921c.getActivity(), request.f58934d, request.f58932b, e, request.mo40685a(), request.f58933c, mo40705a(request.f58935e), request.f58938h);
        mo40707a("e2e", e);
        if (mo40710a(a, C24739e.EnumC24741b.Login.toRequestCode())) {
            return 1;
        }
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
