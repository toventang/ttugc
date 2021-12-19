package com.p2082ss.android.ugc.aweme.mix.editname;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a;
import com.p2082ss.android.ugc.aweme.mix.editname.C59605h;

/* renamed from: com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity */
public final class ChangePlaylistNameActivity extends AbstractActivityC59327a {

    /* renamed from: a */
    public static final C59539a f135881a = new C59539a((byte) 0);

    /* renamed from: b */
    private String f135882b = "";

    /* renamed from: c */
    private String f135883c = "";

    /* renamed from: d */
    private long f135884d;

    /* renamed from: e */
    private String f135885e = "";

    /* renamed from: f */
    private SparseArray f135886f;

    static {
        Covode.recordClassIndex(69934);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f135886f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f135886f == null) {
            this.f135886f = new SparseArray();
        }
        View view = (View) this.f135886f.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f135886f.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity$a */
    public static final class C59539a {
        static {
            Covode.recordClassIndex(69935);
        }

        private C59539a() {
        }

        public /* synthetic */ C59539a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
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

    @Override // com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a
    /* renamed from: a */
    public final Fragment mo96994a() {
        Intent intent = getIntent();
        if (intent != null) {
            String a = m109172a(intent, "user_last_name");
            String str = "";
            if (a == null) {
                a = str;
            }
            this.f135882b = a;
            String a2 = m109172a(intent, "mix_id");
            if (a2 == null) {
                a2 = str;
            }
            this.f135883c = a2;
            this.f135884d = intent.getLongExtra("moderated_rename_timestamp", 0);
            String a3 = m109172a(intent, "enter_from");
            if (a3 != null) {
                str = a3;
            }
            this.f135885e = str;
        }
        return C59605h.C59612g.m109204a(2, this.f135882b, this.f135883c, null, Long.valueOf(this.f135884d), this.f135885e, 8);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m109172a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
