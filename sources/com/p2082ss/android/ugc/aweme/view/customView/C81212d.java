package com.p2082ss.android.ugc.aweme.view.customView;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.view.customView.d */
public final /* synthetic */ class C81212d extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181498a = new C81212d();

    static {
        Covode.recordClassIndex(94542);
    }

    C81212d() {
        super(ProfileNaviEditorState.class, "headStickerPath", "getHeadStickerPath()Ljava/lang/String;", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return ((ProfileNaviEditorState) obj).getHeadStickerPath();
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setHeadStickerPath((String) obj2);
    }
}
