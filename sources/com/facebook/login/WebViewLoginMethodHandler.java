package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.facebook.C24798j;
import com.facebook.EnumC24020c;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24749k;
import com.facebook.internal.DialogC24700af;
import com.facebook.login.LoginClient;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new Parcelable.Creator<WebViewLoginMethodHandler>() {
        /* class com.facebook.login.WebViewLoginMethodHandler.C248442 */

        static {
            Covode.recordClassIndex(29033);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WebViewLoginMethodHandler[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }
    };

    /* renamed from: a */
    private DialogC24700af f58967a;

    /* renamed from: d */
    private String f58968d;

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public final String mo40629a() {
        return "web_view";
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public final boolean mo40709f() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: b */
    public final EnumC24020c mo40632b() {
        return EnumC24020c.WEB_VIEW;
    }

    static {
        Covode.recordClassIndex(29031);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: v_ */
    public final void mo40669v_() {
        DialogC24700af afVar = this.f58967a;
        if (afVar != null) {
            afVar.cancel();
            this.f58967a = null;
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    static class C24845a extends DialogC24700af.C24705a {

        /* renamed from: f */
        String f58971f;

        /* renamed from: g */
        String f58972g;

        /* renamed from: h */
        String f58973h = "fbconnect://success";

        /* renamed from: i */
        EnumC24864d f58974i = EnumC24864d.NATIVE_WITH_FALLBACK;

        static {
            Covode.recordClassIndex(29034);
        }

        @Override // com.facebook.internal.DialogC24700af.C24705a
        /* renamed from: a */
        public final DialogC24700af mo40536a() {
            Bundle bundle = this.f58659e;
            bundle.putString("redirect_uri", this.f58973h);
            bundle.putString("client_id", this.f58656b);
            bundle.putString("e2e", this.f58971f);
            bundle.putString("response_type", "token,signed_request,graph_domain");
            bundle.putString("return_scopes", "true");
            bundle.putString("auth_type", this.f58972g);
            bundle.putString("login_behavior", this.f58974i.name());
            return DialogC24700af.m47312a(this.f58655a, "oauth", bundle, this.f58657c, this.f58658d);
        }

        public C24845a(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f58968d = parcel.readString();
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public final int mo40628a(final LoginClient.Request request) {
        String str;
        Bundle b = mo40713b(request);
        C248431 r3 = new DialogC24700af.AbstractC24707c() {
            /* class com.facebook.login.WebViewLoginMethodHandler.C248431 */

            static {
                Covode.recordClassIndex(29032);
            }

            @Override // com.facebook.internal.DialogC24700af.AbstractC24707c
            /* renamed from: a */
            public final void mo40543a(Bundle bundle, C24798j jVar) {
                WebViewLoginMethodHandler.this.mo40714b(request, bundle, jVar);
            }
        };
        String e = LoginClient.m47578e();
        this.f58968d = e;
        mo40707a("e2e", e);
        ActivityC0945e activity = this.f58965c.f58921c.getActivity();
        boolean d = C24693ad.m47278d(activity);
        C24845a aVar = new C24845a(activity, request.f58934d, b);
        aVar.f58971f = this.f58968d;
        if (d) {
            str = "fbconnect://chrome_os_success";
        } else {
            str = "fbconnect://success";
        }
        aVar.f58973h = str;
        aVar.f58972g = request.f58938h;
        aVar.f58974i = request.f58931a;
        aVar.f58658d = r3;
        this.f58967a = aVar.mo40536a();
        C24749k kVar = new C24749k();
        kVar.setRetainInstance(true);
        kVar.f58723a = this.f58967a;
        kVar.show(activity.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f58968d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo40714b(LoginClient.Request request, Bundle bundle, C24798j jVar) {
        super.mo40712a(request, bundle, jVar);
    }
}
