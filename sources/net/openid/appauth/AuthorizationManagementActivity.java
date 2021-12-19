package net.openid.appauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import net.openid.appauth.C89982e;
import net.openid.appauth.C89988g;
import net.openid.appauth.p4651c.C89977a;
import org.json.JSONException;

public class AuthorizationManagementActivity extends Activity {

    /* renamed from: a */
    public Intent f203853a;

    /* renamed from: b */
    private boolean f203854b;

    /* renamed from: c */
    private C89986f f203855c;

    /* renamed from: d */
    private PendingIntent f203856d;

    /* renamed from: e */
    private PendingIntent f203857e;

    static {
        Covode.recordClassIndex(106134);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C15477a.m28476b(this);
        if (this.f203853a != null) {
            m156096a();
            return;
        }
        try {
            m156096a();
        } catch (NullPointerException unused) {
            finish();
        }
    }

    /* renamed from: a */
    private void m156096a() {
        super.onResume();
        if (!this.f203854b) {
            m156098a(this, this.f203853a);
            this.f203854b = true;
            return;
        }
        if (getIntent().getData() != null) {
            m156099b();
        } else {
            m156100c();
        }
        finish();
    }

    /* renamed from: b */
    private void m156099b() {
        Uri data = getIntent().getData();
        Intent a = m156094a(data);
        if (a == null) {
            C89977a.m156123d("Failed to extract OAuth2 response from redirect", new Object[0]);
            return;
        }
        a.setData(data);
        if (this.f203856d != null) {
            C89977a.m156118a("Authorization complete - invoking completion intent", new Object[0]);
            try {
                this.f203856d.send(this, 0, a);
            } catch (PendingIntent.CanceledException e) {
                C89977a.m156123d("Failed to send completion intent", e);
            }
        } else {
            setResult(-1, a);
        }
    }

    /* renamed from: c */
    private void m156100c() {
        C89977a.m156118a("Authorization flow canceled by user", new Object[0]);
        Intent intent = C89982e.fromTemplate(C89982e.C89984b.f203901b, null).toIntent();
        PendingIntent pendingIntent = this.f203857e;
        if (pendingIntent != null) {
            try {
                pendingIntent.send(this, 0, intent);
            } catch (PendingIntent.CanceledException e) {
                C89977a.m156123d("Failed to send cancel intent", e);
            }
        } else {
            setResult(0, intent);
            C89977a.m156118a("No cancel intent set - will return to previous activity", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
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

    /* renamed from: a */
    static Intent m156093a(Context context) {
        return new Intent(context, AuthorizationManagementActivity.class);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* renamed from: a */
    private static Bundle m156095a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        if (bundle == null) {
            m156097a(m156095a(getIntent()));
        } else {
            m156097a(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.f203854b);
        bundle.putParcelable("authIntent", this.f203853a);
        bundle.putString("authRequest", this.f203855c.mo144643b().toString());
        bundle.putParcelable("completeIntent", this.f203856d);
        bundle.putParcelable("cancelIntent", this.f203857e);
    }

    /* renamed from: a */
    private Intent m156094a(Uri uri) {
        if (uri.getQueryParameterNames().contains("error")) {
            return C89982e.fromOAuthRedirect(uri).toIntent();
        }
        C89988g a = new C89988g.C89989a(this.f203855c).mo144649a(uri).mo144652a();
        if ((this.f203855c.f203926j != null || a.f203948c == null) && (this.f203855c.f203926j == null || this.f203855c.f203926j.equals(a.f203948c))) {
            return a.mo144647a();
        }
        C89977a.m156122c("State returned in authorization response (%s) does not match state from request (%s) - discarding response", a.f203948c, this.f203855c.f203926j);
        return C89982e.C89983a.f203898j.toIntent();
    }

    /* renamed from: a */
    private void m156097a(Bundle bundle) {
        if (bundle == null) {
            C89977a.m156122c("No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.f203853a = (Intent) bundle.getParcelable("authIntent");
        this.f203854b = bundle.getBoolean("authStarted", false);
        C89986f fVar = null;
        try {
            String string = bundle.getString("authRequest", null);
            if (string != null) {
                fVar = C89986f.m156134a(string);
            }
            this.f203855c = fVar;
            this.f203856d = (PendingIntent) bundle.getParcelable("completeIntent");
            this.f203857e = (PendingIntent) bundle.getParcelable("cancelIntent");
        } catch (JSONException e) {
            throw new IllegalStateException("Unable to deserialize authorization request", e);
        }
    }

    /* renamed from: a */
    private static void m156098a(AuthorizationManagementActivity authorizationManagementActivity, Intent intent) {
        C84349a.m145093a(intent, authorizationManagementActivity);
        authorizationManagementActivity.startActivity(intent);
    }
}
