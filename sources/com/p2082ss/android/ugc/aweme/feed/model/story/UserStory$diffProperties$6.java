package com.p2082ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$6 */
public final /* synthetic */ class UserStory$diffProperties$6 extends C89225r {
    public static final AbstractC89284h INSTANCE = new UserStory$diffProperties$6();

    static {
        Covode.recordClassIndex(58838);
    }

    UserStory$diffProperties$6() {
        super(UserStory.class, "totalCount", "getTotalCount()J", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Long.valueOf(((UserStory) obj).getTotalCount());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setTotalCount(((Number) obj2).longValue());
    }
}
