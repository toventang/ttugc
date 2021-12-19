package com.p2082ss.android.ugc.aweme.discover.p2775j;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2636h.C39127c;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41605ae;
import com.p2082ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p2082ss.android.ugc.aweme.discover.model.SearchObserver;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener$$CC;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67584y;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.j.m */
public final class C42098m extends AbstractC42757bi<SearchMusic> {

    /* renamed from: a */
    private MusicPlayHelper f98150a;

    /* renamed from: b */
    private SparseArray f98151b;

    static {
        Covode.recordClassIndex(50032);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final View mo71296a(int i) {
        if (this.f98151b == null) {
            this.f98151b = new SparseArray();
        }
        View view = (View) this.f98151b.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f98151b.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void bb_() {
        SparseArray sparseArray = this.f98151b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: c */
    public final String mo71298c() {
        return "music";
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bb_();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: r */
    public final boolean mo71311r() {
        return true;
    }

    public C42098m() {
        this.f99509t = C67458j.f151136e;
    }

    /* renamed from: d */
    public final void mo71309d() {
        MusicPlayHelper musicPlayHelper = this.f98150a;
        if (musicPlayHelper != null) {
            musicPlayHelper.mo71126a();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void onPause() {
        super.onPause();
        mo71309d();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: f */
    public final void mo59525f() {
        super.mo59525f();
        new C67584y().mo106459o("music_search_result").mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: m */
    public final void mo71300m() {
        mo72913a(new C41605ae(this.f98150a, this.f99507r, mo72880v(), this));
        C39127c.m79421a(mo72925w(), new C42099a(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: i */
    public final void mo71299i() {
        mo73030a(new C42109o());
        C42082g<?> n = mo71349n();
        Objects.requireNonNull(n, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchMusicPresenter");
        n.mo67838a((Object) new C42102n());
        mo71349n().mo67839a_((AbstractC39102c) this);
        mo71349n().mo71293a((AbstractC42637ac) this);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.j.m$a */
    public static final class C42099a implements C39127c.AbstractC39129b {

        /* renamed from: a */
        final /* synthetic */ C42098m f98152a;

        static {
            Covode.recordClassIndex(50033);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42099a(C42098m mVar) {
            this.f98152a = mVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2636h.C39127c.AbstractC39129b
        /* renamed from: a */
        public final Object mo67885a(int i) {
            List e = this.f98152a.mo72900A().mo63369e();
            if (e == null || i < 0 || i >= e.size()) {
                return null;
            }
            return e.get(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.j.m$b */
    static final class C42100b implements SearchStateListener {

        /* renamed from: a */
        final /* synthetic */ C42098m f98153a;

        static {
            Covode.recordClassIndex(50034);
        }

        C42100b(C42098m mVar) {
            this.f98153a = mVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onPageHidden() {
            SearchStateListener$$CC.onPageHidden(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onPageResume() {
            SearchStateListener$$CC.onPageResume(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onContentVisible(boolean z) {
            if (!z) {
                this.f98153a.mo71309d();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            mo71309d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.j.m$c */
    static final class C42101c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42098m f98154a;

        static {
            Covode.recordClassIndex(50035);
        }

        C42101c(C42098m mVar) {
            this.f98154a = mVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                this.f98154a.mo71309d();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        this.f98150a = (MusicPlayHelper) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(MusicPlayHelper.class);
        ActivityC0945e activity2 = getActivity();
        if (activity2 == null) {
            C89219l.m154715b();
        }
        AbstractC1174ac a = C1181ae.m3881a(activity2, (C1175ad.AbstractC1177b) null).mo3983a(SearchStateViewModel.class);
        C89219l.m154716b(a, "");
        SearchObserver searchObserver = new SearchObserver();
        searchObserver.setListener(new C42100b(this));
        ((SearchStateViewModel) a).searchState.observe(this, searchObserver);
        C1213t<Boolean> tVar = mo72902C().isShowingFilters;
        if (tVar != null) {
            tVar.observe(this, new C42101c(this));
        }
        super.onViewCreated(view, bundle);
    }
}
