package com.p2082ss.android.ugc.aweme.discover.p2797ui;

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
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.discover.helper.C41989ai;
import com.p2082ss.android.ugc.aweme.discover.helper.C42047s;
import com.p2082ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f;
import com.p2082ss.android.ugc.aweme.discover.model.SearchObserver;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateListener$$CC;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.x */
public final class C42991x extends AbstractC42971u {

    /* renamed from: K */
    private boolean f100234K = true;

    /* renamed from: L */
    private SparseArray f100235L;

    /* renamed from: o */
    private MusicPlayHelper f100236o;

    static {
        Covode.recordClassIndex(51125);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: a */
    public final View mo71296a(int i) {
        if (this.f100235L == null) {
            this.f100235L = new SparseArray();
        }
        View view = (View) this.f100235L.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f100235L.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    public final void bb_() {
        SparseArray sparseArray = this.f100235L;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: c */
    public final String mo71298c() {
        return "music";
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bb_();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: r */
    public final boolean mo71311r() {
        return this.f100234K;
    }

    /* renamed from: m */
    public final void mo73179m() {
        MusicPlayHelper musicPlayHelper = this.f100236o;
        if (musicPlayHelper != null) {
            musicPlayHelper.mo71126a();
        }
    }

    public C42991x() {
        this.f99509t = C67458j.f151136e;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u
    /* renamed from: l */
    public final boolean mo73163l() {
        if (C16048b.m29633a().mo25412a(true, "dynamic_search_music_container_type", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.x$a */
    static final class C42992a implements SearchStateListener {

        /* renamed from: a */
        final /* synthetic */ C42991x f100237a;

        static {
            Covode.recordClassIndex(51126);
        }

        C42992a(C42991x xVar) {
            this.f100237a = xVar;
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
                this.f100237a.mo73179m();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            mo73179m();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.x$b */
    static final class C42993b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C42991x f100238a;

        static {
            Covode.recordClassIndex(51127);
        }

        C42993b(C42991x xVar) {
            this.f100238a = xVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                this.f100238a.mo73179m();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42635aa
    /* renamed from: a */
    public final void mo72826a(AbstractC42208f fVar) {
        C89219l.m154721d(fVar, "");
        fVar.mo71405a(C41989ai.m84054a(mo72879u(), this.f99511v, C42047s.C42048a.m84150a().mo71202a()));
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        this.f100236o = (MusicPlayHelper) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(MusicPlayHelper.class);
        ActivityC0945e activity2 = getActivity();
        if (activity2 == null) {
            C89219l.m154715b();
        }
        AbstractC1174ac a = C1181ae.m3881a(activity2, (C1175ad.AbstractC1177b) null).mo3983a(SearchStateViewModel.class);
        C89219l.m154716b(a, "");
        SearchObserver searchObserver = new SearchObserver();
        searchObserver.setListener(new C42992a(this));
        ((SearchStateViewModel) a).searchState.observe(this, searchObserver);
        C1213t<Boolean> tVar = mo73156b().isShowingFilters;
        if (tVar != null) {
            tVar.observe(this, new C42993b(this));
        }
        super.onViewCreated(view, bundle);
    }
}
