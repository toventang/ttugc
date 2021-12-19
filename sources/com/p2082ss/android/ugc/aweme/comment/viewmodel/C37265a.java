package com.p2082ss.android.ugc.aweme.comment.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.a */
public final class C37265a implements C1175ad.AbstractC1177b {

    /* renamed from: a */
    private final AbstractC1204m f87846a;

    static {
        Covode.recordClassIndex(44630);
    }

    public C37265a(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        this.f87846a = mVar;
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        return new CommentListViewModel(this.f87846a);
    }
}
