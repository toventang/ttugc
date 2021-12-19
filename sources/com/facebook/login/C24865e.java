package com.facebook.login;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.facebook.AccessToken;
import com.facebook.C24798j;
import com.facebook.CustomTabMainActivity;
import com.facebook.login.LoginClient;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.facebook.login.e */
public final class C24865e extends Fragment {

    /* renamed from: a */
    public LoginClient f59026a;

    /* renamed from: b */
    LoginClient.Request f59027b;

    /* renamed from: c */
    private String f59028c;

    static {
        Covode.recordClassIndex(29054);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        LoginClient loginClient = this.f59026a;
        if (loginClient.f58920b >= 0) {
            loginClient.mo40675a().mo40669v_();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        View findViewById;
        super.onPause();
        if (getView() != null && (findViewById = getView().findViewById(R.id.a88)) != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f59028c == null) {
            getActivity().finish();
            return;
        }
        LoginClient loginClient = this.f59026a;
        LoginClient.Request request = this.f59027b;
        if ((loginClient.f58925g != null && loginClient.f58920b >= 0) || request == null) {
            return;
        }
        if (loginClient.f58925g != null) {
            throw new C24798j("Attempted to authorize while a request is pending.");
        } else if (!AccessToken.m45056a() || loginClient.mo40678b()) {
            loginClient.f58925g = request;
            ArrayList arrayList = new ArrayList();
            EnumC24864d dVar = request.f58931a;
            if (dVar.allowsGetTokenAuth) {
                arrayList.add(new GetTokenLoginMethodHandler(loginClient));
            }
            if (dVar.allowsKatanaAuth) {
                arrayList.add(new KatanaProxyLoginMethodHandler(loginClient));
            }
            if (dVar.allowsFacebookLiteAuth) {
                arrayList.add(new FacebookLiteLoginMethodHandler(loginClient));
            }
            if (dVar.allowsCustomTabAuth) {
                arrayList.add(new CustomTabLoginMethodHandler(loginClient));
            }
            if (dVar.allowsWebViewAuth) {
                arrayList.add(new WebViewLoginMethodHandler(loginClient));
            }
            if (dVar.allowsDeviceAuth) {
                arrayList.add(new DeviceAuthMethodHandler(loginClient));
            }
            LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
            arrayList.toArray(loginMethodHandlerArr);
            loginClient.f58919a = loginMethodHandlerArr;
            loginClient.mo40679c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.f59026a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            LoginClient loginClient = (LoginClient) bundle.getParcelable("loginClient");
            this.f59026a = loginClient;
            if (loginClient.f58921c == null) {
                loginClient.f58921c = this;
            } else {
                throw new C24798j("Can't set fragment once it is already set.");
            }
        } else {
            this.f59026a = new LoginClient(this);
        }
        this.f59026a.f58922d = new LoginClient.AbstractC24836b() {
            /* class com.facebook.login.C24865e.C248661 */

            static {
                Covode.recordClassIndex(29055);
            }

            @Override // com.facebook.login.LoginClient.AbstractC24836b
            /* renamed from: a */
            public final void mo40696a(LoginClient.Result result) {
                int i;
                C24865e eVar = C24865e.this;
                eVar.f59027b = null;
                if (result.f58940a == LoginClient.Result.EnumC24834a.CANCEL) {
                    i = 0;
                } else {
                    i = -1;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.facebook.LoginFragment:Result", result);
                Intent intent = new Intent();
                intent.putExtras(bundle);
                if (eVar.isAdded()) {
                    eVar.getActivity().setResult(i, intent);
                    eVar.getActivity().finish();
                }
            }
        };
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            ComponentName callingActivity = activity.getCallingActivity();
            if (callingActivity != null) {
                this.f59028c = callingActivity.getPackageName();
            }
            Intent intent = activity.getIntent();
            if (intent != null) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request");
                Context context = BadParcelableCrashOptimizer.getContext();
                if (bundleExtra != null) {
                    if (context != null) {
                        bundleExtra.setClassLoader(context.getClassLoader());
                    }
                    this.f59027b = (LoginClient.Request) bundleExtra.getParcelable("request");
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C1764a.m5927a(layoutInflater, R.layout.nc, viewGroup, false);
        final View findViewById = a.findViewById(R.id.a88);
        this.f59026a.f58923e = new LoginClient.AbstractC24835a() {
            /* class com.facebook.login.C24865e.C248672 */

            static {
                Covode.recordClassIndex(29056);
            }

            @Override // com.facebook.login.LoginClient.AbstractC24835a
            /* renamed from: a */
            public final void mo40694a() {
                findViewById.setVisibility(0);
            }

            @Override // com.facebook.login.LoginClient.AbstractC24835a
            /* renamed from: b */
            public final void mo40695b() {
                findViewById.setVisibility(8);
            }
        };
        return a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LoginClient loginClient = this.f59026a;
        loginClient.f58928j++;
        if (loginClient.f58925g == null) {
            return;
        }
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f56420f, false)) {
            loginClient.mo40679c();
        } else if (!loginClient.mo40675a().mo40636e() || intent != null || loginClient.f58928j >= loginClient.f58929k) {
            loginClient.mo40675a().mo40631a(i, i2, intent);
        }
    }
}
