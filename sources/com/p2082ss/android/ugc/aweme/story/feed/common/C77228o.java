package com.p2082ss.android.ugc.aweme.story.feed.common;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.o */
public final class C77228o implements C1175ad.AbstractC1177b {

    /* renamed from: a */
    private final AbstractC1204m f173249a;

    /* renamed from: b */
    private final C49812b f173250b;

    static {
        Covode.recordClassIndex(90240);
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        return new StoryFeedViewModel(this.f173249a, this.f173250b);
    }

    public C77228o(AbstractC1204m mVar, C49812b bVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(bVar, "");
        this.f173249a = mVar;
        this.f173250b = bVar;
    }
}
