package com.p2082ss.android.ugc.aweme.discover.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42823d;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.keyword.C57071b;
import com.p2082ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity */
public final class SearchLiveListActivity extends ActivityC17312a {

    /* renamed from: a */
    public static final C41564a f96933a = new C41564a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f96934b = C89250i.m154773a((AbstractC89171a) new C41565b(this));

    /* renamed from: c */
    private SparseArray f96935c;

    static {
        Covode.recordClassIndex(49473);
    }

    /* renamed from: a */
    private final AbstractC57066a.AbstractC57067a m83500a() {
        return (AbstractC57066a.AbstractC57067a) this.f96934b.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f96935c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f96935c == null) {
            this.f96935c = new SparseArray();
        }
        View view = (View) this.f96935c.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f96935c.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity$a */
    public static final class C41564a {
        static {
            Covode.recordClassIndex(49474);
        }

        private C41564a() {
        }

        public /* synthetic */ C41564a(byte b) {
            this();
        }

        /* renamed from: a */
        private static void m83501a(Context context, Intent intent) {
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }

        /* renamed from: a */
        public static void m83502a(Context context, C41571b bVar, C67674b bVar2) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(bVar, "");
            Intent intent = new Intent(context, SearchLiveListActivity.class);
            intent.putExtra("param_live_enter", bVar);
            intent.addFlags(268435456);
            if (bVar2 != null) {
                intent.putExtra("param_search_enter", bVar2);
            }
            m83501a(context, intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity$b */
    static final class C41565b extends AbstractC89220m implements AbstractC89171a<SearchKeywordPresenter> {

        /* renamed from: a */
        final /* synthetic */ SearchLiveListActivity f96936a;

        static {
            Covode.recordClassIndex(49475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41565b(SearchLiveListActivity searchLiveListActivity) {
            super(0);
            this.f96936a = searchLiveListActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchKeywordPresenter invoke() {
            return new SearchKeywordPresenter(this.f96936a);
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

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity$c */
    static final class C41566c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C41566c f96937a = new C41566c();

        static {
            Covode.recordClassIndex(49476);
        }

        C41566c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C415671.f96938a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity$d */
    static final class View$OnClickListenerC41568d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchLiveListActivity f96939a;

        static {
            Covode.recordClassIndex(49478);
        }

        View$OnClickListenerC41568d(SearchLiveListActivity searchLiveListActivity) {
            this.f96939a = searchLiveListActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96939a.finish();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        Serializable serializableExtra;
        Serializable serializableExtra2;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity", "onCreate", true);
        activityConfiguration(C41566c.f96937a);
        super.onCreate(bundle);
        setContentView(R.layout.ato);
        AbstractC17250a aVar = (AbstractC17250a) _$_findCachedViewById(R.id.eim);
        C89219l.m154716b(aVar, "");
        DmtTextView titleView = aVar.getTitleView();
        C89219l.m154716b(titleView, "");
        titleView.setText(getString(R.string.fm));
        NormalTitleBar normalTitleBar = (NormalTitleBar) _$_findCachedViewById(R.id.eim);
        C89219l.m154716b(normalTitleBar, "");
        normalTitleBar.getStartBtn().setOnClickListener(new View$OnClickListenerC41568d(this));
        ((AbstractC17250a) _$_findCachedViewById(R.id.eim)).mo27298a(true);
        Intent intent = getIntent();
        if (!(intent == null || (serializableExtra = intent.getSerializableExtra("param_live_enter")) == null)) {
            C89219l.m154716b(serializableExtra, "");
            if (serializableExtra instanceof C41571b) {
                AbstractC57066a.AbstractC57067a a = m83500a();
                C41571b bVar = (C41571b) serializableExtra;
                String searchKeyword = bVar.getSearchKeyword();
                if (searchKeyword == null) {
                    searchKeyword = "";
                }
                a.mo94219a(new C57071b(searchKeyword, null, 2));
                AbstractC1174ac a2 = C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(SearchLiveListEnterParamViewModel.class);
                C89219l.m154716b(a2, "");
                ((SearchLiveListEnterParamViewModel) a2).f96941a = bVar;
                Intent intent2 = getIntent();
                if (!(intent2 == null || (serializableExtra2 = intent2.getSerializableExtra("param_search_enter")) == null)) {
                    C89219l.m154716b(serializableExtra2, "");
                    if (serializableExtra2 instanceof C67674b) {
                        SearchEnterViewModel.C42997a.m85830a(this).mo73183a(this, (C67674b) serializableExtra2);
                    }
                    C42823d dVar = new C42823d();
                    C67678d enterMethod = new C67678d().setKeyword(m83500a().mo94218a().f129938a).setEnterMethod(bVar.getEnterMethod());
                    String fromSearchSubtag = bVar.getFromSearchSubtag();
                    if (fromSearchSubtag == null) {
                        fromSearchSubtag = "";
                    }
                    C67678d fromSearchSubtag2 = enterMethod.setFromSearchSubtag(fromSearchSubtag);
                    String preSearchId = bVar.getPreSearchId();
                    if (preSearchId == null) {
                        preSearchId = "";
                    }
                    C67678d preSearchId2 = fromSearchSubtag2.setPreSearchId(preSearchId);
                    C89219l.m154716b(preSearchId2, "");
                    C89219l.m154721d(preSearchId2, "");
                    dVar.f99507r = preSearchId2;
                    getSupportFragmentManager().mo3552a().mo3470b(R.id.b82, dVar, "container").mo3473c();
                }
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity", "onCreate", false);
    }
}
