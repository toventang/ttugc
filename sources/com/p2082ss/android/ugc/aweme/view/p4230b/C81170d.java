package com.p2082ss.android.ugc.aweme.view.p4230b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import java.util.List;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.b.d */
final /* synthetic */ class C81170d extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181372a = new C81170d();

    static {
        Covode.recordClassIndex(94498);
    }

    C81170d() {
        super(ProfileNaviEditorState.class, "tabList", "getTabList()Ljava/util/List;", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return ((ProfileNaviEditorState) obj).getTabList();
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setTabList((List) obj2);
    }
}
