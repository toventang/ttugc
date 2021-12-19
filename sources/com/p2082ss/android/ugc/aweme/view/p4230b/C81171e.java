package com.p2082ss.android.ugc.aweme.view.p4230b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39219x;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.b.e */
final /* synthetic */ class C81171e extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181373a = new C81171e();

    static {
        Covode.recordClassIndex(94499);
    }

    C81171e() {
        super(ProfileNaviEditorState.class, "editCategory", "getEditCategory()Lcom/ss/android/ugc/aweme/common/NaviEditCategory;", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return ((ProfileNaviEditorState) obj).getEditCategory();
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setEditCategory((C39219x) obj2);
    }
}
