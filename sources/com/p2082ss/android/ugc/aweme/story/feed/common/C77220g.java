package com.p2082ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.g */
final /* synthetic */ class C77220g extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f173241a = new C77220g();

    static {
        Covode.recordClassIndex(90232);
    }

    C77220g() {
        super(UserStory.class, "currentInfo", "getCurrentInfo()Lcom/ss/android/ugc/aweme/feed/model/story/UserStoryCurrentInfo;", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return ((UserStory) obj).getCurrentInfo();
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setCurrentInfo((UserStoryCurrentInfo) obj2);
    }
}
