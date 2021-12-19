package com.p2082ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviHubState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.m */
final /* synthetic */ class C81288m extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181612a = new C81288m();

    static {
        Covode.recordClassIndex(94618);
    }

    C81288m() {
        super(ProfileNaviHubState.class, "isContinueEditing", "isContinueEditing()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviHubState) obj).isContinueEditing());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviHubState) obj).setContinueEditing(((Boolean) obj2).booleanValue());
    }
}
