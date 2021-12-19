package com.p2082ss.android.ugc.aweme.discover.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41798z;
import com.p2082ss.android.ugc.aweme.discover.model.SearchEffect;
import com.p2082ss.android.ugc.aweme.discover.model.SearchEffectListViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchEffectPropsList;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity */
public final class SearchEffectListActivity extends ActivityC17312a implements AbstractC39063h.AbstractC39067a {

    /* renamed from: c */
    public static final C41560a f96920c = new C41560a((byte) 0);

    /* renamed from: a */
    View f96921a;

    /* renamed from: b */
    final C41798z f96922b;

    /* renamed from: d */
    private final AbstractC89244h f96923d = C89250i.m154773a((AbstractC89171a) new C41562c(this));

    /* renamed from: e */
    private TextTitleBar f96924e;

    /* renamed from: f */
    private RecyclerView f96925f;

    /* renamed from: g */
    private String f96926g;

    /* renamed from: h */
    private String f96927h = "tiktok_effects";

    /* renamed from: i */
    private String f96928i;

    /* renamed from: j */
    private SparseArray f96929j;

    static {
        Covode.recordClassIndex(49468);
    }

    /* renamed from: a */
    private final SearchEffectListViewModel m83495a() {
        return (SearchEffectListViewModel) this.f96923d.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f96929j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f96929j == null) {
            this.f96929j = new SparseArray();
        }
        View view = (View) this.f96929j.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f96929j.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity$a */
    public static final class C41560a {
        static {
            Covode.recordClassIndex(49469);
        }

        private C41560a() {
        }

        public /* synthetic */ C41560a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity$c */
    static final class C41562c extends AbstractC89220m implements AbstractC89171a<SearchEffectListViewModel> {

        /* renamed from: a */
        final /* synthetic */ SearchEffectListActivity f96931a;

        static {
            Covode.recordClassIndex(49471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41562c(SearchEffectListActivity searchEffectListActivity) {
            super(0);
            this.f96931a = searchEffectListActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchEffectListViewModel invoke() {
            return C1181ae.m3881a(this.f96931a, (C1175ad.AbstractC1177b) null).mo3983a(SearchEffectListViewModel.class);
        }
    }

    public SearchEffectListActivity() {
        C41798z zVar = new C41798z();
        zVar.mo67813a((AbstractC39063h.AbstractC39067a) this);
        this.f96922b = zVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        String str = this.f96926g;
        if (str != null) {
            m83495a().fetch(str, this.f96927h, this.f96922b.mo60933c(), 15);
            this.f96922b.ao_();
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

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity$b */
    public static final class C41561b implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ SearchEffectListActivity f96930a;

        static {
            Covode.recordClassIndex(49470);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41561b(SearchEffectListActivity searchEffectListActivity) {
            this.f96930a = searchEffectListActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f96930a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity$d */
    static final class C41563d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SearchEffectListActivity f96932a;

        static {
            Covode.recordClassIndex(49472);
        }

        C41563d(SearchEffectListActivity searchEffectListActivity) {
            this.f96932a = searchEffectListActivity;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: com.ss.android.ugc.aweme.discover.adapter.z */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            SearchEffectPropsList searchEffectPropsList = (SearchEffectPropsList) obj;
            SearchEffectListActivity searchEffectListActivity = this.f96932a;
            searchEffectListActivity.f96922b.aq_();
            View view = searchEffectListActivity.f96921a;
            if (view == null) {
                C89219l.m154710a("loadingView");
            }
            view.setVisibility(8);
            if (searchEffectPropsList != null) {
                List<SearchEffect> list = searchEffectPropsList.props;
                if (list == null || !(!list.isEmpty())) {
                    searchEffectListActivity.f96922b.ap_();
                    return;
                }
                searchEffectListActivity.f96922b.mo63366c(list);
                if (list.size() < 15) {
                    searchEffectListActivity.f96922b.ap_();
                    return;
                }
                return;
            }
            searchEffectListActivity.f96922b.mo67824j();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(8060);
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.atq);
        getIntent().getIntExtra(StringSet.type, 0);
        String a = m83496a(getIntent(), "alasrc");
        if (a == null) {
            a = "tiktok_effects";
        }
        this.f96927h = a;
        String a2 = m83496a(getIntent(), "title");
        if (a2 == null) {
            a2 = getString(R.string.ff9);
        }
        this.f96928i = a2;
        String a3 = m83496a(getIntent(), "keyword");
        this.f96926g = a3;
        if (a3 != null) {
            m83495a().fetch(a3, this.f96927h, this.f96922b.mo60933c(), 15);
        }
        m83495a().getData().observe(this, new C41563d(this));
        View findViewById = findViewById(R.id.eiz);
        C89219l.m154716b(findViewById, "");
        TextTitleBar textTitleBar = (TextTitleBar) findViewById;
        this.f96924e = textTitleBar;
        if (textTitleBar == null) {
            C89219l.m154710a("titleBar");
        }
        textTitleBar.setTitle(this.f96928i);
        TextTitleBar textTitleBar2 = this.f96924e;
        if (textTitleBar2 == null) {
            C89219l.m154710a("titleBar");
        }
        textTitleBar2.setOnTitleBarClickListener(new C41561b(this));
        View findViewById2 = findViewById(R.id.c_1);
        C89219l.m154716b(findViewById2, "");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f96925f = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("mList");
        }
        recyclerView.setAdapter(this.f96922b);
        View findViewById3 = findViewById(R.id.any);
        if (findViewById3 != null) {
            View inflate = ((ViewStub) findViewById3).inflate();
            C89219l.m154716b(inflate, "");
            this.f96921a = inflate;
            if (inflate == null) {
                C89219l.m154710a("loadingView");
            }
            inflate.setVisibility(0);
            this.f96922b.mo67814a((CharSequence) "");
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity", "onCreate", false);
            MethodCollector.m26664o(8060);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
        MethodCollector.m26664o(8060);
        throw nullPointerException;
    }

    /* renamed from: a */
    private static String m83496a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
