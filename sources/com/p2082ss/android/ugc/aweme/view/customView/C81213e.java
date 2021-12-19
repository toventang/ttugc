package com.p2082ss.android.ugc.aweme.view.customView;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.view.customView.e */
public final /* synthetic */ class C81213e extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181499a = new C81213e();

    static {
        Covode.recordClassIndex(94543);
    }

    C81213e() {
        super(ProfileNaviEditorState.class, "setUpConfigChanged", "getSetUpConfigChanged()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviEditorState) obj).getSetUpConfigChanged());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setSetUpConfigChanged(((Boolean) obj2).booleanValue());
    }
}
