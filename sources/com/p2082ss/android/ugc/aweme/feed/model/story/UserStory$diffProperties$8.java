package com.p2082ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$8 */
public final /* synthetic */ class UserStory$diffProperties$8 extends C89225r {
    public static final AbstractC89284h INSTANCE = new UserStory$diffProperties$8();

    static {
        Covode.recordClassIndex(58840);
    }

    UserStory$diffProperties$8() {
        super(UserStory.class, "hasMoreAfter", "getHasMoreAfter()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((UserStory) obj).getHasMoreAfter());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setHasMoreAfter(((Boolean) obj2).booleanValue());
    }
}
