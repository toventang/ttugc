package com.p2082ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$4 */
public final /* synthetic */ class UserStory$diffProperties$4 extends C89225r {
    public static final AbstractC89284h INSTANCE = new UserStory$diffProperties$4();

    static {
        Covode.recordClassIndex(58836);
    }

    UserStory$diffProperties$4() {
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
