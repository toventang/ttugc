package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.helper.C41989ai;
import com.p2082ss.android.ugc.aweme.discover.helper.C42047s;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.AbstractC42208f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.y */
public final class C42994y extends AbstractC42971u {

    /* renamed from: K */
    private SparseArray f100239K;

    /* renamed from: o */
    private boolean f100240o;

    static {
        Covode.recordClassIndex(51128);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: a */
    public final View mo71296a(int i) {
        if (this.f100239K == null) {
            this.f100239K = new SparseArray();
        }
        View view = (View) this.f100239K.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f100239K.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    public final void bb_() {
        SparseArray sparseArray = this.f100239K;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: c */
    public final String mo71298c() {
        return "shop";
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u
    /* renamed from: l */
    public final boolean mo73163l() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42971u, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bb_();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am
    /* renamed from: r */
    public final boolean mo71311r() {
        return this.f100240o;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42635aa
    /* renamed from: a */
    public final void mo72826a(AbstractC42208f fVar) {
        C89219l.m154721d(fVar, "");
        fVar.mo71405a(C41989ai.m84055b(mo72879u(), this.f99511v, C42047s.C42048a.m84150a().mo71202a()));
    }
}
