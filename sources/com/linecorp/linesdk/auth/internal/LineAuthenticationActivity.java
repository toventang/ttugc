package com.linecorp.linesdk.auth.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.linecorp.linesdk.EnumC28179b;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.auth.internal.C28167a;
import com.linecorp.linesdk.auth.internal.C28172c;
import com.linecorp.linesdk.auth.internal.C28176d;
import com.p2082ss.android.ugc.trill.R;

public class LineAuthenticationActivity extends Activity {

    /* renamed from: a */
    private boolean f65919a;

    /* renamed from: b */
    private C28176d f65920b;

    /* renamed from: c */
    private C28172c f65921c;

    static {
        Covode.recordClassIndex(34111);
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
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        this.f65919a = true;
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

    /* access modifiers changed from: protected */
    public void onResume() {
        C15477a.m28476b(this);
        super.onResume();
        if (this.f65920b.f65952d == C28176d.EnumC28178a.f65953a) {
            C28172c cVar = this.f65921c;
            cVar.f65945h.f65952d = C28176d.EnumC28178a.f65954b;
            new C28172c.AsyncTaskC28175c(cVar, (byte) 0).execute(new Void[0]);
        } else if (this.f65920b.f65952d != C28176d.EnumC28178a.f65955c) {
            new Handler(Looper.getMainLooper()).postDelayed(new C28172c.RunnableC28174b(this.f65921c, (byte) 0), 1000);
        }
        this.f65919a = false;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("authenticationStatus", this.f65920b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo48166a(LineLoginResult lineLoginResult) {
        C28176d dVar = this.f65920b;
        if (dVar == null) {
            finish();
        } else if ((dVar.f65952d == C28176d.EnumC28178a.f65954b && !this.f65919a) || this.f65920b.f65952d == C28176d.EnumC28178a.f65956d) {
            Intent intent = new Intent();
            intent.putExtra("authentication_result", lineLoginResult);
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C28176d dVar;
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.aj8);
        Intent intent = getIntent();
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) intent.getParcelableExtra("authentication_config");
        if (lineAuthenticationConfig == null) {
            mo48166a(new LineLoginResult(EnumC28179b.INTERNAL_ERROR, new LineApiError("The requested parameter is illegal.")));
            return;
        }
        if (bundle == null) {
            dVar = new C28176d();
        } else {
            dVar = (C28176d) bundle.getParcelable("authenticationStatus");
            if (dVar == null) {
                dVar = new C28176d();
            }
        }
        this.f65920b = dVar;
        this.f65921c = new C28172c(this, lineAuthenticationConfig, this.f65920b, intent.getStringArrayExtra("permissions"));
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C28167a.C28170c a;
        EnumC28179b bVar;
        super.onNewIntent(intent);
        if (this.f65920b.f65952d == C28176d.EnumC28178a.f65954b) {
            C28172c cVar = this.f65921c;
            cVar.f65945h.f65952d = C28176d.EnumC28178a.f65955c;
            C28167a aVar = cVar.f65942e;
            Uri data = intent.getData();
            if (data == null) {
                a = C28167a.C28170c.m56271a("Illegal redirection from external application.");
            } else {
                String str = aVar.f65923b.f65951c;
                String queryParameter = data.getQueryParameter("state");
                if (str == null || !str.equals(queryParameter)) {
                    a = C28167a.C28170c.m56271a("Illegal parameter value of 'state'.");
                } else {
                    String queryParameter2 = data.getQueryParameter("code");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        a = new C28167a.C28170c(queryParameter2, null, null, null);
                    } else {
                        a = new C28167a.C28170c(null, data.getQueryParameter("error"), data.getQueryParameter("error_description"), null);
                    }
                }
            }
            if (!a.mo48182a()) {
                cVar.f65945h.f65952d = C28176d.EnumC28178a.f65956d;
                LineAuthenticationActivity lineAuthenticationActivity = cVar.f65938a;
                if (a.mo48183b()) {
                    bVar = EnumC28179b.AUTHENTICATION_AGENT_ERROR;
                } else {
                    bVar = EnumC28179b.INTERNAL_ERROR;
                }
                lineAuthenticationActivity.mo48166a(new LineLoginResult(bVar, a.mo48184c()));
                return;
            }
            C28172c.AsyncTaskC28173a aVar2 = new C28172c.AsyncTaskC28173a(cVar, (byte) 0);
            String[] strArr = new String[1];
            if (!TextUtils.isEmpty(a.f65931a)) {
                strArr[0] = a.f65931a;
                aVar2.execute(strArr);
                return;
            }
            throw new UnsupportedOperationException("requestToken is null. Please check result by isSuccess before.");
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f65920b.f65952d == C28176d.EnumC28178a.f65954b) {
            C28172c cVar = this.f65921c;
            if (i == 3 && cVar.f65945h.f65952d != C28176d.EnumC28178a.f65955c) {
                new Handler(Looper.getMainLooper()).postDelayed(new C28172c.RunnableC28174b(cVar, (byte) 0), 1000);
            }
        }
    }
}
