package com.p2082ss.android.ugc.aweme.discover.p2775j;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41747v;
import com.p2082ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.discover.j.h */
public final class C42083h extends AbstractC42757bi<SearchChallenge> {

    /* renamed from: a */
    private SparseArray f98124a;

    static {
        Covode.recordClassIndex(50017);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final View mo71296a(int i) {
        if (this.f98124a == null) {
            this.f98124a = new SparseArray();
        }
        View view = (View) this.f98124a.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f98124a.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void bb_() {
        SparseArray sparseArray = this.f98124a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: c */
    public final String mo71298c() {
        return "tag";
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42757bi, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bb_();
    }

    public C42083h() {
        this.f99509t = C67458j.f151138g;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: m */
    public final void mo71300m() {
        mo72913a(new C41747v(this.f99507r, mo72880v(), this));
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: i */
    public final void mo71299i() {
        mo73030a(new C42087j());
        C42082g<?> n = mo71349n();
        Objects.requireNonNull(n, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchChallengePresenter");
        n.mo67838a((Object) new C42084i());
        mo71349n().mo67839a_((AbstractC39102c) this);
        mo71349n().mo71293a((AbstractC42637ac) this);
    }
}
