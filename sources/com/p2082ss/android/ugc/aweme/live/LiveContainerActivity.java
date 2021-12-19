package com.p2082ss.android.ugc.aweme.live;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.LiveContainerActivity */
public final class LiveContainerActivity extends ActivityC58486a {

    /* renamed from: c */
    public static final C58474a f133118c = new C58474a((byte) 0);

    /* renamed from: a */
    public String f133119a = "";

    /* renamed from: b */
    public String f133120b = "";

    /* renamed from: d */
    private final C58475b f133121d = new C58475b(this);

    /* renamed from: e */
    private SparseArray f133122e;

    static {
        Covode.recordClassIndex(68759);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f133122e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f133122e == null) {
            this.f133122e = new SparseArray();
        }
        View view = (View) this.f133122e.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f133122e.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.LiveContainerActivity$a */
    public static final class C58474a {
        static {
            Covode.recordClassIndex(68760);
        }

        private C58474a() {
        }

        public /* synthetic */ C58474a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        getSupportFragmentManager().mo3554a(this.f133121d);
        super.onDestroy();
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

    /* renamed from: com.ss.android.ugc.aweme.live.LiveContainerActivity$b */
    public static final class C58475b extends AbstractC0952i.AbstractC0954b {

        /* renamed from: a */
        final /* synthetic */ LiveContainerActivity f133123a;

        static {
            Covode.recordClassIndex(68761);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58475b(LiveContainerActivity liveContainerActivity) {
            this.f133123a = liveContainerActivity;
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public final void onFragmentStopped(AbstractC0952i iVar, Fragment fragment) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(fragment, "");
            super.onFragmentStopped(iVar, fragment);
            if (C89219l.m154714a((Object) this.f133123a.f133119a, (Object) "subscribe_info_list")) {
                this.f133123a.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.LiveContainerActivity$c */
    static final class C58476c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C58476c f133124a = new C58476c();

        static {
            Covode.recordClassIndex(68762);
        }

        C58476c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C584771.f133125a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onCreate", true);
        activityConfiguration(C58476c.f133124a);
        super.onCreate(bundle);
        setContentView(R.layout.aj_);
        this.f133119a = m107227a(getIntent(), "fragment_type");
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        String str = this.f133119a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 514841930) {
                if (hashCode == 956433626 && str.equals("subscribe_info_list")) {
                    fragment = Live.getService().mo12971a(this, "");
                }
            } else if (str.equals("subscribe")) {
                AbstractC11846d service = Live.getService();
                C89219l.m154716b(service, "");
                fragment = service.mo13021d();
            }
            a.mo3453a(R.id.dl3, fragment).mo3473c();
            getSupportFragmentManager().mo3555a((AbstractC0952i.AbstractC0954b) this.f133121d, true);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onCreate", false);
            return;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m107227a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
