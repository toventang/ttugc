package com.p2082ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.l */
final /* synthetic */ class C77225l extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f173246a = new C77225l();

    static {
        Covode.recordClassIndex(90237);
    }

    C77225l() {
        super(UserStory.class, "hasMoreBefore", "getHasMoreBefore()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((UserStory) obj).getHasMoreBefore());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setHasMoreBefore(((Boolean) obj2).booleanValue());
    }
}
