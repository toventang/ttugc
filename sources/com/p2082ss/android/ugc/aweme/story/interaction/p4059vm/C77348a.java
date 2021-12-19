package com.p2082ss.android.ugc.aweme.story.interaction.p4059vm;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.vm.a */
public final class C77348a implements C1175ad.AbstractC1177b {

    /* renamed from: a */
    private final AbstractC1204m f173546a;

    static {
        Covode.recordClassIndex(90375);
    }

    public C77348a(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        this.f173546a = mVar;
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        return new StoryCommentListViewModel(this.f173546a);
    }
}
