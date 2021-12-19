package com.p2082ss.android.ugc.aweme.music.search;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.AbstractC0976n;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.music.search.C60958d;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicActivity */
public final class SearchMusicActivity extends AbstractActivityC60929b {

    /* renamed from: a */
    private SparseArray f138344a;

    static {
        Covode.recordClassIndex(71461);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f138344a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f138344a == null) {
            this.f138344a = new SparseArray();
        }
        View view = (View) this.f138344a.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f138344a.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        KeyboardUtils.m70897c(findViewById(R.id.ax7));
        Serializable serializableExtra = getIntent().getSerializableExtra("pinned_music_list");
        Intent intent = new Intent();
        intent.putExtra("pinned_music_list", serializableExtra);
        setResult(-1, intent);
        super.finish();
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

    /* renamed from: com.ss.android.ugc.aweme.music.search.SearchMusicActivity$a */
    static final class C60873a extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C60873a f138345a = new C60873a();

        static {
            Covode.recordClassIndex(71462);
        }

        C60873a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C608741.f138346a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, com.p2082ss.android.ugc.aweme.music.search.AbstractActivityC60929b, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onCreate", true);
        activityConfiguration(C60873a.f138345a);
        super.onCreate(bundle);
        setContentView(R.layout.amc);
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        Intent intent = getIntent();
        C89219l.m154721d(intent, "");
        C60958d dVar = new C60958d();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("is_me", intent.getBooleanExtra("is_me", false));
        bundle2.putString("user_id", C60958d.C60959a.m110533a(intent, "user_id"));
        bundle2.putString("sec_user_id", C60958d.C60959a.m110533a(intent, "sec_user_id"));
        bundle2.putString("previous_page", C60958d.C60959a.m110533a(intent, "previous_page"));
        bundle2.putSerializable("pinned_music_list", intent.getSerializableExtra("pinned_music_list"));
        dVar.setArguments(bundle2);
        a.mo3469b(R.id.b5d, dVar).mo3467b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onCreate", false);
    }
}
