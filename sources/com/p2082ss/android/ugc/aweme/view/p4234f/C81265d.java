package com.p2082ss.android.ugc.aweme.view.p4234f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.f.d */
final /* synthetic */ class C81265d extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181576a = new C81265d();

    static {
        Covode.recordClassIndex(94595);
    }

    C81265d() {
        super(ProfileNaviEditorState.class, "animationStarted", "getAnimationStarted()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviEditorState) obj).getAnimationStarted());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setAnimationStarted(((Boolean) obj2).booleanValue());
    }
}
