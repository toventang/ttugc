package com.p2082ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.u */
final /* synthetic */ class C81296u extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181620a = new C81296u();

    static {
        Covode.recordClassIndex(94626);
    }

    C81296u() {
        super(ProfileNaviEditorState.class, "isQuitEditing", "isQuitEditing()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviEditorState) obj).isQuitEditing());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setQuitEditing(((Boolean) obj2).booleanValue());
    }
}
