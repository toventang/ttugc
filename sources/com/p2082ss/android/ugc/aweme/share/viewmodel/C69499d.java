package com.p2082ss.android.ugc.aweme.share.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.viewmodel.d */
public final class C69499d extends C1175ad.C1179d {

    /* renamed from: b */
    public FeedPanelStateViewModel f155271b;

    static {
        Covode.recordClassIndex(81840);
    }

    @Override // androidx.lifecycle.C1175ad.C1179d, androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        if (!C89219l.m154714a(FeedPanelStateViewModel.class, cls)) {
            return (T) super.mo3261a(cls);
        }
        if (this.f155271b == null) {
            this.f155271b = (FeedPanelStateViewModel) super.mo3261a(cls);
        }
        return this.f155271b;
    }
}
