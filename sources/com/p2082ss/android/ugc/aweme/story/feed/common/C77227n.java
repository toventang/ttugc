package com.p2082ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.n */
final /* synthetic */ class C77227n extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f173248a = new C77227n();

    static {
        Covode.recordClassIndex(90239);
    }

    C77227n() {
        super(UserStory.class, "maxCursor", "getMaxCursor()J", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Long.valueOf(((UserStory) obj).getMaxCursor());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setMaxCursor(((Number) obj2).longValue());
    }
}
