package com.p2082ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.k */
final /* synthetic */ class C77224k extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f173245a = new C77224k();

    static {
        Covode.recordClassIndex(90236);
    }

    C77224k() {
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
