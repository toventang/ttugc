package com.p2082ss.android.ugc.aweme.view.p4234f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.f.e */
final /* synthetic */ class C81266e extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181577a = new C81266e();

    static {
        Covode.recordClassIndex(94596);
    }

    C81266e() {
        super(ProfileNaviEditorState.class, "naviDoneLoading", "getNaviDoneLoading()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviEditorState) obj).getNaviDoneLoading());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setNaviDoneLoading(((Boolean) obj2).booleanValue());
    }
}
