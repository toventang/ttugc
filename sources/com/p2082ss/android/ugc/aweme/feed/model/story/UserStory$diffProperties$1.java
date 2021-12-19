package com.p2082ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$1 */
public final /* synthetic */ class UserStory$diffProperties$1 extends C89232y {
    public static final AbstractC89290k INSTANCE = new UserStory$diffProperties$1();

    static {
        Covode.recordClassIndex(58831);
    }

    UserStory$diffProperties$1() {
        super(UserStory.class, "stories", "getStories()Ljava/util/List;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((UserStory) obj).getStories();
    }
}
