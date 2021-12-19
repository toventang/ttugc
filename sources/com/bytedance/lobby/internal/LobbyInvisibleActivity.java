package com.bytedance.lobby.internal;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.lobby.C20879a;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.auth.AbstractC20888d;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.trill.R;

public class LobbyInvisibleActivity extends ActivityC0218d {

    /* renamed from: a */
    public static final boolean f49456a = C20879a.f49364a;

    /* renamed from: b */
    public int f49457b;

    /* renamed from: c */
    private boolean f49458c;

    /* renamed from: d */
    private boolean f49459d;

    /* renamed from: e */
    private AbstractC20888d f49460e;

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    static {
        Covode.recordClassIndex(24517);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        AbstractC20888d dVar = this.f49460e;
        if (dVar != null) {
            dVar.mo34323a();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onResume() {
        C15477a.m28476b(this);
        super.onResume();
        if (!this.f49458c || this.f49459d) {
            this.f49458c = true;
        } else {
            finish();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
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
    private static Bundle m39330a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.bj);
        Intent intent = getIntent();
        final String a = m39331a(intent, "provider_id");
        this.f49457b = intent.getIntExtra("action_type", 0);
        AbstractC20888d b = C20919d.m39339a().mo34369b(a);
        this.f49460e = b;
        if (b == null) {
            C20914a a2 = C20914a.m39334a();
            int i = this.f49457b;
            AuthResult.C20883a aVar = new AuthResult.C20883a(a, this.f49457b);
            aVar.f49377a = false;
            aVar.f49378b = new C20891c(1, "No provider found for ".concat(String.valueOf(a)), "before_goto_URL");
            a2.mo34365a(a, i, aVar.mo34319a());
            finish();
            return;
        }
        LobbyViewModel.m39332a(this).mo34364g().observe(this, new AbstractC1214u<AuthResult>() {
            /* class com.bytedance.lobby.internal.LobbyInvisibleActivity.C209131 */

            static {
                Covode.recordClassIndex(24518);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(AuthResult authResult) {
                C20914a.m39334a().mo34365a(a, LobbyInvisibleActivity.this.f49457b, authResult);
                LobbyInvisibleActivity.this.finish();
            }
        });
        this.f49459d = true;
        int i2 = this.f49457b;
        if (i2 == 1) {
            this.f49460e.mo34326a(this, m39330a(intent));
        } else if (i2 != 2) {
            C20914a a3 = C20914a.m39334a();
            int i3 = this.f49457b;
            AuthResult.C20883a aVar2 = new AuthResult.C20883a(a, this.f49457b);
            aVar2.f49377a = false;
            aVar2.f49378b = new C20891c(1, "Unknown action type: " + this.f49457b);
            a3.mo34365a(a, i3, aVar2.mo34319a());
            finish();
        } else {
            this.f49460e.mo34328b(this, m39330a(intent));
        }
    }

    /* renamed from: a */
    private static String m39331a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC20888d dVar = this.f49460e;
        if (dVar != null) {
            dVar.mo34325a(this, i, i2, intent);
        }
    }
}
