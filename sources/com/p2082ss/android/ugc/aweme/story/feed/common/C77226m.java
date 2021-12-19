package com.p2082ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.m */
final /* synthetic */ class C77226m extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f173247a = new C77226m();

    static {
        Covode.recordClassIndex(90238);
    }

    C77226m() {
        super(UserStory.class, "minCursor", "getMinCursor()J", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Long.valueOf(((UserStory) obj).getMinCursor());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setMinCursor(((Number) obj2).longValue());
    }
}
