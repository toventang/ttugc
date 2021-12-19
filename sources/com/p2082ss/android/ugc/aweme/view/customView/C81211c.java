package com.p2082ss.android.ugc.aweme.view.customView;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39220y;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.view.customView.c */
public final /* synthetic */ class C81211c extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181497a = new C81211c();

    static {
        Covode.recordClassIndex(94541);
    }

    C81211c() {
        super(ProfileNaviEditorState.class, "currentMessage", "getCurrentMessage()Lcom/ss/android/ugc/aweme/common/NaviMessage;", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return ((ProfileNaviEditorState) obj).getCurrentMessage();
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviEditorState) obj).setCurrentMessage((C39220y) obj2);
    }
}
