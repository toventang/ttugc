package com.snapchat.kit.sdk;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.networking.FetchCodeVerifierCallback;
import com.snapchat.kit.sdk.core.p2067a.C28958f;
import com.snapchat.kit.sdk.p2066b.C28948a;
import java.lang.ref.WeakReference;

/* renamed from: com.snapchat.kit.sdk.a */
public abstract class AbstractActivityC28935a extends Activity {

    /* renamed from: a */
    C29073m f68366a;

    /* renamed from: b */
    LoginStateController f68367b;

    /* renamed from: c */
    LoginStateController.OnLoginStateChangedListener f68368c = new C28939b(this);

    static {
        Covode.recordClassIndex(35119);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ConnectFromSnapchatHandler mo50256a();

    /* renamed from: com.snapchat.kit.sdk.a$b */
    static final class C28939b implements LoginStateController.OnLoginStateChangedListener {

        /* renamed from: a */
        private WeakReference<AbstractActivityC28935a> f68376a;

        static {
            Covode.recordClassIndex(35123);
        }

        @Override // com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStateChangedListener
        public final void onLogout() {
        }

        @Override // com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStateChangedListener
        public final void onLoginFailed() {
            final AbstractActivityC28935a aVar = this.f68376a.get();
            if (aVar != null) {
                aVar.runOnUiThread(new Runnable() {
                    /* class com.snapchat.kit.sdk.AbstractActivityC28935a.C28939b.RunnableC289412 */

                    static {
                        Covode.recordClassIndex(35125);
                    }

                    public final void run() {
                        AbstractActivityC28935a.m57961a(aVar);
                    }
                });
            }
        }

        @Override // com.snapchat.kit.sdk.core.controller.LoginStateController.OnLoginStateChangedListener
        public final void onLoginSucceeded() {
            final AbstractActivityC28935a aVar = this.f68376a.get();
            if (aVar != null) {
                aVar.runOnUiThread(new Runnable() {
                    /* class com.snapchat.kit.sdk.AbstractActivityC28935a.C28939b.RunnableC289401 */

                    static {
                        Covode.recordClassIndex(35124);
                    }

                    public final void run() {
                        AbstractActivityC28935a.m57961a(aVar);
                        aVar.finish();
                    }
                });
            }
        }

        C28939b(AbstractActivityC28935a aVar) {
            this.f68376a = new WeakReference<>(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
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

    /* renamed from: com.snapchat.kit.sdk.a$a */
    static final class C28936a implements FetchCodeVerifierCallback {

        /* renamed from: a */
        final Uri f68369a;

        /* renamed from: b */
        private WeakReference<AbstractActivityC28935a> f68370b;

        static {
            Covode.recordClassIndex(35120);
        }

        @Override // com.snapchat.kit.sdk.core.networking.FetchCodeVerifierCallback
        public final void onCodeVerifierFetchFailed(Throwable th) {
            final AbstractActivityC28935a aVar = this.f68370b.get();
            if (aVar != null) {
                aVar.runOnUiThread(new Runnable() {
                    /* class com.snapchat.kit.sdk.AbstractActivityC28935a.C28936a.RunnableC289382 */

                    static {
                        Covode.recordClassIndex(35122);
                    }

                    public final void run() {
                        aVar.finish();
                    }
                });
            }
        }

        @Override // com.snapchat.kit.sdk.core.networking.FetchCodeVerifierCallback
        public final void onCodeVerifierFetchedSuccessfully(final String str) {
            final AbstractActivityC28935a aVar = this.f68370b.get();
            if (aVar != null) {
                aVar.runOnUiThread(new Runnable() {
                    /* class com.snapchat.kit.sdk.AbstractActivityC28935a.C28936a.RunnableC289371 */

                    static {
                        Covode.recordClassIndex(35121);
                    }

                    public final void run() {
                        AbstractActivityC28935a aVar = aVar;
                        Uri uri = C28936a.this.f68369a;
                        String str = str;
                        aVar.f68367b.addOnLoginStateChangedListener(aVar.f68368c);
                        C29073m mVar = aVar.f68366a;
                        String queryParameter = uri.getQueryParameter("code");
                        String queryParameter2 = uri.getQueryParameter("state");
                        mVar.mo50742a(C29067h.m58061a(mVar.f68709b, uri.buildUpon().query(null).build().toString(), mVar.f68711d, queryParameter2, str, new C28958f(), mVar.f68717j, mVar.f68718k, mVar.f68722o), queryParameter, queryParameter2);
                    }
                });
            }
        }

        C28936a(AbstractActivityC28935a aVar, Uri uri) {
            this.f68370b = new WeakReference<>(aVar);
            this.f68369a = uri;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m57961a(AbstractActivityC28935a aVar) {
        aVar.f68367b.removeOnLoginStateChangedListener(aVar.f68368c);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("snapchat://cfs"));
        intent.setPackage(C28948a.f68393a);
        intent.setFlags(268435456);
        if (intent.resolveActivity(aVar.getPackageManager()) != null) {
            C84349a.m145093a(intent, aVar);
            aVar.startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || intent.getData() == null) {
            finish();
            return;
        }
        SnapKitComponent a = C28951c.m57973a(this);
        if (a == null) {
            finish();
            return;
        }
        a.inject(this);
        String queryParameter = intent.getData().getQueryParameter("code");
        String queryParameter2 = intent.getData().getQueryParameter("state");
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) {
            finish();
            return;
        }
        ConnectFromSnapchatHandler a2 = mo50256a();
        if (a2.needsLoginRedirect()) {
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("CFS_PENDING_INTENT");
        if (pendingIntent == null || !C28948a.f68393a.equals(pendingIntent.getCreatorPackage())) {
            finish();
        } else {
            a2.fetchCodeVerifier(queryParameter2, new C28936a(this, intent.getData()));
        }
    }
}
