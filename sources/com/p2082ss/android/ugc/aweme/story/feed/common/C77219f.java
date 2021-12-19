package com.p2082ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.f */
final /* synthetic */ class C77219f extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f173240a = new C77219f();

    static {
        Covode.recordClassIndex(90231);
    }

    C77219f() {
        super(UserStory.class, "stories", "getStories()Ljava/util/List;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((UserStory) obj).getStories();
    }
}
