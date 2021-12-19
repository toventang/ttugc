package com.p2082ss.android.ugc.aweme.duet.p2816ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity */
public final class DuetDetailActivity extends ActivityC17312a {

    /* renamed from: b */
    public static final C43262a f100995b = new C43262a((byte) 0);

    /* renamed from: a */
    public HashMap<String, String> f100996a;

    /* renamed from: c */
    private String f100997c = "";

    /* renamed from: d */
    private String f100998d = "";

    /* renamed from: e */
    private String f100999e = "";

    /* renamed from: f */
    private String f101000f = "";

    /* renamed from: g */
    private String f101001g = "";

    /* renamed from: h */
    private final long f101002h = System.currentTimeMillis();

    /* renamed from: i */
    private SparseArray f101003i;

    static {
        Covode.recordClassIndex(51466);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f101003i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f101003i == null) {
            this.f101003i = new SparseArray();
        }
        View view = (View) this.f101003i.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f101003i.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity$a */
    public static final class C43262a {
        static {
            Covode.recordClassIndex(51467);
        }

        private C43262a() {
        }

        public /* synthetic */ C43262a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        C39162r.m79460a("anchor_stay_time", new C33744d().mo59981a("duration", System.currentTimeMillis() - this.f101002h).mo59985a((HashMap<? extends String, ? extends String>) this.f100996a).f79943a);
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

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity$b */
    static final class C43263b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C43263b f101004a = new C43263b();

        static {
            Covode.recordClassIndex(51468);
        }

        C43263b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C432641.f101005a);
            baseActivityViewModel2.config(C432652.f101006a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onCreate", true);
        activityConfiguration(C43263b.f101004a);
        super.onCreate(bundle);
        setContentView(R.layout.b35);
        String a = m86369a(getIntent(), "enter_method");
        if (a == null) {
            a = "";
        }
        this.f100998d = a;
        String a2 = m86369a(getIntent(), "enter_from");
        if (a2 == null) {
            a2 = "";
        }
        this.f100997c = a2;
        String a3 = m86369a(getIntent(), "id");
        if (a3 == null) {
            a3 = "";
        }
        this.f100999e = a3;
        String a4 = m86369a(getIntent(), "origin_item_id");
        if (a4 == null) {
            a4 = "";
        }
        this.f101000f = a4;
        String a5 = m86369a(getIntent(), "author_id");
        if (a5 == null) {
            a5 = "";
        }
        this.f101001g = a5;
        if (getIntent().getSerializableExtra("anchor_event_map") instanceof HashMap) {
            this.f100996a = (HashMap) getIntent().getSerializableExtra("anchor_event_map");
        }
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        AbstractC0976n a6 = supportFragmentManager.mo3552a();
        C89219l.m154716b(a6, "");
        Fragment a7 = supportFragmentManager.mo3551a("duet_detail_fragment_tag");
        if (a7 == null) {
            String str = this.f100999e;
            String str2 = this.f101000f;
            String str3 = this.f100997c;
            String str4 = this.f100998d;
            String str5 = this.f101001g;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            a7 = new C43271d();
            Bundle bundle2 = new Bundle();
            bundle2.putString("origin_item_id", str2);
            bundle2.putString("enter_from", str3);
            bundle2.putString("enter_method", str4);
            bundle2.putString("id", str);
            bundle2.putString("author_id", str5);
            a7.setArguments(bundle2);
        }
        a7.setUserVisibleHint(true);
        a6.mo3470b(R.id.acf, a7, "duet_detail_fragment_tag");
        a6.mo3467b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m86369a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
