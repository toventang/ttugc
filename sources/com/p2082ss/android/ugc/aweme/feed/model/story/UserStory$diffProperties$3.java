package com.p2082ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.model.story.UserStory$diffProperties$3 */
public final /* synthetic */ class UserStory$diffProperties$3 extends C89225r {
    public static final AbstractC89284h INSTANCE = new UserStory$diffProperties$3();

    static {
        Covode.recordClassIndex(58835);
    }

    UserStory$diffProperties$3() {
        super(UserStory.class, "allViewed", "getAllViewed()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((UserStory) obj).getAllViewed());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setAllViewed(((Boolean) obj2).booleanValue());
    }
}
