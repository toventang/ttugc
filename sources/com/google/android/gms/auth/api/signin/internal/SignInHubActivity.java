package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.ActivityC0945e;
import androidx.loader.app.AbstractC1247a;
import androidx.loader.p062a.C1232c;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p1942authapi.C25691m;

public class SignInHubActivity extends ActivityC0945e {

    /* renamed from: c */
    private static boolean f60037c;

    /* renamed from: a */
    int f60038a;

    /* renamed from: b */
    Intent f60039b;

    /* renamed from: d */
    private boolean f60040d;

    /* renamed from: e */
    private SignInConfiguration f60041e;

    /* renamed from: f */
    private boolean f60042f;

    static {
        Covode.recordClassIndex(30689);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onResume() {
        C15477a.m28476b(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    /* renamed from: a */
    private final void m48635a() {
        getSupportLoaderManager().mo4097a(0, null, new C25300a(this, (byte) 0));
        f60037c = false;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    public class C25300a implements AbstractC1247a.AbstractC1248a<Void> {
        static {
            Covode.recordClassIndex(30690);
        }

        @Override // androidx.loader.app.AbstractC1247a.AbstractC1248a
        /* renamed from: a */
        public final void mo4110a() {
        }

        private C25300a() {
        }

        @Override // androidx.loader.app.AbstractC1247a.AbstractC1248a
        /* renamed from: a */
        public final C1232c<Void> mo4109a(Bundle bundle) {
            return new C25305e(SignInHubActivity.this, AbstractC25357i.m48756a());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.loader.app.AbstractC1247a.AbstractC1248a
        /* renamed from: a */
        public final /* synthetic */ void mo4111a(Void r4) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f60038a, SignInHubActivity.this.f60039b);
            SignInHubActivity.this.finish();
        }

        /* synthetic */ C25300a(SignInHubActivity signInHubActivity, byte b) {
            this();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f60042f);
        if (this.f60042f) {
            bundle.putInt("signInResultCode", this.f60038a);
            bundle.putParcelable("signInResultData", this.f60039b);
        }
    }

    /* renamed from: a */
    private final void m48636a(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f60037c = false;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str = (String) C25691m.m49617a(intent.getAction());
        if ("com.google.android.gms.auth.NO_IMPL".equals(str)) {
            m48636a(12500);
        } else if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || str.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (!(bundleExtra == null || context == null)) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            SignInConfiguration signInConfiguration = (SignInConfiguration) ((Bundle) C25691m.m49617a(bundleExtra)).getParcelable("config");
            if (signInConfiguration == null) {
                setResult(0);
                finish();
                return;
            }
            this.f60041e = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.f60042f = z;
                if (z) {
                    this.f60038a = bundle.getInt("signInResultCode");
                    this.f60039b = (Intent) C25691m.m49617a(bundle.getParcelable("signInResultData"));
                    m48635a();
                }
            } else if (f60037c) {
                setResult(0);
                m48636a(12502);
            } else {
                f60037c = true;
                Intent intent2 = new Intent(str);
                if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.f60041e);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f60040d = true;
                    m48636a(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                "Unknown action: ".concat(valueOf);
            } else {
                new String("Unknown action: ");
            }
            finish();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f60040d) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.f60026a != null) {
                        GoogleSignInAccount googleSignInAccount = signInAccount.f60026a;
                        C25316p.m48677a(this).mo41423a(this.f60041e.f60035a, (GoogleSignInAccount) C25691m.m49617a(googleSignInAccount));
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.f60042f = true;
                        this.f60038a = i2;
                        this.f60039b = intent;
                        m48635a();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        m48636a(intExtra);
                        return;
                    }
                }
                m48636a(8);
            }
        }
    }
}
