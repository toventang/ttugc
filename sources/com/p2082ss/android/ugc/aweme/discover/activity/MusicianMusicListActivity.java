package com.p2082ss.android.ugc.aweme.discover.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41532h;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42643ai;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42967t;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity */
public final class MusicianMusicListActivity extends ActivityC17312a {

    /* renamed from: a */
    public static final C41557a f96916a = new C41557a((byte) 0);

    /* renamed from: b */
    private SparseArray f96917b;

    static {
        Covode.recordClassIndex(49464);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f96917b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f96917b == null) {
            this.f96917b = new SparseArray();
        }
        View view = (View) this.f96917b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f96917b.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity$a */
    public static final class C41557a {
        static {
            Covode.recordClassIndex(49465);
        }

        private C41557a() {
        }

        public /* synthetic */ C41557a(byte b) {
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

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity$b */
    static final class C41558b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C41558b f96918a = new C41558b();

        static {
            Covode.recordClassIndex(49466);
        }

        C41558b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C415591.f96919a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        String a;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onCreate", true);
        activityConfiguration(C41558b.f96918a);
        super.onCreate(bundle);
        setContentView(R.layout.atp);
        if (C41532h.m83470a()) {
            String a2 = m83494a(getIntent(), "keyword");
            if (a2 != null) {
                C89219l.m154716b(a2, "");
                C89219l.m154721d(a2, "");
                fragment = new C42967t();
                Bundle bundle2 = new Bundle();
                bundle2.putString("keyword", a2);
                fragment.setArguments(bundle2);
                getSupportFragmentManager().mo3552a().mo3470b(R.id.b82, fragment, "container").mo3473c();
            }
        } else {
            Intent intent = getIntent();
            if (!(intent == null || (a = m83494a(intent, "param_music_author")) == null)) {
                C89219l.m154716b(a, "");
                int intExtra = getIntent().getIntExtra("param_holder_postion", 0);
                C89219l.m154721d(a, "");
                fragment = new C42643ai();
                Bundle bundle3 = new Bundle();
                bundle3.putString("param_music_author", a);
                bundle3.putInt("param_holder_postion", intExtra);
                fragment.setArguments(bundle3);
                getSupportFragmentManager().mo3552a().mo3470b(R.id.b82, fragment, "container").mo3473c();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m83494a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
