package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42082g;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2807d.C42836b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67363b;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bi */
public abstract class AbstractC42757bi<D> extends AbstractC42690av<D> implements AbstractC67363b {

    /* renamed from: a */
    private SparseArray f99735a;

    /* renamed from: c */
    protected C42082g<?> f99736c;

    static {
        Covode.recordClassIndex(50861);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public View mo71296a(int i) {
        if (this.f99735a == null) {
            this.f99735a = new SparseArray();
        }
        View view = (View) this.f99735a.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f99735a.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: a */
    public void mo71303a(C42345d dVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42637ac
    /* renamed from: a */
    public void mo71304a(C42345d dVar, String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public void bb_() {
        SparseArray sparseArray = this.f99735a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bi$a */
    static final class RunnableC42758a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC42757bi f99737a;

        static {
            Covode.recordClassIndex(50862);
        }

        RunnableC42758a(AbstractC42757bi biVar) {
            this.f99737a = biVar;
        }

        public final void run() {
            if (this.f99737a.af_()) {
                this.f99737a.mo71353q();
            }
        }
    }

    /* renamed from: d */
    private static boolean mo71309d() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C42082g<?> mo71349n() {
        C42082g<?> gVar = this.f99736c;
        if (gVar == null) {
            C89219l.m154710a("mPresenter");
        }
        return gVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public void onDestroyView() {
        super.onDestroyView();
        C42082g<?> gVar = this.f99736c;
        if (gVar == null) {
            C89219l.m154710a("mPresenter");
        }
        gVar.ck_();
        bb_();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: t */
    public final String mo71354t() {
        C42082g<?> gVar = this.f99736c;
        if (gVar == null) {
            C89219l.m154710a("mPresenter");
            return null;
        }
        AbstractC42081f fVar = (AbstractC42081f) gVar.f92286h;
        if (fVar != null) {
            return fVar.f98121q;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    public final void bc_() {
        C67437b bVar;
        C42082g<?> gVar = this.f99736c;
        if (gVar == null) {
            C89219l.m154710a("mPresenter");
        }
        gVar.mo71295b(AbstractC42670am.f99493H);
        C42082g<?> gVar2 = this.f99736c;
        if (gVar2 == null) {
            C89219l.m154710a("mPresenter");
        }
        Object[] objArr = new Object[5];
        objArr[0] = 4;
        objArr[1] = mo72908M();
        objArr[2] = 1;
        objArr[3] = Integer.valueOf(this.f99498C);
        C67678d dVar = this.f99507r;
        if (dVar != null) {
            bVar = dVar.getFilterOption();
        } else {
            bVar = null;
        }
        objArr[4] = bVar;
        gVar2.mo57616a(objArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: f */
    public void mo59525f() {
        C42082g<?> gVar = this.f99736c;
        if (gVar == null) {
            C89219l.m154710a("mPresenter");
        }
        if (gVar.f92286h instanceof AbstractC42081f) {
            C42836b E = mo72904E();
            C42082g<?> gVar2 = this.f99736c;
            if (gVar2 == null) {
                C89219l.m154710a("mPresenter");
            }
            T t = gVar2.f92286h;
            C89219l.m154716b(t, "");
            C17273d a = C42836b.m85548a(E, t.mData, null, 2);
            if (a != null) {
                mo72912a(a);
                return;
            }
        }
        C42082g<?> gVar3 = this.f99736c;
        if (gVar3 == null) {
            C89219l.m154710a("mPresenter");
        }
        if (((AbstractC42081f) gVar3.f92286h).mo71286g() == null) {
            mo72906K();
            mo72909N();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73030a(C42082g<?> gVar) {
        C89219l.m154721d(gVar, "");
        this.f99736c = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a_ */
    public final void mo71344a_(boolean z) {
        String c = mo71298c();
        C42082g<?> gVar = this.f99736c;
        if (gVar == null) {
            C89219l.m154710a("mPresenter");
        }
        AbstractC42081f fVar = (AbstractC42081f) gVar.f92286h;
        Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchBaseModel<*, *>");
        mo72915a(c, fVar.f98119o, mo72879u(), z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo71307b(int i) {
        C67437b bVar;
        mo72902C().setIsRefreshingData(true);
        C42082g<?> gVar = this.f99736c;
        if (gVar == null) {
            C89219l.m154710a("mPresenter");
        }
        Object[] objArr = new Object[5];
        objArr[0] = 1;
        objArr[1] = mo72879u();
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Integer.valueOf(this.f99498C);
        C67678d dVar = this.f99507r;
        if (dVar != null) {
            bVar = dVar.getFilterOption();
        } else {
            bVar = null;
        }
        objArr[4] = bVar;
        gVar.mo57616a(objArr);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final void mo72918a(boolean z, boolean z2) {
        if (this.f99736c != null) {
            super.mo72918a(z, z2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av
    /* renamed from: a */
    public final void mo71339a(int i, C67437b bVar) {
        super.mo71339a(i, bVar);
        getActivity();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = mo71309d();
        }
        if (C58029j.f132253e) {
            C42082g<?> gVar = this.f99736c;
            if (gVar == null) {
                C89219l.m154710a("mPresenter");
            }
            gVar.mo71295b(AbstractC42670am.f99493H);
            C42082g<?> gVar2 = this.f99736c;
            if (gVar2 == null) {
                C89219l.m154710a("mPresenter");
            }
            gVar2.mo71294a(this.f99511v);
            mo71307b(i);
            return;
        }
        C29339a.m58753a(new RunnableC42758a(this), 100);
    }
}
