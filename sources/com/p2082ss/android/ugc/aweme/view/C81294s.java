package com.p2082ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.s */
final /* synthetic */ class C81294s extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181618a = new C81294s();

    static {
        Covode.recordClassIndex(94624);
    }

    C81294s() {
        super(ProfileNaviEditorState.class, "isDoneEditing", "isDoneEditing()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviEditorState) obj).isDoneEditing());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setDoneEditing(((Boolean) obj2).booleanValue());
    }
}
