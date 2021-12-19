package com.p2082ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$7 */
public final /* synthetic */ class UserStory$diffProperties$7 extends C89225r {
    public static final AbstractC89284h INSTANCE = new UserStory$diffProperties$7();

    static {
        Covode.recordClassIndex(58839);
    }

    UserStory$diffProperties$7() {
        super(UserStory.class, "originTotalCount", "getOriginTotalCount()J", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Long.valueOf(((UserStory) obj).getOriginTotalCount());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setOriginTotalCount(((Number) obj2).longValue());
    }
}
